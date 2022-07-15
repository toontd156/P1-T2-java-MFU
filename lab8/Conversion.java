package lab8;
interface Exchangeable {
    double dollar2Baht = 31;

    void baht2Dollar(double baht);
}

public class Conversion implements Exchangeable {
    double total;
    @Override
    public void baht2Dollar(double baht ) {
        total = baht / dollar2Baht;
        System.out.println(baht + " = " + total + " dollar");
    }
    
}
