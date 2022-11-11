package controller;

import java.sql.SQLException;
import model.Reserva;
import utils.MySQL;

public class ControllerReserva {
    MySQL conn = new MySQL();
    
    public ControllerReserva(){
        this.conn.conectaBanco();
    }   
    
    public void inserirQuarto(Reserva reserva){
        String sql = "INSERT INTO Quartos(numero_quarto, hospede_id, entrada, saida) VALUES("
                + reserva.getQuarto()+ ","
                + reserva.getHospede()+ ","
                + reserva.getEntrada()+ ","
                + reserva.getSaida() + ");";
        this.conn.insertSQL(sql);
    }
    
    public void encerrar(Reserva reserva) {
            this.conn.fechaBanco();
    }
}
