package ar.edu.unahur.obj2.command.ControlRemotoCommandTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.command.ControlRemotoCommand.ApagarLuzCommand;
import ar.edu.unahur.obj2.command.ControlRemotoCommand.Comando;
import ar.edu.unahur.obj2.command.ControlRemotoCommand.ControlRemoto;
import ar.edu.unahur.obj2.command.ControlRemotoCommand.EncenderLuzCommand;
import ar.edu.unahur.obj2.command.ControlRemotoCommand.Luz;

public class ControlRemotoTest {
    private Luz luz;
    private ControlRemoto control;
    private Comando comandoE;
    private Comando comandoA;

    @BeforeEach
    void setUp() {
        luz = new Luz();
        comandoE = new EncenderLuzCommand(luz);
        comandoA = new ApagarLuzCommand(luz);
        control = new ControlRemoto();
    }

    @Test
    void seLePasaUnComandoDefecuosoAlControlYLanzaExcepcion() throws Exception {
        Exception error = assertThrows(Exception.class, () -> {
            control.presionarBoton();
        });

        assertEquals("se paso un comando nulo", error.getMessage());
    }

    @Test
    void testSetComando() {
        control = new ControlRemoto(comandoA);
        assertEquals(comandoA, control.getComando());
    }

    @Test
    void dadoUnComandoEncenderEnciendeLaLuz() throws Exception {
        control = new ControlRemoto(comandoE);
        control.presionarBoton();
        assertTrue(luz.estaEncencida());
    }
}
