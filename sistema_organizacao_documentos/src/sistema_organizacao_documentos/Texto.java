package sistema_organizacao_documentos;

public class Texto extends Documento {
    private double qntdPalavras;
    
    public Texto(String titulo, String autor, double tamanho, double qntdPalavras) {
        super(titulo, autor, tamanho);
        this.qntdPalavras = qntdPalavras;
        this.setConteudo(
            String.format(
                "=============================\n" +
                "Título: %s\n" +
                "Autor: %s\n" +
                "Resumo: Este é um documento com %.0f palavras.\n" +
                "Visualizando as primeiras linhas...\n\n" +
                "\"Início do documento de texto...\"\n\n",
                this.getTitulo(),
                this.getAutor(),
                this.getQntdPalavras()
            )
        );

    }

    public void abrir(){
        System.out.println("\n\nAbrindo documento de texto...\n");
        System.out.println(this.getConteudo());
    }

    public void formatar(){
        this.setConteudo("Formatando documento de texto" + "\n" + this.getConteudo() + "Texto formatado adicionado" + "\n\n");
        System.out.println(this.getConteudo());
    }

    public double getQntdPalavras() {
        return qntdPalavras;
    }

    public void setQntdPalavras(double qntdPalavras) {
        this.qntdPalavras = qntdPalavras;
    }
    
}
