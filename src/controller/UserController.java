package controller;

import utils.MySQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Usuario;

public class UserController {
    MySQL conn = new MySQL();
    Usuario currentUser = new Usuario();
    ArrayList<Usuario> usuarios = new ArrayList<>();
    
    public UserController() {
        this.conn.conectaBanco();
    }
    
    public ResultSet autenticar(String username, String password) {
        String sql = "SELECT * FROM Usuarios "
                + "JOIN Cargos "
                + "ON Cargos.id = Usuarios.cargo_id "
                + "WHERE "
                + "nome_usuario = '" + username + "' AND "
                + "senha = '" + password + "';";
        this.conn.executarSQL(sql);
        
        return this.conn.getResultSet();
    }
    
    public ArrayList listarUsuarios(String nome) throws SQLException{
        String sql = "SELECT * FROM Usuarios JOIN Cargos "
                + "ON Cargos.id = Usuarios.cargo_id WHERE "
                + "nome_usuario LIKE '%" + nome + "%'";
        this.conn.executarSQL(sql);
              
        while(this.conn.getResultSet().next()) { 
            Usuario usuario = new Usuario();
            usuario.setId(Integer.parseInt(this.conn.getResultSet().getString("id")));
            usuario.setNome(this.conn.getResultSet().getString("nome"));
            usuario.setNomeUsuario(this.conn.getResultSet().getString("nome_usuario"));
            usuario.setCargo(this.conn.getResultSet().getString("nome_cargo"));
            usuario.setSenha(this.conn.getResultSet().getString("senha"));
            this.usuarios.add(usuario);
        }
        return this.usuarios;
    }
    
    public int createUsuario(Usuario usuario) {
        int cargoId = usuario.getCargo().equals("Gerente") ? 1 : 2;
        String sql = "INSERT INTO Usuarios VALUES("
                + "null, "
                + "'" + usuario.getNome() + "', "
                + "'" + usuario.getNomeUsuario() + "', "
                + "'" + usuario.getSenha() + "', "
                + cargoId + ");";
        
        return this.conn.insertSQL(sql);
    }
    
    public boolean updateUsuario(Usuario usuario) {
        int cargoId = usuario.getCargo().equals("Gerente") ? 1 : 2;
        String sql = "UPDATE Usuarios SET "
                + "nome = '" + usuario.getNome() + "', "
                + "nome_usuario = '" + usuario.getNomeUsuario() + "', "
                + "senha = '" + usuario.getSenha() + "', "
                + "cargo_id = " + cargoId + " "
                + "WHERE id = " + usuario.getId() + ";";
        
        return this.conn.updateSQL(sql);
    }
    
    public int deleteUsuario(int id) {
        String sql = "DELETE FROM Usuarios WHERE id = " + id;
        
        return this.conn.insertSQL(sql);
    }
    
    public void closeConn() {
        this.conn.fechaBanco();
    }

    public Usuario getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(Usuario currentUser) {
        this.currentUser = currentUser;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
}
