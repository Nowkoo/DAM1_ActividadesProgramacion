package U1_basic_java;//Algoritmo que recibe horas, minutos y segundos y muestra horas, minutos y segundos
//resultantes de la adición de un segundo.

import java.util.Scanner;

public class Ejercicio18 {
	public static void main (String[] args) {
		
		int hour, min, sec;
		String oldTime, newTime;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese la hora:");
		hour = scanner.nextInt();
		System.out.println("Ingrese los minutos:");
		min = scanner.nextInt();
		System.out.println("Ingrese los segundos:");
		sec = scanner.nextInt();
		
		oldTime = hour + "h " + min + "m " + sec + "s";
		
		if(sec < 59) {
			sec++;
		} else if(sec == 59 && min < 59) {
			min++;
			sec = 0;
		} else if(hour < 23 && sec == 59 && min == 59) {
			hour++;
			min = 0;
			sec = 0;
		} else if(hour == 23) {
			hour = 0;
			min = 0;
			sec = 0;
		} else {
			System.out.println("Hora invalida");
			return;
		}
		
		newTime = hour + "h " + min + "m " + sec + "s";
		
		System.out.println("Old time: " + oldTime);
		System.out.println("New time: " + newTime);
	}
}