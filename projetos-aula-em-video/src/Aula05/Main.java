package Aula05;

public class Main {
    public static void main (String[] args){
        ContaBanco c = new ContaBanco("cp", "User 1");
        c.printConta();
        c.setDono("User1 & User2");
        c.printConta();
        c.depositar(500f);
        c.sacar(70);
        c.printConta();
        c.tipo = "cp";
        c.printConta();
        c.sacar(580f);
        c.fecharConta();
        c.printConta();
        c = new ContaBanco("cc", "User1 & User2");
        c.sacar(20);
        c.printConta();
        c.pagarMensal();
        c.printConta();
        c.tipo = "cp";
        c.pagarMensal();
        c.printConta();
    }


    //Problemas: abrirConta precisou ficar como private
    //A única forma de abrir uma conta novamente é usando new ContaBanco, preciso passar argumentos que podem ser reduntes ou incorretos.
    //se eu tentar fechar uma conta aberta, abrir uma conta aberta ou errar em algum dos critérios para fechar, o código não permite que novas tentavidas sejam feitas. Para a execução.
    //Necessário reavaliar a privacidade dos atributos, conforme uma conta seria
    //O ideal para mexer em atributos é usar métodos (set/get). Ainda com private isso é possível
    //SEMPRE TRABALHAR COM OS MÉTODOS ESPECIAIS PARA MEXER EM ATRIBUTOS
    //POSSO COLOCAR MENSAGENS DE SUCESSO PARA ABRIR, SACAR, DEPOSITAR, COBRAR TAXA
}
