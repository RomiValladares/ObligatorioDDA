/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.ssusuarios;

/**
 *
 * @author Romi
 */
public class Admin extends Usuario {

    public Admin(String nombreUsuario, String contrasenaUsuario) {
        super(nombreUsuario, contrasenaUsuario, RolesUsuario.ADMIN);
    }

}
