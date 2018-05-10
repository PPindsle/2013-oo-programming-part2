
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("meth");
        printWithSmileys("beerbottle");
        printWithSmileys("inter");
    }
    private static void printWithSmileys(String characterString) {
        int length = characterString.length();
        int amount = 4; // there is always a minimum amount of four smileys 
        
        // decides how many smileys to print top and bottom
        for (int i = 2; i < length; i++) {
            amount++;
            i++;
        }
        
        topBottom(amount);
        middle(characterString);
        topBottom(amount);
        
        System.out.println();
    }
    public static void topBottom(int amount) {
        String smiley = ":)";
        for (int i = 0; i < amount; i++) {
            System.out.print(smiley);
        }
        System.out.println();
    }
    public static void middle(String string) {
        String smiley = ":)";
        String space = " ";
        
        if (string.length() % 2 == 1) {
            space = "  ";
        } 
        System.out.println(smiley + " " + string + space + smiley);
    }
}
