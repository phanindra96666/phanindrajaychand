import java.util.Scanner;

class NewConversion3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int base1 = in.nextInt();
        String num1 = in.next();
        int dec1 = convertToDecimal(num1, base1);
        if (dec1 == -1){
            return;
        }

        int base2 = in.nextInt();
        String num2 = in.next();
        int dec2 = convertToDecimal(num2, base2);
        if (dec2 == -1){
            return;
        }

        int total = dec1 + dec2;

        int resultBase = in.nextInt();
        String converted = convertFromDecimal(total, resultBase);
        System.out.println(converted);
    }

    static int convertToDecimal(String num, int base) { 
        int decimal = 0;
        int p = 0;
        for (int i = num.length() - 1; i >= 0; i--) { 
            char ch = num.charAt(i);
            int digit = 0;
            if (ch >= '0' && ch <= '9'){
                digit = ch - 48; 
            }
            else if (ch >= 'a' && ch <= 'z'){
                digit = ch - 87;
            } 
            else if (ch >= 'A' && ch <= 'Z'){
                digit = ch - 55;
            }            
            else {
                return -1;
            }
            if (digit >= base) {
                return -1;
            } 
            decimal += digit * Math.pow(base, p);
            p++;
        }
        return decimal;
    }

    static String convertFromDecimal(int decimal, int base) {
        if (decimal == 0) {
            return "0";
        }
        String result = "";
        while (decimal > 0) {
            int r = decimal % base;
            if (r < 10) {
                result = r + result;
            } else {
                result = (char) (r + 55) + result;
            }
            decimal /= base;
        }
        return result;
    }
}