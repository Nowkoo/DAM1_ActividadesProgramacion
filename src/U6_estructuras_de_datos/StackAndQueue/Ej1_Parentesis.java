package U6_estructuras_de_datos.StackAndQueue;

import java.util.Stack;

import static org.junit.Assert.assertTrue;

public class Ej1_Parentesis {

    public static void main(String[] args) {

    }

     public static boolean evaluarParentesis(String cadena) {
        Stack<Character> parentesis = new Stack<>();

        for (int i = 0; i < cadena.length(); i++) {
            if (esParentesisDeApertura(cadena.charAt(i))) {
                parentesis.push(cadena.charAt(i));
            }

            if (esParentesisDeCierre(cadena.charAt(i)) ) {
                if (parentesis.peek().equals(parentesisEquivalente(cadena.charAt(i)))) {
                    parentesis.pop();
                } else {
                    return false;
                }
            }
        }
        return parentesis.empty();
     }

     public static boolean esParentesisDeApertura(char caracter) {
        return caracter == '{' || caracter == '[' || caracter == '(';
     }

    public static boolean esParentesisDeCierre(char caracter) {
        return caracter == '}' || caracter == ']' || caracter == ')';
    }

    public static char parentesisEquivalente(char caracter) {
        //Character cierre = caracter;
        switch (caracter) {
            case ']':
                return '[';
            case '}':
                return '{';
            case ')':
                return '(';
        }
        return ' ';
    }
}
