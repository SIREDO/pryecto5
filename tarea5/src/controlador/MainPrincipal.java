package controlador;

import modelo.ConexionDB;
import vista.VistaApp;



public class MainPrincipal {
	
	private static ConexionDB conexion;

	public static void main(String[] args) {
		
		conexion=ConexionDB.getInstance("localhost","gamedb","root","silphp");
		conexion.connectDB();
		// Llamamos a la vista de la app para que se ejecute
		
		VistaApp frame = new VistaApp();
		frame.setVisible(true);
	}

}
