
/**
 *
 * @author Pernille
 */
import java.util.ArrayList;
public class Suitcase {
    private int maxWeight;
    private ArrayList<Thing> things = new ArrayList<Thing>();

    public Suitcase(int maxWeight) {
        Thing thing;
        this.maxWeight = maxWeight;
    }
    public void addThing(Thing thing) {
        if (thing.getWeight() <= maxWeight) {
            things.add(thing);
            maxWeight -= thing.getWeight();
        }
    }
    public String toString() {
        int amount = 0;
        String toString = "";
        int kg = 0;
        for (Thing thing : things) {
            amount++;
            kg += thing.getWeight();
        }
        if (amount == 0) {
            toString = "empty (0 kg)";
        } else if (amount == 1) {
            toString = amount + " thing (" + kg + " kg)";
        } else {
            toString = amount + " things (" + kg + " kg)";
        }
        return toString;
    }
    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing.getName() + " (" + thing.getWeight() + " kg)");
        }
    }
    public int totalWeight() {
        int weight = 0;
        for (Thing thing : things) {
            weight += thing.getWeight();
        }
        return weight;
    }
    public Thing heaviestThing() {
        if (totalWeight() > 0) {
            Thing heaviestThing = things.get(0);
            
            for (Thing thing : things) {
                if (thing.getWeight() > heaviestThing.getWeight()) {
                    heaviestThing = thing;
                }
            }
            return heaviestThing;
        } else {
            return null;
        }
    }
}
