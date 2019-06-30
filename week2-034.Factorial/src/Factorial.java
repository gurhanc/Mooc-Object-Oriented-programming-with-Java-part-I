import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number:");
        
        int number = Integer.parseInt(reader.nextLine());
        
        int startNumber = 1;
        
        int result = 1;
        
        
        if (number == 0) {
            System.out.println("Factorial is 1");
        }
        
        else {
            while (startNumber <= number) {
                result *= startNumber;
                startNumber++;
                
                
            }
        
            System.out.println("Factorial is "+result);
            
            
            
            
        }
        
        
        
        
        

    }
}
