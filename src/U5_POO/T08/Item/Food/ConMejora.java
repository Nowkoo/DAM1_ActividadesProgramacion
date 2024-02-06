package U5_POO.T08.Item.Food;

import U5_POO.T08.Character.Personaje;
import U5_POO.T08.Item.Consumible;

public class ConMejora extends FoodDecorator {
    public ConMejora(SimpleFood decoratedFood) {
        super(decoratedFood);
    }

    @Override
    public void consumedBy(Personaje personaje) {

    }

    @Override
    public float getPower() {
        return super.getPower() * 2;
    }
}
