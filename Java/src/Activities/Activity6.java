package Activities;
public class Activity6 {
    public static void main(String[] args) {
        // Create plane object with max 10 passengers
        Plane plane = new Plane(10);

        // Add passengers
        plane.onboard("Alice");
        plane.onboard("Bob");
        plane.onboard("Charlie");

        // Take off and print time
        System.out.println("Plane took off at: " + plane.takeOff());

        // Print list of passengers onboard
        System.out.println("Passengers onboard: " + plane.getPassengers());

        try {
            // Simulate flight time with 5-second pause
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Land the plane and print landing time
        plane.land();
        System.out.println("Plane landed at: " + plane.getLastTimeLanded());
    }
}
