
/**
 *
 * @author Pernille
 */
import java.util.ArrayList;

public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> list = new ArrayList<Suitcase>();
    
    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() <= this.maxWeight) {
            list.add(suitcase);
            maxWeight -= suitcase.totalWeight();
        }
    }
    public String toString() {
        int amount = 0;
        int weight = 0;
        for (Suitcase suitcase : list) {
            amount++;
            weight += suitcase.totalWeight();
        }
        String toString = amount + " suitcases (" + weight + " kg)";
        return toString;
    }
    public void printThings() {
        for (Suitcase suitcase : list) {
            suitcase.printThings();
        }
    }
    
}
