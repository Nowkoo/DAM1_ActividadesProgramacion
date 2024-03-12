package U6_estructuras_de_datos.StackAndQueue;

import Librerias.Utilidades;

import java.util.Stack;

public class Ej2_ExpresionesAritmeticas {
    public String infijoStack(String postfija) {
        Stack<Integer> pila = new Stack<>();
        String[] grupos = Utilidades.dividirEnPalabras(postfija);
        int resultado = 0;
        for (int i = 0; i < grupos.length; i++) {
            String grupoActual = grupos[i];
            if (Character.isDigit(grupoActual.charAt(0))) {
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

    public void infijoQueue() {

    }

    public boolean isOperator(String caracter) {
        String operadores = "/*+-";
        return operadores.contains(caracter + "");
    }
}
