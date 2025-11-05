package ar.edu.unahur.obj2.command.ControlRemotoCommandTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.command.ControlRemotoCommand.Luz;

public class LuzTest {
    private Luz luz;

    @BeforeEach
    void setUp() {
        luz = new Luz();
    }

    @Test
    void testApagar() {
        luz.apagar();
        assertFalse(luz.estaEncencida());
    }

    @Test
    void testEncender() {
        luz.encender();
        assertTrue(luz.estaEncencida());
    }

    @Test
    void testEstaEncencida() {

    }
}
