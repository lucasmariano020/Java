package lojavirtual;
public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int quantidade;
    
    
    //Methods
    public void repor(int quantidadeReposta){
        this.setQuantidade(this.getQuantidade() + quantidadeReposta);
        System.out.println();
        System.out.println("Quantidade reposta do produto " + this.getNome() + ": " + quantidadeReposta);
        System.out.println();
    }

    public void vender(int quantidadeVendida){
        if(this.getQuantidade() - quantidadeVendida < 0){
            System.out.println();
            System.out.println("Não é possível vender essa quantidade do produto. Quantidade disponível: " + this.getQuantidade());
            System.out.println();
        } else {
            this.setQuantidade(this.getQuantidade() - quantidadeVendida);
            System.out.println();
            System.out.println("Quantidade vendida do produto " + this.getNome() + ": " + quantidadeVendida);
            System.out.println();
        }
    }

    @Override
    public String toString(){
        return
        "\n--------------------------------------" +
        "\n Produto: " + this.getNome() +
        "\n Preço: " + this.getPreco() +
        "\n Qauntidade: " + this.getQuantidade() +
        "\n--------------------------------------\n";
    }

    //Especial Methods
    public Produto(int id, String nome, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }    

}
