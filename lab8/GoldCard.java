package lab8;

public class GoldCard extends CreditCard {
    public GoldCard(){
        maxW = 50000;
        yFee = maxW * 0.10 ;
    }

    public void showYearlyFee(){
        System.out.println("Yearly fee of Silver Card " + yFee);
    }
}
