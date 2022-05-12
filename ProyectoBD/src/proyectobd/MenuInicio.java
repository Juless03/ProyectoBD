/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd;

import ConexionSQL.Conexion;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Dares
 */
public class MenuInicio extends javax.swing.JFrame {
    
    Conexion Conexion = new Conexion();
    /**
     * Creates new form MenuInicio
     */
    public MenuInicio() {
        initComponents();
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

        botonAdministrador = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botonProfesor = new javax.swing.JButton();
        botonEstudiante = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MenuInicio");
        setBackground(new java.awt.Color(157, 210, 228));
        setForeground(new java.awt.Color(0, 0, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonAdministrador.setBackground(new java.awt.Color(255, 193, 5));
        botonAdministrador.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        botonAdministrador.setText("Administrador");
        botonAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdministradorActionPerformed(evt);
            }
        });
        getContentPane().add(botonAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 533, 160, 56));

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 14));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\paubo\\Downloads\\Logo.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 589, 532));

        botonProfesor.setBackground(new java.awt.Color(255, 193, 5));
        botonProfesor.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        botonProfesor.setText("Profesor");
        botonProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProfesorActionPerformed(evt);
            }
        });
        getContentPane().add(botonProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 667, 160, 56));

        botonEstudiante.setBackground(new java.awt.Color(255, 193, 5));
        botonEstudiante.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        botonEstudiante.setText("Estudiante");
        botonEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(botonEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 540, 160, 56));

        jLabel2.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel2.setText("¡Bienvenidos a la plataforma del Tecnológico de Costa Rica!");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 520, -1, 17));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdministradorActionPerformed
       InicioSesionAdministrador iniAdministrador = new InicioSesionAdministrador(this,true,Conexion);
       iniAdministrador.setVisible(true);
       
    }//GEN-LAST:event_botonAdministradorActionPerformed

    private void botonProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProfesorActionPerformed
        EvaluaciónDocente evaluacionDocente = new EvaluaciónDocente(this,true,Conexion);
        evaluacionDocente.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_botonProfesorActionPerformed

    private void botonEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEstudianteActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_botonEstudianteActionPerformed

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
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAdministrador;
    private javax.swing.JButton botonEstudiante;
    private javax.swing.JButton botonProfesor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
