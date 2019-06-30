
public class FromOneToHundred {

    public static void main(String[] args) {
        
        int number = 1;
        while (true) {
            if (number > 100) {
                break;
            }
            else {
                System.out.println(number);
                number++;
            }
            
        }
    }
}
