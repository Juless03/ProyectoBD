/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd;


import ConexionSQL.Conexion;
import java.sql.SQLException;

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
        String PersonaElegida = "Nelson Adolfo Alvarado Navarro";
        String[] nombrePartes = PersonaElegida.split(" ");
        String primerNombre =  nombrePartes[0]; 
        String segundoNombre = nombrePartes[1];
        String primerApellido = nombrePartes[2];
        String segundoApellido = nombrePartes[3];
        System.out.println("PrimerNombre: " + primerNombre);
        System.out.println("SegundoNombre: " + segundoNombre);
        System.out.println("PrimerApellido: " + primerApellido);
        System.out.println("SegundoApellido: " + segundoApellido);
    }
    
}
