public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade) throws ValorInvalidoException {
        if (preco <= 0) {
            throw new ValorInvalidoException("Preço inválido para o item: " + nome);
        }
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void reduzirQuantidade(int quantidade) throws EstoqueInsuficienteException {
        if (quantidade > this.quantidade) {
            throw new EstoqueInsuficienteException("Quantidade insuficiente do item: " + nome);
        }
        this.quantidade -= quantidade;
    }

    public String toString() {
        return nome + " - R$ " + preco + " - Estoque: " + quantidade;
    }
}
