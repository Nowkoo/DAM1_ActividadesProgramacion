package U8_interfaces_gráficas.CalculadoraRPN;

import javax.swing.*;
import java.util.EmptyStackException;
import java.util.Stack;

public class Calculadora {
    private static String operacion = "0";
    private static String mathError = "Math ERROR";
    private static String syntaxError = "Syntax ERROR";
    private static String recordatorio = "Insertar espacios después de cada operador u operando.";
    InterfazCalculadora interfaz = new InterfazCalculadora();
    public static void main(String[] args) {
        new Calculadora();
        JOptionPane.showMessageDialog(null, recordatorio);
    }

    public static void escribir(String nuevo) {
        operacion = operacion + nuevo;
    }

    public static void borrar() {
        operacion = "0";
    }
    public static void limpiar() {
        operacion = "";
    }

    public static void calcular() {
        Stack<Integer> pila = new Stack<>();
        String[] grupos = dividirEnPalabras(operacion);
        int resultado = 0;
        for (int i = 0; i < grupos.length; i++) {
            String grupoActual = grupos[i];
            if (esNumero(grupoActual)) {
                int numActual = Integer.parseInt(grupos[i]);
                pila.push(numActual);
                resultado = numActual;
            } else if(isOperator(grupoActual)) {
                int num2;
                int num1;
                try {
                    num2 = pila.pop();
                    num1 = pila.pop();
                } catch (EmptyStackException e) {
                    operacion = syntaxError;
                    return;
                }
                try {
                    resultado = operar(num1, num2, grupoActual);
                    pila.push(resultado);
                } catch (ArithmeticException e) {
                    operacion = mathError;
                    return;
                }
            }
        }
        operacion = String.valueOf(resultado);
    }

    public static boolean esNumero(String cadena) {
        if (cadena.charAt(0) == '-' && cadena.length() == 1) {
            return false;
        } else if (!Character.isDigit(cadena.charAt(0)) && cadena.charAt(0) != '-') {
            return false;
        }

        for (int i = 1;  i < cadena.length(); i++) {
            if (!Character.isDigit(cadena.charAt(i))) return false;
        }

        return true;
    }

    public static boolean isOperator(String caracter) {
        String operadores = "/*+-";
        return operadores.contains(caracter + "");
    }

    public static int operar(int num1, int num2, String operador) throws ArithmeticException {
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

    public static String[] dividirEnPalabras(String cadena){
        // Quitar espacios en blanco al principio y al final
        cadena=cadena.trim();
        // Reemplazar uno o más espacios en blanco por un solo espacio
        cadena=cadena.replaceAll(" +", " ");
        // Dividir la cadena en partes por el carácter espacio (devuelve un array con cada una de las partes)
        return cadena.split(" ");
    }

    public static String getOperacion() {
        return operacion;
    }

    public static String getMathError() {
        return mathError;
    }

    public static String getSyntaxError() {
        return syntaxError;
    }
}
