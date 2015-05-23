package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConexionDB {
	// DATOS DE LA CONEXION
		static final String CONTROLADOR_MYSQL= "com.mysql.jdbc.Driver";
		
		//DATOS DE LA BBDD
		private String host;
		private String bbdd;
		private String user;
		private String pass;
		private String url="jdbc:mysql://";
		
		//Conexion
		private static Connection conexion = null;// maneja la conexi�
		
		//Instancia unica
		private static ConexionDB instance = null;
		
		private ConexionDB(String HOST,String BBDD,String USER,String PASS) {
			this.host=HOST;
			this.bbdd=BBDD;
			this.user=USER;
			this.pass=PASS;
		}
		
		//Implementar SingleTon para crear la conexion desde el metodo
		public static ConexionDB getInstance(String HOST,String BBDD,String USER,String PASS) {
		      if(instance == null) {
		         instance = new ConexionDB(HOST,BBDD,USER,PASS);
		      }
		      return instance;
		   }
		
		public boolean connectDB(){
			try{
				//Lo primero es cargar el controlador MySQL el cual autom�ticamente se registra
				Class.forName(CONTROLADOR_MYSQL);
				//Conectarnos a la BBDD
				conexion = DriverManager.getConnection(this.url+this.host+"/"+this.bbdd,this.user,this.pass);
			}
			catch( SQLException excepcionSql ) 
			{
				excepcionSql.printStackTrace();
				return false;
			}
			catch( ClassNotFoundException noEncontroClase)
			{
				noEncontroClase.printStackTrace();
				return false;
			}
			return true;
		}
		
		public static Connection getConexion(){
			return conexion;
		}

}
