package Aula10;

import java.util.ArrayList;

public class Main {
    public static void main (String args[]){
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Aluno("Cesar", 18, "M", 10009, "Técnico em Automação Industrial"));
        pessoas.add(new Funcionario("Ana Laura", 26, "F", "Administrativo", true));
        pessoas.add(new Pessoa("Claudio", 21, "M"));
        pessoas.add(new Professor("Joana", 38, "F","Instrumentação", 3100f));

        for(int i = 0; i < 4; i++){
            pessoas.get(i).fazerAniver();
        }
        
        ((Aluno)pessoas.get(0)).cancelarMatr();
        ((Funcionario)pessoas.get(1)).mudarTrabalho();
        ((Professor)pessoas.get(3)).receberAum(2000f);

        //((Aluno)p[1]).cancelarMatr(); -- Forma de se utilizar um método da subclasse usando array
        //((Funcionario)p[2]).mudarTrabalho();

    }
}
