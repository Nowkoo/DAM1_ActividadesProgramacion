package U2_2_value_methods;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int dni;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu DNI sin la letra: ");
        dni = scanner.nextInt();

        System.out.println("La letra de tu DNI es: " + letraDni(dni));
    }

    public static char letraDni(int dni) {
        char letter = 'a';
        char[] letters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        dni = dni % 23;

        switch (dni) {
            case 0:
                letter = letters[0];
                break;
            case 1:
                letter = letters[1];
                break;
            case 2:
                letter = letters[2];
                break;
            case 3:
                letter = letters[3];
                break;
            case 4:
                letter = letters[4];
                break;
            case 5:
                letter = letters[5];
                break;
            case 6:
                letter = letters[6];
                break;
            case 7:
                letter = letters[7];
                break;
            case 8:
                letter = letters[8];
                break;
            case 9:
                letter = letters[9];
                break;
            case 10:
                letter = letters[10];
                break;
            case 11:
                letter = letters[11];
                break;
            case 12:
                letter = letters[12];
                break;
            case 13:
                letter = letters[13];
                break;
            case 14:
                letter = letters[14];
                break;
            case 15:
                letter = letters[15];
                break;
            case 16:
                letter = letters[16];
                break;
            case 17:
                letter = letters[17];
                break;
            case 18:
                letter = letters[18];
                break;
            case 19:
                letter = letters[19];
                break;
            case 20:
                letter = letters[20];
                break;
            case 21:
                letter = letters[21];
                break;
            case 22:
                letter = letters[22];
                break;
        }

        return letter;
    }
}
