package DecoratorDesignPattern.Addons;

import DecoratorDesignPattern.Beverage;

public class Milk implements Beverage {

    private Beverage b;

    public Milk(Beverage b){
        this.b = b;
    }

    @Override
    public int getPrice() {
        return b.getPrice() + 20;
    }
}
