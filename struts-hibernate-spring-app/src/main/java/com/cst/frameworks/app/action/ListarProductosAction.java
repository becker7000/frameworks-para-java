package com.cst.frameworks.app.action;

import com.cst.frameworks.app.entity.Producto;
import com.cst.frameworks.app.service.ProductoService;
import com.cst.frameworks.app.service.ProductoServiceImp;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class ListarProductosAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    // Instancia del servicio
    private ProductoService productoService = new ProductoServiceImp();

    // Lista para almacenar los productos
    private List<Producto> productos;

    @Override
    public String execute() {
        try {
            // Llamar al servicio para obtener la lista de productos
            productos = productoService.listar();
            return SUCCESS; // Devuelve el nombre de la vista para mostrar
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR; // Manejo de errores, puede ser una vista de error
        }
    }

    // Getter y Setter para la lista de productos
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
