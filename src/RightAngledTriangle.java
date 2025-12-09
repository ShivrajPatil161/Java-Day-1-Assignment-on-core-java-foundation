import java.util.Scanner;

public class RightAngledTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows (N): ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            // Print stars for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // move to next row
        }

        sc.close();
    }
}
