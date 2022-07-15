package lab8;
public abstract class CreditCard {
    protected double maxW;
    protected double yFee;

    public void showMaxWithdraw(){
        System.out.println("Max withdraw limit: " + maxW);
    }

    public void showYearlyFee(){
        System.out.println("Yearly fee of card: " + yFee);
    }
}
