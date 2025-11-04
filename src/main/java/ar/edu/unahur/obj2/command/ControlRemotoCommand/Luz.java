package ar.edu.unahur.obj2.command.ControlRemotoCommand;

public class Luz {
    private Boolean estaEncendida = false;

    public void encender() {
        this.estaEncendida = true;
    }

    public void apagar() {
        this.estaEncendida = false;
    }

    public Boolean estaEncencida() {
        return this.estaEncendida;
    }

}
