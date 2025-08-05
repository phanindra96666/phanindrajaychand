import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class f2 {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\phani\\OneDrive\\Desktop\\first.txt";  
        String outputFilePath = "C:\\Users\\phani\\OneDrive\\Desktop\\Second.txt";

        try {
            File inputFile = new File(inputFilePath);
            Scanner scanner = new Scanner(inputFile);

            PrintWriter writer = new PrintWriter(outputFilePath);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                writer.println(line);
            }

            scanner.close();
            writer.close();

            System.out.println("File copied successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
