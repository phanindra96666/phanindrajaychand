import java.util.Scanner;

class Insta {
    static Scanner sc = new Scanner(System.in);
    private String password;
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
}

class User {
    public void login(Insta obj) {
        System.out.println("Enter password:");
        String inputPassword = Insta.sc.next();
        if (inputPassword.equals(obj.getPassword())){
            System.out.println("Login successful");
        }
        else {
            System.out.println("Do you want to reset the password");
            String choice = Insta.sc.next();
            if (choice.equals("yes")){
                String newPassword = Insta.sc.next();
                obj.setPassword(newPassword);
                login(obj);
            }
            else{
                System.out.print("Byee");
            }
        }
    }
}
public class J008 {
    public static void main(String[] args) {
        Insta obj = new Insta();
        obj.setPassword(Insta.sc.next());
        User obj1 = new User();
        obj1.login(obj);
    }
}