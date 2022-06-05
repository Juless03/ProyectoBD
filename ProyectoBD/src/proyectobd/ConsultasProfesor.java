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
import javax.swing.JOptionPane;

/**
 *
 * @author Juley
 */
public class ConsultasProfesor extends javax.swing.JDialog {
    private Conexion evaluacionDocente;
    int idProfesor;
    ArrayList<String> consultas = new ArrayList();
    /**
     * Creates new form EvaluaciónDocente
     */
    public ConsultasProfesor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.getContentPane().setBackground(new Color(157,210,228));
    }
    
    public ConsultasProfesor(MenuInicio aThis, boolean modal, Conexion elContralador) throws SQLException{
        super(aThis, modal);
        initComponents();
        evaluacionDocente = elContralador;
        this.getContentPane().setBackground(new Color(157,210,228));
        botonRegresarAdmin.setVisible(false);
        this.setLocationRelativeTo(null);
    }
    
    public ConsultasProfesor(AdminSetup aThis, boolean modal, Conexion setupAdmin) throws SQLException{
        super(aThis, modal);
        initComponents();
        evaluacionDocente = setupAdmin;
        this.getContentPane().setBackground(new Color(157,210,228));
        botonRegresar.setVisible(false);
        evaluacionDocente.getProfessor(combBoxProfesores);
        this.setLocationRelativeTo(null);
        añoCursos.setEnabled(false);
        botonMostrarCursos.setEnabled(false);
        comBoxSemestre.setEnabled(false);
        comboBoxCursosProfesor.setEnabled(false);
        botonMostrarEstudiantes.setEnabled(false);
        jComboBoxEstudiantes.setEnabled(false);
        comBoxCursosEvaluaciones.setEnabled(false);
        botonMostrarEvaluaciones.setEnabled(false);
        
    }

    public ConsultasProfesor(InicioProfesor aThis, boolean modal, Conexion inicioProfesor, int id) throws SQLException{
        super(aThis, modal);
        initComponents();
        evaluacionDocente = inicioProfesor;
        this.getContentPane().setBackground(new Color(157,210,228));
        botonRegresarAdmin.setVisible(false);
        idProfesor = id;
        evaluacionDocente.getCoursesFromProfessor(comboBoxCursosProfesor, idProfesor);
        evaluacionDocente.getCoursesFromProfessor(comBoxCursosEvaluaciones, idProfesor);
        evaluacionDocente.getStudent(jComboBoxEstudiantes);
        jLabel8.setVisible(false);
        combBoxProfesores.setVisible(false);
        this.setLocationRelativeTo(null);
        botonSeleccionarProfe.setVisible(false);
    }
    
    private void mostrarConsultaEstudiantes(String course) throws SQLException{
        consultas.clear();
        jTableDatos.clearSelection();
        evaluacionDocente.totalStudentsCourse(consultas, course);
        String matriz [][] = new String[consultas.size()][4];
        int x = 0;
        for (int i = 0; i < consultas.size()/4; i++){
            int columnas = 0;
            for (int j = x; j < x+4; j++){
                matriz[i][columnas] = consultas.get(j);
                columnas++;
            }
            x+=4;
        }
        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
                new String [] {"Estudiante","Curso", "Evaluación", "Nota"}
        ));
    }
    
    private void mostrarCursos(int semestre, int año) throws SQLException{
        consultas.clear();
        jTableDatos.clearSelection();
        evaluacionDocente.coursesTaught(consultas, idProfesor, semestre, año);
        String matriz [][] = new String[consultas.size()][4];
        int x = 0;
        for (int i = 0; i < consultas.size()/3; i++){
            int columnas = 0;
            for (int j = x; j < x+3; j++){
                matriz[i][columnas] = consultas.get(j);
                columnas++;
            }
            x+=3;
        }
        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
                new String [] {"Curso", "Semestre", "Año"}
        ));
    }
    
    private void mostrarEvaluacionesEstudiante(int estudiante, String Curso) throws SQLException{
        consultas.clear();
        jTableDatos.clearSelection();
        evaluacionDocente.totalEvaluations(consultas, estudiante, Curso);
        String matriz [][] = new String[consultas.size()][4];
        int x = 0;
        for (int i = 0; i < consultas.size()/4; i++){
            int columnas = 0;
            for (int j = x; j < x+4; j++){
                matriz[i][columnas] = consultas.get(j);
                columnas++;
            }
            x+=4;
        }
        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
                new String [] {"Nombre","Evaluación", "Id Estudiante", "Fecha de entrega"}
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        añoCursos = new javax.swing.JTextField();
        botonMostrarCursos = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JButton();
        botonRegresarAdmin = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableDatos = new javax.swing.JTable();
        botonMostrarEstudiantes = new javax.swing.JButton();
        botonMostrarEvaluaciones = new javax.swing.JButton();
        comBoxSemestre = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        comboBoxCursosProfesor = new javax.swing.JComboBox<>();
        jComboBoxEstudiantes = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        comBoxCursosEvaluaciones = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        combBoxProfesores = new javax.swing.JComboBox<>();
        botonSeleccionarProfe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 36)); // NOI18N
        jLabel1.setText("Profesor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 25, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel2.setText("Cursos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel3.setText("Estudiantes");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 118, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel4.setText("Evaluaciones");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 118, -1, -1));

        jLabel6.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel6.setText("Semestre");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 204, -1, -1));

        jLabel7.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel7.setText("Año");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 152, -1, -1));

        añoCursos.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        getContentPane().add(añoCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 152, 123, -1));

        botonMostrarCursos.setBackground(new java.awt.Color(255, 193, 5));
        botonMostrarCursos.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonMostrarCursos.setText("Mostrar");
        botonMostrarCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarCursosActionPerformed(evt);
            }
        });
        getContentPane().add(botonMostrarCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 100, -1));

        jLabel9.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel9.setText("Estudiante");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(797, 152, -1, -1));

        botonRegresar.setBackground(new java.awt.Color(255, 193, 5));
        botonRegresar.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 680, 100, -1));

        botonRegresarAdmin.setBackground(new java.awt.Color(255, 193, 5));
        botonRegresarAdmin.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonRegresarAdmin.setText("Regresar");
        botonRegresarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarAdminActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresarAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 680, 107, -1));

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
        jScrollPane4.setViewportView(jTableDatos);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 288, 1225, 386));

        botonMostrarEstudiantes.setBackground(new java.awt.Color(255, 193, 5));
        botonMostrarEstudiantes.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonMostrarEstudiantes.setText("Mostrar");
        botonMostrarEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarEstudiantesActionPerformed(evt);
            }
        });
        getContentPane().add(botonMostrarEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 200, 101, -1));

        botonMostrarEvaluaciones.setBackground(new java.awt.Color(255, 193, 5));
        botonMostrarEvaluaciones.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonMostrarEvaluaciones.setText("Mostrar");
        botonMostrarEvaluaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarEvaluacionesActionPerformed(evt);
            }
        });
        getContentPane().add(botonMostrarEvaluaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(1159, 200, -1, -1));

        comBoxSemestre.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        comBoxSemestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        getContentPane().add(comBoxSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 204, 123, -1));

        jLabel12.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel12.setText("Curso");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 152, 40, -1));

        comboBoxCursosProfesor.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        getContentPane().add(comboBoxCursosProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 150, 164, -1));

        jComboBoxEstudiantes.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        getContentPane().add(jComboBoxEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(887, 150, 359, -1));

        jLabel5.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel5.setText("Curso");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(797, 204, -1, -1));

        comBoxCursosEvaluaciones.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        getContentPane().add(comBoxCursosEvaluaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(887, 202, 225, -1));

        jLabel8.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Seleccione al profesor antes de iniciar: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        combBoxProfesores.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        getContentPane().add(combBoxProfesores, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 220, -1));

        botonSeleccionarProfe.setText("Seleccionar Profesor");
        botonSeleccionarProfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionarProfeActionPerformed(evt);
            }
        });
        getContentPane().add(botonSeleccionarProfe, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 150, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        this.dispose();
        InicioProfesor inicioProfesor = null;
        try {
            inicioProfesor = new InicioProfesor(this,true, evaluacionDocente);
        } catch (SQLException ex) {
            Logger.getLogger(ModificarCursos.class.getName()).log(Level.SEVERE, null, ex);
        }
    inicioProfesor.setVisible(true);
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonRegresarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarAdminActionPerformed
    this.dispose();
    AdminSetup ventaAdminSetup = null;
        try {
            ventaAdminSetup = new AdminSetup(this,true, evaluacionDocente);
        } catch (SQLException ex) {
            Logger.getLogger(ModificarCursos.class.getName()).log(Level.SEVERE, null, ex);
        }
    ventaAdminSetup.setVisible(true);         
    }//GEN-LAST:event_botonRegresarAdminActionPerformed

    private void botonMostrarEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarEstudiantesActionPerformed
     String curso = (String) comboBoxCursosProfesor.getSelectedItem();
        try {
            mostrarConsultaEstudiantes(curso);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasProfesor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonMostrarEstudiantesActionPerformed

    private void botonMostrarCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarCursosActionPerformed
    
         if(!añoCursos.getText().isEmpty()){
            if(isInt(añoCursos.getText()) && añoCursos.getText().length() == 4){
                String añoString = añoCursos.getText();
                int año = Integer.parseInt(añoString);
                String semestreString = (String) comBoxSemestre.getSelectedItem();
                int semestre = Integer.parseInt(semestreString);
                    try {
                        mostrarCursos(semestre,año);
                    } catch (SQLException ex) {
                        Logger.getLogger(ConsultasProfesor.class.getName()).log(Level.SEVERE, null, ex);
                    }
            } else {
                JOptionPane.showMessageDialog(null,"Error! Digite un año valido");
            }
        } else {
            JOptionPane.showMessageDialog(null,"Error! Campo de año vacio");
        }
        
        
        
    }//GEN-LAST:event_botonMostrarCursosActionPerformed

    private void botonMostrarEvaluacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarEvaluacionesActionPerformed
        String curso = (String) comboBoxCursosProfesor.getSelectedItem();
        String NombreEstudiante;
        NombreEstudiante = (String) jComboBoxEstudiantes.getSelectedItem();
        String[] obteniendoIdEstudiante;
        obteniendoIdEstudiante = NombreEstudiante.split(" ");
        String idEstudiante;
        idEstudiante = obteniendoIdEstudiante[0];
        int idEstudianteInt;
        idEstudianteInt = Integer.parseInt(idEstudiante);
        try {
            mostrarEvaluacionesEstudiante(idEstudianteInt, curso);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasProfesor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonMostrarEvaluacionesActionPerformed

    private void botonSeleccionarProfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionarProfeActionPerformed
        String NombreProfesor;
        NombreProfesor = (String) combBoxProfesores.getSelectedItem();
        String[] obteniendoIdProfesor;
        obteniendoIdProfesor = NombreProfesor.split(" ");
        String idProfesora;
        idProfesora = obteniendoIdProfesor[0];
        idProfesor = Integer.parseInt(idProfesora);
        
        comBoxCursosEvaluaciones.setVisible(false);
        comBoxCursosEvaluaciones.removeAllItems();
        try {
            evaluacionDocente.getCoursesFromProfessor(comBoxCursosEvaluaciones, idProfesor);
            
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasProfesor.class.getName()).log(Level.SEVERE, null, ex);
        }
        comBoxCursosEvaluaciones.setVisible(true);
        
        comboBoxCursosProfesor.setVisible(false);
        comboBoxCursosProfesor.removeAllItems();
        try {
            evaluacionDocente.getCoursesFromProfessor(comboBoxCursosProfesor, idProfesor);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasProfesor.class.getName()).log(Level.SEVERE, null, ex);
        }
        comboBoxCursosProfesor.setVisible(true);
        
        jComboBoxEstudiantes.setVisible(false);
        jComboBoxEstudiantes.removeAllItems();
        try {
            evaluacionDocente.getStudent(jComboBoxEstudiantes);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasProfesor.class.getName()).log(Level.SEVERE, null, ex);
        }
        jComboBoxEstudiantes.setVisible(true);
 
        añoCursos.setEnabled(true);
        botonMostrarCursos.setEnabled(true);
        comBoxSemestre.setEnabled(true);
        comboBoxCursosProfesor.setEnabled(true);
        botonMostrarEstudiantes.setEnabled(true);
        jComboBoxEstudiantes.setEnabled(true);
        comBoxCursosEvaluaciones.setEnabled(true);
        botonMostrarEvaluaciones.setEnabled(true);
    }//GEN-LAST:event_botonSeleccionarProfeActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultasProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultasProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultasProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultasProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConsultasProfesor dialog = new ConsultasProfesor(new javax.swing.JFrame(), true);
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
     private boolean isInt(String text) {  
        try{
            Integer.parseInt(text);
            return true;
        }
        catch (NumberFormatException nfe){
            return false;
        }  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField añoCursos;
    private javax.swing.JButton botonMostrarCursos;
    private javax.swing.JButton botonMostrarEstudiantes;
    private javax.swing.JButton botonMostrarEvaluaciones;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton botonRegresarAdmin;
    private javax.swing.JButton botonSeleccionarProfe;
    private javax.swing.JComboBox<String> comBoxCursosEvaluaciones;
    private javax.swing.JComboBox<String> comBoxSemestre;
    private javax.swing.JComboBox<String> combBoxProfesores;
    private javax.swing.JComboBox<String> comboBoxCursosProfesor;
    private javax.swing.JComboBox<String> jComboBoxEstudiantes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableDatos;
    // End of variables declaration//GEN-END:variables
}
