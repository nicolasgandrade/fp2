package model;

public class Reserva {
    
    private int id;
    private int quarto;
    private String hospede;
    private int entrada;
    private int saida;

    
    public Reserva(){
    }
    
    public Reserva(int id,int quarto, String hospede,int entrada, int saida){
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

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public int getSaida() {
        return saida;
    }

    public void setSaida(int saida) {
        this.saida = saida;
    }
}
