package U1_basic_java;//Algoritmo que calcule el salario neto de un trabajador en función del número de horas de trabajo y los impuestos

import java.util.Scanner;

public class Ejercicio19 {
	public static void main(String[] args){
		
		double horasTrabajadas;
		double precioPorHora;
		
		double pagoBruto;
		double salarioNeto;
		double impuestos;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese las horas trabajadas:");
		horasTrabajadas = scanner.nextDouble();
		System.out.println("Ingrese el precio por hora:");
		precioPorHora = scanner.nextDouble();
		
		
		//Calculamos el pago bruto
		
		if(horasTrabajadas <= 35) {
			pagoBruto = horasTrabajadas * precioPorHora;
		} else {
			double horasExtra = horasTrabajadas - 35;
			pagoBruto = (35 * precioPorHora) + (horasExtra * (precioPorHora * 1.5));
		}
		
		
		//Calculamos el salario neto
		
		double sueldo45 = pagoBruto - 900;
		double sueldo25 = pagoBruto - sueldo45 - 500;
		
		if(pagoBruto <= 500){
			salarioNeto = pagoBruto;
		} else {
			salarioNeto = 500 + ((sueldo25 * 25)/100) + ((sueldo45 * 45)/100);
		}
		
		
		//Calculamos los impuestos
		
		impuestos = pagoBruto - salarioNeto;
		
		
		//Mostramos los resultados
		
		System.out.println("Pago bruto: " + pagoBruto);
		System.out.println("Salario neto: " + salarioNeto);
		System.out.println("Impuestos: " + impuestos);
	}
}