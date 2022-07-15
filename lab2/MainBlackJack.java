package lab2;
import java.util.Scanner;
public class MainBlackJack {
    public static void main(String[] args){ 
        BlackJack bj = new BlackJack();
        char answer;
        bj.showPlayerCard(); 
        bj.showComputerCard(true); 
        System.out.println(); 
        while(true){
            Scanner input = new Scanner(System.in); 
            System.out.print("What another card? <y/n>..."); 
            answer = input.next().charAt(0);
                if(answer == 'y'){
                    bj.addMoreCard(); 
                    bj.showPlayerCard(); 
                    bj.showComputerCard(true); 
                    System.out.println();
                }
                else{
                    break; 
                }
        }
        
        bj.showPlayerCard();
        bj.showComputerCard(false);
        System.out.println();
        bj.showSumCard();
        bj.checkWinner();
        System.out.println("The winner is "+bj.getWinner());
        }
}
