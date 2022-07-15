package lab7;

public class Main1 {
    //Main method
    public static void main(String[] args)
    {        
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        say(a);
        say(b);
    }
    
    //Method with Polymorphic argument
    public static void say(ClassA x)
    {
        x.say();
    }

}
