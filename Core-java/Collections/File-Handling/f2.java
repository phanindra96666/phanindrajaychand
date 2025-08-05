import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class f2 {
    public static void main(String[] args) throws IOException { 
        try {
            File inputFile = new File("C:\\Users\\phani\\OneDrive\\Desktop\\first.txt");
            inputFile.createNewFile();
            FileWriter fw = new FileWriter(inputFile,true);
            fw.write("Hello");
            fw.write("\nHii");
            fw.flush();
            fw.close();
            Scanner scanner = new Scanner(inputFile);

            int lineCount = 0;
            int vowelCount = 0;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineCount++;  
                
                for (char c : line.toLowerCase().toCharArray()) {
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        vowelCount++;
                    }
                }
            }

            scanner.close();

            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of vowels: " + vowelCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
