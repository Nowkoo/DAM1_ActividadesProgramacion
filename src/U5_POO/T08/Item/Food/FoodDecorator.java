package U5_POO.T08.Item.Food;

import U5_POO.T08.Item.Consumible;

public abstract class FoodDecorator implements Consumible {
    protected final SimpleFood decoratedFood;

    protected FoodDecorator(SimpleFood decoratedFood) {
        this.decoratedFood =  decoratedFood;
    }

    @Override
    public float getPower() {
        return decoratedFood.getPower();
    }
}
