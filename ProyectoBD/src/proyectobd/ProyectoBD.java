/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd;


import ConexionSQL.Conexion;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juley
 */
public class ProyectoBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
          // Pruebas
        //Conexion.addPhoneNumber("Casa", "88888888", 3);
        //System.out.println(Conexion.inicioSesionAdmin("LauraAdmin", "LauraPassword"));
       //Conexion.consultarDistritos();
       // System.out.println(Conexion.consultarDistritosNumero("Cahuita"));
       //Conexion.consultarGenero();
        //System.out.println(Conexion.consultarGeneroCodigo("Femenino"));
        //Conexion.getPerson();
 
        //Conexion.updateCourseCredits("Cálculo Diferencial", 3);
        //Conexion.updateCourseName("Algebra", "Cálculo Diferencial");
        //Conexion.getStudentEvaluation(1);
        //Conexion.getStudentGroup(2);
        //Conexion.getStudent();
       
        ArrayList ArrayCursos = new ArrayList();
        ArrayList ArrayCursos1 = new ArrayList();
         /*
        String Fecha = "22/03/2022";
        java.sql.Date FechaNacimientoValidada = null;
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Date FechaDate = null;
        try {
            FechaDate = formatoFecha.parse(Fecha);
        } catch (ParseException ex) {
           Logger.getLogger(RegistroPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        FechaNacimientoValidada = new java.sql.Date(FechaDate.getTime()); 
        
        ArrayCursos1 = Conexion.coursesRegistered(ArrayCursos,"Bases de Datos I", 5, FechaNacimientoValidada);
        System.out.println(ArrayCursos1);
        */
     
        //System.out.println(Conexion.getIDPhone(11111111));
    }

    
}
