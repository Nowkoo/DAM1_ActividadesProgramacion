package U5_POO.T08.Item.Food;

import U5_POO.T08.Item.Consumible;
import U5_POO.T08.Character.Personaje;

public abstract class Food implements Consumible {
    protected float power;

    public Food(int power) {
        this.power = power;
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
        return getClass().getSimpleName();
    }
}
