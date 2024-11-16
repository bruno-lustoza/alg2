public class Eletronico extends Item {
    private String marca;
    private int garantiaMeses;

    public Eletronico(String nome, double preco, int quantidade, String marca, int garantiaMeses) throws ValorInvalidoException {
        super(nome, preco, quantidade);
        this.marca = marca;
        this.garantiaMeses = garantiaMeses;
    }

    public String toString() {
        return super.toString() + " - Marca: " + marca + " - Garantia: " + garantiaMeses + " meses";
    }
}
