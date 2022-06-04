/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd;

import ConexionSQL.Conexion;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author paubo
 */
public class Tablas extends javax.swing.JDialog {
    private Conexion tablas;
    ArrayList<String> datos = new ArrayList();
    /**
     * Creates new form Tablas
     */
    public Tablas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.getContentPane().setBackground(new Color(157,210,228));
        initComponents();
    }

    Tablas(RegistroPersona aThis, boolean modal, Conexion registroDatos) throws SQLException{
        super(aThis, modal);
        initComponents();
        tablas = registroDatos;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(157,210,228));
        comBoxTablas.addItem("Personas");
        tablas.getdataPerson(datos);
        System.out.println("a");
        comBoxTablas.addItem("Emails");
        comBoxTablas.addItem("Telefonos");
        //jTextDatos.setText(datos.toString());
    }
    
    private void mostrar(){
        String matriz [][] = new String[datos.size()][6];
        for (int i = 0; i < datos.size(); i++){
            matriz[i][0] = datos.get(i);
            matriz[i][1] = datos.get(i);
            matriz[i][2] = datos.get(i);
            matriz[i][3] = datos.get(i);
            matriz[i][4] = datos.get(i);
            matriz[i][5] = datos.get(i);
            matriz[i][6] = datos.get(i);
        }
        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
                new String [] {"Esquema","Tabla", "Espacio", "Valor anterior", "Valor actual","Fecha de cambio", "Usuario"}
        ));
    }
    
    Tablas(RegistrarYModificarGenero  aThis, boolean modal, Conexion regisYModificarGenero) throws SQLException{
        super(aThis, modal);
        initComponents();
        tablas = regisYModificarGenero;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(157,210,228));
        comBoxTablas.addItem("Géneros");
    }

    Tablas(RegistrarEvaluaciones aThis, boolean modal, Conexion registrarEvaluaciones) throws SQLException{
        super(aThis, modal);
        initComponents();
        tablas = registrarEvaluaciones;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(157,210,228));
        comBoxTablas.addItem("Evaluaciones");
    }

    Tablas(RegistrarDireccion aThis, boolean modal, Conexion registrarDireccion) throws SQLException{
        super(aThis, modal);
        initComponents();
        tablas = registrarDireccion;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(157,210,228));
        comBoxTablas.addItem("País");
        comBoxTablas.addItem("Canton");
        comBoxTablas.addItem("Distrito");
        comBoxTablas.addItem("Provincia");
    }

    Tablas(RegistrarCursos aThis, boolean modal, Conexion registrarCursos) throws SQLException{
        super(aThis, modal);
        initComponents();
        tablas = registrarCursos;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(157,210,228));
        comBoxTablas.addItem("Cursos");
        comBoxTablas.addItem("Grupos");
    }

    Tablas(ModificarPersona aThis, boolean modal, Conexion modificarDatos) throws SQLException{
        super(aThis, modal);
        initComponents();
        tablas = modificarDatos;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(157,210,228));
        comBoxTablas.addItem("Personas");
        comBoxTablas.addItem("Emails");
        comBoxTablas.addItem("Telefonos");
    }

    Tablas(ModificarEvaluaciones aThis, boolean modal, Conexion modificarEvaluaciones) throws SQLException {
        super(aThis, modal);
        initComponents();
        tablas = modificarEvaluaciones;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(157,210,228));
        comBoxTablas.addItem("Evaluaciones");
    }

    Tablas(ModificarDireccion aThis, boolean modal, Conexion modificarDireccion) throws SQLException{
        super(aThis, modal);
        initComponents();
        tablas = modificarDireccion;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(157,210,228));
        comBoxTablas.addItem("País");
        comBoxTablas.addItem("Canton");
        comBoxTablas.addItem("Distrito");
        comBoxTablas.addItem("Provincia");
    }

    Tablas(ModificarCursos aThis, boolean modal, Conexion modificarCurso) throws SQLException{
        super(aThis, modal);
        initComponents();
        tablas = modificarCurso;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(157,210,228));
        comBoxTablas.addItem("Cursos");
        comBoxTablas.addItem("Grupos");
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
        botonRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        comBoxTablas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 36)); // NOI18N
        jLabel1.setText("Datos");

        botonRegresar.setBackground(new java.awt.Color(255, 193, 5));
        botonRegresar.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonRegresar.setText("Cerrar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel2.setText("Seleccione los datos que desea visualizar");

        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(botonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel2)
                        .addGap(53, 53, 53)
                        .addComponent(comBoxTablas, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 171, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(477, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(464, 464, 464))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 955, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comBoxTablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(botonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Tablas dialog = new Tablas(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton botonRegresar;
    private javax.swing.JComboBox<String> comBoxTablas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDatos;
    // End of variables declaration//GEN-END:variables
}
