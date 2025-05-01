package Aula04;

public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public Caneta(String modelo, String cor) {
        this.ponta = 0.5f;
        this.tampada = true;
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setponta(float p){
        this.ponta = p;
    }

    public void tampar(){
        this.tampada = true;
    }

    
    public void destampar(){
        this.tampada = false;
    }

    public void status() {
        System.out.println("\n\nInformações sobre a caneta:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
