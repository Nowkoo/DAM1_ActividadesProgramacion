package U06.Example01_Iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class GestorPersonas {
    ArrayList<Persona> personas = new ArrayList<>();

    public void addPerson(Persona p){
        personas.add(p);
    }
    public void addSamplePersons(){
        Persona p;
        p = new Persona("Pepe", "P");
        addPerson(p);
        p = new Persona("Julia", "J");
        addPerson(p);
        p = new Persona("Maria", "M");
        addPerson(p);
    }
    public void printSearchedPerson(String searchedPerson){
        for (Persona p: personas){
            if(p.getName().contains(searchedPerson)){
                System.out.println(p);
            }
        }
    }
    public void removePerson(String searchedPerson){
        // El borrado sobre un collection con una estructura foreach genera una excepcion
        //removePersonForEach(searchedPerson);
        // Con una estructura clasica for no funciona para gran parte de los tipos collection
        // ademas tambien puede funcionar mal si el limite se calcula de forma estatica
        //removePersonFor(searchedPerson);
        // Para recorrer collections lo mas recomendable es hacer uso de iterator
        removePersonIterator(searchedPerson);
    }
    public void removePersonForEach(String searchedPerson){
        for (Persona p: personas){
            if (p.getName().contains(searchedPerson)){
                personas.remove(p);
            }
        }
    }
    public void removePersonFor(String searchedPerson){
        for (int i=0; i<personas.size();i++){
            Persona p = personas.get(i);
            if (p.getName().contains(searchedPerson)){
                personas.remove(p);
            }
        }
    }
    public void removePersonIterator(String searchedPerson){
        Iterator<Persona> it = personas.iterator();
        // Cambia el tipo de estructura de for a while
        while (it.hasNext()){
            Persona p = it.next();
            if (p.getName().contains(searchedPerson)){
                // OJO. el borrado se hace a partir del objeto iterator,
                // si borramos con el collection volveremos a tener problemas.
                //personas.remove(p);
                it.remove();
            }
        }
    }
    public String toString(){
        String output ="";
        for(Persona p:personas)
            output += p.toString() + "\n";
        return output;
    }
}
