import java.util.Scanner;

public class VowelCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int count = countVowels(input);

        System.out.println("Total vowels: " + count);

        sc.close();
    }

    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase(); // case-insensitive

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
}
