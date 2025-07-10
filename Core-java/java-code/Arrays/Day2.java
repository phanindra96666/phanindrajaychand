import java.util.Scanner;

public class Day2 {
    public static int toDecimal(String value, int fromBase) {
        int decimalValue = 0;
        int power = 1; 
        for (int i = value.length() - 1; i >= 0; i--) {
            char c = value.charAt(i);
            int digit;
            if (Character.isDigit(c)) {
                digit = c - '0';
            } 
            else {
                digit = c - 'A' + 10;
            } 
            decimalValue += digit * power;
            power *= fromBase;
        }
        return decimalValue;
    }

    public static String fromDecimal(int decimalValue, int toBase) {
        if (decimalValue == 0) {
            return "0";
        }
        String bin = "";
        while (decimalValue > 0) {
            int remainder = decimalValue % toBase;
            if (remainder < 10) {
                bin = remainder + bin;
            } 
            else {
                bin = (char)(remainder + 55) + bin;
            }
            decimalValue /= toBase;
        }
        return bin;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String value1 = sc.nextLine(); // 1325
        int base1 = Integer.parseInt(sc.nextLine());//6

        String value2 = sc.nextLine();//11A
        int base2 = Integer.parseInt(sc.nextLine());//12

        int targetBase = Integer.parseInt(sc.nextLine());//18

        int num1 = toDecimal(value1, base1);
        int num2 = toDecimal(value2, base2);

        System.out.println(num1);//314
        System.out.println(num2);//166
        int sum = num1 + num2;

        String result = fromDecimal(sum, targetBase);

        System.out.println(result);
    }
}