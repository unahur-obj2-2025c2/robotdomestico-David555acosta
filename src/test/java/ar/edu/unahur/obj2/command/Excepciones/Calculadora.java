package ar.edu.unahur.obj2.command.Excepciones;

public class Calculadora {
    public Integer dividir(Integer dividendo, Integer divisor) {
        if (divisor != 0) {
            return dividendo / divisor;
        }
        throw new DivisionPorCeroException();
    }
}
