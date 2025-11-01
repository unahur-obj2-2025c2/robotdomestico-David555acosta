package ar.edu.unahur.obj2.command;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.command.Excepciones.Calculadora;

public class CalculadoraTes {
    Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    void pruebaBasicaExepcion() throws Exception {
        Exception error = assertThrows(Exception.class, () -> {
            calculadora.dividir(10, 0);
        });

        assertEquals("El divisor no puede ser 0", error.getMessage());
    }
}
