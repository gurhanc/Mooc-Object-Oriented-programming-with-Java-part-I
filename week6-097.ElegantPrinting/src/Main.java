
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        int i;
        String result = "";
        for (i=0;i<array.length-1;i++) {
            System.out.print(result+array[i]+", ");
        }
        result += array[array.length-1];
        System.out.println(result);
    }
}
