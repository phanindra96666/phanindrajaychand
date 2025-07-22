public class PasswordValidator {
    public static void main(String[] args) {
        String[] passwords = {
            "Abc@1234X",
            "abc@1234x",
            "Abc123456",
            "ABC@1234X",
            "Ab@1xyz9#"
        };

        for (String password : passwords) {
            System.out.println("Password: " + password);
            if (isValidPassword(password)) {
                System.out.println("Perfect Password\n");
            } else {
                System.out.println("Not a Perfect Password\n");
            }
        }
    }

    public static boolean isValidPassword(String password) {
        if (password.length() != 9) return false;

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } 
            else if (Character.isLowerCase(ch)) {
                hasLower = true;
            } 
            else if (Character.isDigit(ch)) {
                hasDigit = true;
            } 
            else if (!Character.isWhitespace(ch)) {
                hasSpecial = true;
            } 
            
            if (hasUpper && hasLower && hasDigit && hasSpecial) {
                break;
            }
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}
