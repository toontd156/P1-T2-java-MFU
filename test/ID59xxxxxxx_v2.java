package test;

public class ID59xxxxxxx_v2 {
    public static void main(String[] args) {
        Modulus md= new Modulus();
        System.out.println("Modulus using Recursion:: ");
        System.out.println("5 modulus by 2 is "+md.modRecur(5,2));
        System.out.println("5 modulus by 3 is "+md.modRecur(5,3));
        System.out.println("10 modulus by 2 is "+md.modRecur(10,2));
        System.out.println();
        System.out.println("Modulus using Loop:: ");
        md.modLoop(5,2);
        md.modLoop(5,3);
        md.modLoop(10,2);
      }
}
