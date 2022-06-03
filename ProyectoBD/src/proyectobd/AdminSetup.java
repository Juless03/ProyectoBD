/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd;

import ConexionSQL.Conexion;
import java.awt.Color;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paubo
 */
public class AdminSetup extends javax.swing.JDialog {
    
     private Conexion setupAdmin;
    /**
     * Creates new form AdminSetup
     */
    public AdminSetup(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(157,210,228));
    }
    
     public AdminSetup(InicioSesionAdministrador aThis, boolean modal, Conexion inicioSesionAd) throws SQLException {
        super(aThis, modal);
        initComponents();
        setupAdmin = inicioSesionAd;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(157,210,228));
    }
     
     public AdminSetup(RegistroPersona aThis, boolean modal, Conexion registroDatos) throws SQLException {
        super(aThis, modal);
        initComponents();
        setupAdmin = registroDatos;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(157,210,228));
    }

    AdminSetup(RegistrarEvaluaciones aThis, boolean modal, Conexion registrarEvaluaciones) throws SQLException{
        super(aThis, modal);
        initComponents();
        setupAdmin = registrarEvaluaciones;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(157,210,228));
    }

    AdminSetup(RegistrarDireccion aThis, boolean modal, Conexion registrarDireccion) throws SQLException {
        super(aThis, modal);
        initComponents();
        setupAdmin = registrarDireccion;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(157,210,228));
    }

    AdminSetup(RegistrarCursos aThis, boolean modal, Conexion registrarCursos) throws SQLException{
        super(aThis, modal);
        initComponents();
        setupAdmin = registrarCursos;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(157,210,228));
    }

    AdminSetup(ModificarEvaluaciones aThis, boolean modal, Conexion modificarEvaluaciones) throws SQLException{
        super(aThis, modal);
        initComponents();
        setupAdmin = modificarEvaluaciones;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(157,210,228));
    }

    AdminSetup(ModificarDireccion aThis, boolean modal, Conexion modificarDireccion) throws SQLException{
        super(aThis, modal);
        initComponents();
        setupAdmin = modificarDireccion;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(157,210,228));
    }

    AdminSetup(ModificarPersona aThis, boolean modal, Conexion modificarDatos) throws SQLException{
        super(aThis, modal);
        initComponents();
        setupAdmin = modificarDatos;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(157,210,228));
    }

    AdminSetup(ModificarCursos aThis, boolean modal, Conexion modificarCurso) throws SQLException{
        super(aThis, modal);
        initComponents();
        setupAdmin = modificarCurso;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(157,210,228));
    }

    AdminSetup(ConsultarEstadisticas aThis, boolean modal, Conexion consultarEstadisticas) throws SQLException{
        super(aThis, modal);
        initComponents();
        setupAdmin = consultarEstadisticas;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(157,210,228));
    }

    AdminSetup(ConsultasProfesor aThis, boolean modal, Conexion evaluacionDocente) throws SQLException{
        super(aThis, modal);
        initComponents();
        setupAdmin = evaluacionDocente;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(157,210,228));
    }

    AdminSetup(ConsultasEstudiante aThis, boolean modal, Conexion inicioEstudiante) throws SQLException{
        super(aThis, modal);
        initComponents();
        setupAdmin = inicioEstudiante;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(157,210,228));
    }

    AdminSetup(Booklog aThis, boolean modal, Conexion booklog)throws SQLException{
        super(aThis, modal);
        initComponents();
        setupAdmin = booklog;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(157,210,228));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BotonRegistrarPersona = new javax.swing.JButton();
        BotonModificarPersona = new javax.swing.JButton();
        BotonEstadisticas = new javax.swing.JButton();
        BotonEstudiantes = new javax.swing.JButton();
        BotonProfesores = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        BotonRegistrarCursos = new javax.swing.JButton();
        BotonRegistrarEvaluaciones = new javax.swing.JButton();
        BotonRegistrarDireccion = new javax.swing.JButton();
        BotonModificarCursos = new javax.swing.JButton();
        BotonModificarEvaluaciones = new javax.swing.JButton();
        BotonModificarDireccion = new javax.swing.JButton();
        botonRegistrarGenero = new javax.swing.JButton();
        botonBitacora = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 36)); // NOI18N
        jLabel1.setText("Admin");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 62, -1, -1));

        BotonRegistrarPersona.setBackground(new java.awt.Color(255, 193, 5));
        BotonRegistrarPersona.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        BotonRegistrarPersona.setText("Registrar Persona");
        BotonRegistrarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarPersonaActionPerformed(evt);
            }
        });
        getContentPane().add(BotonRegistrarPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 167, 205, -1));

        BotonModificarPersona.setBackground(new java.awt.Color(255, 193, 5));
        BotonModificarPersona.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        BotonModificarPersona.setText("Modificar Persona");
        BotonModificarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarPersonaActionPerformed(evt);
            }
        });
        getContentPane().add(BotonModificarPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 167, 200, -1));

        BotonEstadisticas.setBackground(new java.awt.Color(255, 193, 5));
        BotonEstadisticas.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        BotonEstadisticas.setText("Consultar Estadisticas");
        BotonEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEstadisticasActionPerformed(evt);
            }
        });
        getContentPane().add(BotonEstadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(666, 167, 200, -1));

        BotonEstudiantes.setBackground(new java.awt.Color(255, 193, 5));
        BotonEstudiantes.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        BotonEstudiantes.setText("Consultas Estudiantes");
        BotonEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEstudiantesActionPerformed(evt);
            }
        });
        getContentPane().add(BotonEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(666, 210, 200, -1));

        BotonProfesores.setBackground(new java.awt.Color(255, 193, 5));
        BotonProfesores.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        BotonProfesores.setText("Consultas Profesores");
        BotonProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonProfesoresActionPerformed(evt);
            }
        });
        getContentPane().add(BotonProfesores, new org.netbeans.lib.awtextra.AbsoluteConstraints(666, 253, 200, -1));

        regresar.setBackground(new java.awt.Color(255, 193, 5));
        regresar.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 110, -1));

        BotonRegistrarCursos.setBackground(new java.awt.Color(255, 193, 5));
        BotonRegistrarCursos.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        BotonRegistrarCursos.setText("Registrar Cursos");
        BotonRegistrarCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarCursosActionPerformed(evt);
            }
        });
        getContentPane().add(BotonRegistrarCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 210, 205, -1));

        BotonRegistrarEvaluaciones.setBackground(new java.awt.Color(255, 193, 5));
        BotonRegistrarEvaluaciones.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        BotonRegistrarEvaluaciones.setText("Registrar Evaluaciones");
        BotonRegistrarEvaluaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarEvaluacionesActionPerformed(evt);
            }
        });
        getContentPane().add(BotonRegistrarEvaluaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 253, -1, -1));

        BotonRegistrarDireccion.setBackground(new java.awt.Color(255, 193, 5));
        BotonRegistrarDireccion.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        BotonRegistrarDireccion.setText("Registrar Dirección ");
        BotonRegistrarDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarDireccionActionPerformed(evt);
            }
        });
        getContentPane().add(BotonRegistrarDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 296, 205, -1));

        BotonModificarCursos.setBackground(new java.awt.Color(255, 193, 5));
        BotonModificarCursos.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        BotonModificarCursos.setText("Modificar Cursos");
        BotonModificarCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarCursosActionPerformed(evt);
            }
        });
        getContentPane().add(BotonModificarCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 210, 200, -1));

        BotonModificarEvaluaciones.setBackground(new java.awt.Color(255, 193, 5));
        BotonModificarEvaluaciones.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        BotonModificarEvaluaciones.setText("Modificar Evaluaciones");
        BotonModificarEvaluaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarEvaluacionesActionPerformed(evt);
            }
        });
        getContentPane().add(BotonModificarEvaluaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 253, 200, -1));

        BotonModificarDireccion.setBackground(new java.awt.Color(255, 193, 5));
        BotonModificarDireccion.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        BotonModificarDireccion.setText("Modificar Dirección");
        BotonModificarDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarDireccionActionPerformed(evt);
            }
        });
        getContentPane().add(BotonModificarDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 296, 200, -1));

        botonRegistrarGenero.setBackground(new java.awt.Color(255, 193, 5));
        botonRegistrarGenero.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        botonRegistrarGenero.setText("Registrar Genero");
        botonRegistrarGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarGeneroActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrarGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 343, 205, -1));

        botonBitacora.setBackground(new java.awt.Color(255, 193, 5));
        botonBitacora.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        botonBitacora.setText("Bitácora");
        botonBitacora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBitacoraActionPerformed(evt);
            }
        });
        getContentPane().add(botonBitacora, new org.netbeans.lib.awtextra.AbsoluteConstraints(666, 296, 200, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegistrarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarPersonaActionPerformed
       this.dispose();
        RegistroPersona iniRegistroDatos;
         try {
             iniRegistroDatos = new RegistroPersona(this,true,setupAdmin);
             iniRegistroDatos.setVisible(true);
         } catch (SQLException ex) {
             Logger.getLogger(AdminSetup.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(AdminSetup.class.getName()).log(Level.SEVERE, null, ex);
         }
       
    }//GEN-LAST:event_BotonRegistrarPersonaActionPerformed

    private void BotonModificarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarPersonaActionPerformed
        this.dispose();
        ModificarPersona ventanaModificarDatos = null;
         try {
             ventanaModificarDatos = new ModificarPersona(this,true,setupAdmin);
         } catch (SQLException ex) {
             Logger.getLogger(AdminSetup.class.getName()).log(Level.SEVERE, null, ex);
         }
        ventanaModificarDatos.setVisible(true);
    }//GEN-LAST:event_BotonModificarPersonaActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        this.dispose();
        InicioSesionAdministrador ventaAdmin = new InicioSesionAdministrador(this,true,setupAdmin);
        ventaAdmin.setVisible(true);

    }//GEN-LAST:event_regresarActionPerformed

    private void BotonRegistrarCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarCursosActionPerformed
        this.dispose();
        RegistrarCursos registrarCursos = null;
         try {
             registrarCursos = new RegistrarCursos(this,true,setupAdmin);
         } catch (SQLException ex) {
             Logger.getLogger(AdminSetup.class.getName()).log(Level.SEVERE, null, ex);
         }
        registrarCursos.setVisible(true);   
    }//GEN-LAST:event_BotonRegistrarCursosActionPerformed

    private void BotonModificarCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarCursosActionPerformed
    this.dispose();
        ModificarCursos modificarCursos = null;
         try {
             modificarCursos = new ModificarCursos(this,true,setupAdmin);
         } catch (SQLException ex) {
             Logger.getLogger(AdminSetup.class.getName()).log(Level.SEVERE, null, ex);
         }
    modificarCursos.setVisible(true);      
    }//GEN-LAST:event_BotonModificarCursosActionPerformed

    private void BotonRegistrarEvaluacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarEvaluacionesActionPerformed
        this.dispose();
        RegistrarEvaluaciones registrarEvaluaciones = null;
         try {
             registrarEvaluaciones = new RegistrarEvaluaciones(this,true,setupAdmin);
         } catch (SQLException ex) {
             Logger.getLogger(AdminSetup.class.getName()).log(Level.SEVERE, null, ex);
         }
        registrarEvaluaciones.setVisible(true);         
    }//GEN-LAST:event_BotonRegistrarEvaluacionesActionPerformed

    private void BotonRegistrarDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarDireccionActionPerformed
    this.dispose();
    RegistrarDireccion iniRegistrarDireccion;
    try{
        iniRegistrarDireccion = new RegistrarDireccion(this,true,setupAdmin);
        iniRegistrarDireccion.setVisible(true); 
    }catch (SQLException ex) {
        Logger.getLogger(AdminSetup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotonRegistrarDireccionActionPerformed

    private void BotonModificarEvaluacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarEvaluacionesActionPerformed
        this.dispose();
        ModificarEvaluaciones modificarEvaluaciones = null;
         try {
             modificarEvaluaciones = new ModificarEvaluaciones(this,true,setupAdmin);
         } catch (SQLException ex) {
             Logger.getLogger(AdminSetup.class.getName()).log(Level.SEVERE, null, ex);
         }
        modificarEvaluaciones.setVisible(true);       
    }//GEN-LAST:event_BotonModificarEvaluacionesActionPerformed

    private void BotonModificarDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarDireccionActionPerformed
        this.dispose();
        ModificarDireccion modificarDireccion = null;
         try {
             modificarDireccion = new ModificarDireccion(this,true,setupAdmin);
         } catch (SQLException ex) {
             Logger.getLogger(AdminSetup.class.getName()).log(Level.SEVERE, null, ex);
         }
        modificarDireccion.setVisible(true);   
    }//GEN-LAST:event_BotonModificarDireccionActionPerformed

    private void BotonEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEstadisticasActionPerformed
        this.dispose();
        ConsultarEstadisticas consultarEstadisticas = new ConsultarEstadisticas(this,true,setupAdmin);
        consultarEstadisticas.setVisible(true);      
    }//GEN-LAST:event_BotonEstadisticasActionPerformed

    private void BotonEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEstudiantesActionPerformed
        this.dispose();
        ConsultasEstudiante inicioEstudiante = null;
         try {
             inicioEstudiante = new ConsultasEstudiante(this,true,setupAdmin);
         } catch (SQLException ex) {
             Logger.getLogger(AdminSetup.class.getName()).log(Level.SEVERE, null, ex);
         }
        inicioEstudiante.setVisible(true);      
    }//GEN-LAST:event_BotonEstudiantesActionPerformed

    private void BotonProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonProfesoresActionPerformed
        this.dispose();
        ConsultasProfesor evaluaciónDocente = null;
         try {
             evaluaciónDocente = new ConsultasProfesor(this,true,setupAdmin);
         } catch (SQLException ex) {
             Logger.getLogger(AdminSetup.class.getName()).log(Level.SEVERE, null, ex);
         }
        evaluaciónDocente.setVisible(true);   
    }//GEN-LAST:event_BotonProfesoresActionPerformed

    private void botonRegistrarGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarGeneroActionPerformed
        this.dispose();
        RegistrarYModificarGenero venRegistrarYModificarGenero;
         try {
             venRegistrarYModificarGenero = new RegistrarYModificarGenero(this,true,setupAdmin);
             venRegistrarYModificarGenero.setVisible(true); 
         } catch (SQLException ex) {
             Logger.getLogger(AdminSetup.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_botonRegistrarGeneroActionPerformed

    private void botonBitacoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBitacoraActionPerformed
        this.dispose();
         Booklog booklog = null;
         try {
             booklog = new Booklog(this, true,setupAdmin);
             booklog.setVisible(true);
         } catch (SQLException ex) {
             Logger.getLogger(AdminSetup.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_botonBitacoraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminSetup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminSetup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminSetup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminSetup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdminSetup dialog = new AdminSetup(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEstadisticas;
    private javax.swing.JButton BotonEstudiantes;
    private javax.swing.JButton BotonModificarCursos;
    private javax.swing.JButton BotonModificarDireccion;
    private javax.swing.JButton BotonModificarEvaluaciones;
    private javax.swing.JButton BotonModificarPersona;
    private javax.swing.JButton BotonProfesores;
    private javax.swing.JButton BotonRegistrarCursos;
    private javax.swing.JButton BotonRegistrarDireccion;
    private javax.swing.JButton BotonRegistrarEvaluaciones;
    private javax.swing.JButton BotonRegistrarPersona;
    private javax.swing.JButton botonBitacora;
    private javax.swing.JButton botonRegistrarGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
