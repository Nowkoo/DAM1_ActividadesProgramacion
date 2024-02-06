package U5_POO.T08.Item.Food;

import U5_POO.T08.Character.Personaje;

public class EnhancedFoodDecorator extends FoodDecorator {
    public EnhancedFoodDecorator(Food decoratedFood) {
        super(decoratedFood);
    }

    @Override
    public void consumedBy(Personaje personaje) {
        personaje.heals(decoratedFood.power * 2);
    }
}
