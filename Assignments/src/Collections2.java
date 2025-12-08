import java.util.HashMap;
import java.util.Map;

public class Collections2 {
    public static void main(String[] args) {
        // Create a HashMap to store country-capital pairs
        HashMap<String, String> capitals = new HashMap<>();

        // Add three countries and their capitals
        capitals.put("USA", "Washington, D.C.");
        capitals.put("France", "Paris");
        capitals.put("Japan", "Tokyo");

        // Iterate through the map and print key-value pairs
        System.out.println("Country - Capital:");
        for (Map.Entry<String, String> entry : capitals.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
