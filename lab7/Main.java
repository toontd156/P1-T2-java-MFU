package lab7;

public class Main
{
    //Main Method
    public static void main(String[] args)
    {        
        Shape sh = new Shape();
        //polymorphic assignment of objects
        Shape r = new Rectangle();
        Shape t = new Triangle();
        
        sh.draw();
        r.draw();
        t.draw();
    }
}
