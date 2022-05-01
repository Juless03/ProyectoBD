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
    
    public static void addAdmin(int pIdPerson, String pAdminUser, String pAdminPassword) throws SQLException{
        
        String host = "jdbc:oracle:thin:@localhost:1521:BDPRUEBA";
        String uName = "mtec";
        String uPass = "mtec";
        
        Connection con = DriverManager.getConnection(host, uName, uPass);
        CallableStatement stmt = con.prepareCall("{ call addAdmin(?,?,?) }");
        
        stmt.setInt(1, pIdPerson);
        stmt.setString(2, pAdminUser);
        stmt.setString(3, pAdminPassword);
        stmt.execute();
    
    }
}
