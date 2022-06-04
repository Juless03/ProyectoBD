/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionSQL;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.text.ParseException;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.JComboBox;
/**
 *
 * @author Juley
 */
public class Conexion {

    
    
    // Nueva conexión msql
    private static Connection con;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="camelCase110";
    private static final String url="jdbc:mysql://localhost:3306/mtec";
    /*
      public static Connection conectorBaseNueva() throws SQLException {
        
        Connection con = DriverManager.getConnection(url, user, pass);
        return con;
        }
    */
     public static Connection  conectorBaseNueva() throws SQLException {
        try{
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url, user, pass);
        }
        catch (ClassNotFoundException | SQLException e){
            System.out.println("Error al conectar a la base de datos");
        }
        return con;
      }  
 
    
    // base antigua
        
    public static String encriptarContraseña(String Contraseña){
        char arregloContraseña[] = Contraseña.toCharArray();
        for(int i = 0; i < arregloContraseña.length; i++){   
            arregloContraseña[i] = (char)(arregloContraseña[i] + (char)10);
        }
        String contraseñaEncriptada = String.valueOf(arregloContraseña);  
        return contraseñaEncriptada;
    }
        
    public static String desencriptarContraseña(String Contraseña){
        char arregloContraseña[] = Contraseña.toCharArray();
        for(int i = 0; i < arregloContraseña.length; i++){  
            arregloContraseña[i] = (char)(arregloContraseña[i] - (char)10);
        }
        String contraseñaEncriptada = String.valueOf(arregloContraseña);   
        return contraseñaEncriptada;
    }
        
    public static void getPhoneNumber(JComboBox cbox_PhoneNumber, int idPerson) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call getPhoneNumber(?)}"); 
        stmt.setInt(1, idPerson);
        ResultSet r = stmt.executeQuery();
        while (r.next()) {
            cbox_PhoneNumber.addItem(r.getString("number")); 
            }
    }
        
    public static int getIDPhone(int phoneNumber) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{?= call getPhoneID(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setInt(2, phoneNumber);
        stmt.execute();
        int Resultado = stmt.getInt(1);
        return Resultado;
    }

        
    public static void getStudentGroup(JComboBox comBoxEvaluacion,int pGroupCode) throws SQLException{
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call getStudentGroup(?)}");
        stmt.setInt(1, pGroupCode);
        ResultSet r = stmt.executeQuery();
        while(r.next()){
            comBoxEvaluacion.addItem(r.getString("id_person") + " " + r.getString("first_name") + " " + r.getString("middle_name") + " " + r.getString("first_lastname") + " " + 
            r.getString("second_lastname") );  
        }
    }
        
    public static void getStudent(JComboBox comboBoxStudents) throws SQLException{
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call getStudent()}");
        ResultSet r = stmt.executeQuery();
        while(r.next()){
            comboBoxStudents.addItem(r.getString("id_person") + " " +r.getString("first_name") + " "+ r.getString("middle_name") +
            " " + r.getString("first_lastname") + " " + r.getString("second_lastname"));
        }
    }
        
    public static void getCourse(JComboBox cbox_course) throws SQLException{
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call getCourse()}");
        ResultSet r = stmt.executeQuery();
        while(r.next()){
            cbox_course.addItem(r.getString("course_name"));   
        }
    }
        
    public static void getCourseRegistroGrupo(JComboBox cbox_course) throws SQLException{
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call getCourseGrupo()}");
        ResultSet r = stmt.executeQuery();
        while(r.next()){
            cbox_course.addItem(r.getString("id_course") + " " + r.getString("course_name")); 
        }
    }

    public static void getIDStudent(JComboBox comBoxEstudiante) throws SQLException{
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call getIDStudent()}");
        ResultSet r = stmt.executeQuery();
        while(r.next()){
            comBoxEstudiante.addItem(r.getString("id_person")); 
        }
    }

    public static int getIDCourse(String curso) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{?= call getIDCourse(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setString(2, curso);
        stmt.execute();
        int Resultado = stmt.getInt(1);
        return Resultado;
    }
        
    public static void getProfessor(JComboBox comBoxEstudiante) throws SQLException{
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call getProfessor()}");
        ResultSet r = stmt.executeQuery();
        while(r.next()){
            comBoxEstudiante.addItem(r.getString("id_person") + " " + r.getString("first_name") + " " + r.getString("middle_name") + " " + r.getString("first_lastname") + " " +
            r.getString("second_lastname"));   
        }
    }
        
    public static void getStudentEvaluation(JComboBox comBoxEvaluacion, int pIDStudent) throws SQLException{
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call getEvaluationStudent(?)}"); //JComboBox comBoxEvaluacion,
        stmt.setInt(1, pIDStudent);
        ResultSet r = stmt.executeQuery();
        while(r.next()){
            comBoxEvaluacion.addItem(r.getString("id_evaluation") + " " + r.getString("evaluation_des"));  
            //System.out.println(r.getString("id_evaluation") + " " + r.getString("evaluation_des"));
        }
    }
    
    public static void getEvaluation(JComboBox comboBoxEvaluacion) throws SQLException{
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call getEvaluation()}");
        stmt.execute();
        ResultSet r = stmt.executeQuery();
        while(r.next()){
            comboBoxEvaluacion.addItem(r.getString("id_evaluation") + " " + r.getString("evaluation_name") + " " + r.getString("evaluation_des"));  
        }
    }

    public static void getCourseGroup(JComboBox cbox_coursegroup) throws SQLException{
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call getCourseGroup()}");
        ResultSet r = stmt.executeQuery();
        while(r.next()){
            cbox_coursegroup.addItem(r.getString("id_group"));  
        }
    }
    
    public void escribeImagenEnBBDD(int idPersona, Image mImagen) throws SQLException, IOException {
        Connection con = conectorBaseNueva(); //  Image mImagen String Ruta
        PreparedStatement pstmt = con.prepareStatement("{ call update_person_picture(?,?)  }");
      /*
        pstmt.setInt(1, idPersona);
        File nombre = new File(Ruta);
        FileInputStream archivofoto = new FileInputStream(nombre);
        pstmt.setByte(2,archivofoto);
        pstmt.executeUpdate();
        */
       
        Blob imagenBlob = null;
        BufferedImage bi = new BufferedImage(mImagen.getWidth(null), mImagen.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = bi.createGraphics();
        g2d.drawImage(mImagen, 0, 0, null);
        g2d.dispose();
        ByteArrayOutputStream baos = null;
        try {
        baos = new ByteArrayOutputStream();
        ImageIO.write(bi, "png", baos);
        } finally {
        try {
        baos.close();
        } catch (Exception e) {
        }
        }
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        pstmt.setBlob(2, bais);
        pstmt.setInt(1, idPersona);
        pstmt.executeUpdate();
        pstmt.close();

    }

    public static int getCantonCode(String cantonName) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{?= call getCantonCode(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setString(2, cantonName);
        stmt.execute();
        int Resultado = stmt.getInt(1);
        return Resultado;
    }

    public static void getCanton(JComboBox cbox_canton) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call getCanton()}");
        ResultSet r = stmt.executeQuery();
        while (r.next()) {
            cbox_canton.addItem(r.getString("canton_name")); 
        }
    }
    
    public static int getCountryCode(String countryName) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{?= call getCountryCode(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setString(2, countryName);
        stmt.execute();
        int Resultado = stmt.getInt(1);
        return Resultado;
    }

    public static void getCountry(JComboBox cbox_country) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call getCountry()}");
        ResultSet r = stmt.executeQuery();
        while (r.next()) {
            cbox_country.addItem(r.getString("country_name")); 
        }
    }
     public static int getProvinceCode(String provinceName) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{?= call getProvinceCode(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setString(2, provinceName);
        stmt.execute();
        int Resultado = stmt.getInt(1);
        return Resultado;
    }
     
    public static void getProvince(JComboBox cbox_province) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call getProvince()}");
        ResultSet r = stmt.executeQuery(); 
        while (r.next()) {
            cbox_province.addItem(r.getString("province_name"));
        }
    }
 
    public static String loginAdmin(String pUsuario, String pContraseña) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{?= call getAdminLogin(?,?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setString(2, pUsuario);
        stmt.setString(3, pContraseña);
        stmt.execute();
        String Resultado = stmt.getString(1);
        return Resultado;
    }

    public static int getDistrictCode(String distritoName) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{?= call getDistrictCode(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setString(2, distritoName);
        stmt.execute();
        int Resultado = stmt.getInt(1);
        return Resultado;
    }

    public static void getDistrict(JComboBox cbox_distrito) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call getDistrict()}");
        ResultSet r = stmt.executeQuery();
        while (r.next()) {
            cbox_distrito.addItem(r.getString("district_name")); 
        }
    }

    public static void getGender(JComboBox cbox_genero) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call getGender()}");
        ResultSet r = stmt.executeQuery(); 
        while (r.next()) {
            cbox_genero.addItem(r.getString("type"));
        }
    }

    public static int getGenderCode(String GeneroNombre) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{?= call getGenderCode(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setString(2, GeneroNombre);
        stmt.execute();
        int Resultado = stmt.getInt(1);
        return Resultado;
    }

    //funciones del paquete adminPerson
    public static int getPersonID(String pFirstName, String pMiddleName, String pFirstLastname, String pSecondLastname) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{?= call getIdPerson(?,?,?,?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setString(2, pFirstName);
        stmt.setString(3, pMiddleName);
        stmt.setString(4, pFirstLastname);
        stmt.setString(5, pSecondLastname);
        stmt.execute();
        int Resultado = stmt.getInt(1);
        return Resultado;
    }

    public static void getPerson(JComboBox cbox_personas) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call getPerson()}");
        ResultSet r = stmt.executeQuery();
        while (r.next()) {
            cbox_personas.addItem(r.getString("first_name") + " " + r.getString("middle_name") + " " + r.getString("first_lastname") + " " + r.getString("second_lastname"));
        }
    }

    public static boolean addPerson(String pFirstName, String pMiddleName, String pFirstLastname, String pSecondLastname, int pGenderCode, int pDistrictCode, Date pBirthday) throws SQLException, ParseException {

        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call add_person(?,?,?,?,?,?,?) }");
        stmt.setString(1, pFirstName);
        stmt.setString(2, pMiddleName);
        stmt.setString(3, pFirstLastname);
        stmt.setString(4, pSecondLastname);
        stmt.setInt(5, pGenderCode);
        stmt.setInt(6, pDistrictCode);
        stmt.setDate(7, (java.sql.Date) pBirthday);
        stmt.execute();
        return true;
    }
  
    public static void updatePersonFirstName(int pIdPerson, String pFirstName) throws SQLException{
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_person_first_name(?,?) }");
        stmt.setInt(1, pIdPerson);
        stmt.setString(2, pFirstName);
        stmt.execute();
    }
     
    public static void updatePersonMiddleName(int pIdPerson, String pMiddleName) throws SQLException{
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_person_middle_name(?,?) }");
        stmt.setInt(1, pIdPerson);
        stmt.setString(2, pMiddleName);
        stmt.execute();
    }
      
    public static void updatePersonFirstLastName(int pIdPerson, String pFirstLastName) throws SQLException{
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_person_first_last_name(?,?) }");
        stmt.setInt(1, pIdPerson);
        stmt.setString(2, pFirstLastName);
        stmt.execute();
    } 
    public static void updatePersonSecondLastName(int pIdPerson, String pSecondLastName) throws SQLException{
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_person_second_last_name(?,?) }");
        stmt.setInt(1, pIdPerson);
        stmt.setString(2, pSecondLastName);
        stmt.execute();
    }

    public static void updatePersonGender(int pIdPerson, int pGenderCode) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_person_gender(?,?) }");
        stmt.setInt(1, pIdPerson);
        stmt.setInt(2, pGenderCode);
        stmt.execute();
    }

    public static void updatePersonDistrict(int pIdPerson, int pDistrictCode) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_person_district(?,?) }");
        stmt.setInt(1, pIdPerson);
        stmt.setInt(2, pDistrictCode);
        stmt.execute();
    }

    public static void updatePersonBirthday(int pIdPerson, Date pBirthday) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_person_birthday(?,?) }");
        stmt.setInt(1, pIdPerson);
        stmt.setDate(2, (java.sql.Date) pBirthday);
        stmt.execute();
    }

    public static void addAdmin(int pIdPerson, String pAdminUser, String pAdminPassword) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call add_admin(?,?,?) }");
        stmt.setInt(1, pIdPerson);
        stmt.setString(2, pAdminUser);
        stmt.setString(3, pAdminPassword);
        stmt.execute();
    }

    public static void updateAdminCredentials(int pIdPerson, String pAdminUser, String pAdminPassword) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_admin_credentials(?,?,?) }");
        stmt.setInt(1, pIdPerson);
        stmt.setString(2, pAdminUser);
        stmt.setString(3, pAdminPassword);
        stmt.execute();
    }

    public static void addProfessor(int pIdPerson) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call add_professor(?) }");
        stmt.setInt(1, pIdPerson);
        stmt.execute();
    }

    public static void addStudent(int pIdPerson,int pIdStudent) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call add_student(?,?) }");
        stmt.setInt(1, pIdPerson);
        stmt.setInt(2, pIdStudent);
        stmt.execute();
    }
    
    public static void addEmail(String pEmailDirection, int pIdPerson) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call add_email(?, ?) }");
        stmt.setString(1, pEmailDirection);
        stmt.setInt(2, pIdPerson);
        stmt.execute();
    }
    public static void updateEmailDirection(int pEmailCode, int pEmailDirection) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_email_direction(?, ?) }");
        stmt.setInt(1, pEmailCode);
        stmt.setInt(2, pEmailDirection);
        stmt.execute();
    }
      
    public static int getEmailID(int idPerson) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{?= call getIDEmail(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setInt(2, idPerson);
        stmt.execute();
        int Resultado = stmt.getInt(1);
        return Resultado;
    }
    public static void updateEmailDirection(int pEmailCode, String EmailDes) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_email_direction(?, ?) }");
        stmt.setInt(1, pEmailCode);
        stmt.setString(2, EmailDes);
        stmt.execute();
    }
    public static void addPhoneNumber(String pPhonenumberDescription, int pPhonenumberPhone, int pIdPerson) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call add_phonenumber(?, ?, ?) }");
        stmt.setString(1, pPhonenumberDescription);
        stmt.setInt(2, pPhonenumberPhone);
        stmt.setInt(3, pIdPerson);
        stmt.execute();
    }
    public static void updatePhoneDescription(int pPhonenumberCode, String pPhonenumberDescription) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_phone_type(?, ?) }");
        stmt.setInt(1, pPhonenumberCode);
        stmt.setString(2, pPhonenumberDescription);
        stmt.execute();
    }

    public static void updatePhoneNumber(int pPhonenumberCode, String pPhonenumberPhone) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_number(?, ?) }");
        stmt.setInt(1, pPhonenumberCode);
        stmt.setString(2, pPhonenumberPhone);
        stmt.execute();
    }

    public static void updatePhonePerson(int pPhonenumberCode, int pIdPerson) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_phone_person(?, ?) }");
        stmt.setInt(1, pPhonenumberCode);
        stmt.setInt(2, pIdPerson);
        stmt.execute();
    }

    public static void addGender(String pGenderDescription) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call add_gender(?) }");
        stmt.setString(1, pGenderDescription);
        stmt.execute();
    }

    public static void updateGenderDescription(int pGenderCode, String pGenderDescription) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_gender_description(?, ?) }");
        stmt.setInt(1, pGenderCode);
        stmt.setString(2, pGenderDescription);
        stmt.execute();
    }

    //funciones del paquete adminDirection
    public static void addProvince(String pProvinceName, int pCountryCode) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call add_province(?, ?) }");
        stmt.setString(1, pProvinceName);
        stmt.setInt(2, pCountryCode);
        stmt.execute();
    }

    public static void updateProvinceName(int pProvinceCode, String pProvinceName) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_province_name(?, ?) }");
        stmt.setInt(1, pProvinceCode);
        stmt.setString(2, pProvinceName);
        stmt.execute();
    }

    public static void updateProvinceCountry(int pProvinceCode, int pCountryCode) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_province_country(?, ?) }");
        stmt.setInt(1, pProvinceCode);
        stmt.setInt(2, pCountryCode);
        stmt.execute();
    }

    public static void addCanton(String pCantonName, int pProvinceCode) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call add_canton(?, ?) }");
        stmt.setString(1, pCantonName);
        stmt.setInt(2, pProvinceCode);
        stmt.execute();
    }

    public static void updateCantonName(int pCantonCode, String pCantonName) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_canton_name(?, ?) }");
        stmt.setInt(1, pCantonCode);
        stmt.setString(2, pCantonName);
        stmt.execute();
    }

    public static void updateCantonProvince(int pCantonCode, int pProvinceCode) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_canton_province(?, ?) }");
        stmt.setInt(1, pCantonCode);
        stmt.setInt(2, pProvinceCode);
        stmt.execute();
    }

    public static void addCountry(String pCountryName) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call add_country(?) }");
        stmt.setString(1, pCountryName);
        stmt.execute();
    }

    public static void updateCountryName(int pCountryCode, String pCountryName) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_country_name(?, ?) }");
        stmt.setInt(1, pCountryCode);
        stmt.setString(2, pCountryName);
        stmt.execute();
    }

    public static void addDistrict(String pDistrictName, int pCantonCode) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call add_district(?, ?) }");
        stmt.setString(1, pDistrictName);
        stmt.setInt(2, pCantonCode);
        stmt.execute();
    }

    public static void updateDistrictName(int pDistrictCode, String pDistrictName) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_district_name(?, ?) }");
        stmt.setInt(1, pDistrictCode);
        stmt.setString(2, pDistrictName);
        stmt.execute();
    }

    public static void updateDistrictCanton(int pDistrictCode, int pCantonCode) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_district_canton(?, ?) }");
        stmt.setInt(1, pDistrictCode);
        stmt.setInt(2, pCantonCode);
        stmt.execute();
    }

    //funciones del paquete adminUniversity
    public static void addUniversity(String pUniversityName) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call .add_university(?) }");
        stmt.setString(1, pUniversityName);
        stmt.execute();
    }

    public static void addUniversityXPerson(int pIdPerson, int pUniversityCode) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call add_universityxperson(?, ?) }");
        stmt.setInt(1, pIdPerson);
        stmt.setInt(1, pUniversityCode);
        stmt.execute();
    }

    //funciones del paquete adminCourse
    public static void addStudentxgroup(int pIdPerson, int pGroupCode, String pStatus) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call add_studentxgroup(?, ?, ?) }");
        stmt.setInt(1, pIdPerson);
        stmt.setInt(2, pGroupCode);
        stmt.setString(3, pStatus);
        stmt.execute();
    }

    public static void upadateStudentxgroupReview(int pIdPerson, int pGroupCode, int pReviewCode) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_studentxgroup_review(?, ?, ?) }");
        stmt.setInt(1, pIdPerson);
        stmt.setInt(2, pGroupCode);
        stmt.setInt(3, pReviewCode);
        stmt.execute();
    }

    public static void updateStudentxgroupStatus(int pIdPerson, int pGroupCode, String pStatus) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_studentxgroup_status(?, ?, ?) }");
        stmt.setInt(1, pIdPerson);
        stmt.setInt(2, pGroupCode);
        stmt.setString(3, pStatus);
        stmt.execute();
    }

    public static void addReview(int pStars, String pReviewDescription, int pIdPerson, int pIdProfessor) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{?= call add_review(?, ?, ?, ?) }");
        stmt.setInt(1, pStars);
        stmt.setString(2, pReviewDescription);
        stmt.setInt(3, pIdPerson);
        stmt.setInt(4, pIdProfessor);
        stmt.execute();
    }

    public static void updateReviewStars(int pReviewCode, int pStars) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_review_stars(?, ?) }");
        stmt.setInt(1, pReviewCode);
        stmt.setInt(2, pStars);
        stmt.execute();
    }

    public static void updateReviewDescription(int pReviewCode, String pReviewDescription) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_review_description(?, ?) }");
        stmt.setInt(1, pReviewCode);
        stmt.setString(2, pReviewDescription);
        stmt.execute();
    }

    public static void updateReviewPerson(int pReviewCode, int pIdPerson) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_review_person(?, ?) }");
        stmt.setInt(1, pReviewCode);
        stmt.setInt(2, pIdPerson);
        stmt.execute();
    }

    public static void updateReviewProfessor(int pReviewCode, int pIdProfessor) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_review_professor(?, ?) }");
        stmt.setInt(1, pReviewCode);
        stmt.setInt(2, pIdProfessor);
        stmt.execute();
    }

    public static void addCourse(int pCredits, String pCourseName) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call add_course(?, ?) }");
        stmt.setInt(1, pCredits);
        stmt.setString(2, pCourseName);
        stmt.execute();
    }

    public static void updateCourseCredits(String pCourseName, int pCredits) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_courseCredits_name(?, ?) }");
        stmt.setString(1, pCourseName);
        stmt.setInt(2, pCredits);
        stmt.execute();
    }

    public static void updateCourseName(String pCourseName, String pNewCourseName) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_courseName_name(?, ?) }");
        stmt.setString(1, pCourseName);
        stmt.setString(2, pNewCourseName);
        stmt.execute();
    }

    public static void addCourseGroup(Date pGroupYear, int pGroupSemester, int pIdProfessor, int pIdCourse) throws SQLException{
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call add_coursegroup(?, ?, ?, ?) }");
        stmt.setDate(1, (java.sql.Date) pGroupYear);
        stmt.setInt(2, pGroupSemester);
        stmt.setInt(3, pIdProfessor);
        stmt.setInt(4, pIdCourse);
        stmt.execute(); 
    }
   
    public static void updateCourseGroupYear(int pGroupCode, int pGroupYear) throws SQLException{
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_coursegroup_year(?, ?) }");
        stmt.setInt(1, pGroupCode);
        stmt.setInt(2, pGroupYear);
        stmt.execute(); 
    }
     
    public static void updateCourseGroupSemester(int pGroupCode, int pGroupSemester) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_coursegroup_semester(?, ?) }");
        stmt.setInt(1, pGroupCode);
        stmt.setInt(2, pGroupSemester);
        stmt.execute();
    }

    public static void updateCourseGroupProfessor(int pGroupCode, int pIdProfessor) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_coursegroup_professor(?, ?) }");
        stmt.setInt(1, pGroupCode);
        stmt.setInt(2, pIdProfessor);
        stmt.execute();
    }

    public static void updateCourseGroupCourse(int pGroupCode, int pIdCourse) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_coursegroup_course(?, ?) }");
        stmt.setInt(1, pGroupCode);
        stmt.setInt(2, pIdCourse);
        stmt.execute();
    }
    
    public static void addEvaluation(String pEvaluationName, String pEvaluationDes, String pMembers, int pPercentage, Date pDueDate, int pIdGrupo) throws SQLException{
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call add_evaluation(?, ?, ?, ?, ?,?) }");
        stmt.setString(1, pEvaluationName);
        stmt.setString(2, pEvaluationDes);
        stmt.setString(3, pMembers);
        stmt.setInt(4, pPercentage);
        stmt.setDate(5, (java.sql.Date) pDueDate);
        stmt.setInt(6, pIdGrupo);
        stmt.execute(); 
    }
     
    public static void updateEvaluationName(int pEvaluationCode, String pEvaluationName) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_evaluation_name(?, ?) }");
        stmt.setInt(1, pEvaluationCode);
        stmt.setString(2, pEvaluationName);
        stmt.execute();
    }
    
    public static void updateEvaluationDes(int pEvaluationCode, String pEvaluationDes) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_evaluation_description(?, ?) }");
        stmt.setInt(1, pEvaluationCode);
        stmt.setString(2, pEvaluationDes);
        stmt.execute();
    }
    
    public static void updateEvaluationPercentage(int pEvaluationCode, int pPercentage) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_evaluation_percentage(?, ?) }");
        stmt.setInt(1, pEvaluationCode);
        stmt.setInt(2, pPercentage);
        stmt.execute();
    }
    
    public static void updateEvaluationMembers(int pEvaluationCode, String pMembers) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_evaluation_members(?, ?) }");
        stmt.setInt(1, pEvaluationCode);
        stmt.setString(2, pMembers);
        stmt.execute();
    }
    
     public static void updateEvaluationCourseCode(int pEvaluationCode, int pCourseCode) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_evaluation_group(?, ?) }");
        stmt.setInt(1, pEvaluationCode);
        stmt.setInt(2, pCourseCode);
        stmt.execute();
    }

    public static void updateEvaluationDueDate(int pEvaluationCode, Date pDueDate) throws SQLException{
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_evaluation_duedate(?, ?) }");
        stmt.setInt(1, pEvaluationCode);
        stmt.setDate(2, (java.sql.Date) pDueDate);
        stmt.execute(); 
    }

    public static void addEvaluationxStudent(int pIdPerson, int pEvaluationCode, int pPercentageObtained) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call add_evaluationxstudent(?, ?, ?) }");
        stmt.setInt(1, pIdPerson);
        stmt.setInt(2, pEvaluationCode);
        stmt.setInt(3, pPercentageObtained);
        stmt.execute();
    }

    public static void updateEvaluationxstudentStudent(int pIdEvalxstudent, int pIdPerson) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_evaluationxstudent_stud(?, ?) }");
        stmt.setInt(1, pIdEvalxstudent);
        stmt.setInt(2, pIdPerson);
        stmt.execute();
    }

    public static void updateEvaluationxstudentEvaluation(int pIdEvalxstudent, int pEvaluationCode) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_evaluationxstudent_eval(?, ?) }");
        stmt.setInt(1, pIdEvalxstudent);
        stmt.setInt(2, pEvaluationCode);
        stmt.execute();
    }

    public static void updateEvaluationxstudentPercentage(int pIdPersona, int pIdEvaluation, int pPercentageObtained) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call update_evalxstudent_perc(?, ?, ?)}");
        stmt.setInt(1, pIdPersona);
        stmt.setInt(2, pIdEvaluation);
        stmt.setInt(3, pPercentageObtained);
        stmt.execute();
    }
    
    public static void getDataBooklog(ArrayList<String> listaBooklog) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call dataBooklog()}"); 
        ResultSet r = stmt.executeQuery();
        while (r.next()) {
            listaBooklog.add(r.getString("scheme_name")); 
            listaBooklog.add(r.getString("table_name"));
            listaBooklog.add(r.getString("space_name"));
            listaBooklog.add(r.getString("old_value"));
            listaBooklog.add(r.getString("actual_value"));
            listaBooklog.add(r.getString("creation_date"));
            listaBooklog.add(r.getString("creation_user"));
        }
    }
    
    
    public static void getdataPerson(ArrayList<String> listaPerson) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call dataPerson()}"); 
        ResultSet r = stmt.executeQuery();
        while (r.next()) {
            listaPerson.add(r.getString("first_name")); 
            listaPerson.add(r.getString("middle_name"));
            listaPerson.add(r.getString("first_lastname"));
            listaPerson.add(r.getString("second_lastname"));
            listaPerson.add(r.getString("birth_day"));
            listaPerson.add(r.getString("type"));
        }
    }
    
    public static void getdataEmails(ArrayList<String> listaEmails) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call dataEmails()}"); 
        ResultSet r = stmt.executeQuery();
        while (r.next()) {
            listaEmails.add(r.getString("first_name")); 
            listaEmails.add(r.getString("middle_name"));
            listaEmails.add(r.getString("first_lastname"));
            listaEmails.add(r.getString("second_lastname"));
            listaEmails.add(r.getString("email_direction"));
        }
    }
    
    public static void getdataPhoneNumber(ArrayList<String> listaPhoneNumber) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call dataPhoneNumber()}"); 
        ResultSet r = stmt.executeQuery();
        while (r.next()) {
            listaPhoneNumber.add(r.getString("first_name")); 
            listaPhoneNumber.add(r.getString("first_name")); 
            listaPhoneNumber.add(r.getString("middle_name"));
            listaPhoneNumber.add(r.getString("first_lastname"));
            listaPhoneNumber.add(r.getString("second_lastname"));
            listaPhoneNumber.add(r.getString("number"));
            listaPhoneNumber.add(r.getString("type"));
        }
    }
    
    public static void getdataGender(ArrayList<String> listaGender) throws SQLException {
        CallableStatement stmt = con.prepareCall("{ call dataPerson()}"); 
        ResultSet r = stmt.executeQuery();
        while (r.next()) {
            listaGender.add(r.getString("type")); 
        }
    }
    
    public static void getdataEvaluation(ArrayList<String> listaEvaluation) throws SQLException {
        CallableStatement stmt = con.prepareCall("{ call dataEvaluation()}"); 
        ResultSet r = stmt.executeQuery();
        while (r.next()) {
            listaEvaluation.add(r.getString("evaluation_name")); 
            listaEvaluation.add(r.getString("evaluation_des"));
            listaEvaluation.add(r.getString("members"));
            listaEvaluation.add(r.getString("percentage"));
            listaEvaluation.add(r.getString("due_date"));
            listaEvaluation.add(r.getString("id_group"));
            listaEvaluation.add(r.getString("course_name"));
            
        }
    }
    
    public static void getdataCountry(ArrayList<String> listaCountry) throws SQLException {
        CallableStatement stmt = con.prepareCall("{ call dataCountry()}"); 
        ResultSet r = stmt.executeQuery();
        while (r.next()) {
            listaCountry.add(r.getString("country_name")); 
        }
    }
    
    public static void getdataCanton(ArrayList<String> listaCanton) throws SQLException {
        CallableStatement stmt = con.prepareCall("{ call dataCanton()}"); 
        ResultSet r = stmt.executeQuery();
        while (r.next()) {
            listaCanton.add(r.getString("canton_name")); 
            listaCanton.add(r.getString("province_name"));
        }
    }
    
    public static void getdataDistrict(ArrayList<String> listaDistrict) throws SQLException {
        CallableStatement stmt = con.prepareCall("{ call dataDistrict()}"); 
        ResultSet r = stmt.executeQuery();
        while (r.next()) {
            listaDistrict.add(r.getString("district_name")); 
            listaDistrict.add(r.getString("canton_name"));
        }
    }
    
    public static void getdataProvince(ArrayList<String> listaProvince) throws SQLException {
        CallableStatement stmt = con.prepareCall("{ call dataProvince()}"); 
        ResultSet r = stmt.executeQuery();
        while (r.next()) {
            listaProvince.add(r.getString("province_name")); 
            listaProvince.add(r.getString("country_name"));
        }
    }
    
    public static void getdataCourse(ArrayList<String> listaCourse) throws SQLException {
        CallableStatement stmt = con.prepareCall("{ call dataCourse()}"); 
        ResultSet r = stmt.executeQuery();
        while (r.next()) {
            listaCourse.add(r.getString("course_name")); 
            listaCourse.add(r.getString("credits"));
        }
    }
    
    public static void getdataGroup(ArrayList<String> listaGroup) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call dataGroup()}"); 
        ResultSet r = stmt.executeQuery();
        while (r.next()) {
            listaGroup.add(r.getString("id_group")); 
            listaGroup.add(r.getString("group_semester"));
            listaGroup.add(r.getString("first_name"));
            listaGroup.add(r.getString("middle_name"));
            listaGroup.add(r.getString("first_lastname"));
            listaGroup.add(r.getString("second_lastname"));
            listaGroup.add(r.getString("course_name"));
        }
    }
    
    //Paquete Estadisticas
    public static ArrayList<String> totalStudentsCourseGender(ArrayList<String> totalStudents, int pnCourseCode) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call totalStudentsCourseGender(?) }");
        stmt.setInt(1, pnCourseCode);
        ResultSet r = stmt.executeQuery(); 
        while(r.next()){
            totalStudents.add(r.getString("NombreCurso") + " " + r.getString("Genero") + " " + r.getString("TotalDeEstudiantes") );   
        }
        return totalStudents;
    }
    
    public static ArrayList<String> bestStudentsCourseGender(ArrayList<String> bestStudents, String pcCourseName, String pcGender, int pnTop) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call bestStudentsCourseGender(?, ?, ?) }");
        stmt.setString(1, pcCourseName);
        stmt.setString(2, pcGender);
        stmt.setInt(3, pnTop);
        ResultSet r = stmt.executeQuery(); 
        while(r.next()){
            bestStudents.add(r.getString("NombreCurso") + " " + r.getString("IdPersona") + " " + r.getString("Genero") + " " + r.getString("PorcentajeTotal"));   
        }
        return bestStudents;
    }
    
    public static ArrayList<String> notesAverage(ArrayList<String> notes) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call bestStudentsCourseGender()}");
        ResultSet r = stmt.executeQuery(); 
        while(r.next()){
            notes.add(r.getString("NombreCurso") + " " + r.getString("PromedioDeNotas"));   
        }
        return notes;
    }
    
    public static ArrayList<String>  totalStudentsRankAge(ArrayList<String> totalStudents) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call totalStudentsRankAge()}");
        ResultSet r = stmt.executeQuery(); 
        while(r.next()){
            totalStudents.add(r.getString("Cantidad"));   
        }
        return totalStudents;
    }
    
    //Paquete Consultas Estudiante
    public static ArrayList<String> coursesRegistered(ArrayList<String> courses, int pnIdPerson, int pnGroupSemester, int pnGroupYear) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call coursesRegistered(?, ?, ?) }");
        stmt.setInt(1, pnIdPerson);
        stmt.setInt(2, pnGroupSemester);
        stmt.setInt(3, pnGroupYear);
        ResultSet r = stmt.executeQuery(); 
        while(r.next()){
            courses.add(r.getString("NombreCurso") + " " + r.getString("Semestre") + " " + r.getString("Año"));   
        }
        return courses;
    }
    
    public static ArrayList<String> noteCourseAndEvaluations(ArrayList<String> notes, int pnIdPerson, String pcCourseName) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call coursesRegistered(?, ?) }");
        stmt.setInt(1, pnIdPerson);
        stmt.setString(2, pcCourseName);
        ResultSet r = stmt.executeQuery(); 
        while(r.next()){
            notes.add(r.getString("NombreCurso") + " " + r.getString("EvaluationName") + " " + r.getString("NotaEvaluacion")+ " " + r.getString("NotaTotal"));   
        }
        return notes;
    }
    
    //Paquete Consultas Profesor
    
    public static ArrayList<String> coursesTaught(ArrayList<String> courses, int pnIdProfessor, int pnSemester, int pnYear) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call coursesTaught(?, ?, ?) }");
        stmt.setInt(1, pnIdProfessor);
        stmt.setInt(2, pnSemester);
        stmt.setInt(3, pnYear);
        ResultSet r = stmt.executeQuery(); 
        while(r.next()){
            courses.add(r.getString("NombreCurso") + " " + r.getString("EvaluationName") + " " + r.getString("Semestre")+ " " + r.getString("Año"));   
        }
        return courses;
    }
    
    public static ArrayList<String> totalStudentsCourse(ArrayList<String> totalStudents, String pcCourseName) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call totalStudentsCourse(?)}");
        stmt.setString(1, pcCourseName);
        ResultSet r = stmt.executeQuery(); 
        while(r.next()){
            totalStudents.add(r.getString("Nombre") + " " + r.getString("NombreCurso") + " " + r.getString("DesEvaluación")+ " " + r.getString("Nota"));   
        }
        return totalStudents;
    }
    
    public static ArrayList<String> totalEvaluations(ArrayList<String> totalEvaluations, int pnIdPerson, String pcCourseName) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call totalEvaluations(?, ?)}");
        stmt.setInt(1, pnIdPerson);
        stmt.setString(2, pcCourseName);
        ResultSet r = stmt.executeQuery(); 
        while(r.next()){
            totalEvaluations.add(r.getString("Nombre") + " " + r.getString("NombreCurso") + " " + r.getString("DescripcionEvaluacion")+ " " + r.getString("IdEstudiante")+ " " + r.getString("FechaEntrega"));   
        }
        return totalEvaluations;
    }
    
    public static ArrayList<String> noteStudentCourse(ArrayList<String> notesStudent, String pcCourseName) throws SQLException {
        Connection con = conectorBaseNueva();
        CallableStatement stmt = con.prepareCall("{ call  noteStudentCourse(?)}");
        stmt.setString(1, pcCourseName);
        ResultSet r = stmt.executeQuery(); 
        while(r.next()){
            notesStudent.add(r.getString("Nombre") + " " + r.getString("NotaTotal"));   
        }
        return notesStudent;
    }
}