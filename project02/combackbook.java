package project02;
import java.util.Scanner;

public class combackbook{
    Scanner scanner = new Scanner(System.in);
    char cd;
    public void first(){
        Customer cu = new Customer();
        while(true) {
            System.out.println("Welcome ");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            if(choice == 1){
                cu.register();
                
            }
            else if(choice == 2){
                cu.Login();
                break;
            }
            else{
                System.out.println("No Choose");
                continue;
            }
        }
    }
    public void warings(){
        System.out.println("ห้ามทำหาย");
        System.out.println("เกินวันคืน ปรับตามวัน");
        System.out.println("ถ้าไม่คืนปรับตามราคาหนังสือ");
    }

    
}