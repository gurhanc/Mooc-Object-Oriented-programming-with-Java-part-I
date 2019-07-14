
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        
        int i;
        
        
        while (true) {
            
            System.out.println("name: ");
            String name = reader.nextLine();
            
            if (name.equals("")) {
                break;
            }
            System.out.println("studentnumber: ");
            String studentNumber = reader.nextLine();
            
            Student student = new Student(name,studentNumber);
            
            list.add(student);
            
        }
        
        for (i=0;i<list.size();i++) {
            System.out.println(list.get(i).toString());
            
        }
        
        System.out.println("Give search term: ");
        
        String searchTerm = reader.nextLine();
        
        System.out.println("Result:");
        
        for (i=0;i<list.size();i++) {
            if (list.get(i).getName().contains(searchTerm)) {
                System.out.println(list.get(i).toString());
            }
        }
                
        
        
        
        
    }
}
