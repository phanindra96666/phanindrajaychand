/*Create a java application where we have one Mobile Manufacturing Company, 
they will design a respective branded mobile with specifications like 
RAM, ROM, OS Name, OS Version, Camera, Processor, Battery, Display Type, and price then,
this mobile will be released into the wholesale market then the price has to increase, 
from here it will be released into the retail market again price has to increase then 
from here this mobile will be purchased by the customer, customer has to display all 
these values with updated price with respect to one user-defined method and then invoke 
display method under the main method. (Apple.java)
*/

import java.util.Scanner;

class Mobile {
    static Scanner sc = new Scanner(System.in);
 
        int ram = sc.nextInt();
        String rom = sc.nextLine();
        String osName = sc.nextLine();
        String osVersion = sc.nextLine();
        String camera = sc.nextLine();
        String processor = sc.nextLine();
        String battery = sc.nextLine();
        String displayType = sc.next();
        int price = sc.nextInt();

}

class Wholesale extends Mobile {
    void increaseWholesalePrice(){
        price += 1000;
    }
}

class Retail extends Wholesale{
    void increaseRetailPrice(){
        price += 5000;
    }
}

class Customer extends Retail {
    void viewDetails() {
        System.out.println("RAM: " + ram + " GB");
        System.out.println("ROM: " + rom);
        System.out.println("OS Name: " + osName);
        System.out.println("OS Version: " + osVersion);
        System.out.println("Camera: " + camera);
        System.out.println("Processor: " + processor);
        System.out.println("Battery: " + battery);
        System.out.println("Display Type: " + displayType);
        System.out.println("Final Price: "+ price);
    }
}
class test{
    public static void main(String[] args) {
        Customer obj = new Customer();
        obj.increaseWholesalePrice();
        obj.increaseRetailPrice();
        obj.viewDetails();  
    }
}
