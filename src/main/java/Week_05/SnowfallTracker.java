package Week_05;

import java.util.HashMap;
import java.util.Map;

public class SnowfallTracker {
    public static void main(String[] args) {
        // Create a HashMap to store snowfall data
        Map<String, Double> snowfall = new HashMap<>();

        // Add initial data
        snowfall.put("January", 3.1);
        snowfall.put("February", 10.8);

        // Step 1: Add data for March and April
        snowfall.put("March", 4.1);
        snowfall.put("April", 0.0);

        // Step 2: Print all the data (months and amounts), one entry per line
        System.out.println("Snowfall Data:");
        for (Map.Entry<String, Double> entry : snowfall.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " inches");
        }

        // Step 3: Check if the data is in order
        System.out.println("\nIs the data in order?");
        System.out.println("No, the data is not in order. HashMaps do not maintain insertion order.");
        System.out.println("This is okay because HashMaps are designed for fast lookups by key, not for maintaining order.");

        // Step 4: Calculate and display the total snowfall
        double totalSnowfall = 0.0;
        for (double amount : snowfall.values()) {
            totalSnowfall += amount;
        }
        System.out.println("\nTotal snowfall: " + totalSnowfall + " inches");
    }
}
