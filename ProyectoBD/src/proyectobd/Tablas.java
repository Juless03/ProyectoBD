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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author paubo
 */
public class Tablas extends javax.swing.JDialog {
    private Conexion tablas;
    ArrayList<String> datosDiversos = new ArrayList();
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
        comBoxTablas.addItem("Emails");
        comBoxTablas.addItem("Telefonos");
        //jTextDatos.setText(datos.toString());
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
    
    private void mostrarPersonas() throws SQLException{
        datosDiversos.clear();
        tablas.getdataPerson(datosDiversos);
        String matriz [][] = new String[datosDiversos.size()][3];
        int x = 0;
        for (int i = 0; i < datosDiversos.size()/3; i++){
            System.out.println(x);
            int columnas = 0;
            for (int j = x; j < x+3; j++){
                matriz[i][columnas] = datosDiversos.get(j);
                columnas++;
            }
            x+=3;
        }
        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
                new String [] {"Nombre","Fecha de nacimiento", "Género"}
        ));
    }
    
    private void mostrarEmails() throws SQLException{
        datosDiversos.clear();
        tablas.getdataEmails(datosDiversos);
        String matriz [][] = new String[datosDiversos.size()][2];
        int x = 0;
        for (int i = 0; i < datosDiversos.size()/2; i++){
            int columnas = 0;
            for (int j = x; j < x+2; j++){
                matriz[i][columnas] = datosDiversos.get(j);
                columnas++;
            }
            x+=2;
        }
        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
                new String [] {"Nombre","Email"}
        ));
    }
    
    private void mostrarTelefonos() throws SQLException{
        datosDiversos.clear();
        tablas.getdataPhoneNumber(datosDiversos);
        String matriz [][] = new String[datosDiversos.size()][3];
        int x = 0;
        for (int i = 0; i < datosDiversos.size()/3; i++){
            int columnas = 0;
            for (int j = x; j < x+3; j++){
                matriz[i][columnas] = datosDiversos.get(j);
                columnas++;
            }
            x+=3;
        }
        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
                new String [] {"Nombre","Teléfono", "Tipo"}
        ));
    }
    
    private void mostrarGenero() throws SQLException{
        datosDiversos.clear();
        tablas.getdataGender(datosDiversos);
        String matriz [][] = new String[datosDiversos.size()][2];
        int x = 0;
        for (int i = 0; i < datosDiversos.size()/2; i++){
            System.out.println(x);
            int columnas = 0;
            for (int j = x; j < x+2; j++){
                matriz[i][columnas] = datosDiversos.get(j);
                columnas++;
            }
            x+=2;
        }
        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
                new String [] {"Número","Género"}
        ));
    }
    
    private void mostrarEvaluacion() throws SQLException{
        datosDiversos.clear();
        tablas.getdataEvaluation(datosDiversos);
        String matriz [][] = new String[datosDiversos.size()][7];
        int x = 0;
        for (int i = 0; i < datosDiversos.size()/7; i++){
            System.out.println(x);
            int columnas = 0;
            for (int j = x; j < x+7; j++){
                matriz[i][columnas] = datosDiversos.get(j);
                columnas++;
            }
            x+=7;
        }
        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
                new String [] {"Nombre","Descripción", "Miembros", "Porcentage", "Fecha de entrega","Grupo", "Curso"}
        ));
    }
    
    private void mostrarCanton() throws SQLException{
        datosDiversos.clear();
        tablas.getdataCountry(datosDiversos);
        String matriz [][] = new String[datosDiversos.size()][2];
        int x = 0;
        for (int i = 0; i < datosDiversos.size()/2; i++){
            System.out.println(x);
            int columnas = 0;
            for (int j = x; j < x+2; j++){
                matriz[i][columnas] = datosDiversos.get(j);
                columnas++;
            }
            x+=2;
        }
        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
                new String [] {"Canton","Provincia"}
        ));
    }
    
    private void mostrarPais() throws SQLException{
        datosDiversos.clear();
        tablas.getdataCountry(datosDiversos);
        String matriz [][] = new String[datosDiversos.size()][2];
        int x = 0;
        for (int i = 0; i < datosDiversos.size()/2; i++){
            System.out.println(x);
            int columnas = 0;
            for (int j = x; j < x+2; j++){
                matriz[i][columnas] = datosDiversos.get(j);
                columnas++;
            }
            x+=2;
        }
        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
                new String [] {"Número","País"}
        ));
    }
    
    private void mostrarDistrito() throws SQLException{
        datosDiversos.clear();
        tablas.getdataDistrict(datosDiversos);
        String matriz [][] = new String[datosDiversos.size()][2];
        int x = 0;
        for (int i = 0; i < datosDiversos.size()/2; i++){
            System.out.println(x);
            int columnas = 0;
            for (int j = x; j < x+2; j++){
                matriz[i][columnas] = datosDiversos.get(j);
                columnas++;
            }
            x+=2;
        }
        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
                new String [] {"Distrito","Canton"}
        ));
    }
    
    private void mostrarProvincia() throws SQLException{
        datosDiversos.clear();
        tablas.getdataProvince(datosDiversos);
        String matriz [][] = new String[datosDiversos.size()][2];
        int x = 0;
        for (int i = 0; i < datosDiversos.size()/2; i++){
            System.out.println(x);
            int columnas = 0;
            for (int j = x; j < x+2; j++){
                matriz[i][columnas] = datosDiversos.get(j);
                columnas++;
            }
            x+=2;
        }
        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
                new String [] {"Provincia","Pais"}
        ));
    }
    
    private void mostrarCurso() throws SQLException{
        datosDiversos.clear();
        tablas.getdataCourse(datosDiversos);
        String matriz [][] = new String[datosDiversos.size()][2];
        int x = 0;
        for (int i = 0; i < datosDiversos.size()/2; i++){
            System.out.println(x);
            int columnas = 0;
            for (int j = x; j < x+2; j++){
                matriz[i][columnas] = datosDiversos.get(j);
                columnas++;
            }
            x+=2;
        }
        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
                new String [] {"Curso","Créditos"}
        ));
    }
    
    private void mostrarGrupo() throws SQLException{
        datosDiversos.clear();
        tablas.getdataGroup(datosDiversos);
        String matriz [][] = new String[datosDiversos.size()][4];
        int x = 0;
        for (int i = 0; i < datosDiversos.size()/4; i++){
            System.out.println(x);
            int columnas = 0;
            for (int j = x; j < x+4; j++){
                matriz[i][columnas] = datosDiversos.get(j);
                columnas++;
            }
            x+=4;
        }
        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
                new String [] {"Grupo","Semestre", "Profesor", "Curso"}
        ));
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
        botonMostrar = new javax.swing.JButton();

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
        jLabel2.setText("Seleccione los datos que desea visualizar:");

        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableDatos);

        botonMostrar.setBackground(new java.awt.Color(255, 193, 5));
        botonMostrar.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonMostrar.setText("Mostrar");
        botonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarActionPerformed(evt);
            }
        });

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
                        .addGap(86, 86, 86)
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addComponent(comBoxTablas, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(botonMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 117, Short.MAX_VALUE))
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
                    .addComponent(comBoxTablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonMostrar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(botonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
    this.dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarActionPerformed
    String aMostrar = (String) comBoxTablas.getSelectedItem();
        System.out.println(aMostrar);
    if (aMostrar  == "Personas"){
        try {
            mostrarPersonas();
        } catch (SQLException ex) {
            Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    else if (aMostrar  == "Emails"){
        try {
            mostrarEmails();
        } catch (SQLException ex) {
            Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    else if (aMostrar  == "Telefonos"){
        try {
            mostrarTelefonos();
        } catch (SQLException ex) {
            Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    else if (aMostrar  == "Géneros"){
        try {
            mostrarGenero();
        } catch (SQLException ex) {
            Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    else if (aMostrar  == "Evaluaciones"){
        try {
            mostrarEvaluacion();
        } catch (SQLException ex) {
            Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    else if (aMostrar  == "País"){
        try {
            mostrarPais();
        } catch (SQLException ex) {
            Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    else if (aMostrar  == "Canton"){
        try {
            mostrarCanton();
        } catch (SQLException ex) {
            Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    else if (aMostrar  == "Distrito"){
        try {
            mostrarDistrito();
        } catch (SQLException ex) {
            Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    else if (aMostrar  == "Provincia"){
        try {
            mostrarProvincia();
        } catch (SQLException ex) {
            Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    else if (aMostrar  == "Cursos"){
        try {
            mostrarCurso();
        } catch (SQLException ex) {
            Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    else if (aMostrar  == "Grupos"){
        try {
            mostrarGrupo();
        } catch (SQLException ex) {
            Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }//GEN-LAST:event_botonMostrarActionPerformed

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
    private javax.swing.JButton botonMostrar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JComboBox<String> comBoxTablas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDatos;
    // End of variables declaration//GEN-END:variables
}
