import java.util.Random;

public class PasswordRandomizer {
    private int length;
    private String result;

    public PasswordRandomizer(int length) {
        this.length = length;
        this.result = "";
    }

    public String createPassword() {
        int i;
        Random r = new Random();
        this.result = "";
        String symbol = "abcdefghijklmnopqrstuvwxyz";
        for (i=0;i<this.length;i++) {
            int number = r.nextInt(26);
            result += symbol.charAt(number);
        }    
        return result;
    }
}
