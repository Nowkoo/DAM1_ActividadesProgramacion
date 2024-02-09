package U5_POO.T08.Item.Consumibles.Food;

import U5_POO.T08.Item.Consumibles.ItemConsumible;

public abstract class SimpleFood extends ItemConsumible implements Food {
    public SimpleFood(int power, String name) {
        super(power, name);
    }
}
