/**
 *
 * @author Pernille
 */
import java.util.Map;
import java.util.HashMap;

public class ShoppingBasket {
    private Map<String, Purchase> purchases; 

    public ShoppingBasket() {
        purchases = new HashMap<String,Purchase>();
    }
    
    public void add(String product, int price) {
        if (this.purchases.containsKey(product)) {
            purchases.get(product).increaseAmount();
        } else {
            Purchase newPurchase = new Purchase(product,1,price);
            purchases.put(product, newPurchase);
        }
    }
    
    public int price() {
        int price = 0;
        for (Purchase item : purchases.values()) {
            price += item.price();
        }
        return price;
    }
    
    public void print() {
        for (Purchase item : purchases.values()) {
            System.out.println(item.name() + ": " + item.amount());
        }
    }
    
}
