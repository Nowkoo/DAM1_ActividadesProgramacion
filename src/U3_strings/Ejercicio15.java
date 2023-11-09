package U3_strings;
import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {
		
		String word;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduzca una cadena de carácteres: ");
		word = scanner.next();
		
		if (checkParenthesis(word))
			System.out.println("La cadena está bien parentizada.");
		else
			System.out.println("La cadena está mal parentizada.");
		
	}
	
	public static boolean checkParenthesis(String s) {
		//Indica si hay paréntesis de apertura sin cerrar.
		int openingsCount = -1;
		//Indica si hay paréntesis de cierre sin apertura.
		int closingsCount = -1;
		char[] openParenthesis = new char[s.length()];
		
		for (int i = 0; i < s.length(); i++) {
			
			//Si es un parentésis de apertura, se incrementa openingsCount y se guarda el char en el array de paréntesis abiertos.
			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				openingsCount++;
				openParenthesis[openingsCount] = s.charAt(i);
			
			//Si es un paréntesis de cierre...
			} else if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
				
				//Si no hay paréntesis que cerrar, nos salimos del bucle.
				if (openingsCount == -1) {
					closingsCount++;
					break;
				
				//Si hay paréntesis que cerrar y el paréntesis de apertura coincide con el de cierre, reducimos openingsCount.
				} else if (openParenthesis[openingsCount] == '(' && s.charAt(i) == ')' || 
						   openParenthesis[openingsCount] == '[' && s.charAt(i) == ']' || 
						   openParenthesis[openingsCount] == '{' && s.charAt(i) == '}') {
						
					openingsCount--;
				
				//Si no coinciden, incrementamos closingsCount y nos salimos del bucle. 
				//No podemos tener un parentésis de cierre sin uno de apertura: la cadena está mal parentizada.				
				} else {
					closingsCount++;
					break;
				}
			}	
		}
		
		//Si todos los paréntesis están bien abiertos y bien cerrados, ambas cuentas darán -1.
		return (openingsCount == -1 && closingsCount == -1);
	}
}