package COMUN;

import java.rmi.Remote;

public interface itfSistAutorizacionGoogle extends Remote
{
	boolean ValidarUsuario (String email);
}
