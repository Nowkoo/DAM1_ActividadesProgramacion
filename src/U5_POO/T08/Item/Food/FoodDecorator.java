package U5_POO.T08.Item.Food;

import U5_POO.T08.Character.Personaje;
import U5_POO.T08.Item.Consumible;

public abstract class FoodDecorator implements Consumible {
    protected Consumible decoratedFood;

    public FoodDecorator(Consumible decoratedFood) {
        this.decoratedFood = decoratedFood;
    }
}
