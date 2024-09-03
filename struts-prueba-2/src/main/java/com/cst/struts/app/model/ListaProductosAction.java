package com.cst.struts.app.model;

import com.cst.struts.app.repositorio.ProductoRepositorioImp;
import com.cst.struts.app.repositorio.Repositorio;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class ListaProductosAction extends ActionSupport {

    private List<Producto> productos;

    @Override
    public String execute(){
        try{
            Repositorio<Producto> productoRepositorio = new ProductoRepositorioImp();
            productos = productoRepositorio.listar();
            return SUCCESS;
        }catch (Exception exception){
            exception.printStackTrace();
            return ERROR;
        }
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

}
