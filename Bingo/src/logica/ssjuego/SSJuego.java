/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.ssjuego;

/**
 *
 * @author Romi
 */
public class SSJuego {

    private int cantFilasCarton;
    private int cantColumnasCarton;
    private int cantMaxCartonesPorJugador;
    private int cantJugadores;
    private int valorCarton;

    private static SSJuego instancia = new SSJuego();

    public static SSJuego getInstancia() {
        return instancia;
    }

    private SSJuego() {
        
    }
}
