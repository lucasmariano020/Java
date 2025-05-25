package sistema_organizacao_documentos;

public class Planilha extends Documento{
    private double qntdCelulas;

    public Planilha(String titulo, String autor, double tamanho, double qntdCelulas) {
        super(titulo, autor, tamanho);
        this.qntdCelulas = qntdCelulas;
        this.setConteudo(String.format(
            "=============================\n" +
            "Título: " + this.getTitulo() + "\n" +
            "Autor: " + this.getAutor() + "\n" +
            "Resumo: Planilha genérica com " + this.getQntdCelulas() + " células.\n\n" +
            "+-----------+-----------+\n" +
            "|  Coluna1  |  Coluna2  |\n" +
            "+-----------+-----------+\n" +
            "|   dado1   |   dado2   |\n" +
            "|   dado3   |   dado4   |\n" +
            "...\n" +
            "=============================\n"
        ));
    }

    public void abrir(){
        System.out.println("\n\nAbrindo planilha...");
        System.out.println(this.getConteudo());
    }

    public void formatar() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nFormatando planilha com novos dados:\n");
        sb.append(String.format(
            "+-----------+-----------+\n" +
            "| Produto   | Quantidade|\n" +
            "+-----------+-----------+\n" +
            "| produto1    |     qtd1    |\n" +
            "| produto2     |     qtd2    |"
        )).append("\n");
        sb.append("=============================\n");

        this.conteudo = sb.toString();
        System.out.println(this.getConteudo());
    }


    public double getQntdCelulas() {
        return qntdCelulas;
    }

    public void setQntdCelulas(double qntdCelulas) {
        this.qntdCelulas = qntdCelulas;
    }
}
