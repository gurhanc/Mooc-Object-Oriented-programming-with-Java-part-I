
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int result = 0;
        
        
        int startingNumber = 0;
        
        int endingNumber = Integer.parseInt(reader.nextLine());
        
        
        while (startingNumber <= endingNumber) {
            
            result += (int)Math.pow(2, startingNumber);
            
            startingNumber++;
                    
                    
        }
        
        System.out.println("The result is "+result);
                
          
        
        
        

    }
}
