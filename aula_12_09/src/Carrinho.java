import java.util.ArrayList;

public class Carrinho {
    private Client dono;
    private ArrayList<Product> products;
    private float totalPrice;

    public Carrinho() {
        this.products = new ArrayList<>();
    }

    public void getProducts() {
        for(int i = 0; i < products.size(); i++){
            System.out.println(products.get(i).getName());
            System.out.println(products.get(i).getPrice());
        }
    }

    public Client getDono() {
        return dono;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setDono(Client dono) {
        this.dono = dono;
    }

    public void setTotalPrice() {
        float price = 0;
        for(int i = 0; i < this.products.size(); i++){
            price += this.products.get(i).getPrice();
        }
        this.totalPrice = price;
    }

    public void addItem(Product item){
        products.add(item);
    }

    public void removeItem(Product item){
        products.remove(item);
    }
}