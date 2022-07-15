package lab8;

public class Brid implements Speakable{
    @Override
    public void say(){
        System.out.println("I am a bird");
        System.out.println("I have "+legs+" legs");
    }
}
