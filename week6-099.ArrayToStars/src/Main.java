
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        
        int i;
        int k;
        
        for (i=0;i<array.length;i++) {
            String star = "";
            for (k=0;k<array[i];k++) {
                star += "*";
            }
            System.out.println(star);
        }
    }
}
