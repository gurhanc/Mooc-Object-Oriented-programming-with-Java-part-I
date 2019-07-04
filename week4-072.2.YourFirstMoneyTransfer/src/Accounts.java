
public class Accounts {

    public static void main(String[] args) {
        Account firstAccount = new Account("Matt's account",1000);
        
        Account secondAccount = new Account("My account",0);
        
        firstAccount.withdrawal(100);
        
        secondAccount.deposit(100);
        
        System.out.println(firstAccount.toString());
        
        System.out.println(secondAccount.toString());
        
    }

}
