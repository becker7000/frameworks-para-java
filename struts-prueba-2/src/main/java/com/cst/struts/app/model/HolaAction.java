package com.cst.struts.app.model;

public class HolaAction {

    private String mensaje;

    public String getMensaje(){
        return mensaje;
    }

    public String execute() throws Exception{
        mensaje = "Hola a todos desde una Action en Struts 2";
        return "success";
    }

}
