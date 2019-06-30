
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number:");
        
        double temperature = Double.parseDouble(reader.nextLine());
        
        while (true) {
            
            if (temperature >= -30 && temperature <= 40) {
                Graph.addNumber(temperature);
            }
            
            System.out.println("Type a number: ");
            
            temperature = Double.parseDouble(reader.nextLine());
            
        }
        
        
        
        
        

        
    }
}
