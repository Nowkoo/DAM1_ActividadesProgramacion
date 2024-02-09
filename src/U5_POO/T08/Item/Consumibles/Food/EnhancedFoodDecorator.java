package U5_POO.T08.Item.Consumibles.Food;

import U5_POO.T08.Character.Personaje;

public class EnhancedFoodDecorator extends FoodDecorator {
    public EnhancedFoodDecorator(Food decoratedFood) {
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
