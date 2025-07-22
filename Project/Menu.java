import java.util.LinkedHashMap;
import java.util.Set;

//Items && cost
public class Menu {

    public static void gfs1() {
        // CV Gaming Zone
        System.out.println("┌───────────────────────────────────────────────────────────────────────────────┐");
        System.out.printf("|%45s                           |\n", "=== CV Gaming Zone ===");
        System.out.println("├───────────────────────────────────────────────────────────────────────────────┤");
        System.out.printf("| %-40s : ₹%-10s               |\n", "1. Call of Duty-Modern Warfare II", "3999");
        System.out.printf("| %-40s : ₹%-10s               |\n", "2. FIFA 24", "4499");
        System.out.printf("| %-40s : ₹%-10s               |\n", "3. Grand Theft Auto V", "2999");
        System.out.printf("| %-40s : ₹%-10s               |\n", "4. The Witcher 3: Wild Hunt", "2499");
        System.out.printf("| %-40s : ₹%-10s               |\n", "5. Minecraft", "1999");
        System.out.println("└───────────────────────────────────────────────────────────────────────────────┘");

        Buy.buyGfs1();
    }

    public static void gfs2() {    // Games
        System.out.println("┌───────────────────────────────────────────────────────────────────────────────┐");
        System.out.printf("│%63s                │\n", "=== Games ===");
        System.out.println("├───────────────────────────────────────────────────────────────────────────────┤");
        System.out.printf("│ %-40s : %-13s                      │\n", "1. Red Dead Redemption 2", "₹3499");
        System.out.printf("│ %-40s : %-13s                      │\n", "2. Assassin's Creed Valhalla", "₹3999");
        System.out.printf("│ %-40s : %-13s                      │\n", "3. Fortnite", "₹0 (Free)");
        System.out.printf("│ %-40s : %-13s                      │\n", "4. God of War: Ragnarok", "₹4999");
        System.out.printf("│ %-40s : %-13s                      │\n", "5. Cyberpunk 2077", "₹3799");
        System.out.println("└───────────────────────────────────────────────────────────────────────────────┘");
        Buy.buyGfs2();
    }


    public static void gfs3() {    // Lakme
        System.out.println("┌───────────────────────────────────────────────────────────────────────────────┐");
        System.out.printf("│%65s              │\n", "=== Lakme Products ===");
        System.out.println("├───────────────────────────────────────────────────────────────────────────────┤");
        System.out.printf("│ %-40s : ₹%-10s                        │\n", "1. Perfect Radiance Day Cream", "299");
        System.out.printf("│ %-40s : ₹%-10s                        │\n", "2. 9 to 5 Lip Color", "499");
        System.out.printf("│ %-40s : ₹%-10s                        │\n", "3. Eyeconic Kajal", "210");
        System.out.printf("│ %-40s : ₹%-10s                        │\n", "4. Makeup Primer", "700");
        System.out.printf("│ %-40s : ₹%-10s                        │\n", "5. Radiance Compact", "199");
        System.out.printf("│ %-40s : ₹%-10s                        │\n", "6. Insta Eye Liner", "130");
        System.out.printf("│ %-40s : ₹%-10s                        │\n", "7. Skin Gloss Gel Crème", "399");
        System.out.printf("│ %-40s : ₹%-10s                        │\n", "8. Sun Expert SPF 50 Lotion", "350");
        System.out.printf("│ %-40s : ₹%-10s                        │\n", "9. Argan Oil Serum Foundation", "750");
        System.out.printf("│ %-40s : ₹%-10s                        │\n", "10. Mousse Foundation", "600");
        System.out.println("└───────────────────────────────────────────────────────────────────────────────┘");
        Buy.buyGfs3();

    }

    public static void gfs4() {    // Ponds
        System.out.println("┌───────────────────────────────────────────────────────────────────────────────┐");
        System.out.printf("│%65s              │\n", "=== Pond's Products ===");
        System.out.println("├───────────────────────────────────────────────────────────────────────────────┤");
        System.out.printf("│ %-40s : ₹%-10s                        │\n", "1. Spot-less Fairness Cream", "250");
        System.out.printf("│ %-40s : ₹%-10s                        │\n", "2. Super Light Gel Moisturizer", "275");
        System.out.printf("│ %-40s : ₹%-10s                        │\n", "3. Bright Beauty Face Wash", "180");
        System.out.printf("│ %-40s : ₹%-10s                        │\n", "4. Age Miracle Night Cream", "599");
        System.out.printf("│ %-40s : ₹%-10s                        │\n", "5. Anti-Pollution Face Wash", "200");
        System.out.printf("│ %-40s : ₹%-10s                        │\n", "6. Micellar Water D-Toxx", "225");
        System.out.printf("│ %-40s : ₹%-10s                        │\n", "7. Moisturizing Cold Cream", "150");
        System.out.printf("│ %-40s : ₹%-10s                        │\n", "8. Men Oil Control Face Wash", "180");
        System.out.printf("│ %-40s : ₹%-10s                        │\n", "9. BB+ Cream", "299");
        System.out.printf("│ %-40s : ₹%-10s                        │\n", "10. Sunscreen SPF 50", "350");
        System.out.println("└───────────────────────────────────────────────────────────────────────────────┘");
        Buy.buyGfs4();
    }


    public static void gfs5() {    // Beauty & Nature
        System.out.println("┌───────────────────────────────────────────────────────────────────────────────┐");
        System.out.printf("│%65s              │\n", "=== Beauty Products ===");
        System.out.println("├───────────────────────────────────────────────────────────────────────────────┤");
        System.out.printf("│ %-40s : ₹%-10s                         │\n", "1. Lakme Radiance Cream", "299");
        System.out.printf("│ %-40s : ₹%-10s                         │\n", "2. Pond's Fairness Cream", "250");
        System.out.printf("│ %-40s : ₹%-10s                         │\n", "3. L'Oréal Crystal Gel Cream", "699");
        System.out.printf("│ %-40s : ₹%-10s                         │\n", "4. Neutrogena Water Gel", "549");
        System.out.printf("│ %-40s : ₹%-10s                         │\n", "5. Nivea Moisturizer", "249");
        System.out.println("└───────────────────────────────────────────────────────────────────────────────┘");
        Buy.buyGfs5();
    }




    public static void f1s1() {
        System.out.println("┌───────────────────────────────────────────────────────────────────────────────┐");
        System.out.printf("│%65s              │\n", "=== Style Clothing ===");
        System.out.println("├───────────────────────────────────────────────────────────────────────────────┤");

// Men's Clothing section
        System.out.printf("│%65s              │\n", "=== Men's Clothing ===");
        System.out.printf("│ %-45s : ₹%-10s │\n", "1. Slim Fit Formal Shirt", "899");
        System.out.printf("│ %-45s : ₹%-10s │\n", "2. Casual Polo T-Shirt", "699");
        System.out.printf("│ %-45s : ₹%-10s │\n", "3. Denim Jeans", "1,199");
        System.out.printf("│ %-45s : ₹%-10s │\n", "4. Cotton Chinos", "999");
        System.out.printf("│ %-45s : ₹%-10s │\n", "5. Leather Jacket", "3,499");
        System.out.println("├───────────────────────────────────────────────────────────────────────────────┤");

// Women's Clothing section
        System.out.printf("│%65s              │\n", "=== Women's Clothing ===");
        System.out.printf("│ %-45s : ₹%-10s │\n", "6. Floral Print Summer Dress", "1,299");
        System.out.printf("│ %-45s : ₹%-10s │\n", "7. High Waist Skinny Jeans", "1,199");
        System.out.printf("│ %-45s : ₹%-10s │\n", "8. Silk Saree", "2,999");
        System.out.printf("│ %-45s : ₹%-10s │\n", "9. Crop Top", "599");
        System.out.printf("│ %-45s : ₹%-10s │\n", "10. Long Overcoat", "2,499");
        System.out.println("├───────────────────────────────────────────────────────────────────────────────┤");

// Kid's Clothing section
        System.out.printf("│%65s              │\n", "=== Kid's Clothing ===");
        System.out.printf("│ %-45s : ₹%-10s │\n", "11. Cartoon Print T-Shirt", "399");
        System.out.printf("│ %-45s : ₹%-10s │\n", "12. Denim Shorts", "499");
        System.out.printf("│ %-45s : ₹%-10s │\n", "13. Frock for Girls", "799");
        System.out.printf("│ %-45s : ₹%-10s │\n", "14. Hooded Sweatshirt", "899");
        System.out.printf("│ %-45s : ₹%-10s │\n", "15. Party Wear Suit", "1,199");

        System.out.println("└───────────────────────────────────────────────────────────────────────────────┘");

        Buy.buyF1s1();
    }



    public static void f1s2() {

        System.out.println("┌───────────────────────────────────────────────────────────────────────────────┐");
        System.out.printf("│%65s              │\n", "=== Zudio Clothing Products ===");
        System.out.println("├───────────────────────────────────────────────────────────────────────────────┤");

// Men's Clothing
        System.out.printf("│%65s              │\n", "=== Men's Clothing ===");
        System.out.printf("│ %-45s : ₹%-10s │\n", "1. Casual T-Shirts", "499");
        System.out.printf("│ %-45s : ₹%-10s │\n", "2. Slim Fit Jeans", "999");
        System.out.printf("│ %-45s : ₹%-10s │\n", "3. Hooded Sweatshirt", "1,099");
        System.out.printf("│ %-45s : ₹%-10s │\n", "4. Formal Shirts", "899");
        System.out.printf("│ %-45s : ₹%-10s │\n", "5. Joggers", "849");

        System.out.println("├───────────────────────────────────────────────────────────────────────────────┤");

// Women's Clothing
        System.out.printf("│%65s              │\n", "=== Women's Clothing ===");
        System.out.printf("│ %-45s : ₹%-10s │\n", "6. Floral Print Tops", "699");
        System.out.printf("│ %-45s : ₹%-10s │\n", "7. Denim Jackets", "1,199");
        System.out.printf("│ %-45s : ₹%-10s │\n", "8. Anarkali Kurtis", "1,299");
        System.out.printf("│ %-45s : ₹%-10s │\n", "9. High Waist Jeans", "1,099");
        System.out.printf("│ %-45s : ₹%-10s │\n", "10. Maxi Dresses", "1,499");

        System.out.println("├───────────────────────────────────────────────────────────────────────────────┤");

// Kid's Clothing
        System.out.printf("│%65s              │\n", "=== Kid's Clothing ===");
        System.out.printf("│ %-45s : ₹%-10s │\n", "11. Cartoon Print T-Shirt", "399");
        System.out.printf("│ %-45s : ₹%-10s │\n", "12. Denim Shorts", "499");
        System.out.printf("│ %-45s : ₹%-10s │\n", "13. Frock for Girls", "799");
        System.out.printf("│ %-45s : ₹%-10s │\n", "14. Printed Hoodies", "899");
        System.out.printf("│ %-45s : ₹%-10s │\n", "15. Party Wear Outfits", "1,099");

        System.out.println("└───────────────────────────────────────────────────────────────────────────────┘");

        Buy.buyF1s2();
    }


        public static void f1s3() {
            System.out.println("┌───────────────────────────────────────────────────────────────────────────────┐");
            System.out.printf("│%65s              │\n", "=== H&M Clothing Products ===");
            System.out.println("├───────────────────────────────────────────────────────────────────────────────┤");

// Men's Clothing
            System.out.printf("│%65s              │\n", "=== Men's Clothing ===");
            System.out.printf("│ %-45s : ₹%-10s │\n", "1. Casual T-Shirts", "699");
            System.out.printf("│ %-45s : ₹%-10s │\n", "2. Slim Fit Jeans", "1,499");
            System.out.printf("│ %-45s : ₹%-10s │\n", "3. Hooded Sweatshirt", "1,799");
            System.out.printf("│ %-45s : ₹%-10s │\n", "4. Formal Shirts", "1,299");
            System.out.printf("│ %-45s : ₹%-10s │\n", "5. Cargo Pants", "1,599");

            System.out.println("├───────────────────────────────────────────────────────────────────────────────┤");

// Women's Clothing
            System.out.printf("│%65s              │\n", "=== Women's Clothing ===");
            System.out.printf("│ %-45s : ₹%-10s │\n", "6. Floral Print Tops", "899");
            System.out.printf("│ %-45s : ₹%-10s │\n", "7. Denim Jackets", "1,799");
            System.out.printf("│ %-45s : ₹%-10s │\n", "8. Wrap Skirts", "999");
            System.out.printf("│ %-45s : ₹%-10s │\n", "9. High Waist Jeans", "1,399");
            System.out.printf("│ %-45s : ₹%-10s │\n", "10. Maxi Dresses", "1,699");

            System.out.println("├───────────────────────────────────────────────────────────────────────────────┤");

// Kid's Clothing
            System.out.printf("│%65s              │\n", "=== Kid's Clothing ===");
            System.out.printf("│ %-45s : ₹%-10s │\n", "11. Cartoon Print T-Shirt", "399");
            System.out.printf("│ %-45s : ₹%-10s │\n", "12. Denim Shorts", "599");
            System.out.printf("│ %-45s : ₹%-10s │\n", "13. Frock for Girls", "899");
            System.out.printf("│ %-45s : ₹%-10s │\n", "14. Printed Hoodies", "1,099");
            System.out.printf("│ %-45s : ₹%-10s │\n", "15. Party Wear Outfits", "1,499");

            System.out.println("└───────────────────────────────────────────────────────────────────────────────┘");

            Buy.buyF1s3();
        }




        public static void f1s4(){
            System.out.println("┌───────────────────────────────────────────────────────────────────────────────┐");
            System.out.printf("│%65s              │\n", "=== Max Clothing Products ===");
            System.out.println("├───────────────────────────────────────────────────────────────────────────────┤");

// Men's Clothing
            System.out.printf("│%65s              │\n", "=== Men's Clothing ===");
            System.out.printf("│ %-45s : ₹%-10s │\n", "1. Casual T-Shirts", "549");
            System.out.printf("│ %-45s : ₹%-10s │\n", "2. Slim Fit Jeans", "1,099");
            System.out.printf("│ %-45s : ₹%-10s │\n", "3. Hooded Sweatshirt", "1,299");
            System.out.printf("│ %-45s : ₹%-10s │\n", "4. Formal Shirts", "949");
            System.out.printf("│ %-45s : ₹%-10s │\n", "5. Cargo Pants", "1,299");

            System.out.println("├───────────────────────────────────────────────────────────────────────────────┤");

// Women's Clothing
            System.out.printf("│%65s              │\n", "=== Women's Clothing ===");
            System.out.printf("│ %-45s : ₹%-10s │\n", "6. Floral Print Tops", "649");
            System.out.printf("│ %-45s : ₹%-10s │\n", "7. Denim Jackets", "1,999");
            System.out.printf("│ %-45s : ₹%-10s │\n", "8. Wrap Skirts", "899");
            System.out.printf("│ %-45s : ₹%-10s │\n", "9. High Waist Jeans", "1,099");
            System.out.printf("│ %-45s : ₹%-10s │\n", "10. Maxi Dresses", "1,299");

            System.out.println("├───────────────────────────────────────────────────────────────────────────────┤");

// Kid's Clothing
            System.out.printf("│%65s              │\n", "=== Kid's Clothing ===");
            System.out.printf("│ %-45s : ₹%-10s │\n", "11. Cartoon Print T-Shirt", "399");
            System.out.printf("│ %-45s : ₹%-10s │\n", "12. Denim Shorts", "499");
            System.out.printf("│ %-45s : ₹%-10s │\n", "13. Frock for Girls", "799");
            System.out.printf("│ %-45s : ₹%-10s │\n", "14. Printed Hoodies", "899");
            System.out.printf("│ %-45s : ₹%-10s │\n", "15. Party Wear Outfits", "1,099");

            System.out.println("└───────────────────────────────────────────────────────────────────────────────┘");

            Buy.buyF1s4();
        }






    public static void f1s5(){
        System.out.println("┌───────────────────────────────────────────────────────────────────────────────┐");
        System.out.printf("│%65s              │\n", "=== Pantaloons Clothing Products ===");
        System.out.println("├───────────────────────────────────────────────────────────────────────────────┤");

// Men's Clothing
        System.out.printf("│%65s              │\n", "=== Men's Clothing ===");
        System.out.printf("│ %-45s : ₹%-10s │\n", "1. Casual T-Shirts", "799");
        System.out.printf("│ %-45s : ₹%-10s │\n", "2. Slim Fit Jeans", "1,299");
        System.out.printf("│ %-45s : ₹%-10s │\n", "3. Polo T-Shirts", "699");
        System.out.printf("│ %-45s : ₹%-10s │\n", "4. Blazers", "3,299");
        System.out.printf("│ %-45s : ₹%-10s │\n", "5. Chinos", "999");

        System.out.println("├───────────────────────────────────────────────────────────────────────────────┤");

// Women's Clothing
        System.out.printf("│%65s              │\n", "=== Women's Clothing ===");
        System.out.printf("│ %-45s : ₹%-10s │\n", "6. Printed Kurtis", "1,099");
        System.out.printf("│ %-45s : ₹%-10s │\n", "7. Denim Jackets", "1,599");
        System.out.printf("│ %-45s : ₹%-10s │\n", "8. Palazzo Pants", "999");
        System.out.printf("│ %-45s : ₹%-10s │\n", "9. High Waist Jeans", "1,299");
        System.out.printf("│ %-45s : ₹%-10s │\n", "10. Maxi Dresses", "1,499");

        System.out.println("├───────────────────────────────────────────────────────────────────────────────┤");

// Kid's Clothing
        System.out.printf("│%65s              │\n", "=== Kid's Clothing ===");
        System.out.printf("│ %-45s : ₹%-10s │\n", "11. Cartoon Print T-Shirt", "499");
        System.out.printf("│ %-45s : ₹%-10s │\n", "12. Denim Shorts", "499");
        System.out.printf("│ %-45s : ₹%-10s │\n", "13. Party Dresses for Girls", "1,199");
        System.out.printf("│ %-45s : ₹%-10s │\n", "14. Printed Hoodies", "899");
        System.out.printf("│ %-45s : ₹%-10s │\n", "15. Ethnic Wear Sets", "1,399");

        System.out.println("└───────────────────────────────────────────────────────────────────────────────┘");

        Buy.buyF1s5();
    }//floor 1 completed

    public static void f2s1() {
        System.out.println("┌───────────────────────────────────────────────────────────────────────────────┐");
        System.out.printf("│%63s                    │\n", "=== McDonald's ===");
        System.out.println("├───────────────────────────────────────────────────────────────────────────────┤");

        System.out.printf("│ %-40s : ₹%-10s │\n", "1. Big Mac", "199");
        System.out.printf("│ %-40s : ₹%-10s │\n", "2. McChicken", "179");
        System.out.printf("│ %-40s : ₹%-10s │\n", "3. McSpicy Paneer", "189");
        System.out.printf("│ %-40s : ₹%-10s │\n", "4. McAloo Tikki", "59");
        System.out.printf("│ %-40s : ₹%-10s │\n", "5. Cheeseburger", "129");

        System.out.println("├───────────────────────────────────────────────────────────────────────────────┤");

        System.out.printf("│ %-40s : ₹%-10s │\n", "6. Chicken Kebab Wrap", "149");
        System.out.printf("│ %-40s : ₹%-10s │\n", "7. Veg Maharaja Mac Wrap", "199");
        System.out.printf("│ %-40s : ₹%-10s │\n", "8. Grilled Chicken Wrap", "169");

        System.out.println("├───────────────────────────────────────────────────────────────────────────────┤");

        System.out.printf("│ %-40s : ₹%-10s │\n", "9. French Fries", "99");
        System.out.printf("│ %-40s : ₹%-10s │\n", "10. Chicken Nuggets", "149");
        System.out.printf("│ %-40s : ₹%-10s │\n", "11. Veggie Strips", "109");
        System.out.printf("│ %-40s : ₹%-10s │\n", "12. Cheesy Bites", "129");

        System.out.println("├───────────────────────────────────────────────────────────────────────────────┤");

        System.out.printf("│ %-40s : ₹%-10s │\n", "13. Coca-Cola", "60");
        System.out.printf("│ %-40s : ₹%-10s │\n", "14. Fanta", "60");
        System.out.printf("│ %-40s : ₹%-10s │\n", "15. Sprite", "60");
        System.out.printf("│ %-40s : ₹%-10s │\n", "16. McCafe Coffee", "99");
        System.out.printf("│ %-40s : ₹%-10s │\n", "17. Iced Tea", "89");

        System.out.println("└───────────────────────────────────────────────────────────────────────────────┘");
        Buy.buyF2s1();
    }
    public static void f2s2() {
        System.out.println("┌───────────────────────────────────────────────────────────────────────────────┐");
        System.out.printf("│%63s                    │\n", "=== Cream Stone ===");
        System.out.println("├───────────────────────────────────────────────────────────────────────────────┤");

        System.out.printf("│%41s%-36s│\n", "", "=== Classic Flavors ===");
        System.out.printf("│ %-40s : ₹%-10s │\n", "1. Vanilla", "89");
        System.out.printf("│ %-40s : ₹%-10s │\n", "2. Chocolate", "89");
        System.out.printf("│ %-40s : ₹%-10s │\n", "3. Strawberry", "89");
        System.out.printf("│ %-40s : ₹%-10s │\n", "4. Butterscotch", "89");
        System.out.printf("│ %-40s : ₹%-10s │\n", "5. Mango", "89");

        System.out.println("├───────────────────────────────────────────────────────────────────────────────┤");

        System.out.printf("│%41s%-36s│\n", "", "=== Premium Flavors ===");
        System.out.printf("│ %-40s : ₹%-10s │\n", "6. Cookies and Cream", "129");
        System.out.printf("│ %-40s : ₹%-10s │\n", "7. Belgian Chocolate", "149");
        System.out.printf("│ %-40s : ₹%-10s │\n", "8. Black Forest", "139");
        System.out.printf("│ %-40s : ₹%-10s │\n", "9. Red Velvet", "149");
        System.out.printf("│ %-40s : ₹%-10s │\n", "10. Mint Chocolate Chip", "129");

        System.out.println("├───────────────────────────────────────────────────────────────────────────────┤");

        System.out.printf("│%41s%-36s│\n", "", "=== Sundaes ===");
        System.out.printf("│ %-40s : ₹%-10s │\n", "11. Hot Fudge Sundae", "159");
        System.out.printf("│ %-40s : ₹%-10s │\n", "12. Brownie Sundae", "169");
        System.out.printf("│ %-40s : ₹%-10s │\n", "13. Banana Split", "169");
        System.out.printf("│ %-40s : ₹%-10s │\n", "14. Caramel Crunch Sundae", "169");
        System.out.printf("│ %-40s : ₹%-10s │\n", "15. Strawberry Delight Sundae", "149");

        System.out.println("└───────────────────────────────────────────────────────────────────────────────┘");
        Buy.buyF2s2();
    }
    public static void f2s3() {
        System.out.println("┌────────────────────────────────────────────────────────────────────────────────────────┐");
        System.out.printf("│%63s                             │\n", "=== KFC ===");
        System.out.println("├────────────────────────────────────────────────────────────────────────────────────────┤");

        System.out.printf("│%41s%-46s│\n", "", "=== Buckets ===");
        System.out.printf("│ %-50s : ₹%-10s │\n", "1. 10-Piece Hot & Crispy Chicken Bucket", "749");
        System.out.printf("│ %-50s : ₹%-10s │\n", "2. 8-Piece Smoky Grilled Chicken Bucket", "789");
        System.out.printf("│ %-50s : ₹%-10s │\n", "3. Popcorn Chicken Bucket", "289");
        System.out.printf("│ %-50s : ₹%-10s │\n", "4. Boneless Strips Bucket", "389");
        System.out.printf("│ %-50s : ₹%-10s │\n", "5. Wings Bucket", "489");

        System.out.println("├────────────────────────────────────────────────────────────────────────────────────────┤");

        System.out.printf("│%41s%-46s│\n", "", "=== Burgers & Wraps ===");
        System.out.printf("│ %-50s : ₹%-10s │\n", "6. Zinger Burger", "179");
        System.out.printf("│ %-50s : ₹%-10s │\n", "7. Double Down Burger", "229");
        System.out.printf("│ %-50s : ₹%-10s │\n", "8. Chicken Wrap", "170");
        System.out.printf("│ %-50s : ₹%-10s │\n", "9. Classic Chicken Burger", "149");
        System.out.printf("│ %-50s : ₹%-10s │\n", "10. Veggie Burger", "129");

        System.out.println("├────────────────────────────────────────────────────────────────────────────────────────┤");

        System.out.printf("│%41s%-46s│\n", "", "=== Snacks ===");
        System.out.printf("│ %-50s : ₹%-10s │\n", "11. Chicken Popcorn", "159");
        System.out.printf("│ %-50s : ₹%-10s │\n", "12. French Fries", "169");
        System.out.printf("│ %-50s : ₹%-10s │\n", "13. Chicken Strips", "169");
        System.out.printf("│ %-50s : ₹%-10s │\n", "14. Potato Wedges", "169");
        System.out.printf("│ %-50s : ₹%-10s │\n", "15. Hot Wings", "149");

        System.out.println("└────────────────────────────────────────────────────────────────────────────────────────┘");
        Buy.buyF2s3();
    }
    public static void f2s4() {
        System.out.println("┌────────────────────────────────────────────────────────────────────────────────────────┐");
        System.out.printf("│%63s                             │\n", "=== Pizza Hut ===");
        System.out.println("├────────────────────────────────────────────────────────────────────────────────────────┤");

        System.out.printf("│%41s%-46s│\n", "", "=== Pizzas ===");
        System.out.printf("│ %-50s : ₹%-10s │\n", "1. Margherita Pizza", "149");
        System.out.printf("│ %-50s : ₹%-10s │\n", "2. Veggie Supreme Pizza", "389");
        System.out.printf("│ %-50s : ₹%-10s │\n", "3. Chicken Supreme Pizza", "389");
        System.out.printf("│ %-50s : ₹%-10s │\n", "4. Pepperoni Pizza", "489");
        System.out.printf("│ %-50s : ₹%-10s │\n", "5. Tandoori Paneer Pizza", "389");

        System.out.println("├────────────────────────────────────────────────────────────────────────────────────────┤");

        System.out.printf("│%41s%-46s│\n", "", "=== Signature Pizzas ===");
        System.out.printf("│ %-50s : ₹%-10s │\n", "6. Cheese Maxx Pizza", "479");
        System.out.printf("│ %-50s : ₹%-10s │\n", "7. Triple Chicken Feast Pizza", "329");
        System.out.printf("│ %-50s : ₹%-10s │\n", "8. Country Feast Pizza", "370");
        System.out.printf("│ %-50s : ₹%-10s │\n", "9. Spicy Veggie Pizza", "249");
        System.out.printf("│ %-50s : ₹%-10s │\n", "10. BBQ Chicken Pizza", "529");

        System.out.println("├────────────────────────────────────────────────────────────────────────────────────────┤");

        System.out.printf("│%41s%-46s│\n", "", "=== Sides ===");
        System.out.printf("│ %-50s : ₹%-10s │\n", "11. Garlic Breadsticks", "159");
        System.out.printf("│ %-50s : ₹%-10s │\n", "12. Cheesy Garlic Bread", "169");
        System.out.printf("│ %-50s : ₹%-10s │\n", "13. Potato Wedges", "199");
        System.out.printf("│ %-50s : ₹%-10s │\n", "14. Chicken Wings", "199");
        System.out.printf("│ %-50s : ₹%-10s │\n", "15. Veggie Pops", "159");

        System.out.println("└────────────────────────────────────────────────────────────────────────────────────────┘");
        Buy.buyF2s4();
    }
    public static void f2s5() {
        System.out.println("┌────────────────────────────────────────────────────────────────────────────────────────┐");
        System.out.printf("│%63s                             │\n", "=== Desserts Available in the Dessert Shop ===");
        System.out.println("├────────────────────────────────────────────────────────────────────────────────────────┤");

        System.out.printf("│%41s%-46s│\n", "", "=== Cakes ===");
        System.out.printf("│ %-50s : ₹%-10s │\n", "1. Chocolate Truffle Cake", "349");
        System.out.printf("│ %-50s : ₹%-10s │\n", "2. Red Velvet Cake", "389");
        System.out.printf("│ %-50s : ₹%-10s │\n", "3. Black Forest Cake", "389");
        System.out.printf("│ %-50s : ₹%-10s │\n", "4. Pineapple Cake", "489");
        System.out.printf("│ %-50s : ₹%-10s │\n", "5. Butterscotch Cake", "389");

        System.out.println("├────────────────────────────────────────────────────────────────────────────────────────┤");

        System.out.printf("│%41s%-46s│\n", "", "=== Pastries ===");
        System.out.printf("│ %-50s : ₹%-10s │\n", "6. Chocolate Pastry", "79");
        System.out.printf("│ %-50s : ₹%-10s │\n", "7. Vanilla Pastry", "69");
        System.out.printf("│ %-50s : ₹%-10s │\n", "8. Strawberry Pastry", "70");
        System.out.printf("│ %-50s : ₹%-10s │\n", "9. Red Velvet Pastry", "249");
        System.out.printf("│ %-50s : ₹%-10s │\n", "10. Black Forest Pastry", "529");

        System.out.println("├────────────────────────────────────────────────────────────────────────────────────────┤");

        System.out.printf("│%41s%-46s│\n", "", "=== Ice Creams ===");
        System.out.printf("│ %-50s : ₹%-10s │\n", "11. Vanilla Ice Cream", "59");
        System.out.printf("│ %-50s : ₹%-10s │\n", "12. Chocolate Ice Cream", "169");
        System.out.printf("│ %-50s : ₹%-10s │\n", "13. Mango Ice Cream", "99");
        System.out.printf("│ %-50s : ₹%-10s │\n", "14. Butterscotch Ice Cream", "99");
        System.out.printf("│ %-50s : ₹%-10s │\n", "15. Cookies and Cream Ice Cream", "99");

        System.out.println("└────────────────────────────────────────────────────────────────────────────────────────┘");
        Buy.buyF2s5();
    }
    public static void f3s1() {
        System.out.println("┌────────────────────────────────────────────────────────────────────────────────────────┐");
        System.out.printf("│%63s                             │\n", "=== Bata Products ===");
        System.out.println("├────────────────────────────────────────────────────────────────────────────────────────┤");

        System.out.printf("│ %-50s : ₹%-10s │\n", "1. Bata Power Sneaker", "1,299");
        System.out.printf("│ %-50s : ₹%-10s │\n", "2. Bata Formal Lace-Up", "1,799");
        System.out.printf("│ %-50s : ₹%-10s │\n", "3. Bata Comfit Sandals", "1,389");
        System.out.printf("│ %-50s : ₹%-10s │\n", "4. Bata Red Label Loafers", "2,489");
        System.out.printf("│ %-50s : ₹%-10s │\n", "5. Bata Canvas Casuals", "2,389");
        System.out.printf("│ %-50s : ₹%-10s │\n", "6. Bata Comfort Slippers", "1,179");
        System.out.printf("│ %-50s : ₹%-10s │\n", "7. Bata School Shoes", "2,169");
        System.out.printf("│ %-50s : ₹%-10s │\n", "8. Bata Block Heels", "2,470");

        System.out.println("└────────────────────────────────────────────────────────────────────────────────────────┘");
        Buy.buyF3s1();
    }
    public static void f3s2() {
        System.out.println("┌────────────────────────────────────────────────────────────────────────────────────────┐");
        System.out.printf("│%63s                             │\n", "=== Adidas Products ===");
        System.out.println("├────────────────────────────────────────────────────────────────────────────────────────┤");

        System.out.printf("│ %-50s : ₹%-10s │\n", "1. Adidas Ultraboost 22", "15,299");
        System.out.printf("│ %-50s : ₹%-10s │\n", "2. Adidas Grand Court", "4,799");
        System.out.printf("│ %-50s : ₹%-10s │\n", "3. Adidas Lite Racer", "3,389");
        System.out.printf("│ %-50s : ₹%-10s │\n", "4. Adidas Predator Football Shoes", "2,489");
        System.out.printf("│ %-50s : ₹%-10s │\n", "5. Adidas Adilette Slides", "2,389");
        System.out.printf("│ %-50s : ₹%-10s │\n", "6. Adidas RunFalcon 3.0", "1,179");
        System.out.printf("│ %-50s : ₹%-10s │\n", "7. Adidas Superstar Originals", "2,169");
        System.out.printf("│ %-50s : ₹%-10s │\n", "8. Adidas Galaxy 6", "3,270");

        System.out.println("└────────────────────────────────────────────────────────────────────────────────────────┘");
        Buy.buyF3s2();
    }
    public static void f3s3() {
        System.out.println("┌────────────────────────────────────────────────────────────────────────────────────────┐");
        System.out.printf("│%63s                             │\n", "=== Puma Products ===");
        System.out.println("├────────────────────────────────────────────────────────────────────────────────────────┤");

        System.out.printf("│ %-50s : ₹%-10s │\n", "1. Puma Smash v2", "4,299");
        System.out.printf("│ %-50s : ₹%-10s │\n", "2. Puma Flyer Runner", "2,899");
        System.out.printf("│ %-50s : ₹%-10s │\n", "3. Puma Rebound LayUp", "3,489");
        System.out.printf("│ %-50s : ₹%-10s │\n", "4. Puma RS-X Efekt", "3,489");
        System.out.printf("│ %-50s : ₹%-10s │\n", "5. Puma Softride Rift", "2,789");
        System.out.printf("│ %-50s : ₹%-10s │\n", "6. Puma Drift Cat 5", "2,179");
        System.out.printf("│ %-50s : ₹%-10s │\n", "7. Puma Carina Street", "2,269");
        System.out.printf("│ %-50s : ₹%-10s │\n", "8. Puma Slippers Leadcat", "2,170");

        System.out.println("└────────────────────────────────────────────────────────────────────────────────────────┘");
        Buy.buyF3s3();
    }
    public static void f3s4() {
        System.out.println("┌────────────────────────────────────────────────────────────────────────────────────────┐");
        System.out.printf("│%63s                             │\n", "=== Nike Products ===");
        System.out.println("├────────────────────────────────────────────────────────────────────────────────────────┤");

        System.out.printf("│ %-50s : ₹%-10s │\n", "1. Nike Air Max 90", "14,299");
        System.out.printf("│ %-50s : ₹%-10s │\n", "2. Nike Revolution 6", "1,899");
        System.out.printf("│ %-50s : ₹%-10s │\n", "3. Nike Downshifter 12", "1,489");
        System.out.printf("│ %-50s : ₹%-10s │\n", "4. Nike Air Zoom Pegasus 40", "3,489");
        System.out.printf("│ %-50s : ₹%-10s │\n", "5. Nike Court Vision Low", "1,789");
        System.out.printf("│ %-50s : ₹%-10s │\n", "6. Nike Renew Ride 3", "2,179");
        System.out.printf("│ %-50s : ₹%-10s │\n", "7. Nike Flex Experience", "2,269");
        System.out.printf("│ %-50s : ₹%-10s │\n", "8. Nike Victori One Slides", "2,170");
        System.out.println("└────────────────────────────────────────────────────────────────────────────────────────┘");
        Buy.buyF3s4();
    }
    public static void f3s5() {
        System.out.println("┌────────────────────────────────────────────────────────────────────────────────────────┐");
        System.out.printf("│%61s                               │\n", "=== Air Jordan Products ===");
        System.out.println("├────────────────────────────────────────────────────────────────────────────────────────┤");

        System.out.printf("│ %-50s : ₹%-10s │\n", "1. Air Jordan 1 Retro High", " 18,999");
        System.out.printf("│ %-50s : ₹%-10s │\n", "2. Air Jordan 4 Retro", " 22,499");
        System.out.printf("│ %-50s : ₹%-10s │\n", "3. Air Jordan 11 Retro", " 27,999");
        System.out.printf("│ %-50s : ₹%-10s │\n", "4. Air Jordan 3 Retro", " 24,599");
        System.out.printf("│ %-50s : ₹%-10s │\n", "5. Air Jordan 5 Retro", " 21,299");
        System.out.printf("│ %-50s : ₹%-10s │\n", "6. Air Jordan 6 Retro", " 23,499");
        System.out.printf("│ %-50s : ₹%-10s │\n", "7. Air Jordan 7 Retro", " 19,799");
        System.out.printf("│ %-50s : ₹%-10s │\n", "8. Air Jordan 12 Retro", " 25,499");

        System.out.println("└────────────────────────────────────────────────────────────────────────────────────────┘");
        Buy.buyF3s5();
    }
}