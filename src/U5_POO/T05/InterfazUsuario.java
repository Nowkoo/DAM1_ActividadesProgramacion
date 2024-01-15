package U5_POO.T05;

import java.util.Scanner;

public class InterfazUsuario {
    Scanner scanner = new Scanner(System.in);
    public int inputFila() {
        return scanner.nextInt();
    }

    public int inputColumna() {
        return scanner.nextInt();
    }
}
