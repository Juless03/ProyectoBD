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
public class RegistrarCursos extends javax.swing.JDialog {
    private Conexion registrarCursos;
    /**
     * Creates new form RegistrarCursos
     */
    public RegistrarCursos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.getContentPane().setBackground(new Color(157,210,228));
    }
    
    public RegistrarCursos(AdminSetup aThis, boolean modal, Conexion setupAdmin) {
        super(aThis, modal);
        initComponents();
        registrarCursos = setupAdmin;
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
        cursoCreditos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nombreCurso = new javax.swing.JTextField();
        botonRegistrarCurso = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        grupoAño = new javax.swing.JTextField();
        grupoSemestre = new javax.swing.JTextField();
        BotonRegistrarGrupo = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        sxgReview = new javax.swing.JTextField();
        botonRegistrarEstudianteGrupo = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        combBoxProfesores = new javax.swing.JComboBox<>();
        comBoxCurso = new javax.swing.JComboBox<>();
        comBoxEstudiantes = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 36)); // NOI18N
        jLabel1.setText("Registro de Cursos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 31, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel2.setText("Créditos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 217, -1, -1));

        cursoCreditos.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        getContentPane().add(cursoCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 217, 80, -1));

        jLabel3.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel3.setText("Nombre del Curso");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 287, -1, -1));

        nombreCurso.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        getContentPane().add(nombreCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 287, 80, -1));

        botonRegistrarCurso.setBackground(new java.awt.Color(255, 193, 5));
        botonRegistrarCurso.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonRegistrarCurso.setText("Registrar");
        getContentPane().add(botonRegistrarCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 357, 100, -1));

        jLabel4.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel4.setText("Curso");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 138, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel5.setText("Grupo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel6.setText("Estudiante en un Grupo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel7.setText("Año");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 217, -1, -1));

        jLabel8.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel8.setText("Id Profesor");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 361, -1, -1));

        jLabel9.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel9.setText("Semestre");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 287, -1, -1));

        jLabel10.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel10.setText("Id Curso");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 436, -1, -1));

        grupoAño.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        getContentPane().add(grupoAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 217, 157, -1));

        grupoSemestre.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        getContentPane().add(grupoSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 287, 157, -1));

        BotonRegistrarGrupo.setBackground(new java.awt.Color(255, 193, 5));
        BotonRegistrarGrupo.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        BotonRegistrarGrupo.setText("Registrar");
        getContentPane().add(BotonRegistrarGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(718, 505, 100, -1));

        jLabel11.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel11.setText("Id Estudiante");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(926, 217, -1, -1));

        jLabel13.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel13.setText("Review");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(956, 287, 54, -1));

        sxgReview.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        getContentPane().add(sxgReview, new org.netbeans.lib.awtextra.AbsoluteConstraints(1084, 287, 80, -1));

        botonRegistrarEstudianteGrupo.setBackground(new java.awt.Color(255, 193, 5));
        botonRegistrarEstudianteGrupo.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonRegistrarEstudianteGrupo.setText("Registrar");
        getContentPane().add(botonRegistrarEstudianteGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1064, 357, 100, -1));

        jButton2.setBackground(new java.awt.Color(255, 193, 5));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 696, 100, -1));

        combBoxProfesores.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        combBoxProfesores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(combBoxProfesores, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 361, 157, -1));

        comBoxCurso.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        comBoxCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comBoxCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 436, 157, -1));

        comBoxEstudiantes.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        comBoxEstudiantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comBoxEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1084, 217, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    AdminSetup adminSetup = new AdminSetup(this,true,registrarCursos);
    this.dispose();
    adminSetup.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistrarCursos dialog = new RegistrarCursos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BotonRegistrarGrupo;
    private javax.swing.JButton botonRegistrarCurso;
    private javax.swing.JButton botonRegistrarEstudianteGrupo;
    private javax.swing.JComboBox<String> comBoxCurso;
    private javax.swing.JComboBox<String> comBoxEstudiantes;
    private javax.swing.JComboBox<String> combBoxProfesores;
    private javax.swing.JTextField cursoCreditos;
    private javax.swing.JTextField grupoAño;
    private javax.swing.JTextField grupoSemestre;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nombreCurso;
    private javax.swing.JTextField sxgReview;
    // End of variables declaration//GEN-END:variables
}
