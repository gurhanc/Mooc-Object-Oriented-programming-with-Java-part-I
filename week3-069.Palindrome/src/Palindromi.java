import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        
        String reverseText = "";
        
        int i;
        
        for (i=text.length()-1;i>=0;i--) {
            reverseText += text.charAt(i);
        }
        
        if (text.equals(reverseText)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
