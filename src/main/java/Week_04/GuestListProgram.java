package Week_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

    public class GuestListProgram {
        public static void main(String[] args) {
            // Step 1: Create an empty list to store guest names
            ArrayList<String> guestList = new ArrayList<>();

            // Step 2: Use a while loop to ask the user for guest names
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the names of guests (press Enter to stop):");

            while (true) {
                System.out.print("Guest name: ");
                String name = scanner.nextLine().trim(); // Read input and remove extra spaces

                // If the user presses Enter without typing a name, stop the loop
                if (name.isEmpty()) {
                    break;
                }

                // Reject duplicate names
                if (!guestList.contains(name)) {
                    guestList.add(name); // Add the name to the list if it's not a duplicate
                    System.out.println(name + " added to the guest list.");
                } else {
                    System.out.println(name + " is already in the guest list. Skipping...");
                }
            }

            // Step 3: Sort the names in alphabetical order
            Collections.sort(guestList);

            // Step 4: Print all the names entered
            System.out.println("\nGuest List (Sorted):");
            for (String guest : guestList) {
                System.out.println(guest);
            }

            // Step 5: Ask the user if they would like to delete any names
            System.out.println("\nWould you like to delete any names? (yes/no)");
            String response = scanner.nextLine().trim().toLowerCase();

            while (response.equals("yes")) {
                System.out.print("Enter the name to delete: ");
                String nameToDelete = scanner.nextLine().trim();

                if (guestList.contains(nameToDelete)) {
                    guestList.remove(nameToDelete); // Remove the name from the list
                    System.out.println(nameToDelete + " has been removed from the guest list.");
                } else {
                    System.out.println(nameToDelete + " is not in the guest list.");
                }

                System.out.println("\nWould you like to delete another name? (yes/no)");
                response = scanner.nextLine().trim().toLowerCase();
            }

            // Step 6: Print all the names again after deletions
            System.out.println("\nUpdated Guest List:");
            for (String guest : guestList) {
                System.out.println(guest);
            }

            // Step 7: Print the total number of guests
            System.out.println("\nTotal number of guests: " + guestList.size());

            // Step 8: Select a guest at random to win a prize
            if (!guestList.isEmpty()) {
                // Use Collections.shuffle to randomize the list and pick the first guest
                Collections.shuffle(guestList);
                String winner = guestList.get(0);
                System.out.println("\nCongratulations to " + winner + "! You win a prize!");
            } else {
                System.out.println("\nNo guests in the list to select a winner.");
            }

            // Close the scanner
            scanner.close();
        }
    }

