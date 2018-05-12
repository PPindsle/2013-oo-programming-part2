import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        Scanner reader = new Scanner(System.in);
        UserInterface ui = new UserInterface(reader);
        ui.start();
    }
} 
/*
"1\n" + "AY-123\n" + "108\n" + "x\n" + "1\n" + "x\n";
                /*
                "1\n" + "HA-LOL\n" + "42\n" + "1\n" + "G-OWAC\n" +
                "101\n" + "2\n" + "HA-LOL\n" + "HEL\n" + "BAL\n" +
                "2\n" + "G-OWAC\n" + "JFK\n" + "BAL\n" + "2\n" + "HA-LOL\n"
                + "BAL\n" + "HEL\n" + "x\n" + "1\n" + "2\n" + "3\n" + 
                "G-OWAC\n" + "x\n";
                */
