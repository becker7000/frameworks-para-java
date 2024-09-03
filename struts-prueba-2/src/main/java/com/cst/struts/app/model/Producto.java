package com.cst.struts.app.model;

public class Producto {

    private Integer id;
    private String nombre;
    private Double precio;
    private Integer existencias;
    private String categoria;

    public Producto(Integer id, String nombre, Double precio, Integer existencias, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.existencias = existencias;
        this.categoria = categoria;
    }

    public Producto() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getExistencias() {
        return existencias;
    }

    public void setExistencias(Integer existencias) {
        this.existencias = existencias;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void mostrar(){
        System.out.printf("\n\t Producto: %d %s $ %.2f %d %s",id,nombre,precio,existencias,categoria);
    }

}
