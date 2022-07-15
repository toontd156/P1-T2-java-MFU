import java.util.Random;
import java.util.Scanner;

public class Blackjack{
    private int[] cardYou = new int[5];
    private int[] cardComputer = new int[2];
    private int numYourCard = 2;
    private int sumYou = 0;
    private int sumComputer = 0;
    private String winner;

    public Blackjack(){
        //Initialize game data
        Random rand = new Random();
        //Player
        cardYou[0] = rand.nextInt(11)+1;        
        cardYou[1] = rand.nextInt(11)+1;        
        cardYou[2] = 0;        
        cardYou[3] = 0;        
        cardYou[4] = 0;        
              
        
        //Dealer
        cardComputer[0] = rand.nextInt(11)+1;
        cardComputer[1] = rand.nextInt(11)+1;
        
        
        for(int i = 0;i < cardYou.length; i++){
            sumYou = sumYou + cardYou[i];
        }
        //Sum
        
        sumComputer = cardComputer[0] + cardComputer[1];
        
        
        //Check both 11
        if(sumYou == 22){
            sumYou = 12;
            cardYou[1] = 1;

        }
        if(sumComputer == 22){
            sumComputer = 12;
            cardComputer[1] = 1;
        }
    }    
    
    public void showPlayerCard(){
        System.out.print("You: ");
        for (int i = 0; i < cardYou.length; i++){
            System.out.print(cardYou[i] + " " );
        }
        System.out.println();
    }
    
    public void showComputerCard(boolean start){
        if(start){
            System.out.print("Computer: ? ?");
            
        }else{
            System.out.print("Computer: ");
            for (int a = 0; a < cardComputer.length; a++){
                System.out.print(cardComputer[a] + " " );
            }
            System.out.println();
        }

    }
    
    public void addMoreCard(){
        
        Random rand = new Random();
        cardYou[numYourCard] = rand.nextInt(11)+1;
        sumYou = sumYou + cardYou[numYourCard];
        numYourCard++;
        
    }

    public void showSumCard(){
        System.out.println("Sum of your cards = " + sumYou);
        System.out.println("Sum of computer cards = " + sumComputer);
    }
    
    

    public void checkWinner(){
        if((sumYou > sumComputer) && (sumYou <= 21)){
            winner = "You";
        }
        else {
            winner = "Computer";
        }
        
    }

public String getWinner(){
    return winner;
}

    
    public static void main(String[] args){
        Blackjack bj = new Blackjack();                
        
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
            }else{
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
