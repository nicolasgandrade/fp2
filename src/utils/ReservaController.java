package utils;

import java.sql.SQLException;
import model.Hospede;
import model.Reserva;

public class ReservaController {
    MySQL conn = new MySQL();
    
    public ReservaController() {
        this.conn.conectaBanco();
    }
    
    public void addReserva(Reserva reserva) {
        String sql = "INSERT INTO Reservas VALUES("
                + "null,"
                + "'" + reserva.getQuarto()+ "',"
                + "'" + reserva.getHospede()+ "',"
                + "'" + reserva.getEntrada()+ "',"
                + "'" + reserva.getSaida()+ "');";
        this.conn.updateSQL(sql);
    }
    
    public Reserva buscaReserva(Hospede hospede) throws SQLException {
        String sql = "SELECT * FROM Reservas WHERE "
                + "nome LIKE '%" + hospede + "%';";
        this.conn.executarSQL(sql);
        
        Reserva reserva = new Reserva();        
        while(this.conn.getResultSet().next()) {
            reserva.setId(Integer.parseInt(this.conn.getResultSet().getString("id")));
            // Não sei como resolver esse erro de conversão
            reserva.setQuarto(this.conn.getResultSet().getString("numero_quarto"));
            reserva.setHospede(this.conn.getResultSet().getString("hospede_id"));
            reserva.setEntrada(Integer.parseInt(this.conn.getResultSet().getString("email")));
            reserva.setSaida(Integer.parseInt(this.conn.getResultSet().getString("documento")));
        }
        return reserva;
    }
    
    public void updateReserva(Reserva reserva) {
        String sql = "UPDATE Reservas SET "
                + "numero_quarto = '" + reserva.getQuarto()+ "',"
                + "hospede_id = '" + reserva.getQuarto()+ "',"
                + "entrada = '" + reserva.getEntrada()+ "',"
                + "saida = '" + reserva.getSaida()+ "';";
        this.conn.updateSQL(sql);
    }
    
    public void deleteServico(Hospede hospede) {
        this.conn.insertSQL("DELETE FROM Reservas WHERE hospede_id=" + hospede + ";");                
    }

}