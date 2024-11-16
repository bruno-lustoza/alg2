import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void removerItem(String nome) {
        itens.removeIf(item -> item.getNome().equals(nome));
    }

    public void calcularTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco() * item.getQuantidade();
        }
        System.out.printf("Total do carrinho: R$ %.2f\n", total);
    }

    public void exibirCarrinho() {
        System.out.println("Itens no carrinho:");
        for (Item item : itens) {
            System.out.println(item);
        }
    }

    public void finalizarCompra() {
        try {
            for (Item item : itens) {
                item.reduzirQuantidade(item.getQuantidade());
            }
            System.out.println("Compra finalizada com sucesso!");
        } catch (EstoqueInsuficienteException e) {
            System.out.println("Erro ao finalizar compra: " + e.getMessage());
        }
    }
}
