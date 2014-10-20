/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iu;

import logica.ssusuarios.RolesUsuario;

/**
 *
 * @author Romi
 */
public class Bingo {

    private static final String tituloLoginAdmin = "Loguearse como Admin";
    private static final String tituloLoginJugador = "Loguearse como Jugador";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FrameLogin loginAdmin = new FrameLogin(tituloLoginAdmin);
        loginAdmin.setRolUsuarioLogin(RolesUsuario.ADMIN);
        loginAdmin.setVisible(true);
    }

}
