public class wow {
    public static void main(String[] args) {
        String s = "red yellow blue pink red purple lavender violet green grey green lavender red yellow orange pink magenta blue blue green indigo magenta green grey yellow white red white blue red violet";

        int totalCount = 0;

        while (!s.trim().isEmpty()) {
            String[] parts = s.trim().split(" ");
            String firstWord = parts[0];

            int count = 0;
            StringBuilder sb = new StringBuilder();

            for (String word : parts) {
                if (word.equals(firstWord)) {
                    count++;
                } else {
                    sb.append(word).append(" ");
                }
            }

            s = sb.toString().trim(); 
            totalCount += count;

            System.out.println(firstWord + ", Count: " + count);
        }

        System.out.println("Total words removed: " + totalCount);
        System.out.println("String is:"+s);
    }
}
