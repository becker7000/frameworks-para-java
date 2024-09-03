package com.cst.struts.app.model;

import com.cst.struts.app.repositorio.Repositorio;
import com.cst.struts.app.repositorio.UsuarioRepositorioImp;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class AutenticarUsuarioAction extends ActionSupport {

    private String nombre;
    private String contrasena;

    @Override
    public String execute(){
        Repositorio<Usuario> usuarioRepositorio = new UsuarioRepositorioImp();
        List<Usuario> usuarios = usuarioRepositorio.listar();
        for(Usuario usuario : usuarios){
            if(usuario.getNombre().equals(nombre) && usuario.getContrasena().equals(contrasena)){
                return SUCCESS;
            }
        }
        return ERROR;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}
