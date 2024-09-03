package com.cst.struts.app.repositorio;

import com.cst.struts.app.model.Usuario;
import com.cst.struts.app.util.ConexionBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorioImp implements Repositorio<Usuario> {

    // Conectando a la base de datos:
    private Connection getConnection() throws SQLException{
        return ConexionBD.getInstance();
    }

    @Override
    public List<Usuario> listar() {
        List<Usuario> usuarios = new ArrayList<>();
        try(Statement statement = getConnection().createStatement()){
            ResultSet resultSet = statement.executeQuery("SELECT * FROM usuarios");
            while(resultSet.next()){
                Usuario usuario = crearUsuario(resultSet);
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            System.out.println("\n\t (listar) Error: "+e.getMessage());
        }
        return usuarios;
    }

    @Override
    public Usuario buscarPorId(Integer id) {
        Usuario usuario = null;
        String query = "SELECT * FROM usuarios WHERE idusuario=?";
        try(PreparedStatement preparedStatement = getConnection().prepareStatement(query)){
            preparedStatement.setInt(1,id);
            try(ResultSet resultSet = preparedStatement.executeQuery()){ // Consultas simples.
                if (resultSet.next()) {
                    usuario = crearUsuario(resultSet);
                }
            }
        } catch (SQLException e) {
            System.out.print("\n\t (porId) Error: "+e.getMessage());
        } // El preparedStatement y el resultSet se auto cierran con el bloque try.
        return usuario;
    }

    @Override
    public void guardar(Usuario usuario) {
        String query;
        if(usuario.getId()>0){ // Si el usuario existe
            query="UPDATE usuarios SET nombre=?, contrasena=? WHERE idusuario=?";
        }else{
            query="INSERT INTO usuarios(nombre,contrasena) VALUES(?,?)";
        }

        try (PreparedStatement preparedStatement = getConnection().prepareStatement(query)){
            preparedStatement.setString(1,usuario.getNombre());
            preparedStatement.setString(2,usuario.getContrasena());
            if(usuario.getId()>0){
                preparedStatement.setInt(3, usuario.getId());
            }
            preparedStatement.executeUpdate(); // Modificaciones a la base de datos.
        } catch (SQLException e) {
            System.out.println("\n\t (guardar) Error: "+e.getMessage());
        }
    }

    @Override
    public void eliminar(Integer id) {
        String query="DELETE FROM usuarios WHERE idusuario=?";
        try(PreparedStatement preparedStatement = getConnection().prepareStatement(query)){
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate(); // Actualización a la base de datos.
        } catch (SQLException e) {
            System.out.println("\n\t (eliminar) Error: "+e.getMessage());
        }
    }

    private Usuario crearUsuario(ResultSet resultSet) throws SQLException {
        Usuario usuario = new Usuario();
        usuario.setId(resultSet.getInt("idusuario"));
        usuario.setNombre(resultSet.getString("nombre"));
        usuario.setContrasena(resultSet.getString("contrasena"));
        return usuario;
    }
}
