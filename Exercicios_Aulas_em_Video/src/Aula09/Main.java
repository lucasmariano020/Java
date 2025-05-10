package Aula09;

public class Main {
    public static void  main (String args[]){
        Pessoa autor1 = new Pessoa("Hal Erold", 45, "Masculino");
        Pessoa leitor1 = new Pessoa("Luke", 30, "Masculino");
        Livro livro1 = new Livro("O Milagre da Manhã", autor1, 196);

        autor1.fazerAniver();
        autor1.getIdade();
        leitor1.fazerAniver();
        leitor1.getIdade();

        livro1.detalhes();
        livro1.folhear();
        livro1.abrir();
        livro1.folhear();
        livro1.voltarPag(100);
        livro1.voltarPag(-1);
        livro1.fechar();
        livro1.detalhes();
    }
}
