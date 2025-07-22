public abstract class LoginHandler {
    protected String password;

    // Constructor to initialize password
    public LoginHandler(String password) {
        this.password = password;
    }

    // Abstract method to be implemented by subclasses
    public abstract boolean isLoginSuccessful(String pass);
}