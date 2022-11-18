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
        String sql = "SELECT * FROM Usuarios WHERE "
                + "nome_usuario = '" + username + "' AND "
                + "senha = '" + password + "';";
        this.conn.executarSQL(sql);
        
        return this.conn.getResultSet();
    }
    
    public ArrayList listarUsuarios(String nome) throws SQLException{
        String sql = "SELECT * FROM Usuarios JOIN Cargos "
                + "ON Cargos.id = Usuarios.cargo_id WHERE "
                + "nome LIKE '%" + nome + "%';";
        this.conn.executarSQL(sql);
              
        Usuario usuario = new Usuario();
        while(this.conn.getResultSet().next()) { 
            usuario.setId(Integer.parseInt(this.conn.getResultSet().getString("id")));
            usuario.setNomeUsuario(this.conn.getResultSet().getString("nome_usuario"));
            usuario.setCargo(this.conn.getResultSet().getString("nome_cargo"));
            usuarios.add(usuario);
        }
        return usuarios;   
    }
    
    public void closeConn() {
        this.conn.fechaBanco();
    }
}
