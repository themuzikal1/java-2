package burger_shop;

public class Main {
    public static void main(String[] args) {
        //main execution of the burger shop goes here.  This is the "entry point" of your application
        burger_shop.Burger burger = new burger_shop.Burger("Basic", "sausage", 3.56, "white");
        double price = burger.itemizedHamburger();
        burger.addHamburgerAddition1("Tomato", 0.22);
        burger.addHamburgerAddition2("Lettuce", 0.90);
        burger.addHamburgerAddition3("Cheese", 0.50);
        System.out.println("Total burger price is " + burger.itemizedHamburger());

        burger_shop.HealthBurger healthyBurger = new burger_shop.HealthBurger("Bacon", 5.67);
        healthyBurger.itemizedHamburger();
        healthyBurger.addHamburgerAddition1("egg", 2.00);
        healthyBurger.addHealthAddition1("Lentils", 1.00);
        System.out.println("Total Healthy Burger Price is " + healthyBurger.itemizedHamburger());

        burger_shop.DeluxeBurger db = new burger_shop.DeluxeBurger();
        db.itemizedHamburger();

        burger_shop.Meal meal = new burger_shop.Meal("Deluxe Burger Meal", 9.99, "Mountain Dew", 3.00, "fries", 2.50);
        meal.itemizedHamburger();
        System.out.println("The Deluxe Burger meal includes a drink and a side for a total price of " + meal.itemizedHamburger());

        burger_shop.Order order = new burger_shop.Order("Deluxe", "rye", "Ground Turkey");
        order.addToppings1("Lettuce", 1.00);
        order.addSides1("Fries", 2.00);
        order.addBurger("Turkey Burger", 7.99);
        order.itemizedHamburger();
        order.purchaseOrder();



    }
}
