package lab8;

public class PlatinumCard extends CreditCard {
    public PlatinumCard(){
        maxW = 100000;
        yFee = maxW * 0.15 ;
    }

    public void showYearlyFee(){
        System.out.println("Yearly fee of Silver Card " + yFee);
    }
}
