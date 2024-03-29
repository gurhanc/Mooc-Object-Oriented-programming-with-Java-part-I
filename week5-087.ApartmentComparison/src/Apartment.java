
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartments) {
        
        if (this.squareMeters > otherApartments.squareMeters) {
            return true;
        }
        else return false;
    }
    
    public int priceDifference(Apartment otherApartment) {
        
        int price1 = this.squareMeters * this.pricePerSquareMeter;
        int price2 = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        return Math.abs(price1-price2);
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment) {
        
        double price1 = this.squareMeters * this.pricePerSquareMeter;
        double price2 = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        
        if (price1 > price2) {
            return true;
        }
        else {
            return false;
        }
    }
    
}
