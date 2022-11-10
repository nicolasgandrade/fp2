package utils;

import java.sql.SQLException;
import model.Hospede;

public class HospedeController {
    MySQL conn = new MySQL();
    
    public HospedeController() {
        this.conn.conectaBanco();
    }
    
    public void addHospede(Hospede hospede) {
        String sql = "INSERT INTO Hospedes VALUES("
                + "null,"
                + "'" + hospede.getNome()+ "',"
                + "'" + hospede.getTelefone()+ "',"
                + "'" + hospede.getEmail()+ "',"
                + "'" + hospede.getDocumento()+ "');";
        this.conn.updateSQL(sql);
    }
    
    public Hospede buscaHospede(String nome) throws SQLException {
        String sql = "SELECT * FROM Hospedes WHERE "
                + "nome LIKE '%" + nome + "%';";
        this.conn.executarSQL(sql);
        
        Hospede hospede = new Hospede();        
        while(this.conn.getResultSet().next()) {
            hospede.setId(Integer.parseInt(this.conn.getResultSet().getString("id")));
            hospede.setNome(this.conn.getResultSet().getString("nome"));
            hospede.setTelefone(this.conn.getResultSet().getString("telefone"));
            hospede.setEmail(this.conn.getResultSet().getString("email"));
            hospede.setDocumento(this.conn.getResultSet().getString("documento"));
        }
        return hospede;
    }
    
    public void updateHospede(Hospede hospede) {
        String sql = "UPDATE Hospedes SET "
                + "nome = '" + hospede.getNome()+ "',"
                + "telefone = '" + hospede.getTelefone()+ "',"
                + "email = '" + hospede.getEmail()+ "',"
                + "documento = '" + hospede.getDocumento()+ "';";
        this.conn.updateSQL(sql);
    }
    
    public void deleteServico(String nome) {
        this.conn.insertSQL("DELETE FROM Hospedes WHERE " + "nome LIKE '%" + nome + "%';");                
    }

}