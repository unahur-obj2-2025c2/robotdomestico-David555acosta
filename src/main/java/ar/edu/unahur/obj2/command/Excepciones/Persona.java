package ar.edu.unahur.obj2.command.Excepciones;

public class Persona {

    Calculadora calculadora = new Calculadora();

    public void calcular(Integer a, Integer b) {
        try {
            calculadora.dividir(a, b);
        } catch (Exception e) {
            throw new DivisionPorCeroException();
        }
    }
}
