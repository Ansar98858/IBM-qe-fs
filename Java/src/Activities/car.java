package Activities;

public class car {
    // Variables
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    // Constructor initializing tires and doors to 4
    public car() {
        tyres = 4;
        doors = 4;
    }

    // Method to display all characteristics
    public void displayCharacteristics() {
        System.out.println("Car Make: " + make);
        System.out.println("Color: " + color);
        System.out.println("Transmission: " + transmission);
        System.out.println("Tyres: " + tyres);
        System.out.println("Doors: " + doors);
    }

    // Method to simulate acceleration
    public void accelarate() {
        System.out.println("Car is moving forward.");
    }

    // Method to simulate braking
    public void brake() {
        System.out.println("Car has stopped.");
    }
}