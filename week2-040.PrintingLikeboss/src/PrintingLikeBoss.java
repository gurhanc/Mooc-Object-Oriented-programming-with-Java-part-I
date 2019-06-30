public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        
        int counter = 1;
        
        while (counter <= amount) {
            System.out.print("*");
            
            counter++;
        }
        System.out.println("");

    }

    public static void printWhitespaces(int amount) {
        int cnt = 1;
        
        while (cnt <= amount) {
            System.out.print(" ");
            
            cnt++;
        }
    }

    public static void printTriangle(int size) {
        
        
        int i;
        
        int starSpace = 1;
        
        for (i=size-1;i>=0;i--) {
            printWhitespaces(i);
            printStars(size-i);
        }
    }

    public static void xmasTree(int height) {
        int width = height * 2 - 1;
        
        int number = 1;
        
        int i;
        
        while (number <= width) {
            
            printWhitespaces((width-number)/2);
            
            printStars(number);
            
            
            number += 2;
            

        }
        
        for (i=0;i<=1;i++) {
            printWhitespaces((width-3)/2);
            printStars(3);

        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}