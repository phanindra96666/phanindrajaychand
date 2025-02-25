public class stringreplace {
    public static void main(String[] args) {
        String str = "My-name-is-phani";
        int hyphenCount = 0;
        for (char c : str.toCharArray()) {
            if (c == '-') {
                hyphenCount++;
            }
        }
        String modifiedStr = str.replace("-", "");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < hyphenCount; i++) {
            result.append('-');
        }
        result.append(modifiedStr);
        System.out.println(result.toString());
    }
}
