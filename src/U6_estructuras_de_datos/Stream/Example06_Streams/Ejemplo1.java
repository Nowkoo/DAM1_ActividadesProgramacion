package U06.Ejemplos.Example06_Streams;
import java.util.*;
import java.util.stream.Collectors;

public class Ejemplo1 {
    public static void main(String[] args) {
        ejemploArrayList();
        ejemploLinkedList();
        ejemploHashSet();
    }
    public static void ejemploArrayList() {
        List<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Orange");

        // Filtrar elementos que comienzan con 'A'
        List<String> filteredList = strings.stream()
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(filteredList); // Output: [Apple]
    }
    public static void ejemploLinkedList() {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Multiplicar cada elemento por 2
        List<Integer> multipliedList = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(multipliedList); // Output: [2, 4, 6, 8, 10]
    }
    public static void ejemploHashSet() {
        Set<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        // Convertir a mayúsculas y recoger en una lista
        Set<String> upperCaseColors = colors.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
        System.out.println(upperCaseColors); // Output: [BLUE, GREEN, RED]
    }

}
