import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);
        
        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reverse));
    }
    
    public static int[] copy(int[] array) {
        int[] arrayCopy = java.util.Arrays.copyOf(array, array.length);
        
        return arrayCopy;
    }
    
    public static int[] reverseCopy(int[] array) {
        int[] arrayReversedCopy = new int [array.length];
        int i;
        
        for (i=0;i<array.length;i++) {
            arrayReversedCopy[i] = array[array.length-i-1];
        }
        return arrayReversedCopy; 
    }
}
