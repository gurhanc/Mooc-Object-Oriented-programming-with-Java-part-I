
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        System.out.println(calculateCharacters(name));       
               
        
        
    }
    
    
    public static int calculateCharacters(String text) {
        
        
        return text.length();
        
        
    }
    
}
