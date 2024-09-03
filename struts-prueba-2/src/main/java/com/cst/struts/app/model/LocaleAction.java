package com.cst.struts.app.model;

import com.opensymphony.xwork2.ActionSupport;

public class LocaleAction extends ActionSupport {

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
    public String execute() throws Exception {
        return SUCCESS;
    }



}
