/**
 *
 * @author Pernille
 */

public class Flight {
    private String id;
    private String depCode;
    private String destCode;

    public Flight(String id, String depCode, String destCode) {
        this.id = id;
        this.depCode = depCode;
        this.destCode = destCode;
    }
    public String getId() {
        return this.id;
    }
    public String getDepCode() {
        return this.depCode;
    }
    public String getDestCode() {
        return this.destCode;
    }
    public String toString() {
        String toString = "(" + this.depCode + "-" + this.destCode + ")";
        return toString;
    }
    
    
}
