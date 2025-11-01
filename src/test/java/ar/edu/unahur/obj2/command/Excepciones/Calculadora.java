package ar.edu.unahur.obj2.command.Excepciones;

public class Calculadora {
    public Integer dividir(Integer dividendo, Integer divisor) throws Exception {
        if(divisor != 0) {
            return dividendo / divisor;
        }

        throw new Exception("El divisor no puede ser 0");
    }
}
