package com.cst.struts.app.model;

import com.opensymphony.xwork2.ActionSupport;

public class ClienteAction extends ActionSupport {

    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void validate() {
        if(nombre==null || nombre.trim().equals("")){
            addFieldError("nombre","El nombre es un campo requerido...");
        }
        if(edad<18 || edad>70){
            addFieldError("edad","La edad debe estar entre 18 y 70");
        }
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
