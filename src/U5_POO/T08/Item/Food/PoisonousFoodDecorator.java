package U5_POO.T08.Item.Food;

import U5_POO.T08.Character.Personaje;

public class PoisonousFoodDecorator extends FoodDecorator {

    public PoisonousFoodDecorator(Food decoratedFood) {
        super(decoratedFood);
    }

    @Override
    public void consumedBy(Personaje personaje) {
        personaje.receivesDamage(decoratedFood.power);
    }
}
