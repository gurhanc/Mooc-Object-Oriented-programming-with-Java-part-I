import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        NumberStatistics total = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        
        
        while (true) {
            
            System.out.println("Type numbers:");
            
            int number = Integer.parseInt(reader.nextLine());
            
            if (number == -1) {
                break;
            }
            
            total.addNumber(number);
            
            
            if (number % 2 == 0) {
                even.addNumber(number);
            }
            
            if (number % 2 == 1) {
                odd.addNumber(number);
            }
            
        }
        
        System.out.println("sum: "+total.sum());
        System.out.println("sum of even: "+even.sum());
        System.out.println("sum of odd: "+odd.sum());
    }
}
