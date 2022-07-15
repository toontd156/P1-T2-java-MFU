package lab1;

public class Shop {
    private int shirtAmount;
    private double shirtPrice;
    private int bagAmount;
    private double bagPrice;
    private int shoesAmount;
    private double shoesPrice;
    private double TotalPrice;

    public Shop() {
        shirtAmount = 0;
        shirtPrice = 150.0;
        bagAmount = 0;
        bagPrice = 990.0;
        shoesAmount = 0;
        shoesPrice = 1690.0;
        TotalPrice = 0.0;
    }
    public void addShirtAmount() {
        shirtAmount += 1;
        TotalPrice += shirtPrice;
    }
    public void addBagAmount() {
        bagAmount += 1;
        TotalPrice += bagPrice;
    }
    public void addShoesAmount() {
        shoesAmount += 1;
        TotalPrice += shoesPrice;
    }
    public void ViewCart(){
        System.out.println("--- Cart Summary ---");
        System.out.println("Shirt: "+ shirtAmount);
        System.out.println("Bag: "+ bagAmount);
        System.out.println("Shoes: "+ shoesAmount);
        System.out.println("Total price: "+ TotalPrice + "B");
        System.out.println("------------------------");
    }
}
