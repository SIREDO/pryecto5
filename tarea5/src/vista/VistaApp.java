package vista;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Toolkit;

public class VistaApp extends JFrame {

	//Creamos variables para almacenar el menu y sus items, asi como la vista principal
	private JMenuBar menuBar;
	private JMenu principal, juegos, perfil;
	private JMenuItem principalItem, juegosItem, perfilItem; 
	private VistaPrincipal contentPane;


	/**
	 * Create the frame.
	 */
	public VistaApp() {
		
	/*Configuración de la ventana de nuestra app*/
		
		//Agregamos un icono en el margen 
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(VistaApp.class.getResource("/images/icono.png")));
		
		//Programamos la ventana para que al cerrarse se cierre la aplicación
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Configuración del tamaño de la ventana
		
		setBounds(100, 100, 500, 600);
		
		//Creamos y añadimos al contenedor de la ventana la vista principal
		
		contentPane = new VistaPrincipal();
		setContentPane(contentPane);
		
		//Creamos y añadimos el menu de la ventana
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
			//agregamos en el menu 3 opciones con sus respectivos items
		
			principal = new JMenu("Principal");
			menuBar.add(principal);
		
				principalItem = new JMenuItem("Principal");
				principal.add(principalItem);
		
			juegos = new JMenu("Juegos");
			menuBar.add(juegos);
		
				juegosItem = new JMenuItem("Juegos");
				juegos.add(juegosItem);
		
			perfil = new JMenu("Perfil");
			menuBar.add(perfil);
		
				perfilItem = new JMenuItem("Perfil");
				perfil.add(perfilItem);
		
		
	}

}
