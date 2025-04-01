package Ejercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Dividir0Test {

    @Test
    public void testDivisionPorCero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            int resultado = 10 / 0; // Esta línea debe lanzar una excepción
        });

        String mensajeEsperado = "/ by zero";
        String mensajeReal = exception.getMessage();

        assertEquals(mensajeEsperado, mensajeReal, "El mensaje de excepción no coincide");
    }
}
