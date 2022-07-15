package lab1;
import java.util.Scanner;
public class MainShop {
    public static void main(String[] args) {
        Shop shop = new Shop();

        while(true) {
            int menu;

            System.out.println("=== Shopping ===");
            System.out.println("1. Shirt 150 B");
            System.out.println("2. Bag 990 B");
            System.out.println("3. Shoes 1690 B");
            System.out.println("4. Viwe Cart ");
            System.out.println("5. Exit ");
            System.out.println("=================================");

            Scanner a = new Scanner(System.in);

            System.out.print("Choose 1-5 ");
            menu = a.nextInt();

            if(menu == 4){
                shop.ViewCart();
            }
            if(menu == 1){
                shop.addShirtAmount();
            }
            if(menu == 2){
                shop.addBagAmount();
            }
            if(menu == 3){
                shop.addShoesAmount();
            }
            if(menu == 5){
                break;
            }
        }
    }
}
