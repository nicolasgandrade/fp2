package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Quarto;
import utils.MySQL;

public class ControllerListarQuartos {
    MySQL conn = new MySQL();
    ArrayList<Quarto> quartos = new ArrayList<>();
    
    public ControllerListarQuartos(){
        this.conn.conectaBanco();
    }
    
    public ArrayList ListarQuartos(int número) throws SQLException{
        String sql = "SELECT * FROM Quartos;";
        this.conn.executarSQL(sql);        

        Quarto quarto = new Quarto();
        while(this.conn.getResultSet().next()) { 
            quarto.setNúmero(Integer.parseInt(this.conn.getResultSet().getString("numero")));
            quarto.setAndar(Integer.parseInt(this.conn.getResultSet().getString("andar")));
            if (this.conn.getResultSet().toString().equals("ocupado")){
                quarto.setOcupado(true);
            } else {
                quarto.setOcupado(false);
            }
            quartos.add(quarto);
        }
        return null;
    }
    
    public void closeConn(){
        this.conn.fechaBanco();
    }
    
}
