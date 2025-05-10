package Aula09;

import java.util.Random;

public class Livro implements Publicacao{
    //Atributtes
    private String titulo;
    private Pessoa autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //Methods
    public void detalhes(){
        System.out.println();
        System.out.println();
        System.out.println("Titulo do livro: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor().getNome());
        System.out.println("Total de páginas: " + this.getTotPaginas());
        System.out.println("Página Atual: " + this.getPagAtual());
        System.out.println("O livro está: " + (this.isAberto() ? "aberto" : "fechado"));
    }

    @Override
    public void abrir() {
        if(this.isAberto()){
            System.out.println();
            System.out.println("O livro já está aberto");
        }
        else{
            this.setAberto(true);
        }
    }

    public void fechar(){
        if(!this.isAberto()){
            System.out.println();
            System.out.println("O livro já está fechado!");
        } 
        else{
            this.setAberto(false);
        }
    }

    public void folhear(){
        if(!this.isAberto()){
            System.out.println();
            System.out.println("Primeiro abra o livro!");
        } 
        else{
            Random proxPagina = new Random();
            int paginas = proxPagina.nextInt(this.getTotPaginas());
            
            if(this.getPagAtual() + paginas > this.getTotPaginas()){
                paginas = this.getTotPaginas();
            }
            else{
                this.setPagAtual(this.getPagAtual() + paginas);
            }

            System.out.println();
            System.out.println("Folheando o livro.....");
            System.out.println("...");
            System.out.println("...");
            System.out.println("Atualmente na pagina " + this.getPagAtual());
        }
    }

    public void avancarPag(int paginas){
        if(paginas <= 0){
            System.out.println();
            System.out.println("Número de páginas inválido");
        }
        else if(!this.isAberto()){
            System.out.println();
            System.out.println("Primeiro abra o livro!");
        }
        else{
            if(this.getPagAtual() + paginas > this.getTotPaginas()){
                this.setPagAtual(this.getTotPaginas());
            }
            else{
                this.setPagAtual(this.getPagAtual() + paginas);
            }

            System.out.println();
            System.out.println("Avançando páginas.....");
            System.out.println("...");
            System.out.println("...");
            System.out.println("Atualmente na pagina " + this.getPagAtual());
        } 
    }

    public void voltarPag(int paginas){
        if(paginas <= 0){
            System.out.println();
            System.out.println("Número de páginas inválido");
        }
        else if(!this.isAberto()){
            if(this.getPagAtual() - paginas < 0){
                this.setPagAtual(0);
            }
            else{
                this.setPagAtual(this.getPagAtual() - paginas);
            }

            System.out.println();
            System.out.println("Voltando páginas.....");
            System.out.println("...");
            System.out.println("...");
            System.out.println("Atualmente na pagina " + this.getPagAtual());
        }
    }

    //Especial Methods
    public Livro(String titulo, Pessoa autor, int totPaginas) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPaginas(totPaginas);
        this.setAberto(false);
        this.setPagAtual(0);
    }
    
    private String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private Pessoa getAutor() {
        return autor;
    }

    private void setAutor(Pessoa autor) {
        this.autor = autor;
    }

    private int getTotPaginas() {
        return totPaginas;
    }

    private void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    private int getPagAtual() {
        return pagAtual;
    }

    private void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    private boolean isAberto() {
        return aberto;
    }

    private void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    private Pessoa getLeitor() {
        return leitor;
    }

    private void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    
}
