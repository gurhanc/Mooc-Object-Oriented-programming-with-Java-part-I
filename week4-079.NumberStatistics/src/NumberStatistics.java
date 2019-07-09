
public class NumberStatistics {
    private int amountOfNumbers = 0;
    private int sum = 0;

    public NumberStatistics() {
        this.amountOfNumbers = amountOfNumbers;
        this.sum = sum;
    }

    public void addNumber(int number) {
        this.sum += number;
        this.amountOfNumbers += 1;
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }
    
    public int sum() {
        return this.sum;  
    }
    
    public double average() {
        
        if (this.amountOfNumbers > 0) {
            return (double)this.sum / this.amountOfNumbers;
        }
        return 0;
        
        
    }
    
    
    
    
}
    