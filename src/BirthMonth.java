import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birth month (1 - 12): ");
        // Input
        int birthMonth = scanner.nextInt();

        // Conditional Statement(s)
        if (birthMonth >= 1 && birthMonth <= 12) {
            // value in range, echo input
            System.out.println("Your birth month is: " + birthMonth);
        } else {
            // value not in range, output an error message
            System.out.println("You entered a wrong variable: " + birthMonth);
        }

        scanner.close(); // Closing the scanner
    }
}