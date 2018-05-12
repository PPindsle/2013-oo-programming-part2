/**
 *
 * @author Pernille
 */
import java.util.ArrayList;

public class AirportPanel {
    private Plane plane;
    private Flight flight;
    private ArrayList<Plane> planes = new ArrayList<Plane>();
    private ArrayList<Flight> flights = new ArrayList<Flight>();

    public AirportPanel() {
        
    }
    public void addPlane(Plane plane) {
        planes.add(plane);
    }
    public void addFlight(Flight flight) {
        int i = 0;
        for (Plane plane : planes) {
            if (flight.getId().equals(plane.getId())) {
                flights.add(flight);
            } else {
                i = 1;
            }
        }
        if (i == 1) {
            System.out.println("Plane does not exist. Flight not added");
        }
    }
    public void printPlanes() {
        for (Plane plane : planes) {
            System.out.println(plane.toString());
        }
    }
    public void printFlights() {
        int capacity = 0;
        for (Flight flight : flights) {
            for (Plane plane : planes) {
                if (plane.getId().equals(flight.getId())) {
                    System.out.println(plane.toString() + " " + flight.toString());
                }
            }
            
        }
    }
    public void printPlane(String id) {
        for (Plane plane : planes) {
            if (plane.getId().equals(id)) {
                System.out.println(plane.toString());
            }
        }
    }
}
