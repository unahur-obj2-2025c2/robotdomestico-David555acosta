package ar.edu.unahur.obj2.command;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.command.Excepciones.Calculadora;
import ar.edu.unahur.obj2.command.Excepciones.Persona;

public class CalculadoraTes {
    Calculadora calculadora;
    Persona persona;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
        persona = new Persona();
    }

    @Test
    void pruebaBasicaExepcion() throws RuntimeException {
        Exception error = assertThrows(Exception.class, () -> {
            calculadora.dividir(10, 0);
        });

        assertEquals("No se puede dividir por 0 facha", error.getMessage());
    }

    @Test
    void pruebaPersonaCalculadora() {
        Exception error = assertThrows(Exception.class, () -> {
            persona.calcular(10, 0);
        });

        assertEquals("No se puede dividir por 0 facha", error.getMessage());
    }
}
