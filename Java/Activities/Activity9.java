package activities;

import java.util.ArrayList;

public class Activity9 {

    public static void main(String[] args) {
        // Create an ArrayList of type String
        ArrayList<String> myList = new ArrayList<>();

        // Add 5 names to the ArrayList using add() method
        myList.add("John");
        myList.add("Emily");
        myList.add("David");
        myList.add("Sarah");
        myList.add("Michael");

        // Print all the names using a for loop
        System.out.println("All names in the ArrayList:");
        for (String name : myList) {
            System.out.println(name);
        }

        // Retrieve the 3rd name in the ArrayList using get() method
        String thirdName = myList.get(2);
        System.out.println("The 3rd name in the ArrayList: " + thirdName);

        // Check if a name exists in the ArrayList using contains() method
        String searchName = "Sarah";
        if (myList.contains(searchName)) {
            System.out.println(searchName + " exists in the ArrayList.");
        } else {
            System.out.println(searchName + " does not exist in the ArrayList.");
        }

        // Print the number of names in the ArrayList using size() method
        System.out.println("Number of names in the ArrayList: " + myList.size());

        // Remove a name from the list using remove() method
        String removeName = "David";
        myList.remove(removeName);
        System.out.println("After removing " + removeName + ", the number of names in the ArrayList: " + myList.size());
    }
}

