/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd;

import ConexionSQL.Conexion;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Dares
 */
public class MenuInicio extends javax.swing.JFrame {
    
    Conexion Conexion = new Conexion();
    /**
     * Creates new form MenuInicio
     */
    public MenuInicio() throws IOException {
        initComponents();
        File pathToFile = new File("./imagenes/Logo.png");
        BufferedImage bufferImage = ImageIO.read(pathToFile);
        ImageIcon imageIcon = new ImageIcon(bufferImage);
        jLabel1.setIcon(imageIcon);
        this.setLocationRelativeTo(null);
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

        botonAdministrador = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botonProfesor = new javax.swing.JButton();
        botonEstudiante = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MenuInicio");
        setBackground(new java.awt.Color(157, 210, 228));
        setForeground(new java.awt.Color(0, 0, 102));

        botonAdministrador.setBackground(new java.awt.Color(255, 193, 5));
        botonAdministrador.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        botonAdministrador.setText("Administrador");
        botonAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdministradorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bell MT", 0, 14));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        botonProfesor.setBackground(new java.awt.Color(255, 193, 5));
        botonProfesor.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        botonProfesor.setText("Profesor");
        botonProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProfesorActionPerformed(evt);
            }
        });

        botonEstudiante.setBackground(new java.awt.Color(255, 193, 5));
        botonEstudiante.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        botonEstudiante.setText("Estudiante");
        botonEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEstudianteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel2.setText("¡Bienvenidos a la plataforma del Tecnológico de Costa Rica!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(440, 440, 440)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(botonAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195)
                        .addComponent(jLabel2)
                        .addGap(143, 143, 143)
                        .addComponent(botonEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(638, 638, 638)
                        .addComponent(botonProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(botonAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(botonEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71)
                .addComponent(botonProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdministradorActionPerformed

       InicioSesionAdministrador iniAdministrador = new InicioSesionAdministrador(this,true,Conexion);
       iniAdministrador.setVisible(true);
       
    }//GEN-LAST:event_botonAdministradorActionPerformed

    private void botonProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProfesorActionPerformed
        ConsultasProfesor evaluacionDocente = new ConsultasProfesor(this,true,Conexion);
        evaluacionDocente.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_botonProfesorActionPerformed

    private void botonEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEstudianteActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_botonEstudianteActionPerformed

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
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new MenuInicio().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MenuInicio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAdministrador;
    private javax.swing.JButton botonEstudiante;
    private javax.swing.JButton botonProfesor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
