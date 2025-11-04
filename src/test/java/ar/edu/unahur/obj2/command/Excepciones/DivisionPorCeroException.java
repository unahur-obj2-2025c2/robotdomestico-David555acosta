package ar.edu.unahur.obj2.command.Excepciones;

public class DivisionPorCeroException extends RuntimeException {

    public DivisionPorCeroException() {
        super("No se puede dividir por 0 facha");
    }

}
