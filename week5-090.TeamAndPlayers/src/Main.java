public class Main {
    public static void main(String[] args) {
        // test your code here

        Team barcelona = new Team("FC Barcelona");
        System.out.println("Team: " + barcelona.getName());
        Player brian = new Player("Brian");
        Player pekka = new Player("Pekka", 39);
        Player cakka = new Player("Cakka", 39);
        barcelona.setMaxSize(2);
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(cakka);
        System.out.println(barcelona.size());
    }
}
