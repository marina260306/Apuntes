package Ejercicio5;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MultiCatchExampleTest {

    @Test
    public void testEntradaNoValida() {
        // Simulamos entrada no válida (texto en vez de número)
        String datosEntrada = "abc\n";
        ByteArrayInputStream entradaSimulada = new ByteArrayInputStream(datosEntrada.getBytes());
        System.setIn(entradaSimulada);

        // Capturamos la salida estándar
        ByteArrayOutputStream salidaCapturada = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salidaCapturada));

        // Ejecutamos el método principal
        MultiCatchExample.main(new String[]{});

        // Restauramos entrada y salida originales
        System.setIn(System.in);
        System.setOut(System.out);

        // Verificamos el mensaje de error
        String salidaEsperada = "Error: Entrada no válida. Debe ser un número entero.";
        assertTrue(salidaCapturada.toString().contains(salidaEsperada), "El mensaje de error no coincide.");
    }

    @Test
    public void testDivisionPorCero() {
        // Simulamos entrada con divisor igual a cero
        String datosEntrada = "10\n0\n";
        ByteArrayInputStream entradaSimulada = new ByteArrayInputStream(datosEntrada.getBytes());
        System.setIn(entradaSimulada);

        // Capturamos la salida estándar
        ByteArrayOutputStream salidaCapturada = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salidaCapturada));

        // Ejecutamos el método principal
        MultiCatchExample.main(new String[]{});

        // Restauramos entrada y salida originales
        System.setIn(System.in);
        System.setOut(System.out);

        // Verificamos el mensaje de error
        String salidaEsperada = "Error: No se puede dividir entre cero.";
        assertTrue(salidaCapturada.toString().contains(salidaEsperada), "El mensaje de error no coincide.");
    }

    @Test
    public void testDivisionExitosa() {
        // Simulamos una entrada válida
        String datosEntrada = "10\n2\n";
        ByteArrayInputStream entradaSimulada = new ByteArrayInputStream(datosEntrada.getBytes());
        System.setIn(entradaSimulada);

        // Capturamos la salida estándar
        ByteArrayOutputStream salidaCapturada = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salidaCapturada));

        // Ejecutamos el método principal
        MultiCatchExample.main(new String[]{});

        // Restauramos entrada y salida originales
        System.setIn(System.in);
        System.setOut(System.out);

        // Verificamos el resultado esperado
        String salidaEsperada = "Resultado: 5";
        assertTrue(salidaCapturada.toString().contains(salidaEsperada), "El resultado de la división no coincide.");
    }

    @Test
    public void testMensajeFinalizacion() {
        // Simulamos cualquier entrada para verificar el bloque `finally`
        String datosEntrada = "10\n2\n";
        ByteArrayInputStream entradaSimulada = new ByteArrayInputStream(datosEntrada.getBytes());
        System.setIn(entradaSimulada);

        // Capturamos la salida estándar
        ByteArrayOutputStream salidaCapturada = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salidaCapturada));

        // Ejecutamos el método principal
        MultiCatchExample.main(new String[]{});

        // Restauramos entrada y salida originales
        System.setIn(System.in);
        System.setOut(System.out);

        // Verificamos el mensaje de finalización
        String mensajeFinalEsperado = "Finalizando operación.";
        assertTrue(salidaCapturada.toString().contains(mensajeFinalEsperado), "El mensaje de finalización no coincide.");
    }
}
