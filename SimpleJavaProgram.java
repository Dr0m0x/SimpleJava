import java.util.Scanner;

public class SimpleJavaProgram {
    public static void main(String[] args) {
        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Print a greeting message
        System.out.println("Hello, welcome to the simplest Java program!");

        // Ask for user's name
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        // Display the name entered
        System.out.println("Hello, " + name + "!");

        // Close the scanner
        scanner.close();
    }
}
