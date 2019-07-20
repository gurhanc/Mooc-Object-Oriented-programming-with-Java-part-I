/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gurhan
 */
import java.util.ArrayList;
import java.util.HashMap;
public class Birds {
    
    private ArrayList arr;
    private HashMap count;
    private ArrayList names;
    
    public Birds() {
        arr = new ArrayList();
        count = new HashMap<String, Integer>();
        names = new ArrayList();
    }
    
    public void addBird(Bird bird) {
        arr.add(bird);
        count.put(bird.getName(), 0);
        names.add(bird.getName());
    }
    
    public void addObservation(String name) {
        if (!names.contains(name)) {
            System.out.println("Is not a bird!");
        }
        if (names.contains(name)) {
            count.put(name, (Integer)(count.get(name))+1);
        }
    } 
    
    public void printAll() {
        int i;
        if (arr.size() > 0) {
            for (i=0;i<arr.size();i++) {
                Bird bird = (Bird) arr.get(i);
                System.out.println(bird.getName()+ "("+bird.getLatingName()+"): "+count.get(bird.getName())+" observations");
            }
        }
        
    }
    
    public void print(String name) {
        int i;
        String latin = "";
        for (i=0;i<arr.size();i++) {
            Bird bird = (Bird) arr.get(i);
            if (bird.getName().equals(name)) {
                latin = bird.getLatingName();
                System.out.println((name+ "("+latin+"): "+count.get(name)+" observations"));
                break;
            }
        }
    }
    
}
