package Ventana;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana extends JFrame {
	JFrame Ventana = new JFrame();
	
	public Ventana (String title) {
		this.setTitle("Acceso"); //Agrega titulo
		this.setVisible(true); //Hace visible la ventana
		this.setSize(500, 500); //Ajuste del tamaño de la ventana
		this.setResizable(false); //Permite ajustar el tamaño de la ventana
		this.setLayout(null); //Elimina el formato predeterminado de la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Ejecuta el cierre o finaliza el programa cuando se cierra la ventana
		this.setLocationRelativeTo(null);
		
		JLabel etiqueta1 = new JLabel("Bienvenido"); //Creacion de una etiqueta junto con su contenido
		etiqueta1.setSize(100, 100);
		etiqueta1.setLocation(30, 40); //Posicion donde se imprime la etiqueta
		etiqueta1.setBackground(Color.ORANGE); //Color de fondo para la etiqueta
		this.add(etiqueta1); //Agrega la etiqueta en la ventana
	}
}
