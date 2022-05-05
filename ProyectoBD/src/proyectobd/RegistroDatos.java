/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd;

import ConexionSQL.Conexion;
import static java.lang.System.out;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author paubo
 */
public class RegistroDatos extends javax.swing.JDialog {

    /**
     * Creates new form RegistroDatos
     */
    private Conexion registroDatos;
    /**
     * Creates new form RegistroDatos
     */
    public RegistroDatos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        
        
    }
    public RegistroDatos(AdminSetup aThis, boolean modal, Conexion setupAdmin) throws SQLException {
        super(aThis, modal);
        initComponents();
        registroDatos = setupAdmin;
        
        registroDatos.consultarDistritos(botonDistrito);
        registroDatos.consultarGenero(botonGenero);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PrimerNombre = new javax.swing.JTextField();
        SegundoNombre = new javax.swing.JTextField();
        PrimerApellido = new javax.swing.JTextField();
        SegundoApellido = new javax.swing.JTextField();
        FechaNacimiento = new javax.swing.JTextField();
        BotonRegresar = new javax.swing.JButton();
        botonGenero = new javax.swing.JComboBox<>();
        botonCategoria = new javax.swing.JComboBox<>();
        botonDistrito = new javax.swing.JComboBox<>();
        BotonRegistrar = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Registro de Datos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Primer Nombre");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Segundo Nombre");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Primer Apellido");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Segundo Apellido");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Fecha Nacimiento");

        PrimerNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrimerNombreActionPerformed(evt);
            }
        });

        BotonRegresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotonRegresar.setText("Regresar");
        BotonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegresarActionPerformed(evt);
            }
        });

        botonGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGeneroActionPerformed(evt);
            }
        });

        botonCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Profesor", " " }));

        botonDistrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDistritoActionPerformed(evt);
            }
        });

        BotonRegistrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotonRegistrar.setText("Registrar");
        BotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(419, 419, 419)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SegundoNombre)
                            .addComponent(SegundoApellido)
                            .addComponent(PrimerApellido)
                            .addComponent(PrimerNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(FechaNacimiento))))
                .addGap(340, 340, 340))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(413, 413, 413))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(245, 245, 245))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotonRegresar)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(PrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(SegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(PrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(SegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(FechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(BotonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(BotonRegresar)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PrimerNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrimerNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrimerNombreActionPerformed

    private void BotonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonRegresarActionPerformed

    private void botonGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonGeneroActionPerformed

    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed
        String Categoria = botonCategoria.getSelectedItem().toString();
        // Distritoint 
        int Distrito = 0;
        String DistritoNombre = (String) botonDistrito.getSelectedItem();
        try {
            Distrito = registroDatos.consultarDistritosNumero(DistritoNombre);
        } catch (SQLException ex) {
            Logger.getLogger(RegistroDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Genero
        int Genero = 0;
        String GeneroNombre = (String) botonGenero.getSelectedItem();
        try {
            Genero = registroDatos.consultarGeneroCodigo(GeneroNombre);
        } catch (SQLException ex) {
            Logger.getLogger(RegistroDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        // //Fecha
        
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Date FechaDate = null;
        try {
            FechaDate = formatoFecha.parse(FechaNacimiento.getText());
        } catch (ParseException ex) {
            Logger.getLogger(RegistroDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.sql.Date FechaNacimiento = new java.sql.Date(FechaDate.getTime());
        
        if(Categoria == "Estudiante"){
            
           out. println("Soy un " + Categoria);
        }
        if(Categoria == "Profesor"){
            out. println("Soy un " + Categoria);
        }
 
        try {
            registroDatos.addPerson(PrimerNombre.getText(), SegundoNombre.getText(),PrimerApellido.getText(),SegundoApellido.getText(),Genero,Distrito,FechaNacimiento);
            JOptionPane.showMessageDialog(null,"Persona Agregada.");
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(RegistroDatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(RegistroDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotonRegistrarActionPerformed

    private void botonDistritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDistritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonDistritoActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistroDatos dialog = new RegistroDatos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JTextField FechaNacimiento;
    private javax.swing.JTextField PrimerApellido;
    private javax.swing.JTextField PrimerNombre;
    private javax.swing.JTextField SegundoApellido;
    private javax.swing.JTextField SegundoNombre;
    private javax.swing.JComboBox<String> botonCategoria;
    private javax.swing.JComboBox<String> botonDistrito;
    private javax.swing.JComboBox<String> botonGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
