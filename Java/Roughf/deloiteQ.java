public class deloiteQ {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String input = "programming";
        String ref = "grm";
        char [] ch = input.toCharArray();
        for(char c :ch){
            if (ref.indexOf(c) == -1) {
                sb.append(c);
            }
        }
        System.out.println("Result: " + sb.toString());
        }
}