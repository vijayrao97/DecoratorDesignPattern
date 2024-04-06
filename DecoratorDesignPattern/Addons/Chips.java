package DecoratorDesignPattern.Addons;

import DecoratorDesignPattern.Beverage;

public class Chips implements Beverage {
    private Beverage b;
    public Chips(Beverage b){
        this.b = b;
    }

    @Override
    public int getPrice() {
        return b.getPrice() + 25;
    }
}
