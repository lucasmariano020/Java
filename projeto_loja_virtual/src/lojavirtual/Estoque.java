package lojavirtual;
public class Estoque {
    private int quantidadeMaximaEstoque = 10;
    private int quantidadeAtualProdutos;
    private int posParaInserirProduto;
    public Produto[] produtos;

    //Methods
    public void adicionarProduto(Produto produto){
        if(this.defPosParaInserirProduto() == -1){
            System.out.println("\nNão é possível adicionar mais produtos ao estoque (Limite é " + this.getQuantidadeMaximaEstoque() + ")\n");
        } else {
            this.produtos[this.defPosParaInserirProduto()] = produto;
            this.setQuantidadeAtualProdutos(this.getQuantidadeAtualProdutos() + 1);
        }
    }

    public void removerProduto(int id){
        int match = 0;
        for(int i = 0; i < this.produtos.length; i++){
            //Faz a verificação se o id é igual já prevenindo de comparação xom posição vazia no estoque (evitando erro por NullPointerException)
            if(this.produtos[i] != null && (int)this.produtos[i].getId() == id){
                this.produtos[i] = null;
                this.setQuantidadeAtualProdutos(this.getQuantidadeAtualProdutos() - 1);
                match = 1;
                break;
            }
        }

        if(match == 1){
            System.out.println("\nProduto removido com sucesso\n");
        } else {
            System.out.println("\nO produto com o id especificado não foi encontrado\n");
        }
    }

    public Produto buscarProdutoPorNome(String nomeProduto){
        for(int i = 0; i < this.produtos.length; i++){
            //Faz a verificação se o id é igual já prevenindo de comparação xom posição vazia no estoque (evitando erro por NullPointerException)
            if(this.produtos[i] != null && this.produtos[i].getNome().equals(nomeProduto)){
                return this.produtos[i];
            }
        }

        System.out.println("\nO produto com nome especificado não foi encontrado\n");
        return null;
    }


    @Override
    public String toString(){
        StringBuilder texto = new StringBuilder();
        texto.append("***************************************************\n");
        texto.append("                    Estoque:\n");

        for(int i = 0; i < getQuantidadeMaximaEstoque(); i++){
            if(this.produtos[i] != null){
                texto.append(this.produtos[i].toString());
            }
        }

        texto.append("\n***************************************************\n");

        return texto.toString();
    }

    //Especial Methods
    public Estoque(){
        //Define quantidade do estoque limitada a 100 produtos
        this.produtos = new Produto[this.getQuantidadeMaximaEstoque()];
        this.setQuantidadeAtualProdutos(0);
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public int getQuantidadeMaximaEstoque() {
        return quantidadeMaximaEstoque;
    }

    public void setQuantidadeMaximaEstoque(int quantidadeMaximaEstoque) {
        this.quantidadeMaximaEstoque = quantidadeMaximaEstoque;
    }

    public int getQuantidadeAtualProdutos() {
        int count = 0;
        for(int i = 0; i < this.produtos.length; i++){
            if(this.produtos[i] != null){
                count++;
            }
        }

        return count;
    }

    private void setQuantidadeAtualProdutos(int quantidadeAtualProdutos) {
        this.quantidadeAtualProdutos = quantidadeAtualProdutos;
    }

    public int defPosParaInserirProduto() {
        for(int i = 0; i < this.produtos.length; i++){
            if(this.produtos[i] == null){
                return posParaInserirProduto = i;
            }
        }

        return posParaInserirProduto = -1;
    }


}
