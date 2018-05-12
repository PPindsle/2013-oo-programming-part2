

/**
 *
 * @author Pernille
 */
import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dict;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.dict = dictionary;
        this.reader = reader;
    }
    public void start() {
        while (true) {
            System.out.print("Statement: ");
            String statement = reader.nextLine();
            
            if (statement.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (statement.equals("add")) {
                add();
            } else if (statement.equals("translate")) {
                translate();
            } else {
                System.out.println("Unknown statement");
            }
        }
    }
    public void add() {
        System.out.print("In Finnish: ");
        String key = reader.nextLine();
        System.out.print("Translation: ");
        String value = reader.nextLine();
        dict.add(key,value);
    }
    public void translate() {
        System.out.print("Give a word: ");
        String key = reader.nextLine();
        System.out.println("Translation: " + dict.translate(key));
    }
    
}
