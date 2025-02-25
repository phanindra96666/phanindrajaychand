import java.text.SimpleDateFormat;
import java.util.Date;

public class SpecificDate {
    public static void main(String[] args) {
        String pattern = "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        Date date = new Date();
        String formattedDate = simpleDateFormat.format(date);
        System.out.println(formattedDate); 
    }
}