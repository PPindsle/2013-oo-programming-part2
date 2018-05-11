
/**
 *
 * @author Pernille
 */
public class Calculator {
    private Reader reader = new Reader();
    private int calculations = 0;
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }
            if (command.equals("sum")) {
                sum();
                calculations++;
            } else if (command.equals("difference")) {
                difference();
                calculations++;
            } else if (command.equals("product")) {
                product();
                calculations++;
            }
        }

        statistics();
    }
    
    private void sum() {
        int value1 = value1();
        int value2 = value2();
        
        int sum = value1 + value2;
        System.out.println("Sum of the values: " + sum);
    }
    private void difference() {
        int value1 = value1();
        int value2 = value2();
        
        int difference = value1 - value2;
        System.out.println("Difference of values: " + difference);
    }
    private void product() {
        int value1 = value1();
        int value2 = value2();
        
        int product = value1 * value2;
        System.out.println("Product of values: " + product);
    }
    public int value1() {
        System.out.print("Value1: ");
        int value1 = reader.readInteger();
        return value1;
    }
    public int value2() {
        System.out.print("Value2: ");
        int value2 = reader.readInteger();
        return value2;
    }
    private void statistics() {
        System.out.println("Calculations done " + calculations);
    }
}
