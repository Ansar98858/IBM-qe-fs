package Activities;

public class Activity1 {
    public static void main(String[] args) {
        // Create Car object
        car myCar = new car();

        // Set values
        myCar.make = 2014;
        myCar.color = "Black";
        myCar.transmission = "Manual";

        // Call methods
        myCar.displayCharacteristics();
        myCar.accelarate();
        myCar.brake();
    }
}


