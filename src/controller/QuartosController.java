package controller;

import java.sql.SQLException;
import model.Quarto;
import utils.MySQL;

public class QuartosController {
    MySQL conn = new MySQL();
    
    public QuartosController(){
        this.conn.conectaBanco();
    }
    
    public void inserirQuarto(Quarto quarto){
        int isOcupado = quarto.isOcupado() ? 1 : 0;
        String sql = "INSERT INTO Quartos(andar, categoria_id, ocupado) VALUES("
                + quarto.getAndar()+ ","
                + "1, "
                + isOcupado + ");";
        this.conn.insertSQL(sql);
    }
    
    public void encerrar(Quarto quarto) {
            this.conn.fechaBanco();
    }
}
