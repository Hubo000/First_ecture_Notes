package Week_05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RoadTripPlanner {
    public static void main(String[] args) {
        // Step 1: Create a HashMap to store distances from Minneapolis
        Map<String, Integer> distanceFromMinneapolis = new HashMap<>();

        // Step 2: Add the example data to the HashMap
        distanceFromMinneapolis.put("Duluth", 154);
        distanceFromMinneapolis.put("Brainerd", 127);
        distanceFromMinneapolis.put("Stillwater", 26);
        distanceFromMinneapolis.put("Ely", 245);
        distanceFromMinneapolis.put("Red Wing", 54);

        // Step 3: Get the maximum driving distance from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum distance you want to drive on your road trip (in miles): ");
        int maxDrivingDistance = scanner.nextInt();

        // Step 4: Find and display cities within the driving range
        System.out.println("\nCities within your driving range:");
        boolean foundCities = false;

        for (Map.Entry<String, Integer> cityData : distanceFromMinneapolis.entrySet()) {
            String city = cityData.getKey();
            int drivingDistance = cityData.getValue();

            if (drivingDistance <= maxDrivingDistance) {
                System.out.println(city + " (" + drivingDistance + " miles)");
                foundCities = true;
            }
        }

        // Step 5: Handle case where no cities are within range
        if (!foundCities) {
            System.out.println("Sorry, no Minnesota cities are within your driving range.");
        }

        // Close the scanner
        scanner.close();
    }
}