import java.util.*;
public class switc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int button = in.nextInt();

        // if(button==1){
        //     System.out.print("Red");
        // }
        // else if(button==2){
        //     System.out.print("Green");
        // }
        // else if(button==3){
        //     System.out.print("Blue");
        // }
        // else{
        //     System.out.print("Incorrect");
        // }
        switch(button){
            case 1 : System.out.print("Hello");
            break;
            case 2: System.out.print("Hi");
            break;
            case 3: System.out.print("What");
            break;
            default : System.out.print("Nothing");
        }
        in.close();
    }
    
}
