import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name: ");
        
        
        String name = reader.nextLine();
        
        
        int length = name.length();
        
        
        System.out.println("In reverse order: ");
        
        while (length-1>=0) {
            
            System.out.print(name.charAt(length-1));
            
            length--;
            
        }
        
        
        
        
        
        
        
        
    }
}
