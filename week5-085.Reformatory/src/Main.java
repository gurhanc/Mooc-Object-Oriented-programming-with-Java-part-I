
public class Main {

    public static void main(String[] args) {
        Reformatory eastHelsinkiReformatory = new Reformatory();
        Person brian = new Person("Brian", 1, 110, 7);
        
        System.out.println(brian.getName() + " weight: " + eastHelsinkiReformatory.weight(brian) + " kilos");
        
        
        eastHelsinkiReformatory.feed(brian);
        
        eastHelsinkiReformatory.feed(brian);
        
        System.out.println(brian.getName() + " weight: " + eastHelsinkiReformatory.weight(brian) + " kilos");
        
    }
}
