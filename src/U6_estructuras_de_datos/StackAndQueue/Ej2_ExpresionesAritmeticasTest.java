package U6_estructuras_de_datos.StackAndQueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ej2_ExpresionesAritmeticasTest {

    @Test
    void infijoStack() {
        Ej2_ExpresionesAritmeticas operacionesStack = new Ej2_ExpresionesAritmeticas();
        assertEquals(operacionesStack.infijoStack("2 4 6 3 / * +"), "10");
        assertEquals(operacionesStack.infijoStack("6"), "6");
        assertEquals(operacionesStack.infijoStack("3 5 4 + *"), "27");
        assertEquals(operacionesStack.infijoStack("8 1 1 - /"), "ERROR");
        assertEquals(operacionesStack.infijoStack("1 1 - 8 /"), "0");
        assertEquals(operacionesStack.infijoStack("0 0 /"), "ERROR");
    }

    @Test
    void infijoQueue() {
        Ej2_ExpresionesAritmeticas operacionesQueue = new Ej2_ExpresionesAritmeticas();
        assertEquals(operacionesQueue.infijoQueue("2 4 6 3 / * +"), "20");
        assertEquals(operacionesQueue.infijoQueue("6"), "6");
        assertEquals(operacionesQueue.infijoQueue("3 5 4 + *"), "32");
        assertEquals(operacionesQueue.infijoQueue("8 1 1 - /"), "-7");
        assertEquals(operacionesQueue.infijoQueue("1 1 - 8 /"), "ERROR");
        assertEquals(operacionesQueue.infijoQueue("0 0 /"), "ERROR");
    }
}