package burger_shop;

public final class Order extends burger_shop.Burger {
    private String burger;
    private  String breadRollType;
    private  String meat;
    private  String meal;
    private  String toppings1Name;
    private  double toppings1Price;
    private String toppings2Name;
    private  double toppings2Price;
    private  String addSidesName;
    private  double addSidesPrice;
    private String addBurgerName;
    private double addBurgerPrice;


    public Order(String burger, String breadRollType1, String meat1) {
        super("Turkey Burger", "Ground Turkey", 9.99, "potato bread");
        this.burger = burger;
        this.breadRollType = breadRollType1;
        this.meat = meat1;
    }

    public Order(String name, String meat, double price, String breadRollType, String meal) {
        super("Turkey Burger", "Ground Turkey", 9.99, "potato bread");
        this.meal = meal;
    }

    public void addToppings1(String name, double price) {
        this.toppings1Name = name;
        this.toppings1Price = price;

    }

    public void addToppings2(String name, double price) {
        this.toppings2Name = name;
        this.toppings2Price = price;

    }

    public void addSides1(String name, double price) {
        this.addSidesName = name;
        this.addSidesPrice = price;
    }
    public void addBurger(String name, double price) {
        this.addBurgerName = name;
        this.addBurgerPrice = price;
    }

    @Override
    public double itemizedHamburger() {
        double hamburgerPrice = super.itemizedHamburger();
        if (this.toppings1Name != null) {
            hamburgerPrice += this.toppings1Price;
            System.out.println("Added " + toppings1Name + " for an extra " + this.toppings1Price);
        }
        if (this.toppings2Name != null) {
            hamburgerPrice += this.toppings2Price;
            System.out.println("Added " + toppings2Name + " for an extra " + this.toppings2Price);

        }
        return hamburgerPrice;
    }

    public double addSides() {
        double hamburgerPrice = super.itemizedHamburger();
        if (this.addSidesName != null) {
            hamburgerPrice += this.addSidesPrice;
            System.out.println("Added " + addSidesName + " for an extra " + this.addSidesPrice);
        }

        return hamburgerPrice;
    }
    public double addBurger() {
        double hamburgerPrice = super.itemizedHamburger();
        if(this.addBurgerName != null ) {
            hamburgerPrice =+ this.addBurgerPrice;
            System.out.println("Added " + this.addBurgerName + " for an extra " + this.addBurgerPrice);
        }
        return hamburgerPrice;
    }
    public void purchaseOrder() {
        double hamburgerPrice = super.itemizedHamburger();
        System.out.println("Your purchase is completed");
        return;

    }


}




