
public class Main {
    public static void main(String[] args) {
        // write testcode here
    }
    
    public static int smallest(int[] array) {
        int min = array[0];
        int i;
        for (i=1;i<array.length;i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    
    public static int indexOfTheSmallest(int[] array) {
        int number = smallest(array);
        int i;
        for (i=0;i<array.length;i++) {
            if (array[i] == number) {
                break;
            }
        }
        return i;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int min = array[index];
        int i;
        int sindex = index;
        for (i=index;i<array.length;i++) {
            if (array[i] < min) {
                min = array[i];
                sindex = i;
            }
        }
        return sindex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int a = array[index1];
        int b = array[index2];
        array[index1] = b;
        array[index2] = a;
    }
    
    public static void sort(int[] array) {
        int i;
        for (i=0;i<array.length;i++) {
            System.out.println(array);
            int indx = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, indx);
            System.out.println(array);
        }
    }
    
    

}
