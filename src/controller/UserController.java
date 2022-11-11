package controller;

import utils.MySQL;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserController {
    MySQL conn = new MySQL();
    
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
    
    public void closeConn() {
        this.conn.fechaBanco();
    }
}
