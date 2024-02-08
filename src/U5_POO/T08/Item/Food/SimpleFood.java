package U5_POO.T08.Item.Food;

import U5_POO.T08.Item.ItemConsumible;

public abstract class SimpleFood extends ItemConsumible implements Food {
    public SimpleFood(int power, String name) {
        super(power, name);
    }
}
