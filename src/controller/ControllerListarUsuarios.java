package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Usuario;
import utils.MySQL;
import model.enums.Cargo;


public class ControllerListarUsuarios {
    MySQL conn = new MySQL();
    ArrayList<Usuario> usuarios = new ArrayList<>();
    
    public ControllerListarUsuarios() {
        this.conn.conectaBanco();
    }
    
    public ArrayList ListarUsuarios(String nome) throws SQLException{
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
        System.out.println("Fechou");
        this.conn.fechaBanco();
    }
}
