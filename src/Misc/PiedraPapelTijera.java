package Misc;

import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class PiedraPapelTijera {
    public static String resultado;
    public static int piedra, papel, tijera;
    public static int victoriasPlayer, victoriasIA, empates;
    public static int numRondas = 5;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        String jugadaIA;
        String jugadaPlayer;
        boolean jugadaValida;
        boolean endGame = false;

        while (!endGame) {
            System.out.println("Bienvenido al juego del piedra, papel o tijera.");
            System.out.println("Jugaremos al mejor de 5.");

            for (int i = 1; i <= numRondas; i++) {
                System.out.println("Ronda " + i + ": ¿Piedra, papel o tijera?");
                jugadaPlayer = scanner.nextLine().toUpperCase();
                jugadaValida = resultadoValido(jugadaPlayer);

                if(!jugadaValida){
                    do {
                        System.out.println("El resultado no es válido. Prueba otra vez: ");
                        jugadaPlayer = scanner.nextLine().toUpperCase();
                        jugadaValida = resultadoValido(jugadaPlayer);
                    } while (!jugadaValida);
                }

                jugadaIA = jugadaIA();
                dialogoTiradaIA(jugadaIA);
                resultado = calculaGanador(jugadaIA, jugadaPlayer);
                dialogoResultado(resultado);
            }

            muestraEstadisticas();

            System.out.println("¿Quieres jugar otra vez? (S/N)");
            input = scanner.nextLine().toUpperCase();
            if(!input.equals("S"))
                return;

            reset();
        }

    }

    public static String jugadaIA() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        String jugada = "";

        switch (randomNumber) {
            case 0:
                jugada = "PIEDRA";
                return jugada;
            case 1:
                jugada = "PAPEL";
                return jugada;
            case 2:
                jugada = "TIJERA";
                return jugada;
            default:
                return jugada;
        }
    }

    public static String calculaGanador(String jugadaIA, String jugadaPlayer) {

        int victoriasAntes = victoriasPlayer;
        int empatesAntes = empates;
        String resultado;

        if(jugadaPlayer.equals("PIEDRA")) {
            piedra++;
            if(jugadaIA.equals(jugadaPlayer)) {
                empates++;
            } else if(jugadaIA.equals("PAPEL")) {
                victoriasIA++;
            } else {
                victoriasPlayer++;
            }

        } else if(jugadaPlayer.equals("PAPEL")) {
            papel++;
            if(jugadaIA.equals(jugadaPlayer)) {
                empates++;
            } else if(jugadaIA.equals("TIJERA")) {
                victoriasIA++;
            } else {
                victoriasPlayer++;
            }

        } else if(jugadaPlayer.equals("TIJERA")){
            tijera++;
            if(jugadaIA.equals(jugadaPlayer)) {
                empates++;
            } else if(jugadaIA.equals("PIEDRA")) {
                victoriasIA++;
            } else {
                victoriasPlayer++;
            }
        }

        if(victoriasPlayer > victoriasAntes)
            return "VICTORIA";
        else if(empates > empatesAntes)
            return "EMPATE";
        else
            return "DERROTA";

    }

    public static void muestraEstadisticas() {
        if(victoriasPlayer > victoriasIA)
            System.out.println("Resultado final: VICTORIA");
        else
            System.out.println("Resultado final: DERROTA");

        System.out.println("Estadísticas: ");
        System.out.println((victoriasPlayer * 100) / numRondas + "% victorias | " + (victoriasIA * 100) / numRondas + "% derrotas | " + (empates * 100) / numRondas + "% empates");
        System.out.println((piedra * 100) / numRondas + "% piedra | " + (papel * 100) / numRondas + "% papel | " + (tijera * 100) / numRondas + "% tijera");
    }

    public static void reset() {
        victoriasPlayer = 0;
        victoriasIA = 0;
        empates = 0;
        piedra = 0;
        papel = 0;
        tijera = 0;
    }

    public static boolean resultadoValido(String jugadaPlayer) {
        if(!jugadaPlayer.equals("PIEDRA")) {
            if(!jugadaPlayer.equals("PAPEL")) {
                if(!jugadaPlayer.equals("TIJERA"))
                    return false;
            }
        }
        return true;
    }

    public static void dialogoTiradaIA(String jugada) {
        if(jugada.equals("PIEDRA"))
            System.out.println("He sacado piedra.");
        else if(jugada.equals("PAPEL"))
            System.out.println("He sacado papel.");
        else
            System.out.println("He sacado tijera.");
    }

    public static void dialogoResultado(String resultado) {
        if (resultado.equals("VICTORIA"))
            System.out.println("¡Me has ganado!");
        else if (resultado.equals("EMPATE"))
            System.out.println("¡Hemos empatado!");
        else
            System.out.println("¡Has perdido!");
    }
}
