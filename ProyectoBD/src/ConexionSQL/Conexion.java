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
import oracle.jdbc.OracleTypes;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.JComboBox;
/**
 *
 * @author Juley
 */
public class Conexion {

    
    public static String host = "jdbc:oracle:thin:@localhost:1521:NELSONBASE";
    public static String uName = "mtec";
    public static String uPass = "mtec";
     // Futura Prueba Conexion
    
        public static Connection conectarBase() throws SQLException{
            Connection con = DriverManager.getConnection(host, uName, uPass);
            return con;
        }
        
        public static void getStudentGroup(JComboBox comBoxEvaluacion,int pGroupCode) throws SQLException{
        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{?= call getStudentGroup(?)}");
        stmt.registerOutParameter(1,OracleTypes.CURSOR);
        stmt.setInt(2, pGroupCode);
        stmt.execute();
        ResultSet r = (ResultSet) stmt.getObject(1); 
        while(r.next()){
            comBoxEvaluacion.addItem(r.getString("id_person") + " " + r.getString("first_name") + " " + r.getString("middle_name") + " " + r.getString("first_lastname") + " " + r.getString("second_lastname") );  
            
            }
        }
        
        public static void getStudent(JComboBox comboBoxStudents) throws SQLException{
        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{?= call getStudent()}");
        stmt.registerOutParameter(1,OracleTypes.CURSOR);

        stmt.execute();
        ResultSet r = (ResultSet) stmt.getObject(1); 
        while(r.next()){
            comboBoxStudents.addItem(r.getString("id_person") + " " +r.getString("first_name") + " "+ r.getString("middle_name") + " " + r.getString("first_lastname") + " " + r.getString("second_lastname"));  
            }
        }
        
        public static void getCourse(JComboBox cbox_course) throws SQLException{
        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{?= call getCourse()}");
        stmt.registerOutParameter(1,OracleTypes.CURSOR);

        stmt.execute();
        ResultSet r = (ResultSet) stmt.getObject(1); 
        while(r.next()){
            cbox_course.addItem(r.getString("course_name"));  
            }
        }
        public static void getIDStudent(JComboBox comBoxEstudiante) throws SQLException{
        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{?= call getIDStudent()}");
        stmt.registerOutParameter(1,OracleTypes.CURSOR);

        stmt.execute();
        ResultSet r = (ResultSet) stmt.getObject(1); 
        while(r.next()){
            comBoxEstudiante.addItem(r.getString("id_person"));  
            }
        }
        
        public static void getStudentEvaluation(JComboBox comBoxEvaluacion, int pIDStudent) throws SQLException{
        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{?= call getIDEvalaution(?)}");
        stmt.registerOutParameter(1,OracleTypes.CURSOR);
        stmt.setInt(2, pIDStudent);
        stmt.execute();
        ResultSet r = (ResultSet) stmt.getObject(1); 
        while(r.next()){
            comBoxEvaluacion.addItem(r.getString("id_evalxstudent") + " " + r.getString("evaluation_des"));  
            }
        }
        
         
        public static void getCourseGroup(JComboBox cbox_coursegroup) throws SQLException{
        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{?= call getCourseGroup()}");
        stmt.registerOutParameter(1,OracleTypes.CURSOR);

        stmt.execute();
        ResultSet r = (ResultSet) stmt.getObject(1); 
        while(r.next()){
            cbox_coursegroup.addItem(r.getString("group_code"));  
            }
        }
    
        public void escribeImagenEnBBDD(int idPersona, Image mImagen) throws SQLException, IOException {
        
              Connection con = conectarBase(); // 
              PreparedStatement pstmt = con.prepareStatement("{  call actualizarPersona.update_Picture(?,?)  }");
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
        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{?= call getCantonCode(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setString(2, cantonName);
        stmt.execute();
        int Resultado = stmt.getInt(1);
        return Resultado;
    }

    public static void getCanton(JComboBox cbox_canton) throws SQLException {
        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{?= call getCanton()}");
        stmt.registerOutParameter(1, OracleTypes.CURSOR);

        stmt.execute();
        ResultSet r = (ResultSet) stmt.getObject(1);
        while (r.next()) {
            cbox_canton.addItem(r.getString("canton_name"));

        }
    }
    
    public static int getCountryCode(String countryName) throws SQLException {
        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{?= call getCountryCode(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setString(2, countryName);
        stmt.execute();
        int Resultado = stmt.getInt(1);
        return Resultado;
    }

    public static void getCountry(JComboBox cbox_country) throws SQLException {
        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{?= call getCountry()}");
        stmt.registerOutParameter(1, OracleTypes.CURSOR);

        stmt.execute();
        ResultSet r = (ResultSet) stmt.getObject(1);
        while (r.next()) {
            cbox_country.addItem(r.getString("country_name"));

        }
    }
    
     public static int getProvinceCode(String provinceName) throws SQLException {
        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{?= call getProvinceCode(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setString(2, provinceName);
        stmt.execute();
        int Resultado = stmt.getInt(1);
        return Resultado;
    }

    public static void getProvince(JComboBox cbox_province) throws SQLException {
        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{?= call getProvince()}");
        stmt.registerOutParameter(1, OracleTypes.CURSOR);

        stmt.execute();
        ResultSet r = (ResultSet) stmt.getObject(1);
        while (r.next()) {
            cbox_province.addItem(r.getString("province_name"));

        }
    }

    // Actualizar datos de distrito y genero RegistroPersonas
    public static String loginAdmin(String pUsuario, String pContraseña) throws SQLException {
        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{?= call adminLogin(?,?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setString(2, pUsuario);
        stmt.setString(3, pContraseña);
        stmt.execute();
        String Resultado = stmt.getString(1);
        return Resultado;
    }

    public static int getDistrictCode(String distritoName) throws SQLException {
        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{?= call getDistrictCode(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setString(2, distritoName);
        stmt.execute();
        int Resultado = stmt.getInt(1);
        return Resultado;
    }

    public static void getDistrict(JComboBox cbox_distrito) throws SQLException {
        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{?= call getDistrict()}");
        stmt.registerOutParameter(1, OracleTypes.CURSOR);

        stmt.execute();
        ResultSet r = (ResultSet) stmt.getObject(1);
        while (r.next()) {
            cbox_distrito.addItem(r.getString("district_name"));

        }
    }

    public static void getGender(JComboBox cbox_genero) throws SQLException {
        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{?= call getGender()}");
        stmt.registerOutParameter(1, OracleTypes.CURSOR);

        stmt.execute();
        ResultSet r = (ResultSet) stmt.getObject(1);
        while (r.next()) {
            cbox_genero.addItem(r.getString("gender_description"));
        }

    }

    public static int getGenderCode(String GeneroNombre) throws SQLException {
        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{?= call getGenderCode(?)}");
        stmt.registerOutParameter(1, Types.VARCHAR);
        stmt.setString(2, GeneroNombre);
        stmt.execute();
        int Resultado = stmt.getInt(1);
        return Resultado;
    }

    //funciones del paquete adminPerson
    public static int getPersonID(String pFirstName, String pMiddleName, String pFirstLastname, String pSecondLastname) throws SQLException {
        Connection con = conectarBase();
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
        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{?= call getPerson()}");
        stmt.registerOutParameter(1, OracleTypes.CURSOR);

        stmt.execute();
        ResultSet r = (ResultSet) stmt.getObject(1);
        while (r.next()) {
            cbox_personas.addItem(r.getString("first_name") + " " + r.getString("middle_name") + " " + r.getString("first_lastname") + " " + r.getString("second_lastname"));
        }
    }

    public static boolean addPerson(String pFirstName, String pMiddleName, String pFirstLastname, String pSecondLastname, int pGenderCode, int pDistrictCode, Date pBirthday) throws SQLException, ParseException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.add_person(?,?,?,?,?,?,?) }");
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
        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call update_person_first_name(?,?) }");
        stmt.setInt(1, pIdPerson);
        stmt.setString(2, pFirstName);
        stmt.execute();
    }
     
      public static void updatePersonMiddleName(int pIdPerson, String pMiddleName) throws SQLException{
        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call update_person_middle_name(?,?) }");
        stmt.setInt(1, pIdPerson);
        stmt.setString(2, pMiddleName);
        stmt.execute();
    }
      
    public static void updatePersonFirstLastName(int pIdPerson, String pFirstLastName) throws SQLException{
        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call update_person_first_last_name(?,?) }");
        stmt.setInt(1, pIdPerson);
        stmt.setString(2, pFirstLastName);
        stmt.execute();
    } 
    public static void updatePersonSecondLastName(int pIdPerson, String pSecondLastName) throws SQLException{
        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call update_person_second_last_name(?,?) }");
        stmt.setInt(1, pIdPerson);
        stmt.setString(2, pSecondLastName);
        stmt.execute();
    }

    public static void updatePersonGender(int pIdPerson, int pGenderCode) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.update_person_gender(?,?) }");

        stmt.setInt(1, pIdPerson);
        stmt.setInt(2, pGenderCode);
        stmt.execute();
    }

    public static void updatePersonDistrict(int pIdPerson, int pDistrictCode) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.update_person_district(?,?) }");

        stmt.setInt(1, pIdPerson);
        stmt.setInt(2, pDistrictCode);
        stmt.execute();
    }

    public static void updatePersonBirthday(int pIdPerson, Date pBirthday) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.update_person_birthday(?,?) }");
        stmt.setInt(1, pIdPerson);
        stmt.setDate(2, (java.sql.Date) pBirthday);
        stmt.execute();
    }

    public static void addAdmin(int pIdPerson, String pAdminUser, String pAdminPassword) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.add_admin(?,?,?) }");

        stmt.setInt(1, pIdPerson);
        stmt.setString(2, pAdminUser);
        stmt.setString(3, pAdminPassword);
        stmt.execute();
    }

    public static void updateAdminCredentials(int pIdPerson, String pAdminUser, String pAdminPassword) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.update_admin_credentials(?,?,?) }");

        stmt.setInt(1, pIdPerson);
        stmt.setString(2, pAdminUser);
        stmt.setString(3, pAdminPassword);
        stmt.execute();
    }

    public static void addProfessor(int pIdPerson) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.add_professor(?) }");

        stmt.setInt(1, pIdPerson);
        stmt.execute();
    }

    public static void addStudent(int pIdPerson) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.add_student(?) }");

        stmt.setInt(1, pIdPerson);
        stmt.execute();
    }

    public static void addEmail(String pEmailDirection, int pIdPerson) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.add_email(?, ?) }");

        stmt.setString(1, pEmailDirection);
        stmt.setInt(2, pIdPerson);
        stmt.execute();
    }

    public static void updateEmailDirection(int pEmailCode, int pEmailDirection) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.update_email_direction(?, ?) }");

        stmt.setInt(1, pEmailCode);
        stmt.setInt(2, pEmailDirection);
        stmt.execute();
    }

    public static void updateEmailPerson(int pEmailCode, int pIdPerson) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.update_email_person(?, ?) }");

        stmt.setInt(1, pEmailCode);
        stmt.setInt(2, pIdPerson);
        stmt.execute();
    }

    public static void addPhoneNumber(String pPhonenumberDescription, String pPhonenumberPhone, int pIdPerson) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.add_phonenumber(?, ?, ?) }");

        stmt.setString(1, pPhonenumberDescription);
        stmt.setString(2, pPhonenumberPhone);
        stmt.setInt(3, pIdPerson);
        stmt.execute();
    }

    public static void updatePhoneDescription(int pPhonenumberCode, String pPhonenumberDescription) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.update_phone_description(?, ?) }");

        stmt.setInt(1, pPhonenumberCode);
        stmt.setString(2, pPhonenumberDescription);
        stmt.execute();
    }

    public static void updatePhoneNumber(int pPhonenumberCode, int pPhonenumberPhone) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.update_phone_number(?, ?) }");

        stmt.setInt(1, pPhonenumberCode);
        stmt.setInt(2, pPhonenumberPhone);
        stmt.execute();
    }

    public static void updatePhonePerson(int pPhonenumberCode, int pIdPerson) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.update_phone_person(?, ?) }");

        stmt.setInt(1, pPhonenumberCode);
        stmt.setInt(2, pIdPerson);
        stmt.execute();
    }

    public static void addGender(String pGenderDescription) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.add_gender(?, ?) }");

        stmt.setString(1, pGenderDescription);
        stmt.execute();
    }

    public static void updateGenderDescription(int pGenderCode, String pGenderDescription) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.update_gender_description(?, ?) }");

        stmt.setInt(1, pGenderCode);
        stmt.setString(2, pGenderDescription);
        stmt.execute();
    }

    //funciones del paquete adminDirection
    public static void addProvince(String pProvinceName, int pCountryCode) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminDirection.add_person(?, ?) }");

        stmt.setString(1, pProvinceName);
        stmt.setInt(2, pCountryCode);
        stmt.execute();
    }

    public static void updateProvinceName(int pProvinceCode, String pProvinceName) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminDirection.update_province_name(?, ?) }");

        stmt.setInt(1, pProvinceCode);
        stmt.setString(2, pProvinceName);
        stmt.execute();
    }

    public static void updateProvinceCountry(int pProvinceCode, String pCountryCode) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminDirection.update_province_country(?, ?) }");

        stmt.setInt(1, pProvinceCode);
        stmt.setString(2, pCountryCode);
        stmt.execute();
    }

    public static void addCanton(String pCantonName, int pProvinceCode) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminDirection.add_canton(?, ?) }");

        stmt.setString(1, pCantonName);
        stmt.setInt(2, pProvinceCode);
        stmt.execute();
    }

    public static void updateCantonName(int pCantonCode, String pCantonName) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminDirection.update_canton_name(?, ?) }");

        stmt.setInt(1, pCantonCode);
        stmt.setString(2, pCantonName);
        stmt.execute();
    }

    public static void updateCantonProvince(int pCantonCode, int pProvinceCode) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminDirection.update_canton_province(?, ?) }");

        stmt.setInt(1, pCantonCode);
        stmt.setInt(2, pProvinceCode);
        stmt.execute();
    }

    public static void addCountry(String pCountryName) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminDirection.add_country(?) }");

        stmt.setString(1, pCountryName);
        stmt.execute();
    }

    public static void updateCountryName(int pCountryCode, String pCountryName) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminDirection.update_country_name(?, ?) }");

        stmt.setInt(1, pCountryCode);
        stmt.setString(2, pCountryName);
        stmt.execute();
    }

    public static void addDistrict(String pDistrictName, int pCantonCode) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminDirection.add_district(?, ?) }");

        stmt.setString(1, pDistrictName);
        stmt.setInt(2, pCantonCode);
        stmt.execute();
    }

    public static void updateDistrictName(int pDistrictCode, String pDistrictName) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminDirection.update_district_name(?, ?) }");

        stmt.setInt(1, pDistrictCode);
        stmt.setString(2, pDistrictName);
        stmt.execute();
    }

    public static void updateDistrictCanton(int pDistrictCode, int pCantonCode) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminDirection.update_district_canton(?, ?) }");

        stmt.setInt(1, pDistrictCode);
        stmt.setInt(2, pCantonCode);
        stmt.execute();
    }

    //funciones del paquete adminUniversity
    public static void addUniversity(String pUniversityName) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminUniversity.add_university(?) }");

        stmt.setString(1, pUniversityName);
        stmt.execute();
    }

    public static void addUniversityXPerson(int pIdPerson, int pUniversityCode) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminUniversity.add_universityxperson(?, ?) }");

        stmt.setInt(1, pIdPerson);
        stmt.setInt(1, pUniversityCode);
        stmt.execute();
    }

    //funciones del paquete adminCourse
    public static void addStudentxgroup(int pIdPerson, int pGroupCode, int pReviewCode, String pStatus) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminCourse.add_studentxgroup(?, ?, ?, ?) }");

        stmt.setInt(1, pIdPerson);
        stmt.setInt(2, pGroupCode);
        stmt.setInt(3, pReviewCode);
        stmt.setString(4, pStatus);
        stmt.execute();
    }

    public static void upadateStudentxgroupReview(int pIdPerson, int pGroupCode, int pReviewCode) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminCourse.update_studentxgroup_review(?, ?, ?) }");

        stmt.setInt(1, pIdPerson);
        stmt.setInt(2, pGroupCode);
        stmt.setInt(3, pReviewCode);
        stmt.execute();
    }

    public static void updateStudentxgroupStatus(int pIdPerson, int pGroupCode, String pStatus) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminCourse.update_studentxgroup_status(?, ?, ?) }");

        stmt.setInt(1, pIdPerson);
        stmt.setInt(2, pGroupCode);
        stmt.setString(3, pStatus);
        stmt.execute();
    }

    public static void addReview(int pStars, String pReviewDescription, int pIdPerson, int pIdProfessor) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminCourse.add_review(?, ?, ?, ?) }");

        stmt.setInt(1, pStars);
        stmt.setString(2, pReviewDescription);
        stmt.setInt(3, pIdPerson);
        stmt.setInt(4, pIdProfessor);
        stmt.execute();
    }

    public static void updateReviewStars(int pReviewCode, int pStars) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminCourse.update_review_stars(?, ?) }");

        stmt.setInt(1, pReviewCode);
        stmt.setInt(2, pStars);
        stmt.execute();
    }

    public static void updateReviewDescription(int pReviewCode, String pReviewDescription) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminCourse.update_review_description(?, ?) }");

        stmt.setInt(1, pReviewCode);
        stmt.setString(2, pReviewDescription);
        stmt.execute();
    }

    public static void updateReviewPerson(int pReviewCode, int pIdPerson) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminCourse.update_review_description(?, ?) }");

        stmt.setInt(1, pReviewCode);
        stmt.setInt(2, pIdPerson);
        stmt.execute();
    }

    public static void updateReviewProfessor(int pReviewCode, int pIdProfessor) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminCourse.update_review_professor(?, ?) }");

        stmt.setInt(1, pReviewCode);
        stmt.setInt(2, pIdProfessor);
        stmt.execute();
    }

    public static void addCourse(int pCredits, String pCourseName) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminCourse.add_course(?, ?) }");

        stmt.setInt(1, pCredits);
        stmt.setString(2, pCourseName);
        stmt.execute();
    }

    public static void updateCourseCredits(String pCourseName, int pCredits) throws SQLException {
        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call update_course_credits2(?, ?) }");
        stmt.setString(1, pCourseName);
        stmt.setInt(2, pCredits);
        stmt.execute();
    }

    public static void updateCourseName(String pCourseName, String pNewCourseName) throws SQLException {
        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call update_course_name2(?, ?) }");
        stmt.setString(1, pCourseName);
        stmt.setString(2, pNewCourseName);
        stmt.execute();
    }

    /*
    public static void addCourseGroup(pGroupYear, int pGroupSemester, int pIdProfessor, int pIdCourse) throws SQLException{
        
        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminCourse.add_coursegroup(?, ?, ?, ?) }");
        
        stmt.setInt(1, pGroupYear);
        stmt.setInt(2, pGroupSemester);
        stmt.setInt(3, pIdProfessor);
        stmt.setInt(4, pIdCourse);
        stmt.execute(); 
    }
   */
    public static void updateCourseGroupYear(int pGroupCode, Date pGroupYear) throws SQLException{
        
        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminCourse.update_coursegroup_year(?, ?) }");
        
        stmt.setInt(1, pGroupCode);
        stmt.setDate(2, (java.sql.Date) pGroupYear);
        stmt.execute(); 
    }
     
    public static void updateCourseGroupSemester(int pGroupCode, int pGroupSemester) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminCourse.update_coursegroup_semester(?, ?) }");

        stmt.setInt(1, pGroupCode);
        stmt.setInt(2, pGroupSemester);
        stmt.execute();
    }

    public static void updateCourseGroupProfessor(int pGroupCode, int pIdProfessor) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminCourse.update_coursegroup_professor(?, ?) }");

        stmt.setInt(1, pGroupCode);
        stmt.setInt(2, pIdProfessor);
        stmt.execute();
    }

    public static void updateCourseGroupCourse(int pGroupCode, int pIdCourse) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminCourse.update_coursegroup_course(?, ?) }");

        stmt.setInt(1, pGroupCode);
        stmt.setInt(2, pIdCourse);
        stmt.execute();
    }

    
    public static void addEvaluation(String pEvaluationName, String pEvaluationDes, String pMembers, int pPercentage, Date pDueDate) throws SQLException{
        
        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminCourse.add_evaluation(?, ?, ?, ?, ?) }");
        stmt.setString(1, pEvaluationName);
        stmt.setString(2, pEvaluationDes);
        stmt.setString(3, pMembers);
        stmt.setInt(4, pPercentage);
        stmt.setDate(5, (java.sql.Date) pDueDate);
        stmt.execute(); 
    }
     

    public static void updateEvaluationName(int pEvaluationCode, String pEvaluationName) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminCourse.update_evaluation_name(?, ?) }");

        stmt.setInt(1, pEvaluationCode);
        stmt.setString(2, pEvaluationName);
        stmt.execute();
    }

    public static void updateEvaluationMembers(int pEvaluationCode, int pMembers) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminCourse.update_evaluation_members(?, ?) }");

        stmt.setInt(1, pEvaluationCode);
        stmt.setInt(2, pMembers);
        stmt.execute();
    }

    public static void updateEvaluationPercentage(int pEvaluationCode, int pPercentage) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminCourse.update_evaluation_percentage(?, ?) }");

        stmt.setInt(1, pEvaluationCode);
        stmt.setInt(2, pPercentage);
        stmt.execute();
    }

    /*
    public static void updateEvaluationDueDate(int pEvaluationCode, pDueDate) throws SQLException{
        
        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminCourse.update_evaluation_duedate(?, ?) }");
        
        stmt.setInt(1, pEvaluationCode);
        stmt.setInt(2, pDueDate);
        stmt.execute(); 
    }
     */
    public static void addEvaluationxStudent(int pIdPerson, int pEvaluationCode, int pPercentageObtained) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminCourse.add_evaluationxstudent(?, ?, ?) }");

        stmt.setInt(1, pIdPerson);
        stmt.setInt(2, pEvaluationCode);
        stmt.setInt(3, pPercentageObtained);
        stmt.execute();
    }

    public static void updateEvaluationxstudentStudent(int pIdEvalxstudent, int pIdPerson) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminCourse.update_evaluationxstudent_stud(?, ?) }");

        stmt.setInt(1, pIdEvalxstudent);
        stmt.setInt(2, pIdPerson);
        stmt.execute();
    }

    public static void updateEvaluationxstudentEvaluation(int pIdEvalxstudent, int pEvaluationCode) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminCourse.update_evaluationxstudent_eval(?, ?) }");

        stmt.setInt(1, pIdEvalxstudent);
        stmt.setInt(2, pEvaluationCode);
        stmt.execute();
    }

    public static void updateEvaluationxstudentPercentage(int pIdEvalxstudent, int pPercentageObtained) throws SQLException {

        Connection con = conectarBase();
        CallableStatement stmt = con.prepareCall("{ call AdminCourse.update_evaluationxstudent_perc(?, ?) }");

        stmt.setInt(1, pIdEvalxstudent);
        stmt.setInt(2, pPercentageObtained);
        stmt.execute();
    }
}
