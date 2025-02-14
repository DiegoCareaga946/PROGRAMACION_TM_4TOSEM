package Ventana;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame {
	JFrame Ventana = new JFrame();
	
	public Ventana (String title) {
		Font etiquetas = new Font("Andale Mono", Font.BOLD, 22);
		
		this.setTitle("Acceso"); //Agrega titulo
		this.setVisible(true); //Hace visible la ventana
		this.setSize(500, 500); //Ajuste del tamaño de la ventana
		this.setResizable(false); //Permite ajustar el tamaño de la ventana
		this.setLayout(null); //Elimina el formato predeterminado de la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Ejecuta el cierre o finaliza el programa cuando se cierra la ventana
		this.setLocationRelativeTo(null);
		
		JPanel Login = new JPanel();
		Login.setLocation(0, 0);
		Login.setSize(500, 500);
		Login.setBackground(Color.YELLOW); //Color de fondo para la etiqueta
		Login.setOpaque(true);
		this.add(Login);
		
		JLabel etiqueta1 = new JLabel("Bienvenido"); //Creacion de una etiqueta junto con su contenido
		etiqueta1.setSize(160, 40);
		etiqueta1.setLocation(160, 10); //Posicion donde se imprime la etiqueta
		etiqueta1.setBackground(Color.YELLOW); //Color de fondo para la etiqueta
		etiqueta1.setOpaque(true);
		etiqueta1.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		Login.add(etiqueta1); //Agrega la etiqueta en la ventana
		
		JLabel etiqueta2 = new JLabel("Otro Dato"); //Creacion de una etiqueta junto con su contenido
		etiqueta2.setBounds(30, 100, 150, 100); //Hace lo que SetSize y SetLocation
		etiqueta2.setBackground(Color.green); //Color de fondo para la etiqueta
		etiqueta2.setOpaque(true);
		etiqueta2.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		this.add(etiqueta2); //Agrega la etiqueta en la ventana
		
		
		
	}
}
