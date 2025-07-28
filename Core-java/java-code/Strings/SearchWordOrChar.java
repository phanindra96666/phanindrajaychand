import java.util.Scanner;

public class SearchWordOrChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "I have 100 kilogram of gold";
        System.out.print("Enter word or character to search: ");
        String input = sc.nextLine();

        if (str.contains(" "+input+" ")) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }
}
