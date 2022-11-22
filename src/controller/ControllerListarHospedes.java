package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Hospede;
import utils.MySQL;



public class ControllerListarHospedes {
    MySQL conn = new MySQL();
    ArrayList<Hospede> hospedes = new ArrayList<>();
    
    public ControllerListarHospedes() {
        this.conn.conectaBanco();
    }
    
    public ArrayList ListarHospedes(String nome) throws SQLException{
        String sql = "SELECT * FROM Hospedes";
        this.conn.executarSQL(sql);
              
        Hospede hospede = new Hospede();
        while(this.conn.getResultSet().next()) { 
            hospede.setId(Integer.parseInt(this.conn.getResultSet().getString("id")));
            hospede.setNome(this.conn.getResultSet().getString("nome"));
            hospede.setTelefone(this.conn.getResultSet().getString("telefone"));
            hospede.setEmail(this.conn.getResultSet().getString("email"));
            hospede.setDocumento(this.conn.getResultSet().getString("documento"));
            
            hospedes.add(hospede);
        }
        return hospedes;   
    }
    
    public void closeConn() {
        this.conn.fechaBanco();
    }
}