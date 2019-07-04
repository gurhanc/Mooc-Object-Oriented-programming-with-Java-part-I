
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        
        Account myAccount = new Account("Gurhan Canan",100);
        
        myAccount.deposit(20);
        
        System.out.println(myAccount.toString());
        
        
    }

}
