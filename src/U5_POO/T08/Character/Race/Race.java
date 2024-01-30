package U5_POO.T08.Character.Race;

import U5_POO.T08.Character.Stat.Stat;

abstract public class Race {
    //Devuelve el modificador de la profesión segun el stat
    public abstract int modifier(Stat stat);

    //Devuelve true si son la misma clase
    public boolean equals(Object obj){
        return obj.getClass() == this.getClass();
    }

    //Devuelve el nombre simple de la clase
    public String toString() {
        return getClass().getSimpleName();
    }
}
