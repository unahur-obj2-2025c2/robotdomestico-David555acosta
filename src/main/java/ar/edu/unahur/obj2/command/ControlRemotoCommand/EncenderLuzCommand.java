package ar.edu.unahur.obj2.command.ControlRemotoCommand;

public class EncenderLuzCommand implements Comando {

    private Luz luz;

    public EncenderLuzCommand(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void ejecutar() {
        luz.encender();
    }

}
