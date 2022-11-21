package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Quarto;
import model.Categoria;
import utils.MySQL;

public class ControllerListarQuartos {
    MySQL conn = new MySQL();
    ArrayList<Quarto> quartos = new ArrayList<>();
    
    public ControllerListarQuartos(){
        this.conn.conectaBanco();
    }
    
    public ArrayList listarQuartos(int número) throws SQLException{
        String sql = "SELECT * FROM Quartos;";
        this.conn.executarSQL(sql);        

        while(this.conn.getResultSet().next()) { 
            Quarto quarto = new Quarto();
            quarto.setNúmero(Integer.parseInt(this.conn.getResultSet().getString("numero")));
            quarto.setAndar(Integer.parseInt(this.conn.getResultSet().getString("andar")));
            if (this.conn.getResultSet().getString("ocupado").equals("ocupado")){
                quarto.setOcupado(true);
            } else {
                quarto.setOcupado(false);
            }
            quartos.add(quarto);
        }
        return this.quartos;
    }
    
    public void closeConn(){
        this.conn.fechaBanco();
    }
    
}
