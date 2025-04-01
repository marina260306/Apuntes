package Ejercicio5;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Dividir0usandoScannerTest {

    @Test
    public void testDivisionPorCero() {
        // Simular entrada del usuario: numerador 10 y denominador 0
        String datosEntrada = "10\n0\n";
        ByteArrayInputStream entradaSimulada = new ByteArrayInputStream(datosEntrada.getBytes());
        System.setIn(entradaSimulada);

        // Capturar la salida del programa
        ByteArrayOutputStream salidaCapturada = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salidaCapturada));

        // Ejecutar el método principal
        Dividir0usandoScanner.main(new String[]{});

        // Restaurar las configuraciones originales de entrada y salida
        System.setIn(System.in);
        System.setOut(System.out);

        // Verificar que el mensaje de error se imprime correctamente
        String salidaEsperada = "Error: No se puede dividir entre cero.";
        assertTrue(salidaCapturada.toString().contains(salidaEsperada), "El mensaje de error no coincide.");
    }

    @Test
    public void testDivisionExitosa() {
        // Simular entrada del usuario: numerador 10 y denominador 2
        String datosEntrada = "10\n2\n";
        ByteArrayInputStream entradaSimulada = new ByteArrayInputStream(datosEntrada.getBytes());
        System.setIn(entradaSimulada);

        // Capturar la salida del programa
        ByteArrayOutputStream salidaCapturada = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salidaCapturada));

        // Ejecutar el método principal
        Dividir0usandoScanner.main(new String[]{});

        // Restaurar las configuraciones originales de entrada y salida
        System.setIn(System.in);
        System.setOut(System.out);

        // Verificar que el resultado correcto se imprime
        String salidaEsperada = "El resultado de la división es: 5";
        assertTrue(salidaCapturada.toString().contains(salidaEsperada), "El resultado de la división no coincide.");
    }
}
