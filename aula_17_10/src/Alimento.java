public class Alimento extends Item {
    private String validade;
    private boolean perecivel;

    public Alimento(String nome, double preco, int quantidade, String validade, boolean perecivel) throws ValorInvalidoException {
        super(nome, preco, quantidade);
        this.validade = validade;
        this.perecivel = perecivel;
    }

    public String toString() {
        return super.toString() + " - Validade: " + validade + " - Perecível: " + perecivel;
    }
}
