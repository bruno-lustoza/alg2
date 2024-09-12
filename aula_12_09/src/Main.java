//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product arroz = new Product("Arroz", 15f);
        Product picanha = new Product("Picanha", 10.8f);

        Client bruno = new Client("Bruno", "sougay123@gmail.com");
        Carrinho carrinhodobruno = new Carrinho();
        carrinhodobruno.setDono(bruno);

        System.out.println("Dono: " + carrinhodobruno.getDono());

        carrinhodobruno.addItem(arroz);
        carrinhodobruno.addItem(picanha);

        carrinhodobruno.getProducts();
        System.out.println("Preço total: " + carrinhodobruno.getTotalPrice());

        carrinhodobruno.removeItem(arroz);
        carrinhodobruno.getProducts();
        System.out.println("Preço total: " + carrinhodobruno.getTotalPrice());
    }
}
