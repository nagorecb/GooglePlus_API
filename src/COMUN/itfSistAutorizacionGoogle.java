package COMUN;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface itfSistAutorizacionGoogle extends Remote
{
	boolean ValidarUsuario (String email) throws RemoteException;
}
