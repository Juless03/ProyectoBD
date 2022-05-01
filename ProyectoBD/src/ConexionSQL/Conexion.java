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
/**
 *
 * @author Juley
 */
public class Conexion {
    
    public static void addPhoneNumber(String pPhoneNumberDescription, String pPhonenumberPhone, int pIdPerson) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:BDPRUEBA";
        String uName = "mtec";
        String uPass = "mtec";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call AdminPerson.add_phonenumber(?,?,?) }");
        
        stmt.setString(1, pPhoneNumberDescription);
        stmt.setString(2, pPhonenumberPhone);
        stmt.setInt(3, pIdPerson);
        stmt.execute();
    
    }
}
