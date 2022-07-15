package lab8;

public abstract class Amphibian {
    protected int legs;
    
    public abstract void say();
}

interface LandMoveable {
    void walk();
}

interface WaterMoveable {
    void swim();
}