public class BussinessClass extends Seats {
    double tax = 0.07;
    BussinessClass(double price){
        super(price);
        this.price = this.price + this.price * tax;
    }
}
