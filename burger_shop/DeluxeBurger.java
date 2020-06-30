package burger_shop;

public class DeluxeBurger extends burger_shop.Burger {
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.99, "White");
        super.addHamburgerAddition1("Chips", 2.50);
        super.addHamburgerAddition2("Drink", 1.50);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
