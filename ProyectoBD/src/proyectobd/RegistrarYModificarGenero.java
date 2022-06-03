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
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Dares
 */
public class RegistrarYModificarGenero extends javax.swing.JDialog {
    
    
    private Conexion regisYModificarGenero;
    /**
     * Creates new form RegistrarYModificarGenero
     */
    public RegistrarYModificarGenero(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public RegistrarYModificarGenero(AdminSetup aThis, boolean modal, Conexion setupAdmin) throws SQLException {
        super(aThis, modal);
        initComponents();
        regisYModificarGenero = setupAdmin;
        this.setLocationRelativeTo(null);
        regisYModificarGenero.getGender(botonGeneros);
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
        textoModificarGeneroNombre = new javax.swing.JTextField();
        botonModificarGenero = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        textoRegistrarGeneroNombre = new javax.swing.JTextField();
        botonRegistrarGenero = new javax.swing.JButton();
        botonGeneros = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JButton();
        botonDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        jLabel1.setText("Modificar Genero");

        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        jLabel2.setText("Registrar Genero");

        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel3.setText("Nuevo nombre genero");

        textoModificarGeneroNombre.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N

        botonModificarGenero.setBackground(new java.awt.Color(255, 193, 5));
        botonModificarGenero.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        botonModificarGenero.setText("Modificar");
        botonModificarGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarGeneroActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel4.setText("Nombre Genero");

        textoRegistrarGeneroNombre.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N

        botonRegistrarGenero.setBackground(new java.awt.Color(255, 193, 5));
        botonRegistrarGenero.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        botonRegistrarGenero.setText("Registrar");
        botonRegistrarGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarGeneroActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel5.setText("Seleccione el genero a modificar");

        botonRegresar.setBackground(new java.awt.Color(255, 193, 5));
        botonRegresar.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonRegresar.setText("Regresar");

        botonDatos.setBackground(new java.awt.Color(255, 193, 5));
        botonDatos.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonDatos.setText("Ver Datos");
        botonDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonDatos))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(450, 450, 450)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(textoRegistrarGeneroNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(380, 380, 380)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(90, 90, 90)
                                        .addComponent(botonGeneros, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(textoModificarGeneroNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(botonRegistrarGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(540, 540, 540)
                                .addComponent(botonModificarGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 65, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonGeneros, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textoModificarGeneroNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoRegistrarGeneroNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(botonRegistrarGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonModificarGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonRegresar)
                    .addComponent(botonDatos))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarGeneroActionPerformed
        if(!textoRegistrarGeneroNombre.getText().isEmpty()){
            boolean validando = false;
            String GeneroNombre;
            GeneroNombre = textoRegistrarGeneroNombre.getText().toString();
            try {
                regisYModificarGenero.addGender(GeneroNombre);
                validando = true;
            } catch (SQLException ex) {
                Logger.getLogger(RegistrarYModificarGenero.class.getName()).log(Level.SEVERE, null, ex);
                validando = false;
            }
            if(validando){
                JOptionPane.showMessageDialog(null,"Genero Agregado.");
                textoRegistrarGeneroNombre.setText(null);
            } else {
                JOptionPane.showMessageDialog(null,"Genero No Agregado.");
            }
        } else { 
            JOptionPane.showMessageDialog(null,"Nada agregado\nCampos vacios.");
        }
        botonGeneros.setVisible(false);
        botonGeneros.removeAllItems();
        try {
            regisYModificarGenero.getGender(botonGeneros);
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarYModificarGenero.class.getName()).log(Level.SEVERE, null, ex);
        }
        botonGeneros.setVisible(true);
    }//GEN-LAST:event_botonRegistrarGeneroActionPerformed

    private void botonModificarGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarGeneroActionPerformed
        if(!textoModificarGeneroNombre.getText().isEmpty()){ 
            boolean validandoModificacion = false;
            String nombreGeneroN;
            int idGeneroVijo = 0;
            nombreGeneroN = textoModificarGeneroNombre.getText().toString();
            try {
                idGeneroVijo = regisYModificarGenero.getGenderCode(botonGeneros.getSelectedItem().toString());
            } catch (SQLException ex) {
                Logger.getLogger(RegistrarYModificarGenero.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                regisYModificarGenero.updateGenderDescription(idGeneroVijo, nombreGeneroN);
                validandoModificacion = true;
            } catch (SQLException ex) {
                Logger.getLogger(RegistrarYModificarGenero.class.getName()).log(Level.SEVERE, null, ex);
                validandoModificacion = false;
            }
            if(validandoModificacion){
                JOptionPane.showMessageDialog(null,"Genero Modificado");
                textoModificarGeneroNombre.setText(null);
                botonGeneros.setVisible(false);
                botonGeneros.removeAllItems();
                try {
                    regisYModificarGenero.getGender(botonGeneros);
                } catch (SQLException ex) {
                    Logger.getLogger(RegistrarYModificarGenero.class.getName()).log(Level.SEVERE, null, ex);
                }
                botonGeneros.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null,"Genero No Modificado.");
                }
        } else {
            JOptionPane.showMessageDialog(null,"No se ha modificado nada\nCampos Vacios.");
        }
        
        
    }//GEN-LAST:event_botonModificarGeneroActionPerformed

    private void botonDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDatosActionPerformed
     Tablas tablas = null;
        try {
            tablas = new Tablas(this,true,regisYModificarGenero);
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
            java.util.logging.Logger.getLogger(RegistrarYModificarGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarYModificarGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarYModificarGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarYModificarGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistrarYModificarGenero dialog = new RegistrarYModificarGenero(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> botonGeneros;
    private javax.swing.JButton botonModificarGenero;
    private javax.swing.JButton botonRegistrarGenero;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField textoModificarGeneroNombre;
    private javax.swing.JTextField textoRegistrarGeneroNombre;
    // End of variables declaration//GEN-END:variables
}