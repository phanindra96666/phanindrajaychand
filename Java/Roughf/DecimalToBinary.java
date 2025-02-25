public class DecimalToBinary {
    public static void main(String[] args) {
        int decimalNumber = 15; 
        String binaryString = Integer.toBinaryString(decimalNumber);
        int binaryAsInt = Integer.parseInt(binaryString);
        
        System.out.println("Decimal: " + decimalNumber);
        System.out.println("Binary: " + binaryAsInt);
        int result=0;
        while (binaryAsInt!=0){
            result+=binaryAsInt%10;
            binaryAsInt/=10;
        }
        System.out.println(result);
    }
}