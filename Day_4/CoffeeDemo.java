package Day_4;

public class CoffeeDemo {
    public static void main(String[] args) {
        Coffee coffee =Coffee.Latte;
        System.out.println("You selected "+coffee);
        coffee.display();
        System.out.println(coffee.getBill());
    }
}
