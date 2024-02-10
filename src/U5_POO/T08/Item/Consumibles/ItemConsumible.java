package U5_POO.T08.Item.Consumibles;

import U5_POO.T08.Character.Personaje;
import U5_POO.T08.Item.Item;

public abstract class ItemConsumible extends Item {
    protected float power;

    public ItemConsumible(int power, String name) {
        this.power = power;
        this.name = name;
        this.peso = 5;
    }

    public void consumedBy(Personaje personaje) {
        System.out.println(personaje.getName() + " ha consumido: " + toString());
        personaje.consumir(power);
    }

    public float getPower() {
        return power;
    }

    @Override
    public String toString() {
        return name;
    }
}
