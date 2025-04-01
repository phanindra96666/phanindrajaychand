public class TypeCasting {
    public static void main(String[] args) {
        int num = 100; // int to long
        long longNum = num;
        System.out.println(longNum);

        double pi = 3.14159; //double to int
        int intPi = (int) pi;
        System.out.println(intPi);

        char letter = '7'; // char to int
        int asciiValue = letter-'0';
        System.out.println(asciiValue);

        double largeDecimal = 9.87654321; //double to float
        float smallDecimal = (float) largeDecimal;
        System.out.println(smallDecimal);

        float floatNum = 3.14f; //float to double
        double doubleNum = floatNum;
        System.out.println(doubleNum);

        short shortNum = 12345;
        int intFromShort = shortNum; //short to int
        System.out.println(intFromShort);

        byte byteNum = 100;
        short shortFromByte = byteNum; //byte to short
        System.out.println(shortFromByte);

        long bigLong = 9876543210L;
        int intFromLong = (int) bigLong; //long to int
        System.out.println(intFromLong);

        double decimalValue = 99.99;
        long longFromDouble = (long) decimalValue; // double to long
        System.out.println(longFromDouble);

        byte byteValue = (byte) 3; //int to byte
        System.out.println(byteValue);

        char charFromInt = (char) 65; // int to char
        System.out.println(charFromInt);
    }
}


//Auto-Typecasting
//byte->short->int->long->float->double
//char->int->long->float->double