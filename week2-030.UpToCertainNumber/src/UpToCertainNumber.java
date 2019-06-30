
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int number = Integer.parseInt(reader.nextLine());
        
        int initialNumber = 1;
        
        while (initialNumber <= number) {
            System.out.println(initialNumber);
            
            initialNumber++;
            
    
        }
        
    }
}
