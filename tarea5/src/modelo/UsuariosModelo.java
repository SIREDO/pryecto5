package modelo;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UsuariosModelo {
	
	
	private  final static String USERS_SEL = "SELECT * FROM users";
	private  final static String USER_COL = "user";
	
	private Connection conexion = null;
	private Statement instruccion =null;
	private ResultSet conjuntoResultados=null;
	
	private ArrayList<String> users=null;

	public UsuariosModelo(){
		
		//llamamos a la conexion con el singleton
		
		conexion=ConexionDB.getConexion();
		
		//array para guardar la seleccion a BBDD
		users=new ArrayList<String>();
	}
	
	public ArrayList getUsuarios(){
		
		try{
			//creamos un statement, un canal entre app y BBDD
			instruccion=conexion.createStatement();
			
			//asignamos a la variable lo que devuelve la query
			conjuntoResultados=instruccion.executeQuery(USERS_SEL);
			
			//mientras haya resultados que los coloque en el arraylist
			while (conjuntoResultados.next()){
				
				users.add(conjuntoResultados.getString(USER_COL));
			}
			return users;
		}
		catch (SQLException excepcionSql){
			
			excepcionSql.printStackTrace();
			return users;
		} 
		finally //para que siga ejecutando el try
		{
			try{
				//cerramos el resultset y despues el singleton
				conjuntoResultados.close();
				instruccion.close();
			}
			catch (SQLException excepcionSql){
				excepcionSql.printStackTrace();
			}
		}
	}
}
