package ar.edu.unahur.obj2.command.ControlRemotoCommand;

public class ControlRemoto {
    private Comando comando;

    public ControlRemoto() {
    }

    public ControlRemoto(Comando comando) {
        this.comando = comando;
    }

    public void setComando(Comando comando) {
        this.comando = comando;
    }

    public void presionarBoton() throws ComandRemoteException {
        if (this.comando == null) {
            throw new ComandRemoteException("se paso un comando nulo");
        }

        comando.ejecutar();
    }

    public Comando getComando() {
        return comando;
    }

}
