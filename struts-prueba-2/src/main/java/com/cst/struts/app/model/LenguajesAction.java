package com.cst.struts.app.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LenguajesAction {

    private String titulo = "Lista de lenguajes...";
    private List<String> lenguajes;

    public String getTitulo() {
        return titulo;
    }

    public List<String> getLenguajes() {
        return lenguajes;
    }

    public Date getFecha(){
        return new Date();
    }

    public String execute() throws Exception{
        lenguajes = new ArrayList<>();
        lenguajes.add("Java");
        lenguajes.add("C#");
        lenguajes.add("C++");
        lenguajes.add("Python");
        lenguajes.add("Javascript");
        lenguajes.add("SQL");
        lenguajes.add("Haskell");
        return "success";
    }

}
