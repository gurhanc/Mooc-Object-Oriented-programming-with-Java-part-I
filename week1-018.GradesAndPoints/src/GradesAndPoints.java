
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type the points [0-60]: ");
        
        int number = Integer.parseInt(reader.nextLine());
        
        if (30 <= number && 34 >= number) {
            System.out.println("1");
        }
        else if (35 <= number && number<= 39) {
            System.out.println("2");
        }
        else if (40 <= number && number<= 44) {
            System.out.println("3");
        }
        else if (45 <= number && number<= 49) {
            System.out.println("4");
        }
        else if (50 <= number && number<= 60) {
            System.out.println("5");
        }
        else {
            System.out.println("failed");
        }
        
        
        
        
        
        
        
        
        

    }
}
