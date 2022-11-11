package controller;

import java.sql.SQLException;
import model.Hospede;
import utils.MySQL;

public class ControllerHospede {
    MySQL conn = new MySQL();
    
    public ControllerHospede(){
        this.conn.conectaBanco();
    }
    
    public void inserirHospede(Hospede hospede){
        String sql = "INSERT INTO Hospedes(nome, telefone, email, documento) VALUES("
                + hospede.getNome()+ ","
                + hospede.getTelefone() + ","
                + hospede.getEmail()+ ","
                + hospede.getDocumento() + ");";
        this.conn.insertSQL(sql);  
    }
    
    public void encerrar(Hospede hospede) {
            this.conn.fechaBanco();
    }
}
