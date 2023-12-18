package U4_ficheros;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Seleccion {
    public static void main(String[] args) {
        int exitKey = 0;
        int option = 1;

        while (option != exitKey) {
            System.out.println("0: Cerrar programa");
            System.out.println("1: Generar fichero con la selección de EEUU.");
            System.out.println("2: Leer ficheros de selección.");
            System.out.println("3: Añadir los jugadores de una selección a los de otra (combinar).");
            System.out.println("Introduce tu opción de trabajo: ");
            option = menuInput();

            if (option == 1) {
                generarFichero(generarJugadores(), "./recursos/seleccion_EEUU.dat");
                System.out.println("Se ha generado el fichero con la selección de EEUU.");

            } else if (option == 2) {
                System.out.println("Introduzca la ruta del fichero que quiere leer: ");
                File f = fileInput();
                if(f.exists() && f.isFile())
                    leerSeleccion(f);
                else
                    System.out.println("Archivo no válido.");

            } else if (option == 3) {
                System.out.println("Introduzca la ruta del fichero de selección al que se añadirán los nuevos jugadores: ");
                File f = fileInput();
                if(f.exists() && f.isFile()) {
                    System.out.println("Introduzca la ruta del fichero de selección donde se encuentran los datos de los jugadores que quiere añadir al primer fichero: ");
                    File f2 = fileInput();
                    if(f2.exists() && f2.isFile())
                        combinarSelecciones(f, f2);
                    else
                        System.out.println("Archivo no válido.");
                } else
                    System.out.println("Archivo no válido.");

            } else if (option == 0) {
                break;

            } else {
                System.out.println("La opción seleccionada no existe.");
            }
        }
    }

    public static ArrayList<Jugador> generarJugadores() {
        ArrayList<Jugador> jugadores = new ArrayList<>();

        jugadores.add(new Jugador(4, "USA", "Matt Turner", 1994, 1.90f, "Arsenal (ENG)"));
        jugadores.add(new Jugador(4, "USA", "Ethan Horvath", 1995, 1.93f, "Luton Town (ENG)"));
        jugadores.add(new Jugador(4, "USA", "Sean Johnson", 1989, 1.90f, "New York City FC (USA)"));
        jugadores.add(new Jugador(4, "USA", "Sergiño Dest", 2000, 1.73f, "Milan (ITA)"));
        jugadores.add(new Jugador(4, "USA", "Walker Zimmerman", 1993, 1.90f, "Nashville SC"));
        jugadores.add(new Jugador(4, "USA", "Antonee Robinson", 1997, 1.82f, "Fulham (ENG)"));
        jugadores.add(new Jugador(4, "USA", "Tim Ream", 1987, 1.85f, "Fulham (ENG)"));
        jugadores.add(new Jugador(4, "USA", "Aaron Long", 1992, 1.88f, "New York Red Bulls (USA)"));
        jugadores.add(new Jugador(4, "USA", "Shaquell Moore", 1996, 1.80f, "Nashville SC (USA)"));
        jugadores.add(new Jugador(4, "USA", "Cameron Carter-Vickers", 1997, 1.85f, "Celtic (SCO)"));
        jugadores.add(new Jugador(4, "USA", "DeAndre Yedlin", 1993, 1.71f, "Inter Miami (USA)"));
        jugadores.add(new Jugador(4, "USA", "Joe Scally", 2002, 1.84f, "Borussia Mönchengladbach (GER)"));
        jugadores.add(new Jugador(4, "USA", "Tyler Adams", 1999, 1.75f, "Leeds United (ENG)"));
        jugadores.add(new Jugador(4, "USA", "Yunus Musah", 2002, 1.77f, "Valencia (SPA)"));
        jugadores.add(new Jugador(4, "USA", "Weston McKennie", 1998, 1.85f, "Juventus (ITA)"));
        jugadores.add(new Jugador(4, "USA", "Luca de la Torre", 1998, 1.78f, "Celta de Vigo (SPA)"));
        jugadores.add(new Jugador(4, "USA", "Cristian Roldan", 1995, 1.72f, "Seattle Sounders (USA)"));
        jugadores.add(new Jugador(4, "USA", "Kellyn Acosta", 1995, 1.77f, "Los Angeles FC (USA)"));
        jugadores.add(new Jugador(4, "USA", "Giovanni Reyna", 2002, 1.85f, "Borussia Dortmund (GER)"));

        return jugadores;
    }

    public static void generarFichero(ArrayList<Jugador> jugadores, String ruta) {
        try {
            DataOutputStream f_out = new DataOutputStream(new FileOutputStream(ruta));

            for (int i = 0; i < jugadores.size(); i++) {
                f_out.writeInt(jugadores.get(i).getCodPais());
                f_out.writeUTF(jugadores.get(i).getNombrePais());
                f_out.writeUTF(jugadores.get(i).getNombreJugador());
                f_out.writeInt(jugadores.get(i).getAñoNacimiento());
                f_out.writeFloat(jugadores.get(i).getAltura());
                f_out.writeUTF(jugadores.get(i).getClub());
            }
            f_out.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList arrayJugadores(File f) {
        ArrayList<Jugador> jugadores = new ArrayList<>();

        try {
            DataInputStream f_in = new DataInputStream((new FileInputStream(f)));
            while(f_in.available() > 0) {
                jugadores.add(new Jugador(f_in.readInt(), f_in.readUTF(), f_in.readUTF(), f_in.readInt(), f_in.readFloat(), f_in.readUTF()));
            }
            f_in.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return jugadores;
    }

    public static ArrayList ordenar(ArrayList<Jugador> jugadores) {
        Jugador aux;
        for (int i = 0; i < jugadores.size() - 1; i++) {
            for (int j = 0; j < (jugadores.size() - 1 - i); j++) {
                if (jugadores.get(j).getAñoNacimiento() > jugadores.get(j + 1).getAñoNacimiento()) {
                    aux = jugadores.get(j);
                    jugadores.set(j, jugadores.get(j + 1));
                    jugadores.set(j + 1, aux);
                }
            }
        }
        return jugadores;
    }

    public static void leerSeleccion(File f) {
        ArrayList<Jugador> jugadores = ordenar(arrayJugadores(f));
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.printf("COD. PAÍS: %-2d PAIS: %-10s NOMBRE: %-25s AÑO: %d ALTURA: %.2f CLUB: %s",
                    jugadores.get(i).getCodPais(), jugadores.get(i).getNombrePais(),
                    jugadores.get(i).getNombreJugador(), jugadores.get(i).getAñoNacimiento(),
                    jugadores.get(i).getAltura(), jugadores.get(i).getClub());
            System.out.println();
        }
    }

    public static void combinarSelecciones(File f, File f2) {
        ArrayList<Jugador> jugadores = arrayJugadores(f);
        jugadores.addAll(arrayJugadores(f2));
        generarFichero(jugadores, f.getPath());
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
