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
import javax.swing.JOptionPane;

/**
 *
 * @author Dares
 */
public class InicioSesionAdministrador extends javax.swing.JDialog {
    
     private Conexion inicioSesionAd;

    public InicioSesionAdministrador(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(157,210,228));
    }
 
    public InicioSesionAdministrador(MenuInicio aThis, boolean modal, Conexion elControlador) {
        super(aThis, modal);
        initComponents();
        inicioSesionAd = elControlador;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(157,210,228));
    }
    
    public InicioSesionAdministrador(AdminSetup aThis, boolean modal, Conexion setupAdmin) {
        super(aThis, modal);
        initComponents();
        inicioSesionAd = setupAdmin;
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
        botonIngreso = new javax.swing.JButton();
        botonUsuario = new javax.swing.JTextField();
        botonContraInco = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel1.setText("Contraseña");

        botonIngreso.setBackground(new java.awt.Color(255, 193, 5));
        botonIngreso.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        botonIngreso.setText("Ingresar");
        botonIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresoActionPerformed(evt);
            }
        });

        botonUsuario.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        botonUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonUsuarioActionPerformed(evt);
            }
        });

        botonContraInco.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Bell MT", 0, 36)); // NOI18N
        jLabel2.setText("Inicio de Sesión Administrador ");

        jLabel3.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel3.setText("Ingrese sus credenciales");

        jLabel4.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel4.setText("Usuario");

        botonRegresar.setBackground(new java.awt.Color(255, 193, 5));
        botonRegresar.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(402, 402, 402)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(botonUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(botonContraInco, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(470, 470, 470)
                        .addComponent(botonIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(botonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonContraInco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(botonIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(botonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonUsuarioActionPerformed

    private void botonIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresoActionPerformed
        boolean validandoContraseña = false;
        if(!botonUsuario.getText().isEmpty() && !botonContraInco.getText().isEmpty()){ 
            String Usuario = botonUsuario.getText();
             try {
                 String EncriptarContraseña = inicioSesionAd.encriptarContraseña(String.valueOf(botonContraInco.getPassword()));
                 String Buenas = inicioSesionAd.loginAdmin(botonUsuario.getText(),EncriptarContraseña);
                 if(Buenas == null){
                     JOptionPane.showMessageDialog(null,"Error\nEl usuario o la contraseña son incorrectos");
                 } else {
                 if(Buenas.equals(Usuario)){
                     JOptionPane.showMessageDialog(null,"Inicio seccion con exito.");
                     this.dispose();
                     AdminSetup ventanaAdminSetup =  new AdminSetup(this,true,inicioSesionAd);
                     ventanaAdminSetup.setVisible(true);
                 }else{
                     JOptionPane.showMessageDialog(null,"Error\nEl usuario o la contraseña son incorrectos");
                 } }
             } catch (SQLException ex) {
                 Logger.getLogger(InicioSesionAdministrador.class.getName()).log(Level.SEVERE, null, ex);
             }
         } else {
            JOptionPane.showMessageDialog(null,"Error\nCampos vacios.");
        }
        
             
    }//GEN-LAST:event_botonIngresoActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        this.dispose();
        
        
    }//GEN-LAST:event_botonRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(InicioSesionAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesionAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesionAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesionAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InicioSesionAdministrador dialog = new InicioSesionAdministrador(new javax.swing.JFrame(), true);
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
    private javax.swing.JPasswordField botonContraInco;
    private javax.swing.JButton botonIngreso;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JTextField botonUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
