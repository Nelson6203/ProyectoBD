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

/**
 *
 * @author paubo
 */
public class InicioProfesor extends javax.swing.JDialog {
    private Conexion inicioProfesor;
    /**
     * Creates new form InicioProfesor
     */
    public InicioProfesor(java.awt.Frame parent, boolean modal) throws SQLException {
        super(parent, modal);
        this.getContentPane().setBackground(new Color(157,210,228));
        initComponents();
        inicioProfesor.getProfessor(combBoxProfesores);
    }

    InicioProfesor(RegistrarEvaluaciones aThis, boolean modal, Conexion registrarEvaluaciones) throws SQLException {
        super(aThis, modal);
        this.getContentPane().setBackground(new Color(157,210,228));
        initComponents();
        inicioProfesor.getProfessor(combBoxProfesores);
    }
    
    InicioProfesor(MenuInicio aThis, boolean modal, Conexion conexion) throws SQLException {
        super(aThis, modal);
        this.getContentPane().setBackground(new Color(157,210,228));
        initComponents();
        inicioProfesor = conexion;
        inicioProfesor.getProfessor(combBoxProfesores);
        this.setLocationRelativeTo(null);
    }

    InicioProfesor(ConsultasProfesor aThis, boolean modal, Conexion evaluacionDocente) throws SQLException{
        super(aThis, modal);
        this.getContentPane().setBackground(new Color(157,210,228));
        initComponents();
        inicioProfesor = evaluacionDocente;
        inicioProfesor.getProfessor(combBoxProfesores);
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
        botonConsulta = new javax.swing.JButton();
        botonEvaluar = new javax.swing.JButton();
        combBoxProfesores = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 36)); // NOI18N
        jLabel1.setText("Profesor");

        botonConsulta.setBackground(new java.awt.Color(255, 193, 5));
        botonConsulta.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        botonConsulta.setText("Consultas");
        botonConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultaActionPerformed(evt);
            }
        });

        botonEvaluar.setBackground(new java.awt.Color(255, 193, 5));
        botonEvaluar.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        botonEvaluar.setText("Evaluaciones");
        botonEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEvaluarActionPerformed(evt);
            }
        });

        combBoxProfesores.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel12.setText("Seleccione el profesor: ");

        botonRegresar.setBackground(new java.awt.Color(255, 193, 5));
        botonRegresar.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(botonConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addComponent(botonEvaluar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(398, 398, 398))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(41, 41, 41)
                        .addComponent(combBoxProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154))))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(botonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combBoxProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEvaluar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(230, 230, 230)
                .addComponent(botonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultaActionPerformed
        String NombreProfesor;
        NombreProfesor = (String) combBoxProfesores.getSelectedItem();
        String[] obteniendoIdProfesor;
        obteniendoIdProfesor = NombreProfesor.split(" ");
        String idProfesor;
        idProfesor = obteniendoIdProfesor[0];
        int idProfesorInt;
        idProfesorInt = Integer.parseInt(idProfesor);
        
        this.dispose();
        ConsultasProfesor consultasProfesor = null;
        try {
            consultasProfesor = new ConsultasProfesor(this,true,inicioProfesor, idProfesorInt);
        } catch (SQLException ex) {
            Logger.getLogger(InicioProfesor.class.getName()).log(Level.SEVERE, null, ex);
        }
        consultasProfesor.setVisible(true); 
    }//GEN-LAST:event_botonConsultaActionPerformed

    private void botonEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEvaluarActionPerformed
        this.dispose();
        RegistrarEvaluaciones registrarEvaluaciones = null;
        try {
            registrarEvaluaciones = new RegistrarEvaluaciones(this,true,inicioProfesor);
        } catch (SQLException ex) {
            Logger.getLogger(InicioProfesor.class.getName()).log(Level.SEVERE, null, ex);
        }
        registrarEvaluaciones.setVisible(true); 
    }//GEN-LAST:event_botonEvaluarActionPerformed

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
            java.util.logging.Logger.getLogger(InicioProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InicioProfesor dialog = null;
                try {
                    dialog = new InicioProfesor(new javax.swing.JFrame(), true);
                } catch (SQLException ex) {
                    Logger.getLogger(InicioProfesor.class.getName()).log(Level.SEVERE, null, ex);
                }
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
    private javax.swing.JButton botonConsulta;
    private javax.swing.JButton botonEvaluar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JComboBox<String> combBoxProfesores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    // End of variables declaration//GEN-END:variables
}
