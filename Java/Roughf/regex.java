import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class regex {
public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Phani",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("i am phanindra");
        boolean matchfound = matcher.find();
        if (matchfound) {
            System.out.println("Match found");
        }
        else{
            System.out.println("Not found");
        }
    }
}