package Aula09;

public class Pessoa {
    //Attributes
    private String nome;
    private int idade;
    private String sexo;
    
    //Methods
    public void fazerAniver(){
        setIdade(this.getIdade() + 1);

        System.out.println();
        System.out.println("Parabéns ao " + this.getNome() + " que completa " + this.getIdade() +" anos!!!");
    }

    //Especial Methods
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
}
