package U5_POO.T08.Item.Food;

import U5_POO.T08.Item.Consumible;
import U5_POO.T08.Character.Personaje;

public abstract class SimpleFood implements Consumible {
    protected float power;

    public void consumedBy(Personaje personaje) {
        if (getPower() > 0) {
            personaje.heals(getPower());
        } else {
            personaje.receivesDamage(getPower());
        }

    }

    public float getPower() {
        return power;
    }
}
