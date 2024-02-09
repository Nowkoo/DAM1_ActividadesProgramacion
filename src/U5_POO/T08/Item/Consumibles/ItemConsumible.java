package U5_POO.T08.Item.Consumibles;

import U5_POO.T08.Character.Personaje;

public abstract class ItemConsumible {
    protected float power;
    protected String name;

    public ItemConsumible(int power, String name) {
        this.power = power;
        this.name = name;
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
