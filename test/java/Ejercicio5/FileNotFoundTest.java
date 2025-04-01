package Ejercicio5;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FileNotFoundTest {

    @Test
    public void testArchivoNoEncontrado() {
        // Capturamos la salida estándar para analizarla
        ByteArrayOutputStream salidaCapturada = new ByteArrayOutputStream();
        PrintStream salidaOriginal = System.out;
        System.setOut(new PrintStream(salidaCapturada));

        // Ejecutamos el método principal
        FileNotFound.main(new String[]{});

        // Restauramos la salida estándar
        System.setOut(salidaOriginal);

        // Verificamos que el mensaje de error se imprime correctamente
        String salidaEsperada = "Error: El archivo no fue encontrado.";
        assertTrue(salidaCapturada.toString().contains(salidaEsperada), "El mensaje de error no coincide.");
    }

    @Test
    public void testMensajeFinalizacion() {
        // Capturamos la salida estándar para analizarla
        ByteArrayOutputStream salidaCapturada = new ByteArrayOutputStream();
        PrintStream salidaOriginal = System.out;
        System.setOut(new PrintStream(salidaCapturada));

        // Ejecutamos el método principal
        FileNotFound.main(new String[]{});

        // Restauramos la salida estándar
        System.setOut(salidaOriginal);

        // Verificamos que el mensaje de finalización se imprime correctamente
        String mensajeFinalEsperado = "Finalizando la búsqueda del archivo.";
        assertTrue(salidaCapturada.toString().contains(mensajeFinalEsperado), "El mensaje de finalización no coincide.");
    }
}
