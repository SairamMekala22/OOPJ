import java.util.*;
public class Passanger {
    String name;
    String emailId;
    long phoneNumber;
    public ArrayList<Seats> bookedSeats = new ArrayList<Seats>();
    double totalFare = 0;

    Passanger(String name, String emailId, long phoneNumber) {
        this.name = name;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
    }

    void bookSeat(Flight fl, String seatType) {
        if (seatType.toLowerCase().equals("economy")) {
            int seatNumber = fl.bookEconomy();
            if (seatNumber != 0) {
                System.out.println("You have booked economy seat number " + seatNumber);
            }
        } else if (seatType.toLowerCase().equals("bussiness class")) {
            int seatNumber = fl.bookBS();
            if (seatNumber != 0) {
                System.out.println("You have booked bussiness class seat number " + seatNumber);
            }
        }
    }

    void calculateFare() {
        for (int i = 0; i < bookedSeats.size(); i++) {
            totalFare += bookedSeats.get(i).price;
        }
        System.out.println("Your total fare is $" + totalFare);
    }
}
