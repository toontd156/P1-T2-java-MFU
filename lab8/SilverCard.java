package lab8;

public class SilverCard extends CreditCard {
    public SilverCard(){
        maxW = 20000;
        yFee = maxW * 0.05 ;
    }

    public void showYearlyFee(){
        System.out.println("Yearly fee of Silver Card " + yFee);
    }
}
