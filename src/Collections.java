import java.util.ArrayList;

public class Collections {
    public static void main(String[] args) {
        // Create ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();

        // Add five names
        names.add("Sarah");
        names.add("John");
        names.add("Steve");
        names.add("Alice");
        names.add("Samantha");

        // Iterate using foreach loop and print names starting with 'S'
        System.out.println("Names starting with 'S':");
        for (String name : names) {
            if (name.startsWith("S")) {
                System.out.println(name);
            }
        }
    }
}
