package lab8;

public class Frog extends Amphibian implements LandMoveable, WaterMoveable{
    public void say(){
        System.out.println("I am a frog");
    }

    public void walk(){
        System.out.println("I can walk");
    }

    public void swim(){
        System.out.println("I can swim");
    }
}
