
import java.util.ArrayList;

public class AverageOfNumbers {

    // Copy here the method sum from previous assignment
    public static int sum(ArrayList<Integer> list) {
        
        int sum = 0;
        
        int i;
        
        for (i=0;i<list.size();i++) {
            sum += list.get(i);
        }
        
        return sum;

    }
    

    public static double average(ArrayList<Integer> list) {
        
        double calcAverage = (double)sum(list) / list.size();
        
        return calcAverage;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}
