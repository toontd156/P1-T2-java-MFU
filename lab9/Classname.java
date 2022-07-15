package lab9;
import java.util.Scanner;


public class Classname {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many student?...");
        int num = sc.nextInt();
        Student[] st = new Student[num];
        //variable for storing student's name which enter from keyboard
        String name;
        //variable for storing student's score which enter from keyboard
        double score=0;
        
        //Object Creation of Array: st
        for(int i=0;i<num;i++)
            st[i] = new Student();
            
        //Input
        /* Call appropriate methods for setting student's name and score 
         * of each object in this array*/
        System.out.println("---Input---");
        for(int i=0;i<num;i++)
        {
            System.out.println("Student " + (i+1));
            System.out.print("Enter Name ");
            name = sc.next();
            st[i].setName(name);
            System.out.print("Enter Score ");
            score = sc.nextDouble();
            st[i].setScore(score);
        }
        //Output
        /* Call appropriate methods for getting student's name and score 
         * of each object in this array*/
        System.out.println("---Output---");
        for(int i=0;i<num;i++)
        {
            System.out.println("Student " +(i+1));
            System.out.println("Name = " + st[i].getName());
            System.out.println("Score = " + st[i].getScore());   
        }
        System.out.println("---Score---");
        double max = 0;
        double min = st[0].getScore();
        double x = 0;
        for(int i=0;i<num;i++){
            if(st[i].getScore() > max) max = st[i].getScore();
            if(st[i].getScore() < min) min = st[i].getScore();
            x = x + st[i].getScore();
        }
        System.out.println("Max " + max);
        System.out.println("Min " + min);
        System.out.println("Mean " + x / num);
        
    }
    

}
