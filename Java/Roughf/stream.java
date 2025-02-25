import java.util.List;
import java.util.stream.Collectors;

public class stream {
    public static void main(String[] args) {
        List<String>names = List.of("Alice","Bob","Andrew","John");
        List<String> result = names.stream()
        .filter(name -> name.startsWith("A"))
        .collect(Collectors.toList());
        System.out.println(result);
    }
}