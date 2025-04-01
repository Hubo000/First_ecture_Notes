package Week_03;
import java.util.Scanner; // Import Scanner for user input

public class HelloMethods {

    // This is the main method – the first code to run
    public static void main(String[] args) {
        String name = stringInput("Please enter your name:");
        String greeting = makeGreeting(name);
        System.out.println(greeting);
    } // End of main method

    // Custom input method for reading string input
    public static String stringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }

    // A new method that I have created
    public static String makeGreeting(String n) {
        String greeting = "Hello " + n + "!";
        return greeting;
    } // End of makeGreeting method
} // End of HelloMethods class
