package lab8;

public abstract class Pet {
    protected String name;

    public void showName(){
        System.out.println("My name is " + name);
    }

    public abstract void speak();
}
