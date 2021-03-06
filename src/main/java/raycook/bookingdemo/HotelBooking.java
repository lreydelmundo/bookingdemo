package raycook.bookingdemo;

import javax.persistence.*;

@Entity
public class HotelBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String hotelName;
    private double pricePerNight;
    private int nbOfNights;

    public HotelBooking(){

    }

    public HotelBooking(String hotelName, double pricePerNight, int nbOfNights) {
        this.hotelName = hotelName;
        this.pricePerNight = pricePerNight;
        this.nbOfNights = nbOfNights;
    }

    public String getHotelName() {
        return hotelName;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public int getNbOfNights() {
        return nbOfNights;
    }

    public double getTotalPrice(){
        return pricePerNight * nbOfNights;
    }

    public long getId() {
        return id;
    }
}
