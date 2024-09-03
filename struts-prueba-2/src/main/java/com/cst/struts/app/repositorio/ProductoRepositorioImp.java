package com.cst.struts.app.repositorio;

import com.cst.struts.app.model.Producto;
import com.cst.struts.app.util.ConexionBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoRepositorioImp implements Repositorio<Producto>{

    // Crear un método para la conexión a la base de datos.
    private Connection getConnection() throws SQLException {
        return ConexionBD.getInstance();
    }

    @Override
    public List<Producto> listar() {
        List<Producto> productos = new ArrayList<>();
        try(Statement statement = getConnection().createStatement()){
            ResultSet resultSet = statement.executeQuery("SELECT * FROM productos");
            while(resultSet.next()){
                Producto producto = crearProducto(resultSet);
                productos.add(producto);
            }
        } catch (SQLException e) {
            System.out.println("\n\t (listar) Error: "+e.getMessage());
        }
        return productos;
    }

    @Override
    public Producto buscarPorId(Integer id) {
        Producto producto = null;
        String query = "SELECT * FROM productos WHERE idproducto=?";
        try(PreparedStatement preparedStatement = getConnection().prepareStatement(query)){
            preparedStatement.setInt(1,id);
            try(ResultSet resultSet = preparedStatement.executeQuery()){ // Consultas simples.
                if (resultSet.next()) {
                    producto = crearProducto(resultSet);
                }
            }
        } catch (SQLException e) {
            System.out.print("\n\t (porId) Error: "+e.getMessage());
        } // El preparedStatement y el resultSet se auto cierran con el bloque try.
        return producto;
    }

    @Override
    public void guardar(Producto producto) { // Modifica o inserta registros.
        String query;
        if(producto.getId()>0){ // Si el procuto ya existe
            query="UPDATE productos SET nombre=?, precio=?, existencias=?, categoria=? WHERE idproducto=?";
        }else{
            query="INSERT INTO productos(nombre,precio,existencias,categoria) VALUES(?,?,?,?)";
        }

        try (PreparedStatement preparedStatement = getConnection().prepareStatement(query)){
            preparedStatement.setString(1,producto.getNombre());
            preparedStatement.setDouble(2,producto.getPrecio());
            preparedStatement.setInt(3,producto.getExistencias());
            preparedStatement.setString(4,producto.getCategoria());
            if(producto.getId()>0){
                preparedStatement.setInt(5,producto.getId());
            }
            preparedStatement.executeUpdate(); // Modificaciones a la base de datos.
        } catch (SQLException e) {
            System.out.println("\n\t (guardar) Error: "+e.getMessage());
        }

    }

    @Override
    public void eliminar(Integer id) {
        String query="DELETE FROM productos WHERE idproducto=?";
        try(PreparedStatement preparedStatement = getConnection().prepareStatement(query)){
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate(); // Actualización a la base de datos.
        } catch (SQLException e) {
            System.out.println("\n\t (eliminar) Error: "+e.getMessage());
        }
    }

    // Método auxiliar:
    private Producto crearProducto(ResultSet resultSet) throws SQLException {
        Producto producto = new Producto();
        producto.setId(resultSet.getInt("idproducto"));
        producto.setNombre(resultSet.getString("nombre"));
        producto.setPrecio(resultSet.getDouble("precio"));
        producto.setExistencias(resultSet.getInt("existencias"));
        producto.setCategoria(resultSet.getString("categoria"));
        return producto;
    }

}
