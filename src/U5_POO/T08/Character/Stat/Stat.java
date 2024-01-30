package U5_POO.T08.Character.Stat;

abstract public class Stat {
    int value;

    public Stat (int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    //Aumenta el valor de la característica en 1
    public void increase() {
        value++;
    }

    //Disminuye el valor de la característica en 1
    public void decrease() {
        value--;
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
