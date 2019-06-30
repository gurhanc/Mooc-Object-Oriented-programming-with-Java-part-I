
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("First:");
        
        
        int sum = 0;
        
        int number1 = Integer.parseInt(reader.nextLine());
        
        
        System.out.println("Last: ");
        
        int number2 = Integer.parseInt(reader.nextLine());
        
        while (number1 <= number2) {
            
            sum += number1;
            
            number1++;
            
        }
        
        
        System.out.println("The sum is "+sum);
        
        
        
        
        
    }
}
