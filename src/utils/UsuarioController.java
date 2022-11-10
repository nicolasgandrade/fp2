package utils;

import java.sql.SQLException;
import model.Usuario;

public class UsuarioController {
    MySQL conn = new MySQL();
    
    public UsuarioController() {
        this.conn.conectaBanco();
    }
    
    public void addUsuario(Usuario usuario) {
        String sql = "INSERT INTO Usuarios VALUES("
                + "null,"
                + "'" + usuario.getNome()+ "',"
                + "'" + usuario.getNomeUsuario()+ "',"
                + "'" + usuario.getSenha()+ "',"
                + "'" + usuario.getCargo()+ "');";
        this.conn.updateSQL(sql);
    }
    
    public Usuario buscaUsuario(String nome) throws SQLException {
        String sql = "SELECT * FROM Usuarios WHERE "
                + "nome LIKE '%" + nome + "%';";
        this.conn.executarSQL(sql);
        
        Usuario usuario = new Usuario();        
        while(this.conn.getResultSet().next()) {
            usuario.setId(Integer.parseInt(this.conn.getResultSet().getString("id")));
            usuario.setNome(this.conn.getResultSet().getString("nome"));
            usuario.setNomeUsuario(this.conn.getResultSet().getString("nome_usuario"));
            usuario.setSenha(this.conn.getResultSet().getString("senha"));
            // Não sei como resolver esse erro de conversão
            usuario.setCargo(this.conn.getResultSet().getString("cargo_id"));
        }
        return usuario;
    }
    
    public void updateUsuario(Usuario usuario) {
        String sql = "UPDATE Usuarios SET "
                + "nome = '" + usuario.getNome()+ "',"
                + "nome_usuario = '" + usuario.getNomeUsuario()+ "',"
                + "senha = '" + usuario.getSenha()+ "',"
                + "cargo_id = '" + usuario.getCargo()+ "';";
        this.conn.updateSQL(sql);
    }
    
    public void deleteServico(String nome) {
        this.conn.insertSQL("DELETE FROM Usuarios WHERE " + "nome LIKE '%" + nome + "%';");                
    }

}