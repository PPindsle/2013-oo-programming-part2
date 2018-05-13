/**
 *
 * @author Pernille
 */
public class Purchase {
    private String product;
    private int amount;
    private int unitPrice;
    
    public Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }
    
    public String name() {
        return this.product;
    }
    
    public int amount() {
        return this.amount;
    }
    
    public int price() {
        return this.amount * this.unitPrice;
    }
     
    public void increaseAmount() {
        this.amount++;
    }
    
    public String toString() {
        return name() + ": " + amount();
    }
    
}
