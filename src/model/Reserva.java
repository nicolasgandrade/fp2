package model;

public class Reserva {
    
    private int id;
    private int quarto;
    private String hospede;
    private String entrada;
    private String saida;

    
    public Reserva(){
    }
    
    public Reserva(int id,int quarto, String hospede, String entrada, String saida){
        this.id=id;
        this.quarto=quarto;
        this.hospede=hospede;
        this.entrada=entrada;
        this.saida=saida;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getQuarto() {
        return quarto;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    public String getHospede() {
        return hospede;
    }

    public void setHospede(String hospede) {
        this.hospede = hospede;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }
}
