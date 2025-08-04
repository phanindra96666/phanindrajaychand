public class characterOrder {

    public static void main(String[] args) {
        String input = "zebra apple Mango banana orange";
        sortWordsAlphabetically(input);
    }

    public static void sortWordsAlphabetically(String str) {
        String[] words = str.split(" ");

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - 1 - i; j++) {
                if (words[j].compareToIgnoreCase(words[j + 1]) > 0) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
