public class UniqueWords { 
    public static void main(String[] args) {
        String text = " apple banana apple orange mango banana pear ";
        // String[] words = text.split(" ");
        // String small = words[0];
        // System.out.println("Unique words:");
        // for (int i = 0; i < words.length; i++) {
        //     int count = 0;
        //     for (int j = 0; j < words.length; j++) {
        //         if (words[i].equals(words[j])) {
        //             count++;
        //         }
        //     }
        //     if (count == 1) {
        //         if(small.length()>words[i].length()){
        //             small = words[i];
        //         }
        //         System.out.println(words[i]);
        //     }
        // }
        // System.out.println("Small : "+small);

        String ans = text;
        while (text.trim().length()>0) {
            int a = text.indexOf(" ",1);
            String w = text.substring(0,a+1);
            if (text.indexOf(w,1) == -1) { // unique
                if (ans.length()>w.length()) {
                    ans = w;
                }
            }
            while (text.contains(w)) {
                text = text.replace(w," ");
            }
        }
        System.out.print(ans);
    }
}
