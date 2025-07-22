public class Max_Characters {
    public static void main(String[] args) {
        String input = "phpaqutxp";
        System.out.println(reorderMaxCharFirst(input)); 
    }

    public static String reorderMaxCharFirst(String s) {
        // Map<Character, Integer> freqMap = new HashMap<>();

        // for (char c : s.toCharArray()) {
        //     freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        // }

        // char maxChar = 0;
        // int maxFreq = 0;
        // for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
        //     if (entry.getValue() > maxFreq) {
        //         maxFreq = entry.getValue();
        //         maxChar = entry.getKey();
        //     }
        // }
        int max = 0;
        char c = 0;
        for(int i = 0; i < s.length(); i++) {
            int count = 1;
            for(int j = i + 1; j < s.length(); j++) {
                if( s.charAt(i) == (s.charAt(j))) {
                    count++;
                }
            }
            if (max<count) {
                max = count;
                c = s.charAt(i);
            }
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < max; i++){
            res.append(c);
        }

        for(char ch : s.toCharArray()){
            if (ch != c) {
                res.append(ch);
            }
        }


        // StringBuilder result = new StringBuilder();

        // for (int i = 0; i < maxFreq; i++) {
        //     result.append(maxChar);
        // }

        // for (char c : s.toCharArray()) {
        //     if (c != maxChar) {
        //         result.append(c);
        //     }
        // }

        return res.toString();
    }
}
