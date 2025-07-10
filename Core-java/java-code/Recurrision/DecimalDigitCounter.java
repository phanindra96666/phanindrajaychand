public class DecimalDigitCounter {
    public static void main(String[] args) {
        double number = 123.45678;
        int count = 0;
        while (number != Math.floor(number)) {
            number *= 10;
            System.out.println(number);
            count++;
        }

        System.out.println("Digits after decimal: " + count);
    }
}
