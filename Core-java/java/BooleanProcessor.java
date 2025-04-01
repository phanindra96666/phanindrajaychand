import java.util.Scanner;
public class BooleanProcessor {
    public void processBooleanInput(boolean input) {
        if (input) {
            System.out.println("You entered: true");
        } else {
            System.out.println("You entered: false");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean userInput = scanner.nextBoolean();  
        BooleanProcessor processor = new BooleanProcessor();     
        processor.processBooleanInput(userInput);
        scanner.close();
    }
}
