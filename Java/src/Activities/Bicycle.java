package Activities;
public class Bicycle implements BicycleParts, BicycleOperations {

    // Instance variables
    protected int gears;
    protected int currentSpeed;

    // Constructor
    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

    // Implementation of applyBrake
    public void applyBrake(int decrement) {
        currentSpeed -= decrement;
        if (currentSpeed < 0) currentSpeed = 0;
        System.out.println("Applied brake. Current speed: " + currentSpeed + " km/h");
    }

    // Implementation of speedUp
    public void speedUp(int increment) {
        currentSpeed += increment;
        if (currentSpeed > maxSpeed) currentSpeed = maxSpeed;
        System.out.println("Sped up. Current speed: " + currentSpeed + " km/h");
    }

    // Description of the bicycle
    public String bicycleDesc() {
        return "No of gears are " + gears + "\nSpeed of bicycle is " + maxSpeed;
    }
}
/*//Base class 
class Bicycle implements BicycleParts, BicycleOperations {

public int gears;
public int currentSpeed;

//the Bicycle class has one constructor
public Bicycle(int gears, int currentSpeed) {
    this.gears = gears;
    this.currentSpeed = currentSpeed;
}

//Bicycle class has three methods
public void applyBrake(int decrement) {
    currentSpeed -= decrement;
    System.out.println("Current speed: " + currentSpeed);
}

public void speedUp(int increment) {
    currentSpeed += increment;
    System.out.println("Current speed: " + currentSpeed);
}

//Method to print info of Bicycle
public String bicycleDesc() {
    return("No of gears are "+ gears + "\nSpeed of bicycle is " + maxSpeed);
}
}*/