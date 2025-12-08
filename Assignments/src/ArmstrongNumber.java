import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

        sc.close();
    }

    public static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        int digits = String.valueOf(n).length(); // number of digits

        while (n > 0) {
            int digit = n % 10;      // get last digit
            sum += Math.pow(digit, digits); // raise to power of digits
            n /= 10;                 // remove last digit
        }

        return sum == original;
    }
}
