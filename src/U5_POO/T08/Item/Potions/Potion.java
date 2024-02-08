package U5_POO.T08.Item.Potions;

import U5_POO.T08.Item.ItemConsumible;

public abstract class Potion extends ItemConsumible {
    public Potion(int power, String name) {
        super(power, name);
    }
}
