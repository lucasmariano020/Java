package ChainOfResibility;

public class Main {
    public static void main(String[] args) {
    Gerente gerente = new Gerente();
    Supervisor supervisor = new Supervisor();
    Diretor diretor = new Diretor();

    supervisor.adcProximo(gerente);
    gerente.adcProximo(diretor);

    System.out.println("\n\n" + supervisor.trata(10) + "\n\n");

    
}

}
