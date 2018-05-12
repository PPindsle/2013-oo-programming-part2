/**
 *
 * @author Pernille
 */

public class Plane {
    private String id;
    private int capacity;

    public Plane(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }
    public String getId() {
        return this.id;
    }
    public int getCapacity() {
        return this.capacity;
    }
    public String toString() {
        String string = this.id + " (" + this.capacity + " ppl)";
        return string;
    }
    
    
}
