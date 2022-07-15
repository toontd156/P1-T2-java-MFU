package lab8;

public class Dog extends Pet {
    public Dog (){
        name = "Fatty";  
    }

    @Override
    public void speak(){
        System.out.println("Woof");
    }
}
