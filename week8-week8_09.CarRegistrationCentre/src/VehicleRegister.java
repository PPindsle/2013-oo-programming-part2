/**
 *
 * @author Pernille
 */
import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();
    
    public boolean add(RegistrationPlate plate, String owner) {
        if (owners.get(plate) == null) {
            owners.put(plate, owner);
            return true;
        }
        return false;
    }
    public String get(RegistrationPlate plate) {
        if (owners.containsKey(plate)) {
            return owners.get(plate);
        }
        return null;
    }
    public boolean delete(RegistrationPlate plate) {
        if (owners.containsKey(plate)) {
            owners.remove(plate);
            return true;
        }
        return false;
    }
    public void printRegistrationPlates() {
        for (RegistrationPlate key : owners.keySet()) {
            System.out.println(key);
        }
    }
    public void printOwners() {
        ArrayList<String> owner = new ArrayList<String>();
        for (RegistrationPlate key : owners.keySet()) {
            String ownerName = owners.get(key);
            if (!owner.contains(ownerName)) {
                owner.add(ownerName);
            }
        }
        for (String name : owner) {
            System.out.println(name);
        }
    }
}
