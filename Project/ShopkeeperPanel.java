import java.util.Scanner;

public class ShopkeeperPanel {
    private final Scanner sc = new Scanner(System.in);
    private final ShopInventory inventory = new ShopInventory();

    public void open() {
        int x=0;
        do {
            System.out.println("\n===== Shopkeeper Menu =====");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Remove Product");
            System.out.println("4. Logout");
            System.out.print("Enter your choice: ");
            //choice = sc.nextInt();
            String input = Main.scanner.next();
            //int x = 0;
            if(Main.isNumeric(input)){
                x = Integer.parseInt(input);
            }
            else{
                System.out.println("Invalid input please enter valid");
                open();
            }
            sc.nextLine();

            switch (x) {
                case 1 -> {
                    System.out.print("Enter product name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    inventory.addProduct(name, qty, price);
                }

                case 2 -> {
                    System.out.print("Enter product name to update: ");
                    String name = sc.nextLine();
                    System.out.print("Enter new quantity: ");
                    int qty = sc.nextInt();
                    System.out.print("Enter new price: ");
                    double price = sc.nextDouble();
                    inventory.updateProduct(name, qty, price);
                }

                case 3 -> {
                    System.out.print("Enter product name to remove: ");
                    String name = sc.nextLine();
                    if (inventory.removeProduct(name)) {
                        System.out.println("Product removed.");
                    } else {
                        System.out.println("Product not found.");
                    }
                }

                case 4 -> {
                    System.out.println("Logging out...");
                    AfterShopLogin.afterShopLogin();
                }

                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (x != 4);
    }
}
