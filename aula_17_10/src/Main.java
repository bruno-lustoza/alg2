public class Main {
    public static void main(String[] args) {
        try {

            Eletronico celular = new Eletronico("Celular Samsung", 1500.00, 5, "Samsung", 12);
            Alimento arroz = new Alimento("Arroz 5kg", 20.00, 10, "01/2025", true);

            CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
            carrinho.adicionarItem(celular);
            carrinho.adicionarItem(arroz);

            carrinho.exibirCarrinho();
            carrinho.calcularTotal();

            carrinho.finalizarCompra();
        } catch (ValorInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
