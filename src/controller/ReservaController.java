package controller;

import utils.MySQL;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Reserva;

public class ReservaController {
    MySQL conn = new MySQL();
    ArrayList<Reserva> reservas = new ArrayList<>();
    
    public ReservaController() {
        this.conn.conectaBanco();
    }
    
    public int findHospedId(String documento) throws SQLException{
        String selectHopede = "SELECT id FROM Hospedes WHERE documento='" + documento + "';";
        this.conn.executarSQL(selectHopede);
        int hospedeId = 0;
        
        while(this.conn.getResultSet().next()){
            hospedeId = Integer.parseInt(this.conn.getResultSet().getString("id"));
        }
        return hospedeId;
    }
    
    public ArrayList listarReservas(String documento) throws SQLException{
        int hospedeId = this.findHospedId(documento);
        
        String sql = "SELECT * FROM Reservas JOIN "
                + "Hospedes ON Hospedes.id=Reservas.hospede_id;";
        this.conn.executarSQL(sql);
        
        while(this.conn.getResultSet().next()) {
            Reserva reserva = new Reserva();
            reserva.setId(Integer.parseInt(this.conn.getResultSet().getString("id")));
            reserva.setQuarto(Integer.parseInt(this.conn.getResultSet().getString("numero_quarto")));
            reserva.setHospede(this.conn.getResultSet().getString("hospede_id"));
            reserva.setEntrada(Integer.parseInt(this.conn.getResultSet().getString("email")));
            reserva.setSaida(Integer.parseInt(this.conn.getResultSet().getString("documento")));
            this.reservas.add(reserva);
        }
        return this.reservas;
    }
    
    public int addReserva(String documento, Reserva reserva) throws SQLException {
        int hospedeId = this.findHospedId(documento);
        
        String sql = "INSERT INTO Reservas VALUES("
                + "null,"
                + reserva.getQuarto()+ ","
                + hospedeId + ","
                + "'" + reserva.getEntrada()+ "',"
                + "'" + reserva.getSaida()+ "');";
        return this.conn.insertSQL(sql);
    }
    
    public Reserva buscaReserva(String documento) throws SQLException {
        int hospedeId = this.findHospedId(documento);
        
        String sql = "SELECT * FROM Reservas JOIN "
                + "Hospedes ON Hospedes.id=Reservas.hospede_id "
                + "WHERE Reservas.hospede_id=" + hospedeId + ";";
        this.conn.executarSQL(sql);
        
        Reserva reserva = new Reserva();        
        while(this.conn.getResultSet().next()) {
            reserva.setId(Integer.parseInt(this.conn.getResultSet().getString("id")));
            reserva.setQuarto(Integer.parseInt(this.conn.getResultSet().getString("numero_quarto")));
            reserva.setHospede(this.conn.getResultSet().getString("hospede_id"));
            reserva.setEntrada(Integer.parseInt(this.conn.getResultSet().getString("email")));
            reserva.setSaida(Integer.parseInt(this.conn.getResultSet().getString("documento")));
        }
        return reserva;
    }
    
    public boolean updateReserva(String documento, Reserva reserva) throws SQLException {
        int hospedeId = this.findHospedId(documento);
        
        String sql = "UPDATE Reservas SET "
                + "numero_quarto = '" + reserva.getQuarto()+ "',"
                + "hospede_id = " + hospedeId+ ","
                + "entrada = '" + reserva.getEntrada()+ "',"
                + "saida = '" + reserva.getSaida()+ "';";
        return this.conn.updateSQL(sql);
    }
    
    public boolean deleteServico(String documento) throws SQLException {
        int hospedeId = this.findHospedId(documento);
        
        return this.conn.updateSQL("DELETE FROM Reservas WHERE hospede_id=" + hospedeId + ";");                
    }
    
    
    
    public void closeConn(){
        this.conn.fechaBanco();
    }

}