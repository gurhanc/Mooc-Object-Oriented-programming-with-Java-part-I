import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        
        int i;
        
        int sum = 0;
        
        for (i=0;i<list.size();i++) {
            sum += list.get(i);
        }
        
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        
        int i;
        
        double sum = 0;
        
        for (i=0;i<list.size();i++) {
            sum += list.get(i);
        }
        
        return sum / list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        
        double mean = average(list);
        
        double sum = 0;
        
        int i;
        
        for (i=0;i<list.size();i++) {
            sum += Math.pow((list.get(i)- mean),2);
        }
        
        
        
        return sum / (list.size()-1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
