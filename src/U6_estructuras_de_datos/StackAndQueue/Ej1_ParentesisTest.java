package U6_estructuras_de_datos.StackAndQueue;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

class Ej1_ParentesisTest {

    @Test
    void evaluarParentesis() {
        Ej1_Parentesis parentesis = new Ej1_Parentesis();
        assertTrue(parentesis.evaluarParentesis("{([{}])}"));
        assertTrue(parentesis.evaluarParentesis("{([{uno}{otro}])([])}"));
        assertFalse(parentesis.evaluarParentesis("{([{dos}}])([])}"));
        assertFalse(parentesis.evaluarParentesis("{([{}{}])[])}"));
    }
}