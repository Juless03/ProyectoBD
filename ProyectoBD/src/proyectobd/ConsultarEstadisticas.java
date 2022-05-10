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
public class ConsultarEstadisticas extends javax.swing.JDialog {
    private Conexion consultarEstadisticas;
    /**
     * Creates new form ConsultarEstadisticas
     */
    public ConsultarEstadisticas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.getContentPane().setBackground(new Color(157,210,228));
    }
    
    public ConsultarEstadisticas(AdminSetup aThis, boolean modal, Conexion setupAdmin) {
        super(aThis, modal);
        initComponents();
        consultarEstadisticas = setupAdmin;
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
        NombreCurso = new javax.swing.JTextField();
        BotonEstudiantesxCursoxGenero = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        NombreCursoMejoresEstudiantes = new javax.swing.JTextField();
        RangoTop = new javax.swing.JTextField();
        Genero = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BotonTopMejoresEstudiantes = new javax.swing.JButton();
        BotonPromedioNotas = new javax.swing.JButton();
        BotonPorcentajeAbandonos = new javax.swing.JButton();
        BotonEstudiantesRangoEdad = new javax.swing.JButton();
        BotonRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 36)); // NOI18N
        jLabel1.setText("Estadísticas del sistema");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel2.setText("Elija la estadística que desea visualizar:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 16)); // NOI18N
        jLabel3.setText("Total de estudiantes por curso por género");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel4.setText("Ingrese el nombre del curso:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        NombreCurso.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        getContentPane().add(NombreCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 98, -1));

        BotonEstudiantesxCursoxGenero.setBackground(new java.awt.Color(255, 193, 5));
        BotonEstudiantesxCursoxGenero.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        BotonEstudiantesxCursoxGenero.setText("Ver");
        getContentPane().add(BotonEstudiantesxCursoxGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 240, 90, -1));

        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 16)); // NOI18N
        jLabel5.setText("Top de mejores estudiantes");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel6.setText("Ingrese el nombre del curso:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel7.setText("Ingrese el género:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        jLabel8.setText("Ingrese el rango del top:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, -1, -1));

        NombreCursoMejoresEstudiantes.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        NombreCursoMejoresEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreCursoMejoresEstudiantesActionPerformed(evt);
            }
        });
        getContentPane().add(NombreCursoMejoresEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 57, -1));

        RangoTop.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        RangoTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RangoTopActionPerformed(evt);
            }
        });
        getContentPane().add(RangoTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, 57, -1));

        Genero.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(Genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(743, 240, 70, -1));

        jLabel9.setFont(new java.awt.Font("Bell MT", 1, 16)); // NOI18N
        jLabel9.setText("Promedio de notas por curso");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, -1));

        jLabel10.setFont(new java.awt.Font("Bell MT", 1, 16)); // NOI18N
        jLabel10.setText("Porcentaje de abandonos de curso");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, -1, -1));

        jLabel11.setFont(new java.awt.Font("Bell MT", 1, 16)); // NOI18N
        jLabel11.setText("Total de estudiantes por rango de edad");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, -1, -1));

        BotonTopMejoresEstudiantes.setBackground(new java.awt.Color(255, 193, 5));
        BotonTopMejoresEstudiantes.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        BotonTopMejoresEstudiantes.setText("Ver");
        getContentPane().add(BotonTopMejoresEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 327, 90, -1));

        BotonPromedioNotas.setBackground(new java.awt.Color(255, 193, 5));
        BotonPromedioNotas.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        BotonPromedioNotas.setText("Ver");
        getContentPane().add(BotonPromedioNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 505, 90, -1));

        BotonPorcentajeAbandonos.setBackground(new java.awt.Color(255, 193, 5));
        BotonPorcentajeAbandonos.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        BotonPorcentajeAbandonos.setText("Ver");
        getContentPane().add(BotonPorcentajeAbandonos, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 505, 90, -1));

        BotonEstudiantesRangoEdad.setBackground(new java.awt.Color(255, 193, 5));
        BotonEstudiantesRangoEdad.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        BotonEstudiantesRangoEdad.setText("Ver");
        getContentPane().add(BotonEstudiantesRangoEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 500, 90, -1));

        BotonRegresar.setBackground(new java.awt.Color(255, 193, 5));
        BotonRegresar.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        BotonRegresar.setText("Regresar");
        BotonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreCursoMejoresEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreCursoMejoresEstudiantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreCursoMejoresEstudiantesActionPerformed

    private void RangoTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RangoTopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RangoTopActionPerformed

    private void BotonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresarActionPerformed
    AdminSetup adminSetup = new AdminSetup(this,true,consultarEstadisticas);
    this.dispose();
    adminSetup.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BotonRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConsultarEstadisticas dialog = new ConsultarEstadisticas(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BotonEstudiantesRangoEdad;
    private javax.swing.JButton BotonEstudiantesxCursoxGenero;
    private javax.swing.JButton BotonPorcentajeAbandonos;
    private javax.swing.JButton BotonPromedioNotas;
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JButton BotonTopMejoresEstudiantes;
    private javax.swing.JComboBox<String> Genero;
    private javax.swing.JTextField NombreCurso;
    private javax.swing.JTextField NombreCursoMejoresEstudiantes;
    private javax.swing.JTextField RangoTop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
