/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.fachada;

import logica.ssusuarios.RolesUsuario;
import logica.ssusuarios.SSUsuarios;
import logica.ssusuarios.Usuario;

/**
 *
 * @author Romi
 */
public class Fachada {

    private static Fachada instancia = null;

    public static Fachada getInstancia() {
        if (instancia == null) {
            instancia = new Fachada();
        }
        return instancia;
    }

    private Fachada() {
    }

    public Usuario loguearse(Usuario usuarioALoguearse, RolesUsuario rolUsuario) {
        return SSUsuarios.getInstancia().obtenerUsuario(usuarioALoguearse, rolUsuario);
    }
}
