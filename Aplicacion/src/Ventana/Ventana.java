package Ventana;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class Ventana extends JFrame {
	JFrame Ventana = new JFrame();
	
	public Ventana (String title) {
		Font etiquetas = new Font("Andale Mono", Font.BOLD, 22);
		Font pequeño = new Font("Andale Mono", Font.ROMAN_BASELINE, 14);
		Font subrayado = new Font("Andale Mono", Font.ROMAN_BASELINE, 14);
		Map attributes = subrayado.getAttributes();
		attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		
		this.setTitle("Acceso"); //Agrega titulo
		
		this.setVisible(true); //Hace visible la ventana
		this.setSize(700, 700); //Ajuste del tamaño de la ventana
		this.setResizable(true); //Permite ajustar el tamaño de la ventana
		
		this.setLayout(null); //Elimina el formato predeterminado de la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Ejecuta el cierre o finaliza el programa cuando se cierra la ventana
		
		this.setMaximumSize(new Dimension(800, 800));
		this.setMinimumSize(new Dimension(400, 400));
		this.setLocationRelativeTo(null);
		
		JPanel Login = new JPanel();
		Login.setLocation(0, 0);
		Login.setSize(700, 700);
		Login.setBackground(Color.getHSBColor(209, 143, 171)); //Color de fondo para la etiqueta
		Login.setOpaque(true);
		Login.setLayout(null);
		this.add(Login);
		this.repaint();
		
		JLabel etiqueta1 = new JLabel("ACCEDER"); //Creacion de una etiqueta junto con su contenido
		etiqueta1.setSize(200, 50);
		etiqueta1.setLocation(250, 10); //Posicion donde se imprime la etiqueta
		etiqueta1.setBackground(Color.getHSBColor(3, 24, 86)); //Color de fondo para la etiqueta
		etiqueta1.setOpaque(true);
		etiqueta1.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		Login.add(etiqueta1); //Agrega la etiqueta en la ventana
		
		JLabel etiqueta2 = new JLabel("Correo Electrónico: "); //Creacion de una etiqueta junto con su contenido
		etiqueta2.setSize(250, 50);
		etiqueta2.setLocation(20, 100); //Hace lo que SetSize y SetLocation
		etiqueta2.setBackground(Color.getHSBColor(335, 32, 82)); //Color de fondo para la etiqueta
		etiqueta2.setOpaque(true);
		etiqueta2.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta2.setHorizontalAlignment(JLabel.LEFT);
		Login.add(etiqueta2); //Agrega la etiqueta en la ventana
		
		JLabel etiqueta3 = new JLabel("Contraseña: "); //Creacion de una etiqueta junto con su contenido
		etiqueta3.setSize(250, 50);
		etiqueta3.setLocation(20, 260); //Posicion donde se imprime la etiqueta
		etiqueta3.setBackground(Color.getHSBColor(335, 32, 82)); //Color de fondo para la etiqueta
		etiqueta3.setOpaque(true);
		etiqueta3.setHorizontalAlignment(JLabel.LEFT);
		etiqueta3.setFont(etiquetas); //Tipo y tamaño del texto
		Login.add(etiqueta3); //Agrega la etiqueta en la ventana
		
		JTextField campoCorreoElectronico = new JTextField();
		campoCorreoElectronico.setSize(300, 35);
		campoCorreoElectronico.setLocation(20, 180);
		campoCorreoElectronico.setBackground(Color.LIGHT_GRAY);
		campoCorreoElectronico.setOpaque(true);
		Login.add(campoCorreoElectronico);
		
		JPasswordField campoContrasena = new JPasswordField();
		campoContrasena.setSize(300, 35);
		campoContrasena.setLocation(20, 340);
		campoContrasena.setBackground(Color.LIGHT_GRAY);
		campoContrasena.setOpaque(true);
		Login.add(campoContrasena);
		
		JCheckBox boton = new JCheckBox();
		boton.setSize(20, 20);
		boton.setLocation(25, 410);
		boton.setBackground(Color.white);
		boton.setOpaque(true);
		Login.add(boton);
		
		JLabel etiqueta4 = new JLabel("Recordarme"); //Creacion de una etiqueta junto con su contenido
		etiqueta4.setSize(125, 40);
		etiqueta4.setLocation(10, 400); //Posicion donde se imprime la etiqueta
		etiqueta4.setHorizontalAlignment(JLabel.RIGHT);
		etiqueta4.setFont(pequeño); //Tipo y tamaño del texto
		Login.add(etiqueta4); //Agrega la etiqueta en la ventana
		
		JLabel etiqueta5 = new JLabel("¿No recuerdas la contraseña?"); //Creacion de una etiqueta junto con su contenido
		etiqueta5.setSize(230, 40);
		etiqueta5.setLocation(150, 400); //Posicion donde se imprime la etiqueta
		etiqueta5.setHorizontalAlignment(JLabel.RIGHT);
        etiqueta5.setFont(subrayado.deriveFont(attributes));
        etiqueta5.setForeground(Color.BLUE);
        etiqueta5.setBorder(new EmptyBorder(10,10,10,0)); 
		Login.add(etiqueta5); //Agrega la etiqueta en la ventana

		JButton botonAcceder = new JButton("ACCEDER");
		botonAcceder.setSize(300, 50);
		botonAcceder.setLocation(20, 470);
		botonAcceder.setBackground(Color.white);
		botonAcceder.setHorizontalAlignment(JLabel.CENTER);
		botonAcceder.setOpaque(true);
		botonAcceder.setFont(etiquetas);
		Login.add(botonAcceder);
		Login.repaint();		
		
	}
}
