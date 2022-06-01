/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd;

import ConexionSQL.Conexion;
import java.awt.Color;
//import java.sql.Date;
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
    
    public RegistrarCursos(AdminSetup aThis, boolean modal, Conexion setupAdmin) throws SQLException{
        super(aThis, modal);
        initComponents();
        registrarCursos = setupAdmin;
        this.getContentPane().setBackground(new Color(157,210,228));
        registrarCursos.getCourseRegistroGrupo(comBoxCurso);
        registrarCursos.getStudent(comBoxEstudiantes);
        registrarCursos.getProfessor(combBoxProfesores);
        this.setLocationRelativeTo(null);
        registrarCursos.getCourseGroup(comBoxGrupo);

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
        botonRegresar = new javax.swing.JButton();
        combBoxProfesores = new javax.swing.JComboBox<>();
        comBoxCurso = new javax.swing.JComboBox<>();
        comBoxEstudiantes = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        comBoxGrupo = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        comBoxStatus = new javax.swing.JComboBox<>();
        botonDatos = new javax.swing.JButton();

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
        botonRegistrarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarCursoActionPerformed(evt);
            }
        });
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
        jLabel8.setText("Profesor");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, -1, -1));

        jLabel9.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel9.setText("Semestre");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 287, -1, -1));

        jLabel10.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel10.setText("Curso");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, -1, 20));

        grupoAño.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        getContentPane().add(grupoAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 217, 157, -1));

        grupoSemestre.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        getContentPane().add(grupoSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 287, 157, -1));

        BotonRegistrarGrupo.setBackground(new java.awt.Color(255, 193, 5));
        BotonRegistrarGrupo.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        BotonRegistrarGrupo.setText("Registrar");
        BotonRegistrarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarGrupoActionPerformed(evt);
            }
        });
        getContentPane().add(BotonRegistrarGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 500, 100, -1));

        jLabel11.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel11.setText("Estudiante");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 220, -1, -1));

        jLabel13.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel13.setText("Review");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 360, 54, -1));

        sxgReview.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        getContentPane().add(sxgReview, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 360, 80, -1));

        botonRegistrarEstudianteGrupo.setBackground(new java.awt.Color(255, 193, 5));
        botonRegistrarEstudianteGrupo.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonRegistrarEstudianteGrupo.setText("Registrar");
        botonRegistrarEstudianteGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarEstudianteGrupoActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrarEstudianteGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 510, 100, -1));

        botonRegresar.setBackground(new java.awt.Color(255, 193, 5));
        botonRegresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 696, 100, -1));

        combBoxProfesores.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        combBoxProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combBoxProfesoresActionPerformed(evt);
            }
        });
        getContentPane().add(combBoxProfesores, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 361, 230, -1));

        comBoxCurso.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        getContentPane().add(comBoxCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 436, 157, -1));

        comBoxEstudiantes.setFont(new java.awt.Font("Bell MT", 0, 12)); // NOI18N
        getContentPane().add(comBoxEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1044, 217, 230, -1));

        jLabel12.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel12.setText("Grupo");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 290, -1, -1));

        comBoxGrupo.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        getContentPane().add(comBoxGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 290, 220, -1));

        jLabel14.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        jLabel14.setText("Status");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 430, -1, -1));

        comBoxStatus.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        comBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ABANDONO", "ACTIVO", " " }));
        getContentPane().add(comBoxStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 430, 220, -1));

        botonDatos.setBackground(new java.awt.Color(255, 193, 5));
        botonDatos.setFont(new java.awt.Font("Bell MT", 0, 16)); // NOI18N
        botonDatos.setText("Ver Datos");
        botonDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDatosActionPerformed(evt);
            }
        });
        getContentPane().add(botonDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1155, 693, 110, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
    this.dispose();
    AdminSetup ventaAdminSetup = null;
        try {
            ventaAdminSetup = new AdminSetup(this,true, registrarCursos);
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarCursos.class.getName()).log(Level.SEVERE, null, ex);
        }
    ventaAdminSetup.setVisible(true); 
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonRegistrarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarCursoActionPerformed
        try {
            registrarCursos.addCourse(Integer.parseInt(cursoCreditos.getText()), nombreCurso.getText());
            JOptionPane.showMessageDialog(null,"Curso Agregado.");
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarCursos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonRegistrarCursoActionPerformed

    private void BotonRegistrarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarGrupoActionPerformed

       boolean validandoRegistroCurso = false;
       String idProfesor = (String) combBoxProfesores.getSelectedItem();
       String[] obteniendoIDEstudiante = idProfesor.split(" ");
       String ID = obteniendoIDEstudiante[0];
       int idProfe = Integer.parseInt(ID);
       String idCurso = (String) comBoxCurso.getSelectedItem();
       String[] obteniendoIDCurso = idCurso.split(" ");
       String IDCurso = obteniendoIDCurso[0];
       int IDCURSO = Integer.parseInt(IDCurso);



       SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
       Date FechaDate = null;
        try {
            FechaDate = formatoFecha.parse(grupoAño.getText());
        } catch (ParseException ex) {
            Logger.getLogger(RegistrarCursos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error en formato.");
        }
       java.sql.Date nuevoAñoCurso = new java.sql.Date(FechaDate.getTime());
        try {
            registrarCursos.addCourseGroup(nuevoAñoCurso, Integer.parseInt(grupoSemestre.getText().toString()), idProfe,
            IDCURSO);
            validandoRegistroCurso = true;
            JOptionPane.showMessageDialog(null,"Grupo Agregado.");

        } catch (SQLException ex) {
            Logger.getLogger(RegistrarCursos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"curso no agregado");
            validandoRegistroCurso = false;
        }
        if(validandoRegistroCurso){
          JOptionPane.showMessageDialog(null,"Grupo Agregado.");
          this.dispose();
            AdminSetup ventaAdminSetup = null;
                try {
                    ventaAdminSetup = new AdminSetup(this,true, registrarCursos);
                } catch (SQLException ex) {
                    Logger.getLogger(RegistrarCursos.class.getName()).log(Level.SEVERE, null, ex);
                }
            ventaAdminSetup.setVisible(true); 
         }
    }//GEN-LAST:event_BotonRegistrarGrupoActionPerformed

    private void botonRegistrarEstudianteGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarEstudianteGrupoActionPerformed
        String estudiante = (String) comBoxEstudiantes.getSelectedItem();
        String [] idEstudiante = estudiante.split(" ");
        String id = idEstudiante[0];
        System.out.println(idEstudiante);
        try {
            registrarCursos.addStudentxgroup(Integer.parseInt(id), Integer.parseInt((String) comBoxGrupo.getSelectedItem()),
                    Integer.parseInt(sxgReview.getText()),(String) comBoxStatus.getSelectedItem());
           JOptionPane.showMessageDialog(null,"Estudiante agregado al grupo.");
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarCursos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonRegistrarEstudianteGrupoActionPerformed

    private void combBoxProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combBoxProfesoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combBoxProfesoresActionPerformed

    private void botonDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDatosActionPerformed
    Tablas tablas = null;
        try {
            tablas = new Tablas(this,true,registrarCursos);
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
    private javax.swing.JButton botonDatos;
    private javax.swing.JButton botonRegistrarCurso;
    private javax.swing.JButton botonRegistrarEstudianteGrupo;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JComboBox<String> comBoxCurso;
    private javax.swing.JComboBox<String> comBoxEstudiantes;
    private javax.swing.JComboBox<String> comBoxGrupo;
    private javax.swing.JComboBox<String> comBoxStatus;
    private javax.swing.JComboBox<String> combBoxProfesores;
    private javax.swing.JTextField cursoCreditos;
    private javax.swing.JTextField grupoAño;
    private javax.swing.JTextField grupoSemestre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
