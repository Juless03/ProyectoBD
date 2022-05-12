/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd;

import ConexionSQL.Conexion;
import java.awt.Color;
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
        this.getContentPane().setBackground(new Color(157,210,228));
    }
    
     public AdminSetup(InicioSesionAdministrador aThis, boolean modal, Conexion inicioSesionAd) {
        super(aThis, modal);
        initComponents();
        setupAdmin = inicioSesionAd;
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
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

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
        getContentPane().add(BotonRegistrarPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 167, 200, -1));

        BotonModificarPersona.setBackground(new java.awt.Color(255, 193, 5));
        BotonModificarPersona.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        BotonModificarPersona.setText("Modificar Persona");
        BotonModificarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarPersonaActionPerformed(evt);
            }
        });
        getContentPane().add(BotonModificarPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 167, 200, -1));

        BotonEstadisticas.setBackground(new java.awt.Color(255, 193, 5));
        BotonEstadisticas.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        BotonEstadisticas.setText("Consultar Estadisticas");
        BotonEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEstadisticasActionPerformed(evt);
            }
        });
        getContentPane().add(BotonEstadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 167, 200, -1));

        BotonEstudiantes.setBackground(new java.awt.Color(255, 193, 5));
        BotonEstudiantes.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        BotonEstudiantes.setText("Consultas Estudiantes");
        BotonEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEstudiantesActionPerformed(evt);
            }
        });
        getContentPane().add(BotonEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 210, 200, -1));

        BotonProfesores.setBackground(new java.awt.Color(255, 193, 5));
        BotonProfesores.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        BotonProfesores.setText("Consultas Profesores");
        BotonProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonProfesoresActionPerformed(evt);
            }
        });
        getContentPane().add(BotonProfesores, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 253, 200, -1));

        regresar.setBackground(new java.awt.Color(255, 193, 5));
        regresar.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 110, -1));

        jButton2.setBackground(new java.awt.Color(255, 193, 5));
        jButton2.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jButton2.setText("Registrar Cursos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 210, 200, -1));

        jButton1.setBackground(new java.awt.Color(255, 193, 5));
        jButton1.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jButton1.setText("Registrar Evaluaciones");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 253, 200, -1));

        jButton3.setBackground(new java.awt.Color(255, 193, 5));
        jButton3.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jButton3.setText("Registrar Dirección ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 296, 200, -1));

        jButton4.setBackground(new java.awt.Color(255, 193, 5));
        jButton4.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jButton4.setText("Modificar Cursos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 200, -1));

        jButton5.setBackground(new java.awt.Color(255, 193, 5));
        jButton5.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jButton5.setText("Modificar Evaluaciones");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 253, 200, -1));

        jButton7.setBackground(new java.awt.Color(255, 193, 5));
        jButton7.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jButton7.setText("Modificar Dirección");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 296, 200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegistrarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarPersonaActionPerformed
       RegistroDatos iniRegistroDatos;
         try {
             iniRegistroDatos = new RegistroDatos(this,true,setupAdmin);
             iniRegistroDatos.setVisible(true);
         } catch (SQLException ex) {
             Logger.getLogger(AdminSetup.class.getName()).log(Level.SEVERE, null, ex);
         }
       
    }//GEN-LAST:event_BotonRegistrarPersonaActionPerformed

    private void BotonModificarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarPersonaActionPerformed
        ModificarDatos ventanaModificarDatos = null;
         try {
             ventanaModificarDatos = new ModificarDatos(this,true,setupAdmin);
         } catch (SQLException ex) {
             Logger.getLogger(AdminSetup.class.getName()).log(Level.SEVERE, null, ex);
         }
        ventanaModificarDatos.setVisible(true);
    }//GEN-LAST:event_BotonModificarPersonaActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed

        this.dispose();
     
    }//GEN-LAST:event_regresarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        RegistrarCursos registrarCursos = new RegistrarCursos(this,true,setupAdmin);
        registrarCursos.setVisible(true);   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    ModificarCursos modificarCursos = null;
         try {
             modificarCursos = new ModificarCursos(this,true,setupAdmin);
         } catch (SQLException ex) {
             Logger.getLogger(AdminSetup.class.getName()).log(Level.SEVERE, null, ex);
         }
    modificarCursos.setVisible(true);      
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        RegistrarEvaluaciones registrarEvaluaciones = new RegistrarEvaluaciones(this,true,setupAdmin);
        registrarEvaluaciones.setVisible(true);         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        RegistrarDireccion registrarDireccion = new RegistrarDireccion(this,true,setupAdmin);
        registrarDireccion.setVisible(true);     
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ModificarEvaluaciones modificarEvaluaciones = new ModificarEvaluaciones(this,true,setupAdmin);
        modificarEvaluaciones.setVisible(true);       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ModificarDireccion modificarDireccion = new ModificarDireccion(this,true,setupAdmin);
        modificarDireccion.setVisible(true);   
    }//GEN-LAST:event_jButton7ActionPerformed

    private void BotonEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEstadisticasActionPerformed
        ConsultarEstadisticas consultarEstadisticas = new ConsultarEstadisticas(this,true,setupAdmin);
        consultarEstadisticas.setVisible(true);      
    }//GEN-LAST:event_BotonEstadisticasActionPerformed

    private void BotonEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEstudiantesActionPerformed
        InicioEstudiante inicioEstudiante = new InicioEstudiante(this,true,setupAdmin);
        inicioEstudiante.setVisible(true);      
    }//GEN-LAST:event_BotonEstudiantesActionPerformed

    private void BotonProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonProfesoresActionPerformed
        EvaluaciónDocente evaluaciónDocente = new EvaluaciónDocente(this,true,setupAdmin);
        evaluaciónDocente.setVisible(true);   
    }//GEN-LAST:event_BotonProfesoresActionPerformed

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
    private javax.swing.JButton BotonModificarPersona;
    private javax.swing.JButton BotonProfesores;
    private javax.swing.JButton BotonRegistrarPersona;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
