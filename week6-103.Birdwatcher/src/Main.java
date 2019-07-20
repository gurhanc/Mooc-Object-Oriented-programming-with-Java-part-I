import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         Birds birds = new Birds();
         while (true) {
             System.out.print("? ");
             String command = scanner.nextLine();
             if (command.equals("Add")) {
                 System.out.println("Name: ");
                 String name = scanner.nextLine();
                 System.out.println("Latin Name: ");
                 String latinName = scanner.nextLine();
                 Bird bird = new Bird(name, latinName);
                 birds.addBird(bird); 
             }
             else if (command.equals("Observation")) {
                 System.out.println("What was observed:?");
                 String name = scanner.nextLine();
                 birds.addObservation(name);
             }
             else if (command.equals("Statistics")) {
                 birds.printAll();
             }
             else if (command.equals("Show")) {
                 System.out.println("What? ");
                 String name = scanner.nextLine();
                 birds.print(name);
             }
             else if (command.equals("Quit")) {
                 break;
             }
         }     
    }
}
