

/**
 *
 * @author Pernille
 */
import java.util.HashMap;
import java.util.Map;

public class PromissoryNote {
    private HashMap<String, Double> hashMap;

    public PromissoryNote() {
        hashMap = new HashMap<String, Double>();
    }
    public void setLoan(String toWhom, double value) {
        hashMap.put(toWhom, value);
    }
    public double howMuchIsTheDebt(String whose) {
        if (hashMap.containsKey(whose)) {
            return hashMap.get(whose);
        }
        return 0;
    }
    
}
