
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Until what?");
        
        int startingNumber = 1;
        
        int sum = 0;
        
        int endingNumber = Integer.parseInt(reader.nextLine());
        
        while (startingNumber <= endingNumber) {
            sum += startingNumber;
            startingNumber++;
        }
        
        System.out.println("Sum is"+sum);
        
        
        

    }
}
