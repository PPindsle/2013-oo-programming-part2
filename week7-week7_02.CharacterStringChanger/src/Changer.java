
/**
 *
 * @author Pernille
 */
import java.util.ArrayList;
    
public class Changer {
    ArrayList<Change> list;
    String newString = "";
    Change newChange;
    
    public Changer() {
        list = new ArrayList<Change>();
    }
    public void addChange(Change change) {
        list.add(change);
    }
    public String change(String characterString) {
        for (Change change : list) {
            characterString = change.change(characterString);
        }
        return characterString;
    }
    
}
