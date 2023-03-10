package prog2.exercise4.flight.booking.system;

/**
 * Hello world!
 *
 */
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
//字符串转换为日期(报错)   random(解决)   字符串串联创建number ?  get set number(解决)
//2 Add an attribute for BookingClass可能在flight booking操作，get set  通过123来底层操作First  Business Economy(完成）
// 3. Update the attribute of tripType更新tripType的现有属性，使其可以保存单向的两个选项和返回。因此，乘客必须有选择权。这个选择必须完全如下所示。这些选项必须作为字符串接受：
//1.单向（设置内部逻辑）（完成）
//2.返回 4. Increase trip sources and destinationsTrip source: Nanjing, Beijing, Shanghai, Oulu, Helsinki, and Paris.
//•     Trip destination: Nanjing, Beijing, Shanghai, Oulu, Helsinki, and Paris.（完成）
//•     Source airport: Nanjing Lukou International Airport, Beijing Capital International
//Airport, Shanghai Pudong International Airport, Oulu Airport, Helsinki Airport,
//and Paris Charles de Gaulle Airport.
//•      Destination airport: Nanjing Lukou International Airport, Beijing Capital
//International Airport, Shanghai Pudong International Airport, Oulu Airport,
//Helsinki Airport, and Paris Charles de Gaulle Airport.
//enums   ClassName  trip source和destination要不同  getter和setter
//5. Options to choose from the list of sources and destinations    为字符串格式，程序自动适配出发机场(似乎完成）
// 1. Nanjing        8. Conditional total ticket price  国内基本票价=300欧元税费=基础票价的10%服务费=基础票价的5%
//2. Beijing          国际   300  15  10      fir+250   bus  150   Economic 50  总票价=基本票价+税费+服务费+预订等级 儿童成年
//3.Oulu        departing ticket price 两个参数      set  total return  不设参数
//4. Helsinki  6Conditional trip dates   必须2天以上，若少了系统自动适配7. Conditional ticket number generation票号长10个字符
//单程票11开头回程22   first则后面加F 以此类推  国内旅行则DOM结尾国际INT
//9. Confirmation message 最后
public class Main {
    public static void main(String[] args) {
        //   Calendar calendar = Calendar.getInstance();
        //   System.out.println(calendar.getTime().toString());  // Mon Aug 15 18:19:55 CST 2022

        //  calendar.add(Calendar.YEAR, 2);                     // Mon Aug 15 18:19:55 CST 2024
        //  calendar.add(Calendar.MONTH, -6);                   // Thu Feb 15 18:19:55 CST 2024
        // calendar.add(Calendar.DAY_OF_MONTH, 14);            // Thu Feb 29 18:19:55 CST 2024

        //System.out.println(calendar.getTime().toString());  // Thu Feb 29 18:19:55 CST 2024
        String BookingClass;

        String sdepart = "2023-03-04";
        LocalDate depart= LocalDate.parse(sdepart);
        String sreturn = "2023-03-05";
        LocalDate returnDate = LocalDate.parse(sreturn);
        String FlightID = "FOF" + Math.random() * 9000 + 1000 + "IN";// flightID


        String sourceAirport = "NANJING LUKOU INTERNATIONAL AIRPORT";
        String destinationAirport = "OULU AIRPORT";
        FlightBooking fb = new FlightBooking("John Doe", depart, returnDate, 1, 3);
        int expResult = 4;
        fb.setTotalPassengers(1,3);
        int result = fb.getTotalPassengers();
        fb.setPassengerFullName("John Doe");
        fb.setTicketNumber();
        fb = new FlightBooking(null, null, null, 0, 0);
        fb.setTripSource("2") ;
        fb.setTripDestination("OULU"," Helsinki");
        fb.setFlightCompany("Flights-of-Fancy");
        fb.setDepartureDate(LocalDate.parse("2023-03-04"));
        fb.setReturnDate(LocalDate.parse("2023-03-05"));
        //fb.setBookingClass("");

    //    int child = 2;
       // int adults = 5;
       // double returnedPrice = Math.abs(fb.getTotalTicketPrice());
       // double expectedPrice = Math.abs((((child *((300 + (0.1*300)) + (0.05*300))) + (adults*((300 + (0.1*300)) + (0.05*300)))) + 250)*2);

        System.out.println("Dear " + fb.getPassengerFullName() + ". Thank you for booking your flight with " +
                fb.getFlightCompany() + ".\n Following are the details of your booking and the trip:" + "\n" +
                "Ticket Number: " + fb.getTicketNumber() + "\n" +
                "From " + fb.getTripSource() + " to " + fb.getTripDestination() + "\n" +
                "Date of departure: " + fb.getDepartureDate() + "\n" +
                "Date of return: " + fb.getReturnDate() + "\n" +
                "Total passengers: " + fb.getTotalPassengers() + "\n" +
                "Total ticket price in Euros: " + fb.getTotalTicketPrice());
    }
}