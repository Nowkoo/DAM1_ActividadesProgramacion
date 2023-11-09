package U1_basic_java;

public class Ejercicio35 {
    public static void main(String[] args){

        boolean wasTen = false;
        int sum = 0;
        int index = 0;
        int[] grades = {5, 7, 10, 3, 2, 9, 0, 6};

        for(int i : grades){

            sum = sum + grades[index];

            if(grades[index] == 10) {
                wasTen = true;
            }

            index++;
        }

        System.out.println("Nota media: " + (sum/grades.length));

        if(wasTen) {
            System.out.println("Había un 10");
        } else {
            System.out.println("No había ningún 10");
        }
    }
}
