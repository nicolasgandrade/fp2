package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Quarto;
import utils.MySQL;

public class QuartosController {
    MySQL conn = new MySQL();
    ArrayList<Quarto> quartos = new ArrayList<>();
    
    public QuartosController(){
        this.conn.conectaBanco();
    }
    
    public int inserirQuarto(Quarto quarto) throws SQLException{
        int isOcupado = quarto.isOcupado() ? 1 : 0;
        String sql = "INSERT INTO Quartos(andar, categoria_id, ocupado) VALUES("
                + quarto.getAndar()+ ","
                + "1, "
                + isOcupado + ");";
        return this.conn.insertSQL(sql);
    }
    
    public ArrayList listarQuartos(int numero) throws SQLException{
        String sql = "SELECT * FROM Quartos "
                + "JOIN Categorias "
                + "ON Categorias.id = Quartos.categoria_id "
                + "WHERE numero = " + numero + " ;";
        this.conn.executarSQL(sql);        

        while(this.conn.getResultSet().next()) { 
            Quarto quarto = new Quarto();
            quarto.setNúmero(Integer.parseInt(this.conn.getResultSet().getString("numero")));
            quarto.setAndar(Integer.parseInt(this.conn.getResultSet().getString("andar")));
            quarto.setCategoria(this.conn.getResultSet().getString("nome"));
            if (this.conn.getResultSet().getString("ocupado").equals("ocupado")){
                quarto.setOcupado(true);
            } else {
                quarto.setOcupado(false);
            }
            quartos.add(quarto);
        }
        return this.quartos;
    }
    
    public int deleteQuarto(int n) throws SQLException {
        String sql = "DELETE FROM Quartos WHERE numero = " + n + " ;";
        
        return this.conn.insertSQL(sql);                
    }
    
    public void closeConn(){
        this.conn.fechaBanco();
    }
}
