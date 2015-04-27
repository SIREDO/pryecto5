package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import java.awt.Font;

public class VistaPrincipal extends JPanel {
	
	//Creamos variables para almacenar los distintos elementos del contenedor principal
	private JLabel fotoUser, lblUsuario, lblContrasena;
	private JButton btnJuegos, btnPerfil, btnLogin, btnRegistrarse;
	private JComboBox comboBox;
	private JPasswordField password;
	
	
	/**
	 * Create the panel.
	 */
	public VistaPrincipal() {
		
		//Configuraci�n del contenedor
		
		setLayout(null);
		
			//Creamos y a�adimos un label que mostrar� la foto de usuario de la app
			fotoUser = new JLabel("");
			fotoUser.setBorder(new LineBorder(new Color(0, 0, 0), 2));
			fotoUser.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/images/fotoUser.jpg")));
			fotoUser.setBounds(48, 21, 150, 165);
			add(fotoUser); 
			
			//Creamos y a�adimos dos botones para acceder a la seccion de juegos y a la de perfil
		
			btnJuegos = new JButton("Juegos >");
			btnJuegos.setFont(new Font("Segoe Print", Font.BOLD, 18));
			btnJuegos.setBounds(228, 21, 201, 33);
			add(btnJuegos);
			
			btnPerfil = new JButton("Perfil >");
			btnPerfil.setFont(new Font("Segoe Print", Font.BOLD, 18));
			btnPerfil.setBounds(228, 69, 201, 33);
			add(btnPerfil);
			
			//Creamos y a�adimos etiqueta usuario
		
			lblUsuario = new JLabel("Usuario");
			lblUsuario.setFont(new Font("Segoe Print", Font.BOLD, 18));
			lblUsuario.setBounds(48, 221, 81, 23);
			add(lblUsuario);
			
			//creamos y a�adimos un combobox al contenedor ligado a la etiqueta usuario
		
			comboBox = new JComboBox();
			comboBox.setBounds(48, 255, 150, 23);
			add(comboBox);
			
			//creamos y a�adimos etiqueta cotrase�a
		
			lblContrasena = new JLabel("Contrase�a");
			lblContrasena.setFont(new Font("Segoe Print", Font.BOLD, 18));
			lblContrasena.setBounds(48, 314, 111, 23);
			add(lblContrasena);
			
			//creamos y a�adimos un passwordfield para que el usuario introduzca la contrase�a
		
			password = new JPasswordField();
			password.setBounds(48, 348, 150, 20);
			add(password);
			
			//creamos y a�adimos dos botones: uno para logearse y otro para registrar nuevos usuarios
		
			btnLogin = new JButton("Login");
			btnLogin.setFont(new Font("Segoe Print", Font.BOLD, 18));
			btnLogin.setBounds(48, 408, 150, 33);
			add(btnLogin);
		
			btnRegistrarse = new JButton("Registrarse");
			btnRegistrarse.setFont(new Font("Segoe Print", Font.BOLD, 18));
			btnRegistrarse.setBounds(48, 460, 150, 33);
			add(btnRegistrarse);
		
	}
}
