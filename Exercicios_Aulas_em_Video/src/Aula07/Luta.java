package Aula07;

public class Luta {
    //Attributes
    private Lutador desafiado;
    private Lutador desafiante;
    private Lutador vencedor;
    private int rounds;
    private boolean aprovada;

    //Methods
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && !(l1.getNome().equals(l2.getNome()))){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }
        else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void lutar(){
        if(this.isAprovada()){
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            this.setVencedor();
        }
        else{
            System.out.println("A luta não pode acontecer");
        }
    }
    
    //Especial Methods
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public Lutador getVencedor() {
        return vencedor;
    }

    private void setVencedor() {
        float scoreL1 = (this.desafiante.getVitorias()*2 + this.desafiante.getEmpates() + this.desafiante.getAltuta() + this.desafiante.getPeso() - this.desafiante.getIdade());
        float scoreL2 = (this.desafiado.getVitorias()*2 + this.desafiado.getEmpates() + this.desafiado.getAltuta() + this.desafiado.getPeso() - this.desafiado.getIdade());

        if(scoreL1 > scoreL2){
            this.vencedor = this.desafiante;
            this.desafiante.ganharLuta();
            this.desafiado.perderLuta();
            System.out.println("--------------------------------------------------------------------");
            System.out.println();
            System.out.println("         " + this.desafiante.getNome() + " ganhou a luta! " + scoreL1 + " x " + scoreL2);
            System.out.println();
            System.out.println("--------------------------------------------------------------------");
        }
        else if(scoreL2 > scoreL1){
            this.vencedor = this.desafiado;
            this.desafiado.ganharLuta();;
            this.desafiante.perderLuta();;
            System.out.println("--------------------------------------------------------------------");
            System.out.println();
            System.out.println("        " + this.desafiado.getNome() + " ganhou a luta! " + scoreL2 + " x " + scoreL1);
            System.out.println();
            System.out.println("--------------------------------------------------------------------");
        }
        else{
            this.vencedor = null;
            this.desafiado.empatarLuta();;
            this.desafiante.empatarLuta();;
            System.out.println("--------------------------------------------------------------------");
            System.out.println();
            System.out.println("                           Houve Empate! " + scoreL2 + " x " + scoreL1 + "                      ");
            System.out.println();
            System.out.println("--------------------------------------------------------------------");
        }
    }

}
