
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        
        String result = "";
        
        int length = text.length();
        
        int i;
        
        for (i=length-1;i>=0;i--) {
            result += text.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
