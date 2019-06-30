
import java.util.Scanner;
import java.lang.Math;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the radius: ");
        
        double radius = Integer.parseInt(reader.nextLine());
        
        System.out.println(radius);
        
        double result = 2 * Math.PI * radius;
        
        System.out.println("Circumference of the circle: " + result);
        
        
        
    }
}
