import java.util.ArrayList;
import java.util.Scanner;

public class Words {
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
        
        for (i=0;i<words.size();i++) {
            System.out.println(words.get(i));
        }
    }
}
