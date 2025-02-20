package Ventana;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Ventana extends JFrame {
	JFrame Ventana = new JFrame();
	JFrame Ventana2 = new JFrame();
	
	public static Border createLineBorder(Color blue) {
		return null;
	}
	
	public Ventana (String title){
		Font etiquetas = new Font("Andale Mono", Font.BOLD, 30);
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
		
		this.setMaximumSize(new Dimension(1500, 1500));
		this.setMinimumSize(new Dimension(400, 400));
		this.setLocationRelativeTo(null);
		
		JPanel fondoCalculadora = new JPanel();
		fondoCalculadora.setLocation(0, 0);
		fondoCalculadora.setSize(700, 700);
		fondoCalculadora.setBackground(Color.getHSBColor(209, 143, 171)); //Color de fondo para la etiqueta
		fondoCalculadora.setOpaque(true);
		fondoCalculadora.setLayout(null);
		this.add(fondoCalculadora);
		
		JPanel historialFondo = new JPanel();
		historialFondo.setLocation(500, 0);
		historialFondo.setSize(200, 700);
		historialFondo.setBackground(Color.white); //Color de fondo para la etiqueta
		historialFondo.setOpaque(true);
		historialFondo.setLayout(null);
		fondoCalculadora.add(historialFondo);
		
		JTextField campoIngresoDatos = new JTextField();
		campoIngresoDatos.setSize(500, 200);
		campoIngresoDatos.setLocation(0, 0);
		campoIngresoDatos.setBackground(Color.LIGHT_GRAY);
		campoIngresoDatos.setOpaque(true);
		fondoCalculadora.add(campoIngresoDatos);
		
		JButton etiqueta1 = new JButton("3"); //Creacion de una etiqueta junto con su contenido
		etiqueta1.setSize(100, 100);
		etiqueta1.setLocation(275, 505); //Posicion donde se imprime la etiqueta
		etiqueta1.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		etiqueta1.setOpaque(true);
		etiqueta1.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		fondoCalculadora.add(etiqueta1); //Agrega la etiqueta en la ventana
		
		JButton etiqueta3 = new JButton("2"); //Creacion de una etiqueta junto con su contenido
		etiqueta3.setSize(100, 100);
		etiqueta3.setLocation(150, 505); //Posicion donde se imprime la etiqueta
		etiqueta3.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		etiqueta3.setOpaque(true);
		etiqueta3.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta3.setHorizontalAlignment(JLabel.CENTER);
		fondoCalculadora.add(etiqueta3); //Agrega la etiqueta en la ventana
		
		JButton etiqueta4 = new JButton("1"); //Creacion de una etiqueta junto con su contenido
		etiqueta4.setSize(100, 100);
		etiqueta4.setLocation(25, 505); //Posicion donde se imprime la etiqueta
		etiqueta4.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		etiqueta4.setOpaque(true);
		etiqueta4.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta4.setHorizontalAlignment(JLabel.CENTER);
		fondoCalculadora.add(etiqueta4);
		
		JButton etiqueta5 = new JButton("6"); //Creacion de una etiqueta junto con su contenido
		etiqueta5.setSize(100, 100);
		etiqueta5.setLocation(275, 390); //Posicion donde se imprime la etiqueta
		etiqueta5.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		etiqueta5.setOpaque(true);
		etiqueta5.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta5.setHorizontalAlignment(JLabel.CENTER);
		fondoCalculadora.add(etiqueta5); //Agrega la etiqueta en la ventana
		
		JButton etiqueta6 = new JButton("5"); //Creacion de una etiqueta junto con su contenido
		etiqueta6.setSize(100, 100);
		etiqueta6.setLocation(150, 390); //Posicion donde se imprime la etiqueta
		etiqueta6.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		etiqueta6.setOpaque(true);
		etiqueta6.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta6.setHorizontalAlignment(JLabel.CENTER);
		fondoCalculadora.add(etiqueta6); //Agrega la etiqueta en la ventana
		
		JButton etiqueta7 = new JButton("4"); //Creacion de una etiqueta junto con su contenido
		etiqueta7.setSize(100, 100);
		etiqueta7.setLocation(25, 390); //Posicion donde se imprime la etiqueta
		etiqueta7.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		etiqueta7.setOpaque(true);
		etiqueta7.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta7.setHorizontalAlignment(JLabel.CENTER);
		fondoCalculadora.add(etiqueta7);
		
		JButton etiqueta8 = new JButton("9"); //Creacion de una etiqueta junto con su contenido
		etiqueta8.setSize(100, 100);
		etiqueta8.setLocation(275, 275); //Posicion donde se imprime la etiqueta
		etiqueta8.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		etiqueta8.setOpaque(true);
		etiqueta8.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta8.setHorizontalAlignment(JLabel.CENTER);
		fondoCalculadora.add(etiqueta8); //Agrega la etiqueta en la ventana
		
		JButton etiqueta9 = new JButton("8"); //Creacion de una etiqueta junto con su contenido
		etiqueta9.setSize(100, 100);
		etiqueta9.setLocation(150, 275); //Posicion donde se imprime la etiqueta
		etiqueta9.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		etiqueta9.setOpaque(true);
		etiqueta9.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta9.setHorizontalAlignment(JLabel.CENTER);
		fondoCalculadora.add(etiqueta9); //Agrega la etiqueta en la ventana
		
		JButton etiqueta10 = new JButton("7"); //Creacion de una etiqueta junto con su contenido
		etiqueta10.setSize(100, 100);
		etiqueta10.setLocation(25, 275); //Posicion donde se imprime la etiqueta
		etiqueta10.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		etiqueta10.setOpaque(true);
		etiqueta10.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta10.setHorizontalAlignment(JLabel.CENTER);
		
		JButton etiqueta13 = new JButton("0"); //Creacion de una etiqueta junto con su contenido
		etiqueta13.setSize(150, 25);
		etiqueta13.setLocation(25, 620); //Posicion donde se imprime la etiqueta
		etiqueta13.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		etiqueta13.setOpaque(true);
		etiqueta13.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta13.setHorizontalAlignment(JLabel.CENTER);
		fondoCalculadora.add(etiqueta13); //Agrega la etiqueta en la ventana
		
		JButton etiqueta14 = new JButton("."); //Creacion de una etiqueta junto con su contenido
		etiqueta14.setSize(150, 25);
		etiqueta14.setLocation(200, 620); //Posicion donde se imprime la etiqueta
		etiqueta14.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		etiqueta14.setOpaque(true);
		etiqueta14.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta14.setHorizontalAlignment(JLabel.CENTER);
		fondoCalculadora.add(etiqueta14); //Agrega la etiqueta en la ventana
		
		fondoCalculadora.add(etiqueta10); //Agrega la etiqueta en la ventana
		
		JButton etiqueta2 = new JButton("="); //Creacion de una etiqueta junto con su contenido
		etiqueta2.setSize(100, 300);
		etiqueta2.setLocation(400, 350); //Posicion donde se imprime la etiqueta
		etiqueta2.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		etiqueta2.setOpaque(true);
		etiqueta2.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		fondoCalculadora.add(etiqueta2); //Agrega la etiqueta en la ventana
		
		JButton etiqueta11 = new JButton("C"); //Creacion de una etiqueta junto con su contenido
		etiqueta11.setSize(150, 50);
		etiqueta11.setLocation(200, 210); //Posicion donde se imprime la etiqueta
		etiqueta11.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		etiqueta11.setOpaque(true);
		etiqueta11.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta11.setHorizontalAlignment(JLabel.CENTER);
		fondoCalculadora.add(etiqueta11); //Agrega la etiqueta en la ventana
		
		JButton etiqueta12 = new JButton("CE"); //Creacion de una etiqueta junto con su contenido
		etiqueta12.setSize(150, 50);
		etiqueta12.setLocation(25, 210); //Posicion donde se imprime la etiqueta
		etiqueta12.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		etiqueta12.setOpaque(true);
		etiqueta12.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta12.setHorizontalAlignment(JLabel.CENTER);
		fondoCalculadora.add(etiqueta12); //Agrega la etiqueta en la ventana
		
		String[] opciones = {"Suma", "Resta", "Multiplicación", "Division"};
		JComboBox<String> operacion = new JComboBox(opciones);
		operacion.setSize(100, 50);
		operacion.setLocation(400, 250);
		operacion.setOpaque(true);
		fondoCalculadora.add(operacion);
		
		JLabel etiqueta15 = new JLabel("Operaciones"); //Creacion de una etiqueta junto con su contenido
		etiqueta15.setSize(100, 30);
		etiqueta15.setLocation(400, 215); //Posicion donde se imprime la etiqueta
		etiqueta15.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		etiqueta15.setOpaque(true);
		etiqueta15.setFont(pequeño); //Tipo y tamaño del texto
		etiqueta15.setHorizontalAlignment(JLabel.CENTER);
		fondoCalculadora.add(etiqueta15); //Agrega la etiqueta en la ventana
		
		this.repaint();
	}
	/*
	public Ventana (String title) {
		Font etiquetas = new Font("Andale Mono", Font.BOLD, 22);
		Font pequeño = new Font("Andale Mono", Font.ROMAN_BASELINE, 14);
		Font subrayado = new Font("Andale Mono", Font.ROMAN_BASELINE, 14);
		Map attributes = subrayado.getAttributes();
		attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		
		this.setTitle("Acceso"); //Agrega titulo
		
		this.setVisible(true); //Hace visible la ventana
		this.setSize(1400, 700); //Ajuste del tamaño de la ventana
		this.setResizable(true); //Permite ajustar el tamaño de la ventana
		
		this.setLayout(null); //Elimina el formato predeterminado de la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Ejecuta el cierre o finaliza el programa cuando se cierra la ventana
		
		this.setMaximumSize(new Dimension(1500, 1500));
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
		*/
		/*
		JPanel Registro = new JPanel();
		Registro.setLocation(700, 0);
		Registro.setSize(700, 700);
		Registro.setBackground(Color.getHSBColor(180, 143, 171)); //Color de fondo para la etiqueta
		Registro.setOpaque(true);
		Registro.setLayout(null);
		this.add(Registro);
		this.repaint();
		
		JLabel etiqueta1 = new JLabel("REGISTRO"); //Creacion de una etiqueta junto con su contenido
		etiqueta1.setSize(200, 50);
		etiqueta1.setLocation(250, 10); //Posicion donde se imprime la etiqueta
		etiqueta1.setBackground(Color.getHSBColor(3, 24, 86)); //Color de fondo para la etiqueta
		etiqueta1.setOpaque(true);
		etiqueta1.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		Registro.add(etiqueta1); //Agrega la etiqueta en la ventana
		
		JLabel etiqueta2 = new JLabel("NOMBRE DE USUARIO: "); //Creacion de una etiqueta junto con su contenido
		etiqueta2.setSize(300, 50);
		etiqueta2.setLocation(200, 70); //Hace lo que SetSize y SetLocation
		etiqueta2.setBackground(Color.getHSBColor(335, 32, 82)); //Color de fondo para la etiqueta
		etiqueta2.setOpaque(true);
		etiqueta2.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		Registro.add(etiqueta2); //Agrega la etiqueta en la ventana
		
		JTextField campoRegistro = new JTextField();
		campoRegistro.setSize(400, 35);
		campoRegistro.setLocation(150, 140);
		campoRegistro.setBackground(Color.LIGHT_GRAY);
		campoRegistro.setOpaque(true);
		Registro.add(campoRegistro);
		
		JLabel etiqueta3 = new JLabel("BIO: "); //Creacion de una etiqueta junto con su contenido
		etiqueta3.setSize(100, 40);
		etiqueta3.setLocation(300, 190); //Hace lo que SetSize y SetLocation
		etiqueta3.setBackground(Color.getHSBColor(335, 32, 82)); //Color de fondo para la etiqueta
		etiqueta3.setOpaque(true);
		etiqueta3.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta3.setHorizontalAlignment(JLabel.CENTER);
		Registro.add(etiqueta3); //Agrega la etiqueta en la ventana
		
		JTextArea campoBiografia = new JTextArea();
		campoBiografia.setSize(500, 100);
		campoBiografia.setLocation(100, 250);
		campoBiografia.setBackground(Color.LIGHT_GRAY);
		campoBiografia.setOpaque(true);
		Registro.add(campoBiografia);
		
		JLabel etiqueta5 = new JLabel("PREFERENCIAS: "); //Creacion de una etiqueta junto con su contenido
		etiqueta5.setSize(300, 50);
		etiqueta5.setLocation(200, 370); //Hace lo que SetSize y SetLocation
		etiqueta5.setBackground(Color.getHSBColor(335, 32, 82)); //Color de fondo para la etiqueta
		etiqueta5.setOpaque(true);
		etiqueta5.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta5.setHorizontalAlignment(JLabel.CENTER);
		Registro.add(etiqueta5); //Agrega la etiqueta en la ventana
		
		Border border = BorderFactory.createLineBorder(Color.RED, 10);
		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.setSelected(null, rootPaneCheckingEnabled);
		ButtonGroup grupoTerminosYCondiciones = new ButtonGroup();
		
		
		JRadioButton boton1 = new JRadioButton("Dulce");
		boton1.setSize(100, 20);
		boton1.setLocation(75, 440);
		boton1.setBackground(Color.getHSBColor(335, 32, 82));
		boton1.setOpaque(true);
		boton1.setBorder(border);
		boton1.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
		grupo1.add(boton1);
		Registro.add(boton1);
		
		JRadioButton boton2 = new JRadioButton("Salado");
		boton2.setSize(100, 20);
		boton2.setLocation(225, 440);
		boton2.setBackground(Color.getHSBColor(335, 32, 82));
		boton2.setOpaque(true);
		boton2.setBorder(border);
		grupo1.add(boton2);
		Registro.add(boton2);
		
		JRadioButton boton3 = new JRadioButton("Saluble");
		boton3.setSize(100, 20);
		boton3.setLocation(375, 440);
		boton3.setBackground(Color.getHSBColor(335, 32, 82));
		boton3.setOpaque(true);
		boton3.setBorder(border);
		grupo1.add(boton3);
		Registro.add(boton3);
		
		JLabel etiqueta6 = new JLabel("TERMINOS Y CONDICIONES: "); //Creacion de una etiqueta junto con su contenido
		etiqueta6.setSize(400, 50);
		etiqueta6.setLocation(150, 480); //Hace lo que SetSize y SetLocation
		etiqueta6.setBackground(Color.getHSBColor(335, 32, 82)); //Color de fondo para la etiqueta
		etiqueta6.setOpaque(true);
		etiqueta6.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta6.setHorizontalAlignment(JLabel.CENTER);
		Registro.add(etiqueta6); //Agrega la etiqueta en la ventana
		
		JRadioButton boton4 = new JRadioButton("ACEPTO LOS TERMINOS Y CONDICIONES");
		boton4.setSize(250, 20);
		boton4.setLocation(50, 550);
		boton4.setBackground(Color.getHSBColor(335, 32, 82));
		boton4.setOpaque(true);
		boton4.setBorder(border);
		boton4.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
		grupo1.add(boton4);
		Registro.add(boton4);
		
		JRadioButton boton5 = new JRadioButton("NO ACEPTO LOS TERMINOS Y CONDICIONES");
		boton5.setSize(250, 20);
		boton5.setLocation(350, 550);
		boton5.setBackground(Color.getHSBColor(335, 32, 82));
		boton5.setOpaque(true);
		boton5.setBorder(border);
		grupo1.add(boton5);
		Registro.add(boton5);
		
		String[] colonias = {"San Carlos III", "San Carlos IV", "El Pedregal", "Santa Fe"};
		JComboBox<String> comboBox = new JComboBox<String>(colonias);
		comboBox.setSize(200, 30);
		comboBox.setLocation(100, 600);
		Registro.add(comboBox);
		
		JButton boton6 = new JButton("CREAR CUENTA");
		boton6.setSize(250, 50);
		boton6.setLocation(350, 600);
		boton6.setBackground(Color.getHSBColor(335, 32, 82));
		boton6.setOpaque(true);
		boton6.setBorder(border);
		boton6.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
		grupo1.add(boton6);
		Registro.add(boton6);
		
		this.repaint();
		
	}
		 */
}
