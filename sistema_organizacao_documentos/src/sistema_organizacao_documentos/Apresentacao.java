package sistema_organizacao_documentos;

public class Apresentacao extends Documento{
    private int qntSlides;

    public Apresentacao(String titulo, String autor, double tamanho, int qntSlides) {
        super(titulo, autor, tamanho);
        this.qntSlides = qntSlides;

        StringBuilder sb = new StringBuilder();
            sb.append("=============================\n");
            sb.append("Iniciando apresentação...\n");
            sb.append(String.format("Título: %s\n", this.getTitulo()));
            sb.append(String.format("Autor: %s\n", this.getAutor()));
            sb.append(String.format("Resumo: Esta é uma apresentação com %d slide%s.\n\n", 
                this.getQntSlides(), this.getQntSlides() == 1 ? "" : "s"));

            for (int i = 1; i <= this.getQntSlides(); i++) {
                sb.append("+------------------+\n");
                sb.append(String.format("|     Slide %d      |\n", i));
                sb.append("+------------------+\n\n");
            }

            sb.append("=============================\n\n");

            this.setConteudo(sb.toString());
    }

    public void abrir(){
        System.out.println("\n\nAbrindo apresentacao...\n");
        System.out.println(this.getConteudo());
    }

    public void formatar() {
        StringBuilder sb = new StringBuilder();
        sb.append("Formatando apresentacao\n");
        for (int i = 1; i <= this.getQntSlides(); i++) {
            sb.append("+------------------+\n");
            sb.append(String.format("|  %s %d  |\n", "Titulo Formatado", i));
            sb.append("+------------------+\n\n");
        }

        sb.append("=============================\n\n");

        this.setConteudo(sb.toString());
        System.out.println(this.getConteudo());
    }

    public int getQntSlides() {
        return qntSlides;
    }

    public void setQntSlides(int qntSlides) {
        this.qntSlides = qntSlides;
    }

}
