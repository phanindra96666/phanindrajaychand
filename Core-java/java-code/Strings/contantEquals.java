public class contantEquals {
    public static void main(String[] args) {
        String a = "Room - 15";
        String b = "Room - 22"; // checks the actual value not the object reference
        System.out.println(a.contentEquals(b));
    }
    

}
