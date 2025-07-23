public class WordIndex {
    public static void main(String[] args) {
        String str = "This java is a simple Java program java java";
        String word = "java";
        int len = word.length();

        String lowerStr = str.toLowerCase();  
        String lowerWord = word.toLowerCase(); 

        int fromIndex = 0;

        while (true) {
            int index = lowerStr.indexOf(lowerWord, fromIndex);
            if (index == -1) {
                break;
            }

            System.out.println("Found at index: " + index + "-" + (index + len));

            fromIndex = index + 1;
        }
    }
}
