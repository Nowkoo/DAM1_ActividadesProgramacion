package U4_ficheros;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Seleccion {
    public static void main(String[] args) {
        int exitKey = 0;
        int option = 1;

        while (option != exitKey) {
            System.out.println("0: Cerrar programa");
            System.out.println("1: Generar selección");
            System.out.println("2: Leer selección");
            System.out.println("Introduce tu opción de trabajo: ");
            option = menuInput();

            if (option == 1) {
                generarFichero(generarJugadores());
                System.out.println("Se ha generado el fichero.");

            } else if (option == 2) {
                System.out.println("Introduzca la ruta del archivo que quiere leer: ");
                File f = fileInput();
                if(f.exists() && f.isFile())
                    leerSeleccion(f);
                else
                    System.out.println("Archivo no válido.");

            } else if (option == 0) {
                break;

            } else {
                System.out.println("La opción seleccionada no existe.");
            }
        }
    }

    public static Jugador[] generarJugadores() {
        Jugador[] jugadores = new Jugador[19];

        jugadores[0] = new Jugador(4, "USA", "Matt Turner", 1994, 1.90f, "Arsenal (ENG)");
        jugadores[1] = new Jugador(4, "USA", "Ethan Horvath", 1995, 1.93f, "Luton Town (ENG)");
        jugadores[2] = new Jugador(4, "USA", "Sean Johnson", 1989, 1.90f, "New York City FC (USA)");
        jugadores[3] = new Jugador(4, "USA", "Sergiño Dest", 2000, 1.73f, "Milan (ITA)");
        jugadores[4] = new Jugador(4, "USA", "Walker Zimmerman", 1993, 1.90f, "Nashville SC");
        jugadores[5] = new Jugador(4, "USA", "Antonee Robinson", 1997, 1.82f, "Fulham (ENG)");
        jugadores[6] = new Jugador(4, "USA", "Tim Ream", 1987, 1.85f, "Fulham (ENG)");
        jugadores[7] = new Jugador(4, "USA", "Aaron Long", 1992, 1.88f, "New York Red Bulls (USA)");
        jugadores[8] = new Jugador(4, "USA", "Shaquell Moore", 1996, 1.80f, "Nashville SC (USA)");
        jugadores[9] = new Jugador(4, "USA", "Cameron Carter-Vickers", 1997, 1.85f, "Celtic (SCO)");
        jugadores[10] = new Jugador(4, "USA", "DeAndre Yedlin", 1993, 1.71f, "Inter Miami (USA)");
        jugadores[11] = new Jugador(4, "USA", "Joe Scally", 2002, 1.84f, "Borussia Mönchengladbach (GER)");
        jugadores[12] = new Jugador(4, "USA", "Tyler Adams", 1999, 1.75f, "Leeds United (ENG)");
        jugadores[13] = new Jugador(4, "USA", "Yunus Musah", 2002, 1.77f, "Valencia (SPA)");
        jugadores[14] = new Jugador(4, "USA", "Weston McKennie", 1998, 1.85f, "Juventus (ITA)");
        jugadores[15] = new Jugador(4, "USA", "Luca de la Torre", 1998, 1.78f, "Celta de Vigo (SPA)");
        jugadores[16] = new Jugador(4, "USA", "Cristian Roldan", 1995, 1.72f, "Seattle Sounders (USA)");
        jugadores[17] = new Jugador(4, "USA", "Kellyn Acosta", 1995, 1.77f, "Los Angeles FC (USA)");
        jugadores[18] = new Jugador(4, "USA", "Giovanni Reyna", 2002, 1.85f, "Borussia Dortmund (GER)");

        return jugadores;
    }

    public static void generarFichero(Jugador[] jugadores) {
        try {
            DataOutputStream f_out = new DataOutputStream(new FileOutputStream("./recursos/seleccion_USA.dat"));

            for (int i = 0; i < jugadores.length; i++) {
                f_out.writeInt(jugadores[i].getCodPais());
                f_out.writeUTF(jugadores[i].getNombrePais());
                f_out.writeUTF(jugadores[i].getNombreJugador());
                f_out.writeInt(jugadores[i].getAñoNacimiento());
                f_out.writeFloat(jugadores[i].getAltura());
                f_out.writeUTF(jugadores[i].getClub());
            }
            f_out.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void leerSeleccion(File f) {
        try {
            Jugador[] jugadores;
            DataInputStream f_in = new DataInputStream(new FileInputStream(f));

            while(f_in.available() > 0) {
                /*System.out.print(("COD. PAÍS: " + f_in.readInt()));
                System.out.print("\tPAÍS: " + f_in.readUTF());
                System.out.print("\tNOMBRE: " + f_in.readUTF());
                System.out.print("\tAÑO: " + f_in.readInt());
                System.out.print("\tALTURA: " + f_in.readFloat());
                System.out.print("\tCLUB: " + f_in.readUTF());*/
                System.out.printf("COD. PAÍS: %d PAIS: %s NOMBRE: %-22s AÑO: %d ALTURA: %.2f CLUB: %s", f_in.readInt(), f_in.readUTF(), f_in.readUTF(), f_in.readInt(), f_in.readFloat(), f_in.readUTF());

                System.out.println();
            }
            f_in.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static File fileInput() {
        Scanner scanner = new Scanner(System.in);
        return new File(scanner.nextLine());
    }

    static int menuInput() {
        Scanner scanner = new Scanner(System.in);
        int input;
        try {
            input = scanner.nextInt();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            input = -10;
        }
        return input;
    }
}
