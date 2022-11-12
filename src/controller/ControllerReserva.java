package controller;

import java.sql.SQLException;
import model.Reserva;
import utils.MySQL;
import model.Quarto;
import model.Hospede;

public class ControllerReserva {
    MySQL conn = new MySQL();
    
    public ControllerReserva(){
        this.conn.conectaBanco();
    }   
    
    public void inserirReserva(Reserva reserva, Quarto quarto, Hospede hospede){
        String sql = "INSERT INTO Reservas(numero_quarto, hospede_id, entrada, saida) VALUES("
                + quarto.getNúmero()+ ","
                + hospede.getId()+ ","
                + reserva.getEntrada()+ ","
                + reserva.getSaida() + ");";
        this.conn.insertSQL(sql);
    }
    
    public void encerrar(Reserva reserva) {
            this.conn.fechaBanco();
    }
}
