import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        int i;
        while (true) {
            
            System.out.println("Type a word: ");
            
            String name = reader.nextLine();
            
            if (name.equals("")) {
                break;
            }
            
            else {
                words.add(name);
                
            }
        }
        System.out.println("You typed the following words:");
        
        for (i=words.size()-1;i>=0;i--) {
            System.out.println(words.get(i));
        }
   
    }
}
