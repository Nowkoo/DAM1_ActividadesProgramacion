package U5_POO.T08.Item.Food;

import U5_POO.T08.Character.Personaje;
import U5_POO.T08.Item.Consumible;

import java.lang.module.Configuration;

public class EnhancedFoodDecorator extends FoodDecorator {
    public EnhancedFoodDecorator(Consumible decoratedFood) {
        super(decoratedFood);
    }

    @Override
    public void consumedBy(Personaje personaje) {
        System.out.println(personaje.getName() + " ha consumido: " + toString());
        personaje.consumir(getPower());
    }

    @Override
    public float getPower() {
        return decoratedFood.getPower() * 2;
    }

    @Override
    public String toString() {
        return decoratedFood.toString() + " mejorado/a";
    }
}
