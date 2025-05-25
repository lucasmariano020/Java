package lojavirtual;

public class ControleEstoque {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        estoque.setQuantidadeMaximaEstoque(10);
        estoque.produtos = new Produto[estoque.getQuantidadeMaximaEstoque()];

        // Adicionando 10 produtos (limite)
        estoque.adicionarProduto(new Produto(1, "Mouse Gamer", 120.0, 15));
        estoque.adicionarProduto(new Produto(2, "Teclado Mecânico", 250.0, 10));
        estoque.adicionarProduto(new Produto(3, "Monitor LED", 900.0, 5));
        estoque.adicionarProduto(new Produto(4, "Cadeira Gamer", 1400.0, 3));
        estoque.adicionarProduto(new Produto(5, "Mousepad", 40.0, 30));
        estoque.adicionarProduto(new Produto(6, "Webcam Full HD", 300.0, 6));
        estoque.adicionarProduto(new Produto(7, "Headset", 270.0, 9));
        estoque.adicionarProduto(new Produto(8, "HD Externo", 500.0, 4));
        estoque.adicionarProduto(new Produto(9, "Notebook", 4500.0, 2));
        estoque.adicionarProduto(new Produto(10, "Carregador USB-C", 80.0, 20));

        // Tentativa de adicionar além do limite
        estoque.adicionarProduto(new Produto(11, "Produto Excedente", 1.0, 1));

        // Vender até zerar o estoque do produto 1
        Produto mouse = estoque.buscarProdutoPorNome("Mouse Gamer");
        mouse.vender(15); // estoque zera
        mouse.vender(1);  // tentativa de venda inválida

        // Repor grande quantidade no produto 2
        Produto teclado = estoque.buscarProdutoPorNome("Teclado Mecânico");
        teclado.repor(1000);

        // Buscar nome parcialmente parecido (sem sucesso)
        estoque.buscarProdutoPorNome("Mouse");  // Não existe exatamente esse nome

        // Remover produto do meio e do fim
        estoque.removerProduto(5);  // Remove Mousepad
        estoque.removerProduto(10); // Remove Carregador USB-C (último índice)

        // Tentar operar em item removido
        Produto carregador = estoque.buscarProdutoPorNome("Carregador USB-C");
        if (carregador != null) {
            carregador.vender(1);  // Isso não deveria ocorrer
        }

        // Mostrar o estado final do estoque
        System.out.println(estoque);
    }
}
