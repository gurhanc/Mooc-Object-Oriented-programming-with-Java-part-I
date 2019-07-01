
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name: ");
        
        String name = reader.nextLine();
        
        int length = name.length();
        
        int character = 1;
        
        while (character <= length) {
            
            System.out.println(character+". character:"+name.charAt(character-1));
            
            character++;
            
        }
        
        
        
        
        
        
        
    }
}
