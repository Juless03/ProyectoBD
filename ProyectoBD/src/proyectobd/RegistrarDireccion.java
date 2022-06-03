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
 * @author Juley
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
    
    public RegistrarDireccion(AdminSetup aThis, boolean modal, Conexion setupAdmin) throws SQLException {
        super(aThis, modal);
        initComponents();
        registrarDireccion = setupAdmin;
        this.setLocationRelativeTo(null);
        registrarDireccion.getProvince(comBoxProvincia);
        registrarDireccion.getCanton(comBoxCanton);
        registrarDireccion.getCountry(comBoxPais);
        
        
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
        botonDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 36)); // NOI18N
        jLabel1.setText("Registro Direcciones");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel2.setText("Canton");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel3.setText("Distrito");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel4.setText("Provincia");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel5.setText("País");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 380, -1, -1));

        jLabel6.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel6.setText("Nombre");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel7.setText("Provincia");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        cantonNombre.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        getContentPane().add(cantonNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 97, -1));

        jLabel8.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel8.setText("Nombre");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, -1, -1));

        jLabel9.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel9.setText("Canton");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, -1, -1));

        distritoNombre.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        distritoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distritoNombreActionPerformed(evt);
            }
        });
        getContentPane().add(distritoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 190, 97, -1));

        botonRegistrarCanton.setBackground(new java.awt.Color(255, 193, 5));
        botonRegistrarCanton.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonRegistrarCanton.setText("Registrar");
        botonRegistrarCanton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarCantonActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrarCanton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 100, -1));

        botonRegistrarDistrito.setBackground(new java.awt.Color(255, 193, 5));
        botonRegistrarDistrito.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonRegistrarDistrito.setText("Registrar");
        botonRegistrarDistrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarDistritoActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrarDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 280, -1, -1));

        jLabel10.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel10.setText("Nombre");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 61, -1));

        jLabel11.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel11.setText("País");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 52, -1));

        provinciaNombre.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        getContentPane().add(provinciaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 97, -1));

        jLabel12.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel12.setText("Nombre");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, 67, -1));

        paisNombre.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        getContentPane().add(paisNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 420, 97, -1));

        botonRegistrarProvincia.setBackground(new java.awt.Color(255, 193, 5));
        botonRegistrarProvincia.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonRegistrarProvincia.setText("Registrar");
        botonRegistrarProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarProvinciaActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrarProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, -1, -1));

        botonRegistrarPais.setBackground(new java.awt.Color(255, 193, 5));
        botonRegistrarPais.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonRegistrarPais.setText("Registrar");
        botonRegistrarPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarPaisActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrarPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 450, -1, -1));

        botonRegresar.setBackground(new java.awt.Color(255, 193, 5));
        botonRegresar.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 100, -1));

        comBoxCanton.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        getContentPane().add(comBoxCanton, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 230, 97, -1));

        comBoxProvincia.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        getContentPane().add(comBoxProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 97, -1));

        comBoxPais.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        getContentPane().add(comBoxPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 97, -1));

        botonDatos.setBackground(new java.awt.Color(255, 193, 5));
        botonDatos.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonDatos.setText("Ver Datos");
        botonDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDatosActionPerformed(evt);
            }
        });
        getContentPane().add(botonDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1035, 583, 110, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void distritoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distritoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_distritoNombreActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
    this.dispose();
    AdminSetup ventaAdminSetup = null;
        try {
            ventaAdminSetup = new AdminSetup(this,true, registrarDireccion);
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarDireccion.class.getName()).log(Level.SEVERE, null, ex);
        }
    ventaAdminSetup.setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonRegistrarCantonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarCantonActionPerformed
        int provincia = 0;
        if(!cantonNombre.getText().isEmpty()){
            String provinciaNombre = (String) comBoxProvincia.getSelectedItem();
            try{
                provincia = registrarDireccion.getProvinceCode(provinciaNombre);
            }catch (SQLException ex){
                Logger.getLogger(RegistrarDireccion.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                registrarDireccion.addCanton(cantonNombre.getText(), provincia);
                JOptionPane.showMessageDialog(null,"Canton Agregado.");
            } catch (SQLException ex) {
                Logger.getLogger(RegistrarDireccion.class.getName()).log(Level.SEVERE, null, ex);
            }
            cantonNombre.setText("");
            comBoxCanton.setVisible(false);
            comBoxCanton.removeAllItems();
            try {
                registrarDireccion.getCanton(comBoxCanton);
            } catch (SQLException ex) {
                Logger.getLogger(ModificarPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
            comBoxCanton.setVisible(true);
        } else{
            JOptionPane.showMessageDialog(null,"Campos Vacios. Canton no Agregado.");
        } 

    }//GEN-LAST:event_botonRegistrarCantonActionPerformed

    private void botonRegistrarProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarProvinciaActionPerformed
       if(!provinciaNombre.getText().isEmpty()){ 
            int pais = 0;
            String paisNombre = (String) comBoxPais.getSelectedItem();
            try{
                pais = registrarDireccion.getCountryCode(paisNombre);
            }catch (SQLException ex){
                Logger.getLogger(RegistrarDireccion.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                registrarDireccion.addProvince(provinciaNombre.getText(), pais);
                JOptionPane.showMessageDialog(null,"Provincia Agregada.");
            } catch (SQLException ex) {
                Logger.getLogger(RegistrarDireccion.class.getName()).log(Level.SEVERE, null, ex);
            }
            provinciaNombre.setText("");
            comBoxProvincia.setVisible(false);
            comBoxProvincia.removeAllItems();
            try {
                registrarDireccion.getProvince(comBoxProvincia);
            } catch (SQLException ex) {
                Logger.getLogger(ModificarPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
            comBoxProvincia.setVisible(true);
        } else {
        JOptionPane.showMessageDialog(null,"Campos vacios. Provincia no Agregada.");
       }
       
    }//GEN-LAST:event_botonRegistrarProvinciaActionPerformed
        
    private void botonRegistrarDistritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarDistritoActionPerformed
        if(!distritoNombre.getText().isEmpty()){ 
            int canton = 0;
            String cantonNombre = (String) comBoxCanton.getSelectedItem();
            try{
                canton = registrarDireccion.getCantonCode(cantonNombre);
            }catch (SQLException ex){
                Logger.getLogger(RegistrarDireccion.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                registrarDireccion.addDistrict(distritoNombre.getText(), canton);
                JOptionPane.showMessageDialog(null,"Distrito Agregado.");
            } catch (SQLException ex) {
                Logger.getLogger(RegistrarDireccion.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null,"Campos vacios. Distrito no Agregado.");
        }
    }//GEN-LAST:event_botonRegistrarDistritoActionPerformed

    private void botonRegistrarPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarPaisActionPerformed
        if(!paisNombre.getText().isEmpty()){ 
            try {
                registrarDireccion.addCountry(paisNombre.getText());
                JOptionPane.showMessageDialog(null,"País Agregado.");
            } catch (SQLException ex) {
                Logger.getLogger(RegistrarDireccion.class.getName()).log(Level.SEVERE, null, ex);
            }
            paisNombre.setText("");
            comBoxPais.setVisible(false);
            comBoxPais.removeAllItems();
            try {
                registrarDireccion.getCountry(comBoxPais);
            } catch (SQLException ex) {
                Logger.getLogger(ModificarPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
            comBoxPais.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null,"Campos vacios. País no Agregado.");
        }
    }//GEN-LAST:event_botonRegistrarPaisActionPerformed

    private void botonDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDatosActionPerformed
     Tablas tablas = null;
        try {
            tablas = new Tablas(this,true,registrarDireccion);
        } catch (SQLException ex) {
            Logger.getLogger(RegistroPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        tablas.setVisible(true);
    }//GEN-LAST:event_botonDatosActionPerformed
    
   
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
    private javax.swing.JButton botonDatos;
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
