package Aula10;

public class Aluno extends Pessoa{
    //Attributes
    private int matr;
    private String curso;

    //Methods
    public void cancelarMatr(){
        System.out.println();
        System.out.println("A matrícula de " + this.getNome() + " será cancelada");
    }

    //Especial Methods
    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Aluno(String nome, int idade, String sexo, int matr, String curso) {
        super(nome, idade, sexo);
        this.matr = matr;
        this.curso = curso;
    }

}
