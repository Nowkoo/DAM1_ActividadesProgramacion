package U5_POO.T08.Item.Food;

import U5_POO.T08.Item.Consumible;
import U5_POO.T08.Character.Personaje;

public abstract class Food implements Consumible {
    protected float power;

    public Food(int power) {
        this.power = power;
    }

    public void consumedBy(Personaje personaje) {
        if (power >= 0) {
            personaje.heals(power);
        } else {
            personaje.receivesDamage(power);
        }
    }
}
