import java.util.ArrayList;

public class Carrinho {
    private Client dono;
    private ArrayList<Product> products;
    private Float totalPrice = 0f;

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

    public void addItem(Product item){
        products.add(item);
        totalPrice += item.getPrice();
    }

    public void removeItem(Product item){
        products.remove(item);
        totalPrice -= item.getPrice();
    }
}