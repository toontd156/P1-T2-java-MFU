package lab7;

import java.util.Scanner;
public class Main2
{
    //Main method
    public static void main(String[] args)
    {        
        Human h = new Human();
        Cat c = new Cat();
        //Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Type 1 for Human, 2 for Cat...");
        int choice = sc.nextInt();
        
        if(choice==1)
            speak(h);
        else if(choice==2)
            speak(c);
    }
    
    //Method with Polymorphic argument
    public static void speak(Mamal m)
    {
        m.speak();
    }
}

