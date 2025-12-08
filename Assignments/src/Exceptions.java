import java.util.Scanner;

public class Exceptions {

    // Method to perform integer division
    public static int divide(int numerator, int denominator) {
        int result = 0;

        try {
            result = numerator / denominator;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        int num = sc.nextInt();

        System.out.print("Enter denominator: ");
        int denom = sc.nextInt();

        int result = divide(num, denom);

        // Only print result if denominator was not zero
        if (denom != 0) {
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}
