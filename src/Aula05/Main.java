package Aula05;

public class Main {
    public static void main (String[] args){
        ContaBanco c = new ContaBanco("cp", "Lucas");
        c.printConta();
        c.setDono("Bruna & Lucas");
        c.printConta();
        c.depositar(500f);
        c.sacar(70);
        c.printConta();
    }
}
