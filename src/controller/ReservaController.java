package controller;

import utils.MySQL;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.Reserva;

public class ReservaController {
    MySQL conn = new MySQL();
    private ArrayList<Reserva> reservas = new ArrayList<>();
    
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
    
    public ArrayList listarReservas() throws SQLException{
        this.reservas = new ArrayList<>();
        String sql = "SELECT * FROM Reservas JOIN "
                + "Hospedes ON Hospedes.id=Reservas.hospede_id;";
        this.conn.executarSQL(sql);
        
        while(this.conn.getResultSet().next()) {
            Reserva reserva = new Reserva();
            reserva.setId(Integer.parseInt(this.conn.getResultSet().getString("id")));
            reserva.setQuarto(Integer.parseInt(this.conn.getResultSet().getString("numero_quarto")));
            reserva.setHospede(this.conn.getResultSet().getString("nome"));
            reserva.setEntrada(this.conn.getResultSet().getString("entrada"));
            reserva.setSaida(this.conn.getResultSet().getString("saida"));
            this.reservas.add(reserva);
        }
        return this.reservas;
    }
    
    public int addReserva(String documento, Reserva reserva) throws SQLException, ParseException {
        int hospedeId = this.findHospedId(documento);
        
        String sql = "INSERT INTO Reservas VALUES("
                + "null,"
                + reserva.getQuarto()+ ","
                + hospedeId + ","
                + "'" + reserva.getEntrada()+ "',"
                + "'" + reserva.getSaida()+ "');";
        
        Date entrada = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(reserva.getEntrada());
        Date saida = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(reserva.getSaida());
        boolean estadoQuarto = false;
        if ((new Date().after(entrada) || new Date().equals(entrada)) && (new Date().before(saida) || new Date().equals(saida))){
            estadoQuarto = true;
        }
        System.out.println(estadoQuarto);
        
        String sqlQuarto = "UPDATE Quartos SET "
                + "ocupado = " + estadoQuarto + " WHERE "
                + "numero = " + reserva.getQuarto() + ";";
        this.conn.updateSQL(sqlQuarto);
        return this.conn.insertSQL(sql);
        
    }
    
    public ArrayList buscaReserva(String documento) throws SQLException {
        int hospedeId = this.findHospedId(documento);
        this.reservas = new ArrayList<>();
        
        String sql = "SELECT * FROM Reservas JOIN "
                + "Hospedes ON Hospedes.id=Reservas.hospede_id "
                + "WHERE Reservas.hospede_id=" + hospedeId + ";";
        this.conn.executarSQL(sql);
               
        while(this.conn.getResultSet().next()) {
            Reserva reserva = new Reserva(); 
            reserva.setId(Integer.parseInt(this.conn.getResultSet().getString("id")));
            reserva.setQuarto(Integer.parseInt(this.conn.getResultSet().getString("numero_quarto")));
            reserva.setHospede(this.conn.getResultSet().getString("nome"));
            reserva.setEntrada(this.conn.getResultSet().getString("entrada"));
            reserva.setSaida(this.conn.getResultSet().getString("saida"));
            this.reservas.add(reserva);
        }
        return this.reservas;
    }
    
    public boolean updateReserva(String documento, Reserva reserva) throws SQLException {
        int hospedeId = this.findHospedId(documento);
        System.out.println(reserva.toString());
        String sql = "UPDATE Reservas SET "
                + "numero_quarto = " + reserva.getQuarto()+ ","
                + "hospede_id = " + hospedeId+ ","
                + "entrada = '" + reserva.getEntrada()+ "',"
                + "saida = '" + reserva.getSaida()+ "'"
                + " WHERE id = "+ reserva.getId() + ";";
        return this.conn.updateSQL(sql);
    }
    
    public int deleteReserva(int id) throws SQLException {
        String sql = "DELETE FROM Reservas WHERE id=" + id + ";";
        
        return this.conn.insertSQL(sql);                
    }
    
    public void closeConn(){
        this.conn.fechaBanco();
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }
}