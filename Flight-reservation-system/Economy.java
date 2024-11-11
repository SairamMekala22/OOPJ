public class Economy extends Seats{
    double tax = 0.05;
    Economy(double price){
        super(price);
        this.price = this.price + this.price * tax;
    }
}
