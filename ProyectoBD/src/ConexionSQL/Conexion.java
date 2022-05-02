/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionSQL;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import oracle.jdbc.OracleTypes;
import java.util.Date;
/**
 *
 * @author Juley
 */
public class Conexion {
    
    //funciones del paquete adminPerson
    
    public static void addPerson(String pFirstName, String pMiddleName, String pFirstLastname, String pSecondLastname, int pGenderCode, int pDistrictCode,  pBirthday) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:BDPRUEBA";
        String uName = "mtec";
        String uPass = "mtec";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.add_person(?,?,?,?,?,?,?,?) }");
        
        stmt.setString(1, pFirstName);
        stmt.setString(2, pMiddleName);
        stmt.setString(3, pFirstLastname);
        stmt.setString(3, pSecondLastname);
        stmt.setInt(4, pGenderCode);
        stmt.setInt(5, pDistrictCode);
        stmt.setDate(6, pBirthday);
        stmt.execute();
    }
    
     public static void updatePersonName(int pIdPerson, String pFirstName, String pMiddleName, String pFirstLastName, String pSecondLastName) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:BDPRUEBA";
        String uName = "mtec";
        String uPass = "mtec";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.update_person_name(?,?,?,?,?) }");
        
        stmt.setInt(1, pIdPerson);
        stmt.setString(2, pFirstName);
        stmt.setString(3, pMiddleName);
        stmt.setString(4, pFirstLastName);
        stmt.setString(5, pSecondLastName);
        stmt.execute();
    }
     
    public static void updatePersonGender(int pIdPerson, int pGenderCode) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:BDPRUEBA";
        String uName = "mtec";
        String uPass = "mtec";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.update_person_gender(?,?) }");
        
        stmt.setInt(1, pIdPerson);
        stmt.setInt(2, pGenderCode);
        stmt.execute(); 
    }
    
    public static void updatePersonDistrict(int pIdPerson, int pDistrictCode) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:BDPRUEBA";
        String uName = "mtec";
        String uPass = "mtec";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.update_person_district(?,?) }");
        
        stmt.setInt(1, pIdPerson);
        stmt.setInt(2, pDistrictCode);
        stmt.execute(); 
    }
    
    public static void updatePersonBirthday(int pIdPerson, pBirthday) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:BDPRUEBA";
        String uName = "mtec";
        String uPass = "mtec";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.update_person_birthday(?,?) }");
        
        stmt.setInt(1, pIdPerson);
        stmt.setInt(2, pBirthday);
        stmt.execute(); 
    }
    
    public static void addAdmin(int pIdPerson, String pAdminUser, String pAdminPassword) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:BDPRUEBA";
        String uName = "mtec";
        String uPass = "mtec";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.add_admin(?,?,?) }");
        
        stmt.setInt(1, pIdPerson);
        stmt.setString(2, pAdminUser);
        stmt.setString(3, pAdminPassword);
        stmt.execute(); 
    }
    
    public static void updateAdminCredentials(int pIdPerson, String pAdminUser, String pAdminPassword) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:BDPRUEBA";
        String uName = "mtec";
        String uPass = "mtec";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.update_admin_credentials(?,?,?) }");
        
        stmt.setInt(1, pIdPerson);
        stmt.setString(2, pAdminUser);
        stmt.setString(3, pAdminPassword);
        stmt.execute(); 
    }
    
    public static void addProfessor(int pIdPerson) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:BDPRUEBA";
        String uName = "mtec";
        String uPass = "mtec";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.add_professor(?) }");
        
        stmt.setInt(1, pIdPerson);
        stmt.execute(); 
    }
    
    public static void addStudent(int pIdPerson) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:BDPRUEBA";
        String uName = "mtec";
        String uPass = "mtec";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.add_student(?) }");
        
        stmt.setInt(1, pIdPerson);
        stmt.execute(); 
    }
    
    public static void addEmail(String pEmailDirection, int pIdPerson) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:BDPRUEBA";
        String uName = "mtec";
        String uPass = "mtec";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.add_email(?, ?) }");
        
        stmt.setString(1, pEmailDirection);
        stmt.setInt(2, pIdPerson);
        stmt.execute(); 
    }
    
    public static void updateEmailDirection(int pEmailCode, int pEmailDirection) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:BDPRUEBA";
        String uName = "mtec";
        String uPass = "mtec";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.update_email_direction(?, ?) }");
        
        stmt.setInt(1, pEmailCode);
        stmt.setInt(2, pEmailDirection);
        stmt.execute(); 
    }
    
    public static void updateEmailPerson(int pEmailCode, int pIdPerson) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:BDPRUEBA";
        String uName = "mtec";
        String uPass = "mtec";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.update_email_person(?, ?) }");
        
        stmt.setInt(1, pEmailCode);
        stmt.setInt(2, pIdPerson);
        stmt.execute(); 
    }
    
    public static void addPhoneNumber(String pPhonenumberDescription, String pPhonenumberPhone, int pIdPerson) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:BDPRUEBA";
        String uName = "mtec";
        String uPass = "mtec";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.add_phonenumber(?, ?, ?) }");
        
        stmt.setString(1, pPhonenumberDescription);
        stmt.setString(2, pPhonenumberPhone);
        stmt.setInt(3, pIdPerson);
        stmt.execute(); 
    }
    
    public static void updatePhoneDescription(int pPhonenumberCode, String pPhonenumberDescription) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:BDPRUEBA";
        String uName = "mtec";
        String uPass = "mtec";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.update_phone_description(?, ?) }");
        
        stmt.setInt(1, pPhonenumberCode);
        stmt.setString(2, pPhonenumberDescription);
        stmt.execute(); 
    }
    
    public static void updatePhoneNumber(int pPhonenumberCode, int pPhonenumberPhone) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:BDPRUEBA";
        String uName = "mtec";
        String uPass = "mtec";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.update_phone_number(?, ?) }");
        
        stmt.setInt(1, pPhonenumberCode);
        stmt.setInt(2, pPhonenumberPhone);
        stmt.execute(); 
    }
    
    public static void updatePhonePerson(int pPhonenumberCode, int pIdPerson) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:BDPRUEBA";
        String uName = "mtec";
        String uPass = "mtec";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.update_phone_person(?, ?) }");
        
        stmt.setInt(1, pPhonenumberCode);
        stmt.setInt(2, pIdPerson);
        stmt.execute(); 
    }
      
    public static void addGender(String pGenderDescription) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:BDPRUEBA";
        String uName = "mtec";
        String uPass = "mtec";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.add_gender(?, ?) }");
        
        stmt.setString(1, pGenderDescription);
        stmt.execute(); 
    }
    
    public static void updateGenderDescription(int pGenderCode, String pGenderDescription) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:BDPRUEBA";
        String uName = "mtec";
        String uPass = "mtec";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.update_gender_description(?, ?) }");
        
        stmt.setInt(1, pGenderCode);
        stmt.setString(2, pGenderDescription);
        stmt.execute(); 
    }
    
    //funciones del paquete adminDirection
    
    public static void addProvince(String pProvinceName, int pCountryCode) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:BDPRUEBA";
        String uName = "mtec";
        String uPass = "mtec";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call AdminDirection.add_person(?, ?) }");
        
        stmt.setString(1, pProvinceName);
        stmt.setInt(2, pCountryCode);
        stmt.execute(); 
    }
    
    public static void updateProvinceName(int pProvinceCode, String pProvinceName) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:BDPRUEBA";
        String uName = "mtec";
        String uPass = "mtec";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call AdminDirection.update_province_name(?, ?) }");
        
        stmt.setInt(1, pProvinceCode);
        stmt.setString(2, pProvinceName);
        stmt.execute(); 
    }
    
    public static void updateProvinceCountry(int pProvinceCode, String pCountryCode) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:BDPRUEBA";
        String uName = "mtec";
        String uPass = "mtec";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call AdminDirection.update_province_country(?, ?) }");
        
        stmt.setInt(1, pProvinceCode);
        stmt.setString(2, pCountryCode);
        stmt.execute(); 
    }
    
    public static void addCanton(String pCantonName, int pProvinceCode) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:BDPRUEBA";
        String uName = "mtec";
        String uPass = "mtec";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call AdminDirection.add_canton(?, ?) }");
        
        stmt.setString(1, pCantonName);
        stmt.setInt(2, pProvinceCode);
        stmt.execute(); 
    }
    
    public static void updateCantonName(int pCantonCode, String pCantonName) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:BDPRUEBA";
        String uName = "mtec";
        String uPass = "mtec";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call AdminDirection.update_canton_name(?, ?) }");
        
        stmt.setInt(1, pCantonCode);
        stmt.setString(2, pCantonName);
        stmt.execute(); 
    }
    
    public static void updateCantonProvince(int pCantonCode, int pProvinceCode) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:BDPRUEBA";
        String uName = "mtec";
        String uPass = "mtec";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call AdminDirection.update_canton_province(?, ?) }");
        
        stmt.setInt(1, pCantonCode);
        stmt.setInt(2, pProvinceCode);
        stmt.execute(); 
    }
    
    public static void addCountry(String pCountryName) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:BDPRUEBA";
        String uName = "mtec";
        String uPass = "mtec";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call AdminDirection.add_country(?) }");
        
        stmt.setString(1, pCountryName);
        stmt.execute(); 
    }
    
    public static void updateCountryName(int pCountryCode, String pCountryName) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:BDPRUEBA";
        String uName = "mtec";
        String uPass = "mtec";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call AdminDirection.update_country_name(?, ?) }");
        
        stmt.setInt(1, pCountryCode);
        stmt.setString(2, pCountryName);
        stmt.execute(); 
    }
    
    public static void addDistrict(String pDistrictName, int pCantonCode) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:BDPRUEBA";
        String uName = "mtec";
        String uPass = "mtec";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call AdminDirection.add_district(?, ?) }");
        
        stmt.setString(1, pDistrictName);
        stmt.setInt(2, pCantonCode);
        stmt.execute(); 
    }
    
    public static void updateDistrictName(int pDistrictCode, String pDistrictName) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:BDPRUEBA";
        String uName = "mtec";
        String uPass = "mtec";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call AdminDirection.update_district_name(?, ?) }");
        
        stmt.setInt(1, pDistrictCode);
        stmt.setString(2, pDistrictName);
        stmt.execute(); 
    }
    
    public static void updateDistrictCanton(int pDistrictCode, int pCantonCode) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:BDPRUEBA";
        String uName = "mtec";
        String uPass = "mtec";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call AdminDirection.update_district_canton(?, ?) }");
        
        stmt.setInt(1, pDistrictCode);
        stmt.setInt(2, pCantonCode);
        stmt.execute(); 
    }
    
    //funciones del paquete adminUniversity
    
    public static void addUniversity(String pUniversityName) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:BDPRUEBA";
        String uName = "mtec";
        String uPass = "mtec";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call AdminDirection.add_university(?) }");
        
        stmt.setString(1, pUniversityName);
        stmt.execute(); 
    }
    
    public static void addUniversityXPerson(int pIdPerson, int pUniversityCode) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:BDPRUEBA";
        String uName = "mtec";
        String uPass = "mtec";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call AdminDirection.add_universityxperson(?, ?) }");
        
        stmt.setInt(1, pIdPerson);
        stmt.setInt(1, pUniversityCode);
        stmt.execute(); 
    }
}