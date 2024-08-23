public class Password_Checker {

    public static void checkPasswordStrength(String password) {
        if (password.length() < 8) {
            System.out.println("Password is not greater than 8 characters.");
        } else {
            boolean hasSpecialChar = password.matches(".*[!@#$%^&*()_?><,./';\\[\\]{}~].*");
            boolean hasNumber = password.matches(".*\\d.*"); // \d matches any digit

            if (hasSpecialChar) {
                if (hasNumber) {
                    System.out.println("Your password is strong.");
                } else {
                    System.out.println("Your password does not contain any numbers.");
                }
            } else {
                System.out.println("Your password does not contain any special characters.");
            }
        }
    }
}
