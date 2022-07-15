package lab2;
import java.util.Random;
public class BlackJack {
    private int[] cardYou = new int[5];
    private int[] cardComputer = new int[2];
    private int numYouCard = 2;
    private int sumYou = 0;
    private int sumComputer = 0;
    private String winner;

    public BlackJack() {
        Random rand = new Random();

        cardYou[0] = rand.nextInt(11)+1;
        cardYou[1] = rand.nextInt(11)+1;
        cardYou[2] = 0;
        cardYou[3] = 0;
        cardYou[4] = 0;

        cardComputer[0] = rand.nextInt(11)+1;
        cardComputer[1] = rand.nextInt(11)+1;
        

        for(int i = 0; i < cardYou.length; i++) {
            sumYou = sumYou + cardYou[i];
        }

        sumComputer = cardComputer[0] + cardComputer[1];

        if(sumYou == 22) {
            sumYou = 12;
            cardYou[1] = 1;
        }

        if(sumComputer == 22) {
            sumComputer = 12;
            cardComputer[1] = 1;
        }
    }

    public void showPlayerCard(){
        System.out.print("You: ");
        for (int i = 0; i < cardYou.length; i++){
            System.out.print(cardYou[i]+ " ");
        }
        System.out.println();
    }

    public void showComputerCard(boolean start){
        if(start){
            System.out.print("Computer: ? ?");
        }
        else{
            System.out.print("Computer: ");
            for(int a = 0; a < cardComputer.length; a++){
                System.out.print(cardComputer[a]+ " ");
            }
            System.out.println();
        }
    }

    public void addMoreCard(){
        Random rand = new Random();
        cardYou[numYouCard] = rand.nextInt(11)+1;
        sumYou = sumYou + cardYou[numYouCard];
        numYouCard++;
    }

    public void showSumCard(){
        System.out.println("Sum of your cards = " + sumYou);
        System.out.println("Sum of computer cards = " + sumComputer);
    }

    public void checkWinner(){
        if((sumYou > sumComputer) && (sumYou <= 21)){
            winner = "You";
        }
        else{
            winner = "Computer";
        }
    }

    public String getWinner(){
        return winner;
    }
}
