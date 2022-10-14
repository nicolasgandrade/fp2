package model;

public class Reserva {
    
    private int id;
    private Quarto quarto;
    private Hospede hospede;
    private int entrada;
    private int saida;

    
    public Reserva(){
    }
    
    public Reserva(int id,Quarto quarto, Hospede hospede,int entrada, int saida){
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
    
    public Quarto getQuarto() {
        return quarto;
    }

    public void setNum_quarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede_id(Hospede hospede) {
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
