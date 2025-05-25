package sistema_organizacao_documentos;

public abstract class Documento {
    private String titulo;
    private String autor;
    private double tamanho;
    protected String conteudo;

    protected Documento(String titulo, String autor, double tamanho) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanho = tamanho;
    }

    public abstract void abrir();
    public abstract void formatar();

    @Override
    public String toString() {
        return "\n\nDocumento{" +
               "titulo='" + titulo + '\'' +
               ", autor='" + autor + '\'' +
               ", tamanho=" + tamanho + " MB" +
               '}' + "\n\n";
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getTamanho() {
        return tamanho;
    }

    protected String getConteudo() {
        return conteudo;
    }

    protected void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

}
