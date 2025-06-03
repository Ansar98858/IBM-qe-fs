package Activities;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date takeOffTime;
    private Date lastTimeLanded;

    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    public void onboard(String passengerName) {
        if (passengers.size() < maxPassengers) {
            passengers.add(passengerName);
        } else {
            System.out.println("Plane is full. Cannot add more passengers.");
        }
    }

    public Date takeOff() {
        takeOffTime = new Date();
        return takeOffTime;
    }

    public void land() {
        lastTimeLanded = new Date();
        passengers.clear(); // passengers disembark
    }

    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    public List<String> getPassengers() {
        return passengers;
    }
}
