package U6_estructuras_de_datos.StackAndQueue;

import Librerias.Utilidades;

import java.util.*;

public class Ej2_ExpresionesAritmeticas {
    public String infijoStack(String postfija) {
        Stack<Integer> pila = new Stack<>();
        String[] grupos = Utilidades.dividirEnPalabras(postfija);
        int resultado = 0;
        for (int i = 0; i < grupos.length; i++) {
            String grupoActual = grupos[i];
            if (esNumero(grupoActual)) {
                int numActual = Integer.parseInt(grupos[i]);
                pila.push(numActual);
                resultado = numActual;
            } else if(isOperator(grupoActual)) {
                int num2 = pila.pop();
                int num1 = pila.pop();
                try {
                    resultado = operar(num1, num2, grupoActual);
                    pila.push(resultado);
                } catch (ArithmeticException e) {
                    return "ERROR";
                }
            }
        }
        return String.valueOf(resultado);
    }

    public String infijoQueue(String postfija) {
        Queue<Integer> cola = new LinkedList<>();
        String[] grupos = Utilidades.dividirEnPalabras(postfija);
        int resultado = 0;
        for (int i = 0; i < grupos.length; i++) {
            String grupoActual = grupos[i];
            if (esNumero(grupoActual)) {
                int numActual = Integer.parseInt(grupoActual);
                cola.offer(numActual);
                resultado = numActual;
            } else if (isOperator(grupoActual)) {
                int num2 = cola.poll();
                if (cola.isEmpty()) return String.valueOf(resultado);
                int num1 = cola.poll();
                try {
                    resultado = operar(num1, num2, grupoActual);
                    cola.offer(resultado);
                } catch (ArithmeticException e) {
                    return "ERROR";
                }
            }
        }
        return String.valueOf(resultado);
    }

    public boolean esNumero(String cadena) {
        for (int i = 0;  i < cadena.length(); i++) {
            if (!Character.isDigit(cadena.charAt(i))) return false;
        }
        return true;
    }

    public boolean isOperator(String caracter) {
        String operadores = "/*+-";
        return operadores.contains(caracter + "");
    }

    public int operar(int num1, int num2, String operador) throws ArithmeticException {
        switch (operador) {
            case "/":
                return num1/num2;
            case "*":
                return num1 * num2;
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
        }
        return 0;
    }
}
