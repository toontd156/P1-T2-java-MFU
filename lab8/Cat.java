package lab8;

public class Cat extends Pet{
    public Cat (){
        name = "Kitty";  
    }

    @Override
    public void speak(){
        System.out.println("Meaw");
    }
}
