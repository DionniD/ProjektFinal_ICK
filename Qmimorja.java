import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Price {
    private LocalTime arrivalTime;

    public Qmimorja(String arrivalTime) {
        DateTimeFormatter formatofTime = DateTimeFormatter.ofPattern("HH:mm");
        this.arrivalTime = LocalTime.parse(arrivalTime, formatofTime);
    }

    public double (String exitTime) {
        LocalTime exitTimeDt = LocalTime.parse(exitTime);
        long diferenceTime = this.arrivalTime.until(exitTimeDt, ChronoUnit.HOURS);
        double totalPrice = diferenceTime * 1.5; 
        return totalPrice;
    }
}
