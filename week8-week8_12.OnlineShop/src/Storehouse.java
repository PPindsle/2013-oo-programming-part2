/**
 *
 * @author Pernille
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class Storehouse {
    private Map<String,Integer> prices;
    private Map<String,Integer> stocks;

    public Storehouse() {
        this.prices = new HashMap<String,Integer>();
        this.stocks = new HashMap<String,Integer>();
    }
    
    public void addProduct(String product, int price, int stock) {
        stocks.put(product,stock);
        prices.put(product,price);
    }
    
    public int price(String product) {
        for (String key : prices.keySet()) {
            if (key.equals(product)) {
                return prices.get(product);
            }
        }
        return -99;
    }
    
    public int stock(String product) {
        for (String key : stocks.keySet()) {
            if (key.equals(product)) {
                return stocks.get(product);
            }
        }
        return 0;
    }
    
    public boolean take(String product) {
        for (String key : stocks.keySet()) {
            if (key.equals(product)) {
                if (stocks.get(key) > 0) {
                    stocks.put(key, stocks.get(key) - 1);
                    return true;
                }
            }
        }
        return false;
    }
    
    public Set<String> products() {
        Set<String> list = new HashSet<String>();
        for (String key : this.prices.keySet()) {
            list.add(key);
        }
        return list;
    }
}
