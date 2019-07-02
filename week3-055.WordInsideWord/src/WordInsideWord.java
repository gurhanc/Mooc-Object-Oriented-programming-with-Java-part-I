
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int i;
        
        int k;
        
        System.out.println("Type the first word: ");
        
        String name1 = reader.nextLine();
        
        System.out.println("Type the second word: ");
        
        String name2 = reader.nextLine();
        
        boolean flag = false;
        
        for (i=0;i<name1.length();i++) {
            
            for (k=i+1;k<=name1.length();k++) {
                System.out.println(name1.substring(i, k));
                if (name1.substring(i, k).equals(name2)) {
                    System.out.println("The word "+name2+" is found in the word "+name1+".");
                    flag = true;
                    break;
                }
            }
        }
       if (flag == false) {
           System.out.println("The word "+name2+" is not found in the word "+name1+".");
       }
        
        
        
        
        
    }
}
