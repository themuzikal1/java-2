package burger_shop;

public class Main {
    public static void main(String[] args) {
        //main execution of the burger shop goes here.  This is the "entry point" of your application
    burger_shop.Burger burger = new burger_shop.Burger("Basic", "Sausage", 3.56, "White");
    double price = burger.itemizedHamburger();
    }
}
