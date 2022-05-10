/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd;

import ConexionSQL.Conexion;
import java.awt.Color;

/**
 *
 * @author paubo
 */
public class RegistrarDireccion extends javax.swing.JDialog {
    private Conexion registrarDireccion;
    /**
     * Creates new form RegistrarEvaluacion
     */
    public RegistrarDireccion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.getContentPane().setBackground(new Color(157,210,228));
    }
    
    public RegistrarDireccion(AdminSetup aThis, boolean modal, Conexion setupAdmin) {
        super(aThis, modal);
        initComponents();
        registrarDireccion = setupAdmin;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cantonNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        distritoNombre = new javax.swing.JTextField();
        botonRegistrarCanton = new javax.swing.JButton();
        botonRegistrarDistrito = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        provinciaNombre = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        paisNombre = new javax.swing.JTextField();
        botonRegistrarProvincia = new javax.swing.JButton();
        botonRegistrarPais = new javax.swing.JButton();
        botonRegresar = new javax.swing.JButton();
        comBoxCanton = new javax.swing.JComboBox<>();
        comBoxProvincia = new javax.swing.JComboBox<>();
        comBoxPais = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 36)); // NOI18N
        jLabel1.setText("Registro Direcciones");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 51, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel2.setText("Canton");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 158, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel3.setText("Distrito");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(832, 158, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel4.setText("Provincia");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 432, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel5.setText("País");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(832, 432, -1, -1));

        jLabel6.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel6.setText("Nombre");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 221, -1, -1));

        jLabel7.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel7.setText("Id Provincia");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 333, -1, -1));

        cantonNombre.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        getContentPane().add(cantonNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 221, 97, -1));

        jLabel8.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel8.setText("Nombre");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(751, 221, -1, -1));

        jLabel9.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel9.setText("Id Canton");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(751, 320, -1, -1));

        distritoNombre.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        distritoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distritoNombreActionPerformed(evt);
            }
        });
        getContentPane().add(distritoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(905, 221, 97, -1));

        botonRegistrarCanton.setBackground(new java.awt.Color(255, 193, 5));
        botonRegistrarCanton.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonRegistrarCanton.setText("Registrar");
        getContentPane().add(botonRegistrarCanton, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 387, 100, -1));

        botonRegistrarDistrito.setBackground(new java.awt.Color(255, 193, 5));
        botonRegistrarDistrito.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonRegistrarDistrito.setText("Registrar");
        getContentPane().add(botonRegistrarDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(905, 387, -1, -1));

        jLabel10.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel10.setText("Nombre");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 513, 61, -1));

        jLabel11.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel11.setText("Id País");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 606, 52, -1));

        provinciaNombre.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        getContentPane().add(provinciaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 512, 97, -1));

        jLabel12.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel12.setText("Nombre");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(751, 512, 67, -1));

        paisNombre.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        getContentPane().add(paisNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(905, 512, 97, -1));

        botonRegistrarProvincia.setBackground(new java.awt.Color(255, 193, 5));
        botonRegistrarProvincia.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonRegistrarProvincia.setText("Registrar");
        getContentPane().add(botonRegistrarProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 661, -1, -1));

        botonRegistrarPais.setBackground(new java.awt.Color(255, 193, 5));
        botonRegistrarPais.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonRegistrarPais.setText("Registrar");
        getContentPane().add(botonRegistrarPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(905, 584, -1, -1));

        botonRegresar.setBackground(new java.awt.Color(255, 193, 5));
        botonRegresar.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 694, 100, -1));

        comBoxCanton.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        comBoxCanton.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comBoxCanton, new org.netbeans.lib.awtextra.AbsoluteConstraints(905, 319, 97, -1));

        comBoxProvincia.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        comBoxProvincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comBoxProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 333, 97, -1));

        comBoxPais.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        comBoxPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comBoxPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 605, 97, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void distritoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distritoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_distritoNombreActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
    AdminSetup adminSetup = new AdminSetup(this,true,registrarDireccion);
    this.dispose();
    adminSetup.setVisible(true);          // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(RegistrarDireccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarDireccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarDireccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarDireccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistrarDireccion dialog = new RegistrarDireccion(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton botonRegistrarCanton;
    private javax.swing.JButton botonRegistrarDistrito;
    private javax.swing.JButton botonRegistrarPais;
    private javax.swing.JButton botonRegistrarProvincia;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JTextField cantonNombre;
    private javax.swing.JComboBox<String> comBoxCanton;
    private javax.swing.JComboBox<String> comBoxPais;
    private javax.swing.JComboBox<String> comBoxProvincia;
    private javax.swing.JTextField distritoNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField paisNombre;
    private javax.swing.JTextField provinciaNombre;
    // End of variables declaration//GEN-END:variables
}
