package Aula10;

public class Professor extends Pessoa {
    //Attributes
    private String especialidade;
    private float salario;

    //Methods
    public void receberAum(float aum){
        this.setSalario(this.getSalario() + aum);
        System.out.println();
        System.out.println("Salario do professor " + this.getNome() + " aumentado em R$" + aum);
    }

    //Especial Methods    
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Professor(String nome, int idade, String sexo, String especialidade, float salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }
    
}
