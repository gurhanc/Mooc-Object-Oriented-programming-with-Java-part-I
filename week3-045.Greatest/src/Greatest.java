
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        
        
        int result = Math.max(number1, number2);
        
        result = Math.max(result, number3);
        
        return result;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
