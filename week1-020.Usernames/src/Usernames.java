
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your username: ");
        
        String userName = reader.nextLine();
        
        System.out.println("Type your password: ");
        
        String password = reader.nextLine();
        
        String validName1 = "alex";
        String validName2 = "emily";
        String validPassword1 = "mightyducks";
        String validPassword2 = "cat";
        
        if ((userName.equals(validName1) || userName.equals(validName2)) && (password.equals(validPassword1)|| password.equals(validPassword2))) {
            System.out.println("You are now logged into the system!");
        }
        else {
            System.out.println("Your username or password was invalid!");
        }
        
        
        

    }
}
