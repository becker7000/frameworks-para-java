package com.cst.frameworks.app.model;

import java.util.Arrays;

public class Persona {

    private String nombre;
    private String apellido;
    private String deporte;
    private String genero;
    private String residencia;
    private boolean mayorDe18;
    private String[] modelosDeCoche;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public boolean esMayorDe18() {
        return mayorDe18;
    }

    public void setMayorDe18(boolean mayorDe18) {
        this.mayorDe18 = mayorDe18;
    }

    public String[] getModelosDeCoche() {
        return modelosDeCoche;
    }

    public void setModelosDeCoche(String[] modelosDeCoche) {
        this.modelosDeCoche = modelosDeCoche;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " | " +
                "Apellido: " + getApellido() + " | " +
                "Deporte Favorito: " + getDeporte() + " | " +
                "Género: " + getGenero() + " | " +
                "Residencia: " + getResidencia() + " | " +
                "Mayor de 18: " + esMayorDe18() + " | " +
                "Modelos de Coche: " + Arrays.asList(getModelosDeCoche());
    }

}
