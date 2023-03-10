package prog2.exercise4.flight.booking.system;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class FlightBooking {
    enum TripSource {
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS;
    }
    private String TicketNumber;
    private String PassengerFullName;

    private TripSource tripSource;
    private String FlightCompany;
    private TripDestination tripDestination;
    private String TripDestination;
    private LocalDate DepartureDate;
    private LocalDate ReturnDate;
    private int TotalPassengers;
    private double TotalTicketPrice;
    private int ChildPassengers;
    private int AdultPassengers;
    private BookingClass bookingClass;
    private TripType tripType;
    private String SourceAirport;
    private SourceAirport sourceAirport;
    private String DestinationAirport;
    private double DepartingTicketPrice;
    private double ReturnTicketPrice;
    private int TripDate;


    public FlightBooking(String aNull, LocalDate depart, LocalDate returnDate, int i, int i1) {
        this.PassengerFullName = aNull;
        this.DepartureDate = depart;
        this.ReturnDate = returnDate;
        this.ChildPassengers = i;
        this.AdultPassengers = i1;
    }

    String sdepart = "2023-03-04";
    LocalDate departureDate = LocalDate.parse(sdepart);

    String sreturn = "2023-03-05";
    LocalDate returnDate = LocalDate.parse(sreturn);


    public void setTripDate(int tripDate) {


        /*long i = departureDate.toEpochDay() - returnDate.toEpochDay();
        if (i >= 0 && i < 1) {
            LocalDate returnDate = departureDate.plusDays(2);
        } else if (i >= 1 && i < 2) {
            LocalDate returnDate = departureDate.plusDays(1);
        }*/
    }

    public int getTripDate() {

        return TripDate;
    }


    enum BookingClass {
        FIRST, BUSINESS, ECONOMY
    }
    //private BookingClassOptions bookingClass;

    public void setBookingClass(String bookingclass) {
        switch (bookingclass) {
            case "1":
                this.bookingClass = bookingClass.FIRST;
                break;
            case "2":
                this.bookingClass = bookingClass.BUSINESS;
                break;
            case "3":
                this.bookingClass = bookingClass.ECONOMY;
                break;
            default:

        }
    }


    enum TripType {
        ONE_WAY, RETURN
    }


    //private TripTypeOption tripType;

    public void setTripType(String triptype) {
        switch (triptype) {
            case "1":
                this.tripType = tripType.ONE_WAY;
                break;
            case "2":
                this.tripType = tripType.RETURN;
                break;
            default:

        }
    }


   /* enum TripSource {
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS;
    }*/
    //private TripSourceOptions tripSource;

    public TripSource getTripSource() {

        return tripSource;
    }

    public void setTripSource(String source) {
        switch (source) {
            case "1":
                this.tripSource = tripSource.NANJING;
                break;
            case "2":
                this.tripSource = tripSource.BEIJING;
                break;
            case "3":
                this.tripSource = tripSource.SHANGHAI;
                break;
            case "4":
                this.tripSource = tripSource.OULU;
                break;
            case "5":
                this.tripSource = tripSource.HELSINKI;
                break;
            case "6":
                this.tripSource = tripSource.PARIS;
                break;
            default:
        }
    }

    enum TripDestination {
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS;
    }

    //private TripDestinationOptions tripDestination;
    public String getTripDestination() {

        return TripDestination;
    }

    public void setTripDestination(String tripdestination, String tripdestination2) {

        switch (tripdestination) {
            case "1":
                this.tripDestination = tripDestination.NANJING;
                break;
            case "2":
                this.tripDestination = tripDestination.BEIJING;
                break;
            case "3":
                this.tripDestination = tripDestination.SHANGHAI;
                break;
            case "4":
                this.tripDestination = tripDestination.OULU;
                break;
            case "5":
                this.tripDestination = tripDestination.HELSINKI;
                break;
            case "6":
                this.tripDestination = tripDestination.PARIS;
                break;
            default:
        }
    }


    //private enum SourceAirportOptions{
    //Nanjing, Beijing, Shanghai, Oulu, Helsinki, Paris;
    //}
    //private SourceAirportOptions sourceAirport;

    public String getSourceAirport() {

        return SourceAirport;
    }


    enum SourceAirport {
        NANJING_LUKOU_INTERNATION_AIRPORT
    }


    public void setSourceAirport(String sourceAirport) {
        //sourceAirport = String.valueOf(tripSource);
        // "Nanjing Lukou International Airport";
        if (tripSource == tripSource.NANJING) {
            this.SourceAirport = "Nanjing Lukou International Airport";
        }
        if (tripSource == tripSource.BEIJING) {
            this.SourceAirport = "Beijing Capital International Airport";
        }
        if (tripSource == tripSource.SHANGHAI) {
            this.SourceAirport = "Shanghai Pudong International Airport";
        }
        if (tripSource == tripSource.OULU) {
            this.SourceAirport = "Oulu Airport";
        }
        if (tripSource == tripSource.HELSINKI) {
            this.SourceAirport = "Helsinki Airport";
        }
        if (tripSource == tripSource.PARIS) {
            this.SourceAirport = " Paris Charles de Gaulle Airport";
        }
    }


    public String getDestinationAirport() {

        return DestinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        DestinationAirport = String.valueOf(tripDestination);
        if (tripDestination == tripDestination.NANJING) {
            this.DestinationAirport = "Nanjing Lukou International Airport";
        }
        if (tripDestination == tripDestination.SHANGHAI) {
            this.DestinationAirport = "Beijing Capital International Airport";
        }
        if (tripDestination == tripDestination.SHANGHAI) {
            this.DestinationAirport = "Shanghai Pudong International Airport";
        }
        if (tripDestination == tripDestination.OULU) {
            this.DestinationAirport = "Oulu Airport";
        }
        if (tripDestination == tripDestination.HELSINKI) {
            this.DestinationAirport = "Helsinki Airport";
        }
        if (tripDestination == tripDestination.PARIS) {
            this.DestinationAirport = " Paris Charles de Gaulle Airport";
        }
    }


    // public void setTicketNumber(String TicketNumber) {

    //this.TicketNumber = TicketNumber;
    // }


    public String getTicketNumber() {
        setTicketNumber();
        return TicketNumber;
    }

    public String getPassengerFullName() {

        return PassengerFullName;
    }


    public String getFlightCompany() {

        return FlightCompany;
    }


    public LocalDate getDepartureDate() {

        return DepartureDate;
    }

    public LocalDate getReturnDate() {

        return ReturnDate;
    }

    public int getTotalPassengers() {

        return TotalPassengers;
    }

    public double getTotalTicketPrice() {

        return TotalTicketPrice;
    }

    public double getDepartingTicketPrice() {

        return DepartingTicketPrice;
    }

    public double getReturnTicketPrice() {

        return ReturnTicketPrice;
    }





    public void setPassengerFullName(String PassengerFullName) {

        this.PassengerFullName = PassengerFullName;
    }


    public void setFlightCompany(String FlightCompany) {

        this.FlightCompany = FlightCompany;
    }


    public void setDepartureDate(LocalDate departureDate) {
        //this.DepartureDate = DepartureDate;
        String sdepart = "2023-03-04";
        this.DepartureDate = LocalDate.parse(sdepart);
    }

    public void setReturnDate(LocalDate returnDate) {
        // this.ReturnDate = ReturnDate;
        String sreturn = "2023-03-05";


        this.ReturnDate = DepartureDate.plusDays(2);

        /*long i = DepartureDate.toEpochDay() - ReturnDate.toEpochDay();
        if (i >= 0 && i < 1) {
            this.ReturnDate = DepartureDate.plusDays(2);
        } else if (i >= 1 && i < 2) {
            this.ReturnDate = DepartureDate.plusDays(1);
        }*/
    }

    public void setTotalPassengers(int totalPassengers, int TotalPassengers) {

        this.TotalPassengers = ChildPassengers + AdultPassengers;
    }

    public void setTotalTicketPrice() {

        this.TotalTicketPrice = Math.abs((((2 *((300 + (0.1*300)) + (0.05*300))) + (5*((300 + (0.1*300)) + (0.05*300)))) + 250)*2);
    }

    public void setDepartingTicketPrice(int child, int adult) {

        this.DepartingTicketPrice = DepartingTicketPrice;
    }

    public void setReturnTicketPrice() {

        this.ReturnTicketPrice = ReturnTicketPrice;
    }


    public String toString() {
        return "Dear " + PassengerFullName + ". Thank you for booking your flight with " +
                FlightCompany + ". \nFollowing are the details of your booking and the trip:" + "\n" +
                "Ticket Number: " + TicketNumber + "\n" +
                "From " + tripSource + " to " + TripDestination + "\n" +
                "Date of departure: " + DepartureDate + "\n" +
                "Date of return: " + ReturnDate + "\n" +
                "Total passengers: " + TotalPassengers + "\n" +
                "Total ticket price in Euros: " + TotalTicketPrice;
    }

    Random random = new Random();

    public void setTicketNumber( ) {
        String ticketNumber = null;
        switch (tripType){
            case ONE_WAY:
                ticketNumber = "11";
                break;
            case  RETURN:
                ticketNumber = "22";
                break;
        }
        switch (bookingClass){
            case FIRST:
                ticketNumber = ticketNumber + "F";
                break;
            case BUSINESS:
                ticketNumber = ticketNumber + "B";
                break;
            case ECONOMY:
                ticketNumber = ticketNumber + "E";
                break;
        }
        for (int i=0; i<4; i++){
            char f = (char) ((random.nextInt(26) + 65));
            ticketNumber = ticketNumber + f;
        }
        this.TicketNumber = ticketNumber+"DOM";
        if(tripSource == tripSource.NANJING && tripDestination == tripDestination.BEIJING) {
            this.TicketNumber = ticketNumber + "DOM";
        }
        if(tripSource == tripSource.BEIJING && tripDestination == tripDestination.NANJING) {
            this.TicketNumber = ticketNumber + "DOM";
        }
        if(tripSource == tripSource.OULU && tripDestination == tripDestination.HELSINKI) {
            this.TicketNumber = ticketNumber + "DOM";
        }
        if(tripSource == tripSource.HELSINKI && tripDestination == tripDestination.OULU) {
            this.TicketNumber = ticketNumber + "DOM";
        }if(tripSource == tripSource.NANJING && tripDestination == tripDestination.OULU ) {
            this.TicketNumber = ticketNumber + "INT";
        }
        if(tripSource == tripSource.OULU && tripDestination == tripDestination.NANJING ) {
            this.TicketNumber = ticketNumber + "INT";
        }
        if(tripSource == tripSource.NANJING && tripDestination == tripDestination.HELSINKI) {
            this.TicketNumber = ticketNumber + "INT";
        }
        if(tripSource == tripSource.HELSINKI && tripDestination == tripDestination.NANJING) {
            this.TicketNumber = ticketNumber + "INT";
        }
        if(tripSource == tripSource.BEIJING && tripDestination == tripDestination.OULU) {
            this.TicketNumber = ticketNumber + "INT";
        }
        if(tripSource == tripSource.OULU && tripDestination == tripDestination.BEIJING) {
            this.TicketNumber = ticketNumber + "INT";
        }
        if(tripSource == tripSource.BEIJING &&  tripDestination == tripDestination.NANJING) {
            this.TicketNumber = ticketNumber + "INT";
        }
        if(tripSource == tripSource.HELSINKI && tripDestination == tripDestination.BEIJING) {
            this.TicketNumber = ticketNumber + "INT";
        }
    }
    private ConfirmationMessage confirmationMessage;

    enum ConfirmationMessage {
        CHANGE, SAVE
    }

    public void setConfirmationMessage(String confirmationmessage) {
        switch (confirmationmessage) {
            case "1":
                this.confirmationMessage = confirmationMessage.CHANGE;
                System.out.println("Thank you for booking your flight with "+FlightCompany+". Following are the details \n" +
                        "of your booking and the trip: \n" +
                        "Ticket Number: "+TicketNumber+"\n" +
                        "Passenger Name: "+PassengerFullName+"\n" +
                        "From TripSource to "+TripDestination+"\n" +
                        "Date of departure: "+DepartureDate+"\n" +
                        "Date of return: ReturnDate (Changed from old ReturnDate to new\n" +
                        ReturnDate+")\n" +
                        "Total passengers: "+TotalPassengers+"\n" +
                        "Total ticket price in Euros: "+TotalTicketPrice+"\n" +
                        "IMPORTANT NOTICE: As per our policy, the return date was changed because it was \n" +
                        "less than two days apart from your departure date");
                break;
            case "2":
                this.confirmationMessage = confirmationMessage.SAVE;
                System.out.println("Thank you for booking your flight with "+FlightCompany+".Following are the details \n" +
                        "of your booking and the trip: \n" +
                        "Ticket Number: "+TicketNumber+"\n" +
                        "Passenger Name: "+PassengerFullName+"\n" +
                        "From TripSource to "+TripDestination+"\n" +
                        "Date of departure: "+DepartureDate+"\n" +
                        "Date of return: "+ReturnDate+"\n" +
                        "Total passengers: "+TotalPassengers+"\n" +
                        "Total ticket price in Euros: "+TotalTicketPrice+"\n");

                break;
        }





























}}