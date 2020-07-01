package burger_shop;

public final class Meal extends burger_shop.DeluxeBurger {
    private String meal1Name;
    private double meal1Price;
    private String drink1Name;
    private double drink1Price;
    private String side1Name;
    private double side1Price;

    public Meal(String meal1Name, double meal1Price, String drink1Name, double drink1Price, String side1Name, double side1Price) {
        this.meal1Name = meal1Name;
        this.meal1Price = meal1Price;
        this.drink1Name = drink1Name;
        this.drink1Price = drink1Price;
        this.side1Name = side1Name;
        this.side1Price = side1Price;
    }
    @Override
    public double itemizedHamburger() {
        double hamburgerPrice = super.itemizedHamburger();
        if (this.drink1Name != null) {
            hamburgerPrice += this.drink1Price;
            System.out.println("Added " + drink1Name + " for an extra " + this.drink1Price);
        }
        if (this.side1Name != null) {
            hamburgerPrice += this.side1Price;
            System.out.println("Added " + side1Name + " for an extra " + this.side1Price);

        }
        return hamburgerPrice;
    }

    public void addToppings1(String name, double price) {
        System.out.println("Cannot add multiples of the same topping");
    }


    public void addToppings2(String name, double price) {
        System.out.println("Cannot add multiples of the same topping");
    }


    public void addBurger(String name, double price) {
        System.out.println("Cannot add multiples of the same burger");
    }


    public void setDrink1Name(String name, double price) {
        System.out.println("Cannot add multiples of the same drink");
    }
}

