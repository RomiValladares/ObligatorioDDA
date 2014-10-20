/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.ssusuarios;

import java.util.Objects;

/**
 *
 * @author Romi
 */
public class Usuario {

    private String nombre;
    private String contrasena;
    private RolesUsuario rolUsuario;

    public RolesUsuario getRolUsuario() {
        return rolUsuario;
    }

    public Usuario(String nombreUsuario, String contrasenaUsuario) {
        this.nombre = nombreUsuario;
        this.contrasena = contrasenaUsuario;
    }

    public Usuario(String nombreUsuario, String contrasenaUsuario, RolesUsuario rolUsuario) {
        this(nombreUsuario, contrasenaUsuario);
        this.rolUsuario = rolUsuario;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the contrasena
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * @param contrasena the contrasena to set
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.contrasena, other.contrasena)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.nombre);
        hash = 31 * hash + Objects.hashCode(this.contrasena);
        return hash;
    }

}
