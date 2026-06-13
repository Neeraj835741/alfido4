import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filehandling {
    public static void main(String[] args) {

        String fileName = "student.txt";

        try {
            // Writing to file
            FileWriter writer = new FileWriter(fileName);
            writer.write("Name: Neeraj Kumar\n");
            writer.write("Course: Java Programming\n");
            writer.write("Roll No: 199\n");
            writer.close();

            System.out.println("Data written successfully.\n");

            // Reading from file
            FileReader reader = new FileReader(fileName);

            int character;
            System.out.println("Reading file contents:");

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}