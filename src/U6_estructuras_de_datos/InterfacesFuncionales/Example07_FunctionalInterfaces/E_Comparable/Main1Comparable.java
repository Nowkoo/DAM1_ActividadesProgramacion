package U6_estructuras_de_datos.InterfacesFuncionales.Example07_FunctionalInterfaces.E_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Interfaz funcional Comparable:
 * recibe un parámetro del mismo tipo definido y genera
 * un resultado entero.
 * Su función abstracta es "compareTo" y su firma es del tipo:
 * int compare(<T> t)
 * El resultado debería ser >0 si this se considera mayor que t
 * <0 si se considera menor y ==0 si se consideran equivalentes
 */
public class Main1Comparable {
    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();
        members.add(new Member("Juan",175));
        members.add(new Member("Xenia", 165));
        members.add(new Member("Sofia", 175));
        members.add(new Member("Rolfe", 182));
        //Mostrar lista
        System.out.println(members);
        System.out.println();
        //Mostrar Stream lista
        members.stream().forEach(m-> System.out.println(m));
        System.out.println();
        //Mostrar Stream lista ordenado
        members.stream().sorted().forEach(m-> System.out.println(m));
        System.out.println();
        //Mostrar lista original
        System.out.println(members);
        //Mostrar lista ordenada
        System.out.println();
        Collections.sort(members);
        System.out.println(members);
    }

}
class Member implements Comparable<Member> {
    private String name;
    private int height;

    public Member(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getHeight() + ")";
    }

    @Override
    public int compareTo(Member member) {
        if (this.height == member.getHeight()) {
            return 0;
        } else if (this.height > member.getHeight()) {
            return 1;
        } else {
            return -1;
        }
    }
}
