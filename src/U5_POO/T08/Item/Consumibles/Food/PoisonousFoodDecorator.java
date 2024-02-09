package U5_POO.T08.Item.Consumibles.Food;

import U5_POO.T08.Character.Personaje;

public class PoisonousFoodDecorator extends FoodDecorator {

    public PoisonousFoodDecorator(Food decoratedFood) {
        super(decoratedFood);
    }

    @Override
    public void consumedBy(Personaje personaje) {
        System.out.println(toString());
        personaje.consumir(getPower());
    }

    @Override
    public float getPower() {
        return decoratedFood.getPower() * -1;
    }

    public String toString() {
        return decoratedFood.toString() + " envenenado/a";
    }
}
