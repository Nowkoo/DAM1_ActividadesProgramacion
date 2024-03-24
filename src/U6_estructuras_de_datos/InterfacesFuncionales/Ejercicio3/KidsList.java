package U6_estructuras_de_datos.InterfacesFuncionales.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class KidsList {
    private List<Kid> kids = new ArrayList<>();

    public void newKid(int comportamiento, int pesoRegalo) {
        kids.add(new Kid(comportamiento, pesoRegalo));
    }

    public List<Kid> getKids() {
        return kids;
    }
}
