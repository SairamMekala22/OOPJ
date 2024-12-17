import java.util.*;
public class Flight {
    String flightNumber;
    String departureTime;
    String destination;
    String status;
    int numOfEconomySeats;
    int numOfBCSeats;
    double economyPrice;
    double BSPrice;
    int economySeat = 0;
    int BSSeat = 0;

    
    Flight(String flightNumber, String departureTime, String destination, String arivalTime, int economy, int BC, double economyPrice, double BSPrice) {
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.destination = destination;
        this.status = "The flight in airport at " + arivalTime;
        this.numOfEconomySeats = economy;
        this.numOfBCSeats = BC;
        this.economyPrice = economyPrice;
        this.BSPrice = BSPrice;
    }

    ArrayList<Economy> economySeats = new ArrayList<Economy>();
    ArrayList<BussinessClass> bussinessClassSeats = new ArrayList<BussinessClass>();

    for (int i = 0; i <= numOfEconomySeats; i++) {
        Economy e = new Economy(economyPrice);
        economySeats.add(e);
    }

    for (int i = 0; i <= numOfBCSeats; i++) {
        BussinessClass bs = new BussinessClass(BSPrice);
        economySeats.add(bs);
    }

    void changeStatus(String latestStatus) {
        this.status = latestStatus;
    }

    int bookEconomy() {
        if (economySeat < numOfEconomySeats) {
            this.economySeats.get(economySeat).booked = true;
            bookedSeats.add(economySeats.get(economySeat));
            economySeat++;
            return economySeat;
        } else {
            System.out.println("Economy seats are full.");
            return 0;
        }
    }

    int bookBS() {
        if (BSSeat > numOfEconomySeats) {
            this.bussinessClassSeats.get(BSSeat).booked = true;
            bookedSeats.add(bussinessClassSeats.get(BSSeat));
            BSSeat++;
            return BSSeat;
        } else {
            System.out.println("Bussiness class seats are full.");
            return 0;
        }
    }

}