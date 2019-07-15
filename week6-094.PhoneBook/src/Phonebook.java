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

public class Phonebook {
    
    private ArrayList list = new ArrayList();
    
    public void add(String name, String number) {
        Person person = new Person(name,number);
        list.add(person);
    }
    
    public void printAll() {
        int i;
        for (i=0;i<list.size();i++) {
            System.out.println(list.get(i).toString());
        }
    }
    
    public String searchNumber(String name) {
        int i;
        for (i=0;i<list.size();i++) {
            if (((Person)list.get(i)).getName() == name) {
                return ((Person)list.get(i)).getNumber();
            }        
    }
        return "number not known";
    }  
}
