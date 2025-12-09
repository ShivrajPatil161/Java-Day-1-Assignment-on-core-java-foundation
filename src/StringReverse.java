import java.util.Scanner;

public class StringReverse {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string : ");
        String str = sc.nextLine();

        StringBuilder rev = new StringBuilder();

        for (int i = str.length()-1 ; i>=0; i--) {
            rev.append(str.charAt(i));
        }
        System.out.println(rev.toString());
    }
}
