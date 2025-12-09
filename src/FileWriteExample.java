import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        String filename = "assignment_output.txt";
        String content = "This is a test.";

        // Use try-with-resources to automatically close the FileWriter
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
            System.out.println("Successfully written to " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
