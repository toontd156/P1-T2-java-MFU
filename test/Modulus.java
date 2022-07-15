package test;

public class Modulus {
    public int modRecur(int val, int divisor) {
        if (val < divisor) {
            return val;
        }
        else
            return modRecur (val - divisor, divisor);
    }

    public void modLoop(int val, int divisor) {
        System.out.print(val + " % "+divisor+" = "+val);
        int i = val;

        while(i >= divisor){
            i = i - divisor;
            System.out.print(" - " + divisor);
        }
        System.out.println(" = " + i);

    }
}
