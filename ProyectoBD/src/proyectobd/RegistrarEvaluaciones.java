/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd;

import ConexionSQL.Conexion;
import java.awt.Color;
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
public class RegistrarEvaluaciones extends javax.swing.JDialog {
    private Conexion registrarEvaluaciones;
    /**
     * Creates new form RegistrarEvaluaciones
     */
    public RegistrarEvaluaciones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.getContentPane().setBackground(new Color(157,210,228));
    }
    
    public RegistrarEvaluaciones(AdminSetup aThis, boolean modal, Conexion setupAdmin) throws SQLException {
        super(aThis, modal);
        initComponents();
        registrarEvaluaciones = setupAdmin;
        this.setLocationRelativeTo(null);
        registrarEvaluaciones.getIDStudent(comBoxEstudiante);
        comBoxEvaluacion.setEnabled(false);
        exsPorcentajeObtenido.setEnabled(false);
        botonRegistrarEvaEstudiante.setEnabled(false);
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
        evaluacionNombre = new javax.swing.JTextField();
        evaluacionDescripcion = new javax.swing.JTextField();
        evaluacionPorcentaje = new javax.swing.JTextField();
        evaluacionMiembros = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        exsPorcentajeObtenido = new javax.swing.JTextField();
        botonRegistrarEvaluacion = new javax.swing.JButton();
        botonRegistrarEvaEstudiante = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        comBoxEstudiante = new javax.swing.JComboBox<>();
        comBoxEvaluacion = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        botonFechaEntrega = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 36)); // NOI18N
        jLabel1.setText("Registrar Evaluaciones");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel2.setText("Evaluación");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 141, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel4.setText("Descripción");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel5.setText("Cantidad de personas");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel6.setText("Porcentaje");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        evaluacionNombre.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        getContentPane().add(evaluacionNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 100, -1));

        evaluacionDescripcion.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        getContentPane().add(evaluacionDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 230, 140));

        evaluacionPorcentaje.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        getContentPane().add(evaluacionPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 100, -1));

        evaluacionMiembros.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        getContentPane().add(evaluacionMiembros, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 100, -1));

        jLabel8.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel8.setText("Evaluar un Estudiante");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(875, 141, -1, -1));

        jLabel9.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel9.setText("Id Estudiante");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(815, 200, -1, -1));

        jLabel10.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel10.setText("Id Evaluación");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 300, -1, -1));

        jLabel11.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel11.setText("Porcentaje Obtenido");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 380, -1, -1));

        exsPorcentajeObtenido.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        getContentPane().add(exsPorcentajeObtenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 370, 110, 40));

        botonRegistrarEvaluacion.setBackground(new java.awt.Color(255, 193, 5));
        botonRegistrarEvaluacion.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonRegistrarEvaluacion.setText("Registrar");
        botonRegistrarEvaluacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarEvaluacionActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrarEvaluacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 120, 70));

        botonRegistrarEvaEstudiante.setBackground(new java.awt.Color(255, 193, 5));
        botonRegistrarEvaEstudiante.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonRegistrarEvaEstudiante.setText("Registrar");
        botonRegistrarEvaEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarEvaEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrarEvaEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, 130, 60));

        jButton2.setBackground(new java.awt.Color(255, 193, 5));
        jButton2.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 684, 100, -1));

        comBoxEstudiante.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        getContentPane().add(comBoxEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 200, 90, 40));

        comBoxEvaluacion.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        getContentPane().add(comBoxEvaluacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 290, 110, 40));

        jLabel12.setText("Fecha de entrega");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 100, 40));
        getContentPane().add(botonFechaEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 120, 30));

        jButton3.setText("Seleccionar ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 200, 100, 40));

        jLabel7.setText("Seleccione el id de la evaluación");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 270, 220, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    this.dispose();
    AdminSetup ventaAdminSetup = null;
        try {
            ventaAdminSetup = new AdminSetup(this,true,registrarEvaluaciones);
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarEvaluaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    ventaAdminSetup.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botonRegistrarEvaluacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarEvaluacionActionPerformed
       //if(evaluacionNombre.getText().isEmpty() && evaluacionPorcentaje.getText().isEmpty() && evaluacionMiembros.getText().isEmpty() && evaluacionDescripcion.getText().isEmpty()){ 
         //      JOptionPane.showMessageDialog(null,"Error!\nTodos los campos están vacios.");
       //}
       java.sql.Date DueDateValida = null;
       boolean validando = false;
       int porcentaje = 0;
       if(!botonFechaEntrega.getText().isEmpty()){
       String DueDate = botonFechaEntrega.getText();
       SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
       Date FechaDate = null;
       try {
       FechaDate = formatoFecha.parse(botonFechaEntrega.getText());
        } catch (ParseException ex) {
           //Logger.getLogger(RegistroPersona.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null,"Error!\nFormato de fecha incorrecto.");
        }
       
        DueDateValida = new java.sql.Date(FechaDate.getTime());} 
       if(!evaluacionPorcentaje.getText().isEmpty()){
        porcentaje = Integer.parseInt(evaluacionPorcentaje.getText());    
        }
        try {
            registrarEvaluaciones.addEvaluation(evaluacionNombre.getText(),evaluacionDescripcion.getText(),evaluacionMiembros.getText(),porcentaje,DueDateValida);
            validando = true;
        } catch (SQLException ex) {
            //Logger.getLogger(RegistrarEvaluaciones.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error!\nEvaluación no agregada");
            validando = false;
        }
        if(validando){
        JOptionPane.showMessageDialog(null,"Evaluación registrada!");
        this.dispose();
         AdminSetup ventaAdminSetup = null;
        try {
            ventaAdminSetup = new AdminSetup(this,true,registrarEvaluaciones);
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarEvaluaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    ventaAdminSetup.setVisible(true);  
        }
    }//GEN-LAST:event_botonRegistrarEvaluacionActionPerformed

    private void botonRegistrarEvaEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarEvaEstudianteActionPerformed
        boolean validandoActualizacionPorcentaje = false;
        int idEvaluacion = Integer.parseInt(comBoxEvaluacion.getSelectedItem().toString());
        int porcentajeEvaluacion = Integer.parseInt(exsPorcentajeObtenido.getText().toString());
        try {
            registrarEvaluaciones.updateEvaluationxstudentPercentage(idEvaluacion, porcentajeEvaluacion);
            validandoActualizacionPorcentaje = true;
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarEvaluaciones.class.getName()).log(Level.SEVERE, null, ex);
            validandoActualizacionPorcentaje = false;
            JOptionPane.showMessageDialog(null,"Error!\nEvaluación no calificada");
        }
        if(validandoActualizacionPorcentaje){
            JOptionPane.showMessageDialog(null,"Evaluación Calificada!");
            this.dispose();
            AdminSetup ventaAdminSetup = null;
                try {
                    ventaAdminSetup = new AdminSetup(this,true,registrarEvaluaciones);
                } catch (SQLException ex) {
                    Logger.getLogger(RegistrarEvaluaciones.class.getName()).log(Level.SEVERE, null, ex);
                }
            ventaAdminSetup.setVisible(true); 
            
        } 
    }//GEN-LAST:event_botonRegistrarEvaEstudianteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        comBoxEvaluacion.removeAllItems();
        exsPorcentajeObtenido.setEnabled(true);
        botonRegistrarEvaEstudiante.setEnabled(true);
        int IdEstudiante = Integer.parseInt(comBoxEstudiante.getSelectedItem().toString());
        try {
            comBoxEvaluacion.setEnabled(true);
            registrarEvaluaciones.getStudentEvaluation(comBoxEvaluacion,IdEstudiante);
            //comBoxEvaluacion.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarEvaluaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarEvaluaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarEvaluaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarEvaluaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarEvaluaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistrarEvaluaciones dialog = new RegistrarEvaluaciones(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField botonFechaEntrega;
    private javax.swing.JButton botonRegistrarEvaEstudiante;
    private javax.swing.JButton botonRegistrarEvaluacion;
    private javax.swing.JComboBox<String> comBoxEstudiante;
    private javax.swing.JComboBox<String> comBoxEvaluacion;
    private javax.swing.JTextField evaluacionDescripcion;
    private javax.swing.JTextField evaluacionMiembros;
    private javax.swing.JTextField evaluacionNombre;
    private javax.swing.JTextField evaluacionPorcentaje;
    private javax.swing.JTextField exsPorcentajeObtenido;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    // End of variables declaration//GEN-END:variables
}
