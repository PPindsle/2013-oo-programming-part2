/**
 *
 * @author Pernille
 */
import java.util.Scanner;

public class UserInterface {
    private Scanner reader;
    AirportPanel airport = new AirportPanel();

    public UserInterface(Scanner reader) {
        this.reader = reader;
    }
    public void start() {
        airportPanel();
    }
    public void airportPanel() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");
            String cmd = reader.nextLine();
            
            if (cmd.equals("1")) {
                addPlane();
            } else if (cmd.equals("2")) {
                addFlight();
            } else if (cmd.equals("x")) {
                flightService();
                break;
            }
        }
    }
    public void flightService() {
        System.out.println("Flight service");
        System.out.println("------------");
        
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print("> ");
            String cmd = reader.nextLine();
            
            if (cmd.equals("1")) {
                airport.printPlanes();
            } else if (cmd.equals("2")) {
                airport.printFlights();
            } else if (cmd.equals("3")) {
                System.out.print("Give plane ID: ");
                String id = reader.nextLine();
                airport.printPlane(id);
            } else if (cmd.equals("x")) {
                break;
            }
        }
    }
    public void addPlane() {
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        
        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(reader.nextLine());
        
        Plane newPlane = new Plane(id, capacity);
        airport.addPlane(newPlane);
    }
    public void addFlight() {
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        
        System.out.print("Give departure airport code: ");
        String depCode = reader.nextLine();
        
        System.out.print("Give destination airport code: ");
        String destCode = reader.nextLine();
        
        Flight newFlight = new Flight(id, depCode, destCode);
        airport.addFlight(newFlight);
    }
}
