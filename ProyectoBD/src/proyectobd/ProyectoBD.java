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
        ArrayList<String> totalStudents = new ArrayList();
        Conexion.totalStudentsRankAge(totalStudents);
        System.out.println(totalStudents.toString());
        
        
        /*ArrayList<String> prueba = new ArrayList();
        Conexion.getDataBooklog(prueba);
        System.out.println(prueba.toString());
        prueba.clear();
        Conexion.getdataPerson(prueba);
        System.out.println(prueba.toString());
        prueba.clear();
        Conexion.getdataEmails(prueba);
        System.out.println(prueba.toString());
        prueba.clear();
        Conexion.getdataPhoneNumber(prueba);
        System.out.println(prueba.toString());
        prueba.clear();
        Conexion.getdataGender(prueba);
        System.out.println(prueba.toString());
        prueba.clear();
        Conexion.getdataEvaluation(prueba);
        System.out.println(prueba.toString());
        prueba.clear();
        Conexion.getdataCountry(prueba);
        System.out.println(prueba.toString());
        prueba.clear();
        Conexion.getdataCanton(prueba);
        System.out.println(prueba.toString());
        prueba.clear();
        Conexion.getdataDistrict(prueba);
        System.out.println(prueba.toString());
        prueba.clear();
        Conexion.getdataProvince(prueba);
        System.out.println(prueba.toString());
        prueba.clear();
        Conexion.getdataCourse(prueba);
        System.out.println(prueba.toString());
        prueba.clear();
        Conexion.getdataGroup(prueba);
        System.out.println(prueba.toString());
        prueba.clear();*/
        
          // Pruebas
        //Conexion.addPhoneNumber("Casa", "88888888", 3);
        //System.out.println(Conexion.inicioSesionAdmin("LauraAdmin", "LauraPassword"));
       //Conexion.consultarDistritos();
       // System.out.println(Conexion.consultarDistritosNumero("Cahuita"));
       //Conexion.consultarGenero();
        //System.out.println(Conexion.consultarGeneroCodigo("Femenino"));
        //System.out.println(Conexion.getIDCourse("Inglés"));
 
        //Conexion.updateCourseCredits("Cálculo Diferencial", 3);
        //Conexion.updateCourseName("Algebra", "Cálculo Diferencial");
        //Conexion.getStudentEvaluation(1);
        //Conexion.getStudentGroup(2);
        //Conexion.getStudent();
       //Conexion.getStudentEvaluation(20221);
        //ArrayList ArrayCursos = new ArrayList();
        //ArrayList ArrayCursos1 = new ArrayList();
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
        // Conexion.getPhoneNumber(6);
        
        //System.out.println(Conexion.getIDPhone(11111111));
        //System.out.println(Conexion.encriptarContraseña("La@11"));
        //Conexion.updatePersonDistrict(1, 1);
    }

    
}
