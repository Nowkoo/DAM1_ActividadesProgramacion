package U1_basic_java;

import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args){

        String nie;
        int numNie = 0;

        int[] array;
        array = new int[8];

        char letter = 'a';
        char[] letters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca su NIE: ");
        nie = scanner.next();

        switch (nie.charAt(0)) {
            case 'X':
                array[0] = 0;
                break;
            case 'Y':
                array[0] = 1;
                break;
            case 'Z':
                array[0] = 2;
                break;
        }

        for(int i = 1; i < array.length; i++) {
            switch (nie.charAt(i)) {
                case '0':
                    array[i] = 0;
                    break;
                case '1':
                    array[i] = 1;
                    break;
                case '2':
                    array[i] = 2;
                    break;
                case '3':
                    array[i] = 3;
                    break;
                case '4':
                    array[i] = 4;
                    break;
                case '5':
                    array[i] = 5;
                    break;
                case '6':
                    array[i] = 6;
                    break;
                case '7':
                    array[i] = 7;
                    break;
                case '8':
                    array[i] = 8;
                    break;
                case '9':
                    array[i] = 9;
                    break;
            }
        }
        int potencia = 1;
        for (int i = array.length-1; i >= 0; i--) {
            numNie += array[i] * potencia;
            potencia *= 10;
        }

        numNie = numNie % 23;

        switch (numNie) {
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

        if(nie.charAt(8) == letter) {
            System.out.println("La última letra del nie es correcta");
        } else {
            System.out.println("La última letra del nie es incorrecta");
        }

    }
}
