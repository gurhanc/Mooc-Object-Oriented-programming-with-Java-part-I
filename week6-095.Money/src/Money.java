import java.lang.Math;


public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added) {
        Money sum = new Money(this.euros+added.euros,this.cents+added.cents);
        return sum;
    }
    
    public boolean less(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }
        else if (this.euros == compared.euros) {
            if (this.cents < compared.cents) {
                return true;
            }
        }
        return false;
    }
    
    public Money minus(Money decremented) {
        
        if (this.less(decremented) == true) {
            return new Money(0,0);
        }
        
        double total1 = (double)this.euros + (double)this.cents/100;
        double total2 = (double)decremented.euros + (double)decremented.cents/100;
        
        double result = total1 - total2;
        
        System.out.println(result);
        
        System.out.println((int)Math.floor(result));
        
        System.out.println((int)(result-Math.floor(result)));
        
        
        
        return new Money((int)Math.floor(result),(int)(Math.round((result-Math.floor(result))*100)));
        
    }

}
