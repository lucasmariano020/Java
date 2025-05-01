package Aula05;

public class ContaBanco {
    //Atributes
    private String numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Constructor
    public ContaBanco(String tipo, String dono) {
        this.tipo = tipo;
        this.dono = dono;
        this.status = false;
        abrirConta(tipo);
    }
    
    //Methods
    private void abrirConta(String tipo){
        ValidarContarFechada();
        this.status = true;
        this.numConta = String.valueOf(System.currentTimeMillis());
        if(tipo.equals("cc")){
            this.saldo = 50;
        }
        else if(tipo.equals("cp")){
            this.saldo = 150;
        }
    }

    public void fecharConta(){
        ValidarContarAberta();
        if(this.saldo > 0){
            System.out.println("Erro: a conta tem saldo positivo!");
        }
        else if(this.saldo < 0){
            System.out.println("Erro: a conta está em débito!");
        }
        else{
            this.status = false;
        }
    }

    public void depositar(float valor){
        ValidarContarAberta();
        this.saldo += valor;
    }

    public void sacar(float valor){
        ValidarContarAberta();
        this.saldo -= valor;
    }

    public void pagarMensal(){
        ValidarContarAberta(); 
        if(this.tipo.equals("cc")){
            this.saldo -= 12;
        }
        else if(this.tipo.equals("cp"))
        {
            this.saldo -=20;
        }
    }

    public void printConta() {
        System.out.println();
        System.out.println("\n=== Dados da Conta ===\n");
        System.out.printf("%-20s: %s%n", "Nº da conta", numConta);
        System.out.printf("%-20s: %s%n", "Dono da conta",  dono);
        System.out.printf("%-20s: %s%n", "Tipo da conta", tipo);
        System.out.printf("%-20s: R$ %8.2f%n", "Saldo da conta", saldo);
        System.out.printf("%-20s: %s%n", "Status da conta", status ? "Aberta" : "Fechada");
        System.out.println();
    }    

    //Verifiers
    private void ValidarContarAberta(){
        if (this.status == false) {
            throw new IllegalStateException("\n\nErro: a conta não está aberta");
        }
    }

    private void ValidarContarFechada(){
        if (this.status == true) {
            throw new IllegalStateException("\n\nErro: a conta não está fechada");
        }
    }

    //Getters and setters
    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }
}
