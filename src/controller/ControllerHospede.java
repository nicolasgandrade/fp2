package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Hospede;
import utils.MySQL;

public class ControllerHospede {
    MySQL conn = new MySQL();
    ArrayList<Hospede> hospedes = new ArrayList<>();
    
    public ControllerHospede(){
        this.conn.conectaBanco();
    }
    
    public void inserirHospede(Hospede hospede){
        String sql = "INSERT INTO Hospedes(nome, telefone, email, documento) VALUES("
                + "'" + hospede.getNome()+ "','"
                + hospede.getTelefone() + "','"
                + hospede.getEmail()+ "','"
                + hospede.getDocumento() + "');";
        this.conn.insertSQL(sql);  
    }
    
    public ArrayList listarHospedes(String documento) throws SQLException{
        this.conn.conectaBanco();
        this.hospedes = new ArrayList<>();
        String sql = "SELECT * FROM Hospedes WHERE documento LIKE '%" + documento + "%';";
        this.conn.executarSQL(sql);
              
        
        while(this.conn.getResultSet().next()) { 
            Hospede hospede = new Hospede();
            hospede.setId(Integer.parseInt(this.conn.getResultSet().getString("id")));
            hospede.setNome(this.conn.getResultSet().getString("nome"));
            hospede.setTelefone(this.conn.getResultSet().getString("telefone"));
            hospede.setEmail(this.conn.getResultSet().getString("email"));
            hospede.setDocumento(this.conn.getResultSet().getString("documento"));
            
            hospedes.add(hospede);
        }
        return hospedes;   
    }
    
    public void encerrar(Hospede hospede) {
            this.conn.fechaBanco();
    }
    
    
}
