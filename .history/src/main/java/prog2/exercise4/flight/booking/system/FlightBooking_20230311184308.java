package prog2.exercise4.flight.booking.system;
import java.time.LocalDate;

public class FlightBooking {
  private String ticketNumber;
    private String  passengerFullName;
    private String tripSource;
    private String flightCompany;
    private String tripDestination;
    private LocalDate departingDate;
    private LocalDate returnDate;
    private int totalPassengers;
    private double totalTicketPrice;
    private int childPassengers;
    private int adultPassengers;
    public FlightBooking(String Null, LocalDate departDate, LocalDate returnDate, int childPassengers, int adultPassengers) {
        this.passengerFullName = Null;
        this.departingDate = departDate;
        this.returnDate = returnDate;
        this.childPassengers =childPassengers;
        this.adultPassengers =adultPassengers;
    }


    public String getTicketNumber()
    {

        return ticketNumber;
    }
    public String getPassengerFullName()
    {

        return passengerFullName;
    }
    public String getTripSource()
    {

        return tripSource;
    }
    public String getFlightCompany()
    {

        return flightCompany;
    }
    public String getTripDestination()
    {

        return tripDestination;
    }
    public LocalDate getDepartingDate()
    {

        return departingDate;
    }
    public LocalDate getReturnDate()
    {

        return returnDate;
    }
    public int getTotalPassengers()
    {

        return totalPassengers;
    }
    public double getTotalTicketPrice()
    {

        return totalTicketPrice;
    }
    public int getChildrenPassengers()
    {

        return childPassengers;
    }
    public int getAdultPassengers()
    {

        return adultPassengers;
    }


    public void setTicketNumber(String ticketNumber)
    {

        this.ticketNumber = ticketNumber;
    }
    public void setPassengerFullName(String passengerFullName)
    {

        this.passengerFullName = passengerFullName;
    }
    public void setTripSource(String tripSource)
    {

        this.tripSource = tripSource;
    }
    public void setFlightCompany(String flightCompany)
    {

        this.flightCompany = flightCompany;
    }
    public void setTripDestination(String tripDestination)
    {

        this.tripDestination = tripDestination;
    }
    public void setDepartingDate(LocalDate departingDate)
    {

        this.departingDate = departingDate;
    }
    public void setReturnDate(LocalDate returnDate)
    {

        this.returnDate = returnDate;
    }
    public void setTotalPassengers(int childrenPassengers, int adultPassengers)
    {

        this.totalPassengers = childrenPassengers+adultPassengers;
    }
    public void setTotalTicketPrice(double totalTicketPrice)
    {

        this.totalTicketPrice = totalTicketPrice;
    }
    public void setChildPassengers(int childPassengers)
    {

        this.childPassengers = childPassengers;
    }
    public void setAdultPassengers(int adultPassengers)
    {

        this.adultPassengers = adultPassengers;
    }
    public String toString(){
        return "Dear " + passengerFullName + ". Thank you for booking your flight with " + 
        flightCompany + ". Following are the details of your booking and the trip:" + "\n" + 
        "Ticket Number: " + ticketNumber + "\n" + 
        "From " + tripSource + " to " + tripDestination + "\n" +
        "Date of departure: " + departingDate + "\n" +
        "Date of return: " + returnDate + "\n" +
        "Total passengers: " + totalPassengers + "\n" +
        "Total ticket price in Euros: " + totalTicketPrice;

}
}
   


