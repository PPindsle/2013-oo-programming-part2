/**
 *
 * @author Pernille
 */
import java.util.ArrayList;

public class Box implements ToBeStored {
    private double maxWeight;
    private ArrayList<ToBeStored> list; 
    
    public Box(double maxWeight) {
        list = new ArrayList<ToBeStored>();
        this.maxWeight = maxWeight;
    }
    public void add(ToBeStored thing) {
        if (thing.weight() <= this.maxWeight) {
            list.add(thing);
            this.maxWeight -= thing.weight();
        }
    }
    public double weight() {
        double weight = 0;
        for (ToBeStored thing : list) {
            weight += thing.weight();
        }
        return weight;
    }
    public String toString() {
        return "Box: " + list.size() + " things, total weight " + weight() + " kg";
    }

}
