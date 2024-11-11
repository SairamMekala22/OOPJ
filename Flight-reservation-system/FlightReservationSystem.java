import java.util.ArrayList;

// Flight class
class Flight {
    private String flightNumber;
    private String departureTime;
    private String destination;
    private int distance; // In km
    private ArrayList<Passenger> passengers;

    public Flight(String flightNumber, String departureTime, String destination, int distance) {
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.destination = destination;
        this.distance = distance;
        this.passengers = new ArrayList<>();
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public boolean bookFlight(Passenger passenger) {
        passengers.add(passenger);
        return true;
    }

    public double calculateFare(Passenger passenger) {
        double baseFare = 0.1 * distance; // base fare per km
        return passenger.getSeatClass().getMultiplier() * baseFare;
    }

    public void cancelFlight(Passenger passenger) {
        passengers.remove(passenger);
    }
}

// SeatClass (Economy/Business)
abstract class SeatClass {
    public abstract double getMultiplier();
}

class EconomyClass extends SeatClass {
    @Override
    public double getMultiplier() {
        return 1.0;
    }
}

class BusinessClass extends SeatClass {
    @Override
    public double getMultiplier() {
        return 2.0;
    }
}

// Passenger class
class Passenger {
    private String name;
    private SeatClass seatClass;

    public Passenger(String name, SeatClass seatClass) {
        this.name = name;
        this.seatClass = seatClass;
    }

    public SeatClass getSeatClass() {
        return seatClass;
    }

    public String getName() {
        return name;
    }
}

// Main class for testing
public class FlightReservationSystem {
    public static void main(String[] args) {
        // Create flights
        Flight flight1 = new Flight("AB123", "10:00 AM", "New York", 1500);
        Flight flight2 = new Flight("CD456", "02:00 PM", "Los Angeles", 3000);

        // Create passengers
        Passenger passenger1 = new Passenger("John", new EconomyClass());
        Passenger passenger2 = new Passenger("Emma", new BusinessClass());

        // Book flights
        flight1.bookFlight(passenger1);
        flight2.bookFlight(passenger2);

        // Calculate fares
        System.out.println(passenger1.getName() + "'s fare: $" + flight1.calculateFare(passenger1));
        System.out.println(passenger2.getName() + "'s fare: $" + flight2.calculateFare(passenger2));
    }
}