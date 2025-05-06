import java.util.Scanner;
public class PrintDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String inpu1 = sc.nextLine();
        String sDate [] = input.split(":");
        String eDate [] = inpu1.split(":");
        int date = Integer.parseInt(sDate[0]);
        int month = Integer.parseInt(sDate[1]);
        int year = Integer.parseInt(sDate[2]);

        int datee = Integer.parseInt(eDate[0]);
        int monthe = Integer.parseInt(eDate[1]);
        int yeare = Integer.parseInt(eDate[2]);

        




    }
}
