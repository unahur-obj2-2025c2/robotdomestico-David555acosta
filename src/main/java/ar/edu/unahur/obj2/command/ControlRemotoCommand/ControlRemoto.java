package ar.edu.unahur.obj2.command.ControlRemotoCommand;

import ar.edu.unahur.obj2.command.ComandRemoteException;

public class ControlRemoto {
    private Comando comando;

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

}
