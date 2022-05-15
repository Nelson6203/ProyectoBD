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
public class ModificarEvaluaciones extends javax.swing.JDialog {
    private Conexion modificarEvaluaciones;
    /**
     * Creates new form ModificarEvaluaciones
     */
    public ModificarEvaluaciones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.getContentPane().setBackground(new Color(157,210,228));
    }
    
    public ModificarEvaluaciones(AdminSetup aThis, boolean modal, Conexion setupAdmin) throws SQLException {
        super(aThis, modal);
        initComponents();
        modificarEvaluaciones = setupAdmin;
        modificarEvaluaciones.getStudent(comboBoxEstudiantes);
        this.getContentPane().setBackground(new Color(157,210,228));
        this.setLocationRelativeTo(null);
        nombreEvaluacion.setEnabled(false);
        descripcionEvaluacion.setEnabled(false);
        porcentajeEvaluacion.setEnabled(false);
        cantidadEvaluaion.setEnabled(false);
        nombreCurso.setEnabled(false);
        botonFechaEntrega.setEnabled(false);
        comBoxEvaluacion.setEnabled(false);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comBoxEvaluacion = new javax.swing.JComboBox<>();
        nombreEvaluacion = new javax.swing.JTextField();
        descripcionEvaluacion = new javax.swing.JTextField();
        porcentajeEvaluacion = new javax.swing.JTextField();
        cantidadEvaluaion = new javax.swing.JTextField();
        botonFechaEntrega = new javax.swing.JTextField();
        botonModificarEvaluacion = new javax.swing.JButton();
        botonRegresar = new javax.swing.JButton();
        nombreCurso = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        comboBoxEstudiantes = new javax.swing.JComboBox<>();
        botonSeleccionarEstudiante = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 36)); // NOI18N
        jLabel1.setText("Modificar Evaluaciones");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel2.setText("Evaluación");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel5.setText("Descripción");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel6.setText("Porcentaje");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 330, -1, 20));

        jLabel7.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel7.setText("Cantidad de Personas");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, -1, -1));

        jLabel8.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel8.setText("Fecha de Entrega");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 480, 160, 30));

        jLabel9.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel9.setText("Seleccione la evaluación a modificar:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        comBoxEvaluacion.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        getContentPane().add(comBoxEvaluacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 200, 40));

        nombreEvaluacion.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        nombreEvaluacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreEvaluacionActionPerformed(evt);
            }
        });
        getContentPane().add(nombreEvaluacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 100, -1));

        descripcionEvaluacion.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        getContentPane().add(descripcionEvaluacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 211, 124));

        porcentajeEvaluacion.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        getContentPane().add(porcentajeEvaluacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, 100, -1));

        cantidadEvaluaion.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        getContentPane().add(cantidadEvaluaion, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 390, 100, -1));

        botonFechaEntrega.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        getContentPane().add(botonFechaEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 490, 100, -1));

        botonModificarEvaluacion.setBackground(new java.awt.Color(255, 193, 5));
        botonModificarEvaluacion.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonModificarEvaluacion.setText("Modificar");
        botonModificarEvaluacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarEvaluacionActionPerformed(evt);
            }
        });
        getContentPane().add(botonModificarEvaluacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 530, 130, 60));

        botonRegresar.setBackground(new java.awt.Color(255, 193, 5));
        botonRegresar.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 101, -1));

        nombreCurso.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        getContentPane().add(nombreCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 420, 100, -1));

        jLabel10.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel10.setText("Curso");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 420, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Llene lo que desea modificar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 290, 30));

        jLabel11.setText("Seleccione el estudiante al cual se le va a modificar la evaluación");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 430, 50));

        getContentPane().add(comboBoxEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 230, 50));

        botonSeleccionarEstudiante.setText("Seleccionar");
        botonSeleccionarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionarEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(botonSeleccionarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 100, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreEvaluacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreEvaluacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreEvaluacionActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
    this.dispose();
    AdminSetup ventaAdminSetup = null;
        try {
            ventaAdminSetup = new AdminSetup(this,true, modificarEvaluaciones);
        } catch (SQLException ex) {
            Logger.getLogger(ModificarEvaluaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    ventaAdminSetup.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonModificarEvaluacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarEvaluacionActionPerformed
        java.sql.Date DueDateValida = null;
       /*
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
        */
    }//GEN-LAST:event_botonModificarEvaluacionActionPerformed

    private void botonSeleccionarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionarEstudianteActionPerformed
        comBoxEvaluacion.removeAllItems();
        nombreEvaluacion.setEnabled(true);
        descripcionEvaluacion.setEnabled(true);
        porcentajeEvaluacion.setEnabled(true);
        cantidadEvaluaion.setEnabled(true);
        nombreCurso.setEnabled(true);
        botonFechaEntrega.setEnabled(true);
        comBoxEvaluacion.setEnabled(true);
        String NombreEstudiante = (String) comboBoxEstudiantes.getSelectedItem();
        String[] obteniendoIDEstudiante = NombreEstudiante.split(" ");
        String ID = obteniendoIDEstudiante[0];
        int idEstudiante = Integer.parseInt(ID);
      
        try {
            comBoxEvaluacion.setEnabled(true);
            modificarEvaluaciones.getStudentEvaluation(comBoxEvaluacion,idEstudiante);
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarEvaluaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_botonSeleccionarEstudianteActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarEvaluaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarEvaluaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarEvaluaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarEvaluaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModificarEvaluaciones dialog = new ModificarEvaluaciones(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton botonModificarEvaluacion;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton botonSeleccionarEstudiante;
    private javax.swing.JTextField cantidadEvaluaion;
    private javax.swing.JComboBox<String> comBoxEvaluacion;
    private javax.swing.JComboBox<String> comboBoxEstudiantes;
    private javax.swing.JTextField descripcionEvaluacion;
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
    private javax.swing.JTextField nombreCurso;
    private javax.swing.JTextField nombreEvaluacion;
    private javax.swing.JTextField porcentajeEvaluacion;
    // End of variables declaration//GEN-END:variables
}
