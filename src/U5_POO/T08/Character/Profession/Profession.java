package U5_POO.T08.Character.Profession;

import U5_POO.T08.Character.Stat.Stat;

public abstract class Profession {
    public abstract int modifier(Stat stat);

    public boolean equals(Object obj) {
        return obj.getClass() == this.getClass();
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
