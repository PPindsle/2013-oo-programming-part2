
/**
 *
 * @author Pernille
 */
public class Change {
    private char fromCharacter;
    public char toCharacter;
    private String newString = "";
    
    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }
    public String change(String characterString) {
        for (int i = 0; i < characterString.length(); i++) {
            if (characterString.charAt(i) == fromCharacter) {
                newString += toCharacter;
            } else {
                newString += characterString.charAt(i);
            }
        }
        return newString;
    }
    
}
