package DecoratorDesignPattern;

import DecoratorDesignPattern.Addons.Chips;
import DecoratorDesignPattern.Addons.Milk;
import DecoratorDesignPattern.Addons.Waffer;

public class Main {
    public static void main(String[] args){
        Beverage b = new Espresso();
        b = new Milk(b);
        b = new Chips(b);
        b = new Waffer(b);
        System.out.println(b.getPrice());
    }
}
