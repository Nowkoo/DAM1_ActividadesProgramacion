package U5_POO.T05;

import java.util.Scanner;

public class InterfazUsuario {
    Scanner scanner = new Scanner(System.in);
    public int inputFila() {
        System.out.println("Letra: ");
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String letra = scanner.next();

        return letras.indexOf(letra.charAt(0));
    }

    public int inputColumna() {
        System.out.print("Número: ");
        return scanner.nextInt() - 1;
    }
}
