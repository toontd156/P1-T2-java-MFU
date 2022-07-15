package test;

public class LabTest1_V4 {
    public static void main(String[] args) {     
        Number num1 = new Number();
        System.out.print("printRecursion(3,12):  ");
        num1.printRecursion(3, 12);
        System.out.println();
        System.out.print("printRecursion(1,1):  ");
        num1.printRecursion(1, 1);
        System.out.println();
        System.out.print("printLoop(11,20):  ");
        num1.printLoop(11, 20);
        System.out.println();
        System.out.print("printLoop(5,5):  ");
        num1.printLoop(5, 5);
        System.out.println();
     } 
}
