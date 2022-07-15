package lab8;

public class Main1 {
    public static void main(String[] args)
    {
        SilverCard sc = new SilverCard();
        GoldCard gc = new GoldCard();
        PlatinumCard pc = new PlatinumCard();
        System.out.println("---Silver card---");
        sc.showMaxWithdraw();
        sc.showYearlyFee();
        System.out.println("---Gold card---");
        gc.showMaxWithdraw();
        gc.showYearlyFee();
        System.out.println("---Platinum card---");
        pc.showMaxWithdraw();
        pc.showYearlyFee();
    }

}
