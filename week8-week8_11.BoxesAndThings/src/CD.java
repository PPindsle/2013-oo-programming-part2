/**
 *
 * @author Pernille
 */
public class CD implements ToBeStored {
    private String artist;
    private String title;
    private int year;
    private double weight;
    
    public CD(String artist, String title, int year) {
        this.artist = artist;
        this.title = title;
        this.year = year;
        this.weight = 0.1;
    }
    public double weight() {
        return this.weight;
    }
    public String toString() {
        return this.artist + ": " + this.title + " (" + this.year + ")";
    }
    
}
