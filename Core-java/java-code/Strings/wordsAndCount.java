public class wordsAndCount {
    public static void main(String[] args) {
        String text = "hi jjmm hi hi jj ww kk ee ww kk";
        String[] words = text.split(" ");
        System.out.println("Duplicate words and their counts:");

        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }

            if (count > 1) {
                boolean alreadyPrinted = false;
                for (int k = 0; k < i; k++) {
                    if (words[i].equals(words[k])) {
                        alreadyPrinted = true;
                        break;
                    }
                }

                if (!alreadyPrinted) {
                    System.out.println(words[i] + " " + count);
                }
            }
        }
    }
}
