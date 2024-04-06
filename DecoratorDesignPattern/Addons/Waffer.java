package DecoratorDesignPattern.Addons;

import DecoratorDesignPattern.Beverage;

public class Waffer implements Beverage {
    private Beverage b;

    public Waffer(Beverage b){
        this.b = b;
    }

    @Override
    public int getPrice() {
        return b.getPrice() + 25;
    }
}
