package U3_strings;import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {

        String number1, number2, result;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número en binario: ");
        number1 = scanner.nextLine();
        System.out.println("Introduzca otro número en binario : ");
        number2 = scanner.nextLine();

        result = addBinary(number1, number2);
        System.out.println("La suma de los dos números es: " + result);
    }

    public static String addBinary(String b1, String b2) {
        int n1 = toDecimalInt(b1);
        int n2 = toDecimalInt(b2);
        return toBinaryString(n1 + n2);
    }

    public static int toDecimalInt(String b) {
        int decimal = 0;
        int base = 1;

        for (int i = b.length() - 1; i >= 0; i--) {
            if (b.charAt(i) == '1')
                decimal += base;
            base = base * 2;
        }
        return  decimal;
    }

    public static String toBinaryString(int b) {
        if (b > 0) {
            return toBinaryString(b / 2) + b % 2;
        }
        return "";
    }
}
