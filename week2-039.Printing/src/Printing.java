public class Printing {

    public static void printStars(int amount) {
        
        
        int start = 1;
        while (start <= amount) {
            System.out.print("*");
            start++;
        }
        
        
        System.out.println("");      
    }

    public static void printSquare(int sideSize) {
        int counter = 1;
        
        while (counter <= sideSize) {
            printStars(sideSize);
            counter++;
        }
    }

    public static void printRectangle(int width, int height) {
        
        int i;
        
        for (i=0;i<height;i++) {
            
            printStars(width);
            
            
        }
        
        
    }

    public static void printTriangle(int size) {
        
        int k;
        
        for (k=1;k<=size;k++) {
            printStars(k);
        }
        
        
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
