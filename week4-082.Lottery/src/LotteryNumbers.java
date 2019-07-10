import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        this.numbers = numbers;
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        Random r = new Random();
        this.numbers = new ArrayList<Integer>();
        int i = 0;
        while (i<7) {
            int number = r.nextInt(39) + 1;
            if (!this.containsNumber(number)) {
                this.numbers.add(number);
                i++;
            }
        }
    }

    public boolean containsNumber(int number) {
        if (this.numbers.contains(number)) {
            return true;
        }
        else {
            return false;
        }
    }
}
