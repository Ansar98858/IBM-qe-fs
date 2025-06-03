package Activities;
import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        // Create an ArrayList of type String
        ArrayList<String> myList = new ArrayList<>();

        // Add 5 names to the ArrayList
        myList.add("Ansar");
        myList.add("Thanusha");
        myList.add("Sruthi");
        myList.add("Jainabee");
        myList.add("Thahaleel");

        // Print all names using a for loop
        System.out.println("All names in the list:");
        for (String name : myList) {
            System.out.println(name);
        }

        // Retrieve the 3rd name (index 2)
        String thirdName = myList.get(2);
        System.out.println("\n3rd name in the list: " + thirdName);

        // Check if a name exists in the list
        String nameToCheck = "Ansar";
        if (myList.contains(nameToCheck)) {
            System.out.println("\nThe name \"" + nameToCheck + "\" exists in the list.");
        } else {
            System.out.println("\nThe name \"" + nameToCheck + "\" does not exist in the list.");
        }

        // Print the number of names in the list
        System.out.println("\nTotal names in the list: " + myList.size());

        // Remove a name from the list
        myList.remove("Sruthi");
        System.out.println("\n\"Sruthi\" removed from the list.");

        // Print the updated size of the list
        System.out.println("Updated total names in the list: " + myList.size());
    }
}
