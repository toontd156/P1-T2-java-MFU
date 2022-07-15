package test;
public class Number {
    public void printRecursion(int min, int max){
        if(min < max){
            System.out.print(min + " " );
            printRecursion(min + 1, max); 
        } else{
            System.out.print(min);
        }
    }

    public void printLoop(int min, int max){
        for(int i = min; i <= max; i++){
            System.out.print(i + " ");
        }
    }
}
