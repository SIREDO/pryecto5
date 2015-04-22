package vista;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class VistaApp extends JFrame {

	private JMenuBar menuBar;
	private JMenu principal, juegos, perfil;
	private JMenuItem principalItem, juegosItem, perfilItem; 
	private VistaPrincipal contentPane;


	/**
	 * Create the frame.
	 */
	public VistaApp() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 500, 600);
		
		contentPane = new VistaPrincipal();
		setContentPane(contentPane);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
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
