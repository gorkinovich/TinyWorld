package icaro.aplicaciones.recursos.persistenciaAccesoBD;


import icaro.infraestructura.patronRecursoSimple.ItfUsoRecursoSimple;
import java.sql.*;

public interface ItfUsoPersistenciaAccesoBD extends ItfUsoRecursoSimple {
	public boolean compruebaUsuario(String usuario, String password) throws Exception;
	public boolean compruebaNombreUsuario(String usuario) throws Exception;
	public void insertaUsuario (String usuario,String password) throws Exception;
        ResultSet obtieneDatosUsuario (String usuario) throws Exception;
}