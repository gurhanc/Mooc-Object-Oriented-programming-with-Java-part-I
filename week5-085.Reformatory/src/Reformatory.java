public class Reformatory {
    
    private int number = 0;

    public int weight(Person person) {
        number += 1;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        int weight = person.getWeight();
        
        person.setWeight(weight+1);
        
    }
    
    public int totalWeightsMeasured() {
        return number;
    }
    
    
    

}
