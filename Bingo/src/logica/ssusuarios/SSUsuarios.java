/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.ssusuarios;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Romi SubSistema encargado de la administracion de usuarios
 */
public class SSUsuarios {

    private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
    private ArrayList<Admin> admins = new ArrayList<Admin>();

    private static SSUsuarios instancia = new SSUsuarios();

    public static SSUsuarios getInstancia() {
        return instancia;
    }

    private SSUsuarios() {

    }

    public Jugador obtenerJugador(Jugador jugadorABuscar) {
        return (Jugador) obtenerUsuario(jugadorABuscar);
    }

    public Admin obtenerAdmin(Admin adminABuscar) {
        return (Admin) obtenerUsuario(adminABuscar);
    }

    public Usuario obtenerUsuario(Usuario usuarioABuscar) {
        if (usuarioABuscar instanceof Jugador) {
            return obtenerUsuario(usuarioABuscar, RolesUsuario.JUGADOR);
        } else if (usuarioABuscar instanceof Admin) {
            return obtenerUsuario(usuarioABuscar, RolesUsuario.ADMIN);
        } else {
            return null;
        }
    }

    public Usuario obtenerUsuario(Usuario usuarioABuscar, RolesUsuario rolUsuario) {
        ArrayList<? extends Usuario> listaDondeBuscar;

        switch (rolUsuario) {
            case ADMIN:
                listaDondeBuscar = admins;
                break;
            case JUGADOR:
                listaDondeBuscar = jugadores;
                break;
            default:
                return null;
        }

        int indiceUsuarioEnLista = listaDondeBuscar.indexOf(usuarioABuscar);

        return indiceUsuarioEnLista != -1 ? listaDondeBuscar.get(indiceUsuarioEnLista) : null;
    }
}
