/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd;

import ConexionSQL.Conexion;

/**
 *
 * @author Juley
 */
public class ProyectoBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conexion.addAdmin(0, pAdminUser, pAdminPassword);
        
    }
    
}
