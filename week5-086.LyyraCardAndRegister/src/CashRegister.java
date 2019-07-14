
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = cashInRegister;
        this.economicalSold = economicalSold;
        this.gourmetSold = gourmetSold;
        cashInRegister = 1000;
        economicalSold = 0;
        gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        if (2.50 > cashGiven) {
            return cashGiven;
        }
        cashInRegister += 2.50;
        economicalSold += 1;
        return cashGiven - 2.50;
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        if (4.00 > cashGiven) {
            return cashGiven;
        }
        cashInRegister += 4.00;
        gourmetSold += 1;
        return cashGiven - 4.00;  
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
    
    public boolean payEconomical(LyyraCard card) {
        if (card.balance() < 2.50) {
            return false;
        }
        economicalSold += 1;
        card.pay(2.50);
        return true;
    }
    
     public boolean payGourmet(LyyraCard card) {
        if (card.balance() < 4.00) {
            return false;
        }
        gourmetSold += 1;
        card.pay(4.00);
        return true;
    }
     
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
            cashInRegister += sum;
        }
    }
 
}
