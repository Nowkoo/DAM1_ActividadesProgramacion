package U5_POO.T08.Item.Consumibles.Food;

public abstract class FoodDecorator implements Food {
    protected Food decoratedFood;

    public FoodDecorator(Food decoratedFood) {
        this.decoratedFood = decoratedFood;
    }
}
