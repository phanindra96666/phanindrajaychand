public class Password_Checker {

    public static String checkPasswordStrength(String password) {
        if (password.length() < 8) {
            return "Password is not greater than 8 characters.Please enter password length greater than 8";
        } else {
            boolean hasSpecialChar = password.matches(".*[!@#$%^&*()_?><,./';\\[\\]{}~].*");
            boolean hasNumber = password.matches(".*\\d.*");

            if (hasSpecialChar && hasNumber) {
                return "Your password is strong.";
            } else if (!hasSpecialChar) {
                return "Your password does not contain any special characters.";
            } else {
                return "Your password does not contain any numbers.";
            }
        }
    }
}
