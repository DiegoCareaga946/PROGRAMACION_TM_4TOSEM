package Ventana;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.Document;

import Campos.Password;
import Campos.Text;
import Texto.TextRound;

public class Ventana extends JFrame {
	JFrame Ventana = new JFrame();
	
	
	public Ventana (String title) {
		
		//Tipos de fuentes de texto
		Font etiquetas = new Font("Andale Mono", Font.BOLD, 22);
		Font etiquetasCursiva = new Font("Andale Mono", Font.ITALIC, 22);
		Font pequeño = new Font("Andale Mono", Font.ROMAN_BASELINE, 14);
		Font subtitulo = new Font("Arial", Font.ITALIC, 14);
		Font normal = new Font("Arial", Font.BOLD, 16);
		Map attributes = subtitulo.getAttributes();
		attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		
		this.setTitle("Acceso"); //Agrega titulo
		
		this.setVisible(true); //Hace visible la ventana
		this.setSize(1400, 700); //Ajuste del tamaño de la ventana
		this.setResizable(true); //Permite ajustar el tamaño de la ventana
		
		this.setLayout(null); //Elimina el formato predeterminado de la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Ejecuta el cierre o finaliza el programa cuando se cierra la ventana
		
		this.setMaximumSize(new Dimension(1500, 1500)); //Limite de redimencion (maxima)
		this.setMinimumSize(new Dimension(400, 400));//Limite de redimencion (minima)
		this.setLocationRelativeTo(null);
		
		/*
		BorderLayout organizarFondo = new BorderLayout();
		
		JLabel interes = new JLabel("Interés");
		interes.setFont(etiquetasCursiva);
		interes.setForeground(Color.red);

		JPanel FondoIzquierda = new JPanel();
		FondoIzquierda.setBounds(0,0,700,600);
		FondoIzquierda.setOpaque(true);
		FondoIzquierda.setBackground(new Color(228, 251, 87));
		FondoIzquierda.setLayout(organizarFondo);
		FondoIzquierda.add(interes,BorderLayout.NORTH);
		this.add(FondoIzquierda);
		
		JLabel cuadro1_1 = new JLabel();
		cuadro1_1.setLayout(organizarFondo);
		cuadro1_1.setBorder(BorderFactory.createTitledBorder(new EstiloBordeRedondeado(true), "Calcular Interes", 0, 0, normal));
		FondoIzquierda.add(cuadro1_1, BorderLayout.CENTER);
		
		JPanel cuadro1 = new JPanel();
		cuadro1.setOpaque(true);
		cuadro1.setBackground(new Color(146, 251, 87));
		cuadro1.setLayout(new GridLayout(4,2, 50, 50));
		cuadro1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		
		JLabel capital_tag = new JLabel("Capital");
		capital_tag.setBorder(BorderFactory.createEmptyBorder(0, 110, 0, 0));
		
		JTextField campoCapital = new JTextField("1500");
		campoCapital.setFont(normal);
		
		JLabel tiempo_tag = new JLabel("Tiempo");
		tiempo_tag.setBorder(BorderFactory.createEmptyBorder(0, 110, 0, 0));
		
		JTextField campoTiempo = new JTextField("2");
		campoTiempo.setFont(normal);

		JLabel tasaInteres_tag = new JLabel("Tasa Interes");
		tasaInteres_tag.setBorder(BorderFactory.createEmptyBorder(0, 85, 0, 0));

		JTextField campoTasaInteres = new JTextField("0.1");
		campoTasaInteres.setFont(normal);

		EstiloBoton calcular = new EstiloBoton("Calcular");
		EstiloBoton cancelar = new EstiloBoton("Cancelar");
		
		cuadro1.add(capital_tag);
		cuadro1.add(campoCapital);
		cuadro1.add(tiempo_tag);
		cuadro1.add(campoTiempo);
		cuadro1.add(tasaInteres_tag);
		cuadro1.add(campoTasaInteres);
		cuadro1.add(calcular);
		cuadro1.add(cancelar);
		
		cuadro1_1.add(cuadro1);	
		FondoIzquierda.add(cuadro1, organizarFondo.CENTER);
		
		capital_tag.setFont(etiquetas);
		tiempo_tag.setFont(etiquetas);
		tasaInteres_tag.setFont(etiquetas);
	
		JPanel cuadro2 = new JPanel();
		cuadro2.setOpaque(true);
		cuadro2.setBackground(new Color(251,92,87));
		cuadro2.setLayout(new GridLayout(2,2,20,20));
		cuadro2.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

		JLabel interes_tag = new JLabel("Ínteres");
		interes_tag.setBorder(BorderFactory.createEmptyBorder(0, 110, 0, 0));

		JTextField CampoInteres = new JTextField("315.00002");
		CampoInteres.setFont(normal);

		JLabel monto_tag = new JLabel("Monto");
		monto_tag.setBorder(BorderFactory.createEmptyBorder(0, 110, 0, 0));

		JTextField CampoMonto = new JTextField("1815.00000");
		CampoMonto.setFont(normal);

		cuadro2.add(interes_tag);
		cuadro2.add(CampoInteres);
		cuadro2.add(monto_tag);
		cuadro2.add(CampoMonto);
		cuadro1_1.add(cuadro2, BorderLayout.SOUTH);
		
		monto_tag.setFont(etiquetas);
		interes_tag.setFont(etiquetas);
		
		cuadro2.repaint();		
		this.validate();
		this.repaint();
		*/
		
		/*
		GridLayout botonesCal = new GridLayout(6,5);
		JPanel calculadora = new JPanel();
		calculadora.setLayout(botonesCal);
		
		JLabel pantalla = new JLabel();		
		pantalla.setBounds(0,0,600,270);
		pantalla.setBackground(Color.white);
		pantalla.setOpaque(true);
		this.add(pantalla);
		
		JLabel historial = new JLabel();		
		pantalla.setBounds(0,0,600,270);
		pantalla.setBackground(Color.white);
		pantalla.setOpaque(true);
		this.add(pantalla);
		
		calculadora.setBounds(0, 270, 600, 400);
		calculadora.setOpaque(true);
		
		calculadora.add(new JButton(""));
		calculadora.add(new JButton(""));
		calculadora.add(new JButton("CE"));
		calculadora.add(new JButton("C"));
		
		calculadora.add(new JButton("7")); 
		calculadora.add(new JButton("8")); 
		calculadora.add(new JButton("9"));
		calculadora.add(new JButton("*"));
		
		calculadora.add(new JButton("4"));
		calculadora.add(new JButton("5"));
		calculadora.add(new JButton("6"));
		calculadora.add(new JButton("+"));
		
		calculadora.add(new JButton("1"));
		calculadora.add(new JButton("2"));
		calculadora.add(new JButton("3"));
		calculadora.add(new JButton("-"));
		
		calculadora.add(new JButton(""));
		calculadora.add(new JButton("0"));
		calculadora.add(new JButton(""));
		calculadora.add(new JButton("/"));
		
		calculadora.add(new JButton(""));
		calculadora.add(new JButton(""));
		calculadora.add(new JButton(""));
		calculadora.add(new JButton("="));


		
		this.add(calculadora);
		this.repaint();
		*/
		
		
		JMenuBar barra = new JMenuBar(); // Barra de menus
		
		JMenu menu1 = new JMenu("Archivo");
		JMenu menu2 = new JMenu("Ayuda");
		
		
		JMenuItem op_open = new JMenuItem("Nuevo");
		JMenuItem op_save = new JMenuItem("Guardar");
		JMenuItem op_load = new JMenuItem("Cargar");
		JMenuItem op_close = new JMenuItem("Cerrar");
		
		menu1.add(op_open);
		menu1.add(op_save);
		menu1.add(op_load);
		menu1.add(op_close);

		JRadioButtonMenuItem op_help = new JRadioButtonMenuItem("Ayuda");
		JCheckBoxMenuItem op_support = new JCheckBoxMenuItem("Soporte");
		
		menu2.add(op_help);
		menu2.add(op_support);
		
		barra.add(menu1);
		barra.add(menu2);

		this.setJMenuBar(barra);
		this.repaint();
		this.revalidate();
		
		/*
		JPanel Login = new JPanel();
		Login.setLocation(0, 0); //Establece el sitio de creación
		Login.setSize(1400, 700); //Ajusta el tamaño que ocupara el panel
		Login.setOpaque(true); //Vuelve opaco el fondo del panel
		Login.setLayout(null); 
		this.add(Login); //Agrega el componente a la ventana
		
		TextRound etiqueta = new TextRound("INICIAR SESIÓN"); //Creacion de una etiqueta junto con su contenido
		etiqueta.setRoundBottomLeft(50);
		etiqueta.setRoundTopLeft(50);
		etiqueta.setRoundTopRight(50);
		etiqueta.setRoundBottomRight(50);
		etiqueta.setSize(250, 50);
		etiqueta.setLocation(570, 70); //Hace lo que SetSize y SetLocation
		etiqueta.setBackground(Color.getHSBColor(223, 163, 131)); //Color de fondo para la etiqueta
		etiqueta.setFont(etiquetas); //Seleccion de tipo y tamaño del texto
		etiqueta.setHorizontalAlignment(JLabel.CENTER); //Acomodado del texto en el espacio
		Login.add(etiqueta); //Agrega la etiqueta en la ventana
		
		JLabel etiqueta2 = new JLabel("Correo Electrónico: ");
		etiqueta2.setSize(250, 50);
		etiqueta2.setLocation(477, 160);
		etiqueta2.setFont(normal); 
		etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		Login.add(etiqueta2);
		
		Text campoCorreoElectronico = new Text(); //Creacion de un componente tipo campo de texto vacio
		campoCorreoElectronico.setRoundBottomLeft(25); //Redondeo de la esquina inferior izquierda
		campoCorreoElectronico.setRoundTopLeft(25); //Redondeo de la esquina superior izquierda
		campoCorreoElectronico.setRoundTopRight(25); //Redondeo de la esquina superior derecha
		campoCorreoElectronico.setRoundBottomRight(25); //Redondeo de la esquina inferior derecha
		campoCorreoElectronico.setSize(350, 50);
		campoCorreoElectronico.setLocation(525, 200);
		campoCorreoElectronico.setBackground(Color.white);
		campoCorreoElectronico.setBorder(BorderFactory.createEmptyBorder()); //Cambia el formato del borde en la figura.
		campoCorreoElectronico.setFont(normal);
		Login.add(campoCorreoElectronico);
		
		ImageIcon imagenIcono = new ImageIcon("IconoUsuario.png"); //Agrega una imagen
		JLabel etiquetaIcono = new JLabel(imagenIcono); //Se adjunta la imagen a una etiqueta para su ajuste
		etiquetaIcono.setBounds(0, 0, 1000, 450);
		etiquetaIcono.setIcon(new ImageIcon(imagenIcono.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH))); //Permite el control del tamaño y reajuste de la imagen
		Login.add(etiquetaIcono);
		
		JLabel etiqueta3 = new JLabel("Contraseña: ");
		etiqueta3.setSize(200, 50);
		etiqueta3.setLocation(477, 280);
		etiqueta3.setFont(normal);
		etiqueta3.setHorizontalAlignment(JLabel.CENTER);
		Login.add(etiqueta3);
		
		Password campoContrasena = new Password(); //Creacion de un componente de tipo campo de texto Contraseña vacio
		campoContrasena.setRoundBottomLeft(25);
		campoContrasena.setRoundTopLeft(25);
		campoContrasena.setRoundTopRight(25);
		campoContrasena.setRoundBottomRight(25);
		campoContrasena.setSize(350, 50);
		campoContrasena.setLocation(525, 320);
		campoContrasena.setBackground(Color.white);
		campoContrasena.setBorder(BorderFactory.createEmptyBorder());
		campoContrasena.setFont(normal);
		Login.add(campoContrasena);
		
		ImageIcon imagenContrasena = new ImageIcon("contrasena.png");
		JLabel etiquetaContrasena = new JLabel(imagenContrasena); 
		etiquetaContrasena.setBounds(0, 0, 1000, 690);
		etiquetaContrasena.setIcon(new ImageIcon(imagenContrasena.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
		Login.add(etiquetaContrasena);
		
		JCheckBox boton = new JCheckBox(); // Creacion de boton de selección
		boton.setSize(20, 20);
		boton.setLocation(510, 410);
		boton.setBackground(Color.white);
		boton.setVisible(true); //Permite la visibilidad del componente
		Login.add(boton);
		
		JLabel etiqueta4 = new JLabel("Recordarme");
		etiqueta4.setSize(125, 40);
		etiqueta4.setLocation(490, 400);
		etiqueta4.setHorizontalAlignment(JLabel.RIGHT);
		etiqueta4.setFont(pequeño);
		Login.add(etiqueta4);
		
		JLabel etiqueta5 = new JLabel("¿No recuerdas la contraseña?");
		etiqueta5.setSize(230, 40);
		etiqueta5.setLocation(660, 400);
		etiqueta5.setHorizontalAlignment(JLabel.RIGHT);
        etiqueta5.setFont(subtitulo.deriveFont(attributes));
        etiqueta5.setForeground(Color.BLUE);
        etiqueta5.setBorder(new EmptyBorder(10,10,10,0)); 
		Login.add(etiqueta5);
		
		EstiloBoton botonAcceder = new EstiloBoton("INICIAR SESION"); //Creacion de un boton con texto
		botonAcceder.setSize(300, 70);
		botonAcceder.setLocation(550, 465);
		botonAcceder.setHorizontalAlignment(JLabel.CENTER);
		botonAcceder.setForeground(Color.BLACK); //Permite cambiar el color de la letra
		botonAcceder.setBackground(Color.WHITE);
		botonAcceder.setFont(etiquetas);
		Login.add(botonAcceder);
		
		EstiloBoton botonRegistrarse = new EstiloBoton("REGISTRARSE"); //Creacion de un boton con texto
		botonRegistrarse.setSize(200, 40);
		botonRegistrarse.setLocation(600, 550);
		botonRegistrarse.setHorizontalAlignment(JLabel.CENTER);
		botonRegistrarse.setForeground(Color.BLACK); //Permite cambiar el color de la letra
		botonRegistrarse.setBorderColor(Color.getHSBColor(217, 123, 231));
		botonRegistrarse.setColorClick(Color.getHSBColor(220, 170, 100));
		botonRegistrarse.setColorOver(Color.getHSBColor(220, 160, 80));
		botonRegistrarse.setBackground(Color.WHITE);
		botonRegistrarse.setFont(etiquetas);
		Login.add(botonRegistrarse);
		
		PanelRound fondoPorEncima = new PanelRound(); //Inserta un panel vacio
		fondoPorEncima.setBounds(450, 30, 500, 600);
		fondoPorEncima.setRoundBottomLeft(50);
		fondoPorEncima.setRoundTopLeft(50);
		fondoPorEncima.setRoundTopRight(50);
		fondoPorEncima.setRoundBottomRight(50);
		fondoPorEncima.setBackground(Color.getHSBColor(250, 131, 159));
		Login.add(fondoPorEncima);
		
		ImageIcon fondo = new ImageIcon("imagenFondoLogin.jpg");
		JLabel etiquetaFondo = new JLabel(fondo);
		etiquetaFondo.setBounds(0, 0, 1400, 800);
		etiquetaFondo.setIcon(new ImageIcon(fondo.getImage().getScaledInstance(1400, 800, Image.SCALE_SMOOTH)));
		Login.add(etiquetaFondo);
		Login.repaint();
		*/
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
        etiqueta5.setFont(etiquetas.deriveFont(attributes));
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
		

		JPanel Registro = new JPanel();
		Registro.setLocation(700, 0);
		Registro.setSize(700, 700);
		Registro.setBackground(Color.getHSBColor(180, 143, 171)); //Color de fondo para la etiqueta
		Registro.setOpaque(true);
		Registro.setLayout(null);
		//this.add(Registro);
		this.repaint();
		
		JLabel etiqueta6 = new JLabel("REGISTRO"); //Creacion de una etiqueta junto con su contenido
		etiqueta6.setSize(200, 50);
		etiqueta6.setLocation(250, 10); //Posicion donde se imprime la etiqueta
		etiqueta6.setBackground(Color.getHSBColor(3, 24, 86)); //Color de fondo para la etiqueta
		etiqueta6.setOpaque(true);
		etiqueta6.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta6.setHorizontalAlignment(JLabel.CENTER);
		Registro.add(etiqueta6); //Agrega la etiqueta en la ventana
		
		JLabel etiqueta7 = new JLabel("NOMBRE DE USUARIO: "); //Creacion de una etiqueta junto con su contenido
		etiqueta7.setSize(300, 50);
		etiqueta7.setLocation(200, 70); //Hace lo que SetSize y SetLocation
		etiqueta7.setBackground(Color.getHSBColor(335, 32, 82)); //Color de fondo para la etiqueta
		etiqueta7.setOpaque(true);
		etiqueta7.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta7.setHorizontalAlignment(JLabel.CENTER);
		Registro.add(etiqueta7); //Agrega la etiqueta en la ventana
		
		JTextField campoRegistro = new JTextField();
		campoRegistro.setSize(400, 35);
		campoRegistro.setLocation(150, 140);
		campoRegistro.setBackground(Color.LIGHT_GRAY);
		campoRegistro.setOpaque(true);
		Registro.add(campoRegistro);
		
		JLabel etiqueta8 = new JLabel("BIO: "); //Creacion de una etiqueta junto con su contenido
		etiqueta8.setSize(100, 40);
		etiqueta8.setLocation(300, 190); //Hace lo que SetSize y SetLocation
		etiqueta8.setBackground(Color.getHSBColor(335, 32, 82)); //Color de fondo para la etiqueta
		etiqueta8.setOpaque(true);
		etiqueta8.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta8.setHorizontalAlignment(JLabel.CENTER);
		Registro.add(etiqueta8); //Agrega la etiqueta en la ventana
		
		JTextArea campoBiografia = new JTextArea();
		campoBiografia.setSize(500, 100);
		campoBiografia.setLocation(100, 250);
		campoBiografia.setBackground(Color.LIGHT_GRAY);
		campoBiografia.setOpaque(true);
		Registro.add(campoBiografia);
		
		JLabel etiqueta9 = new JLabel("PREFERENCIAS: "); //Creacion de una etiqueta junto con su contenido
		etiqueta9.setSize(300, 50);
		etiqueta9.setLocation(200, 370); //Hace lo que SetSize y SetLocation
		etiqueta9.setBackground(Color.getHSBColor(335, 32, 82)); //Color de fondo para la etiqueta
		etiqueta9.setOpaque(true);
		etiqueta9.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta9.setHorizontalAlignment(JLabel.CENTER);
		Registro.add(etiqueta9); //Agrega la etiqueta en la ventana
		
		Border border = BorderFactory.createLineBorder(Color.RED, 10);
		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.setSelected(null, rootPaneCheckingEnabled);
		ButtonGroup grupoTerminosYCondiciones = new ButtonGroup();
		
		JRadioButton boton1 = new JRadioButton("Dulce");
		boton1.setSize(100, 20);
		boton1.setLocation(75, 440);
		boton1.setBackground(Color.getHSBColor(335, 32, 82));
		boton1.setOpaque(true);

		grupo1.add(boton1);
		Registro.add(boton1);
		
		JRadioButton boton2 = new JRadioButton("Salado");
		boton2.setSize(100, 20);
		boton2.setLocation(225, 440);
		boton2.setBackground(Color.getHSBColor(335, 32, 82));
		boton2.setOpaque(true);
		grupo1.add(boton2);
		Registro.add(boton2);
		
		JRadioButton boton3 = new JRadioButton("Saluble");
		boton3.setSize(100, 20);
		boton3.setLocation(375, 440);
		boton3.setBackground(Color.getHSBColor(335, 32, 82));
		boton3.setOpaque(true);
		grupo1.add(boton3);
		Registro.add(boton3);
		
		JLabel etiqueta10 = new JLabel("TERMINOS Y CONDICIONES: "); //Creacion de una etiqueta junto con su contenido
		etiqueta10.setSize(400, 50);
		etiqueta10.setLocation(150, 480); //Hace lo que SetSize y SetLocation
		etiqueta10.setBackground(Color.getHSBColor(335, 32, 82)); //Color de fondo para la etiqueta
		etiqueta10.setOpaque(true);
		etiqueta10.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta10.setHorizontalAlignment(JLabel.CENTER);
		Registro.add(etiqueta10); //Agrega la etiqueta en la ventana
		
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
		boton6.addActionListener(new ActionListener() {
			
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println(campoContrasena.getPassword().equals(""));

				
				if(campoBiografia.getText().equals("")) {
					campoBiografia.setBorder(BorderFactory.createLineBorder(Color.red, 7));
				}
				else{
					campoBiografia.setBorder(BorderFactory.createLineBorder(Color.green, 7));
				}
				
				if(campoRegistro.getText().equals("")){
				campoRegistro.setBorder(BorderFactory.createLineBorder(Color.red, 7));
				}
				else {
					campoRegistro.setBorder(BorderFactory.createLineBorder(Color.green, 7));

				}
			}
			
		});
		
		botonAcceder.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String myPassword = String.valueOf(campoContrasena.getPassword());
				if(campoCorreoElectronico.getText().equals("diegocareagacel@gmail.com") && myPassword.equals("contraseña") ) {
					campoCorreoElectronico.setBorder(BorderFactory.createLineBorder(Color.green, 7));
					campoContrasena.setBorder(BorderFactory.createLineBorder(Color.green, 7));
					JOptionPane.showMessageDialog(null, "BIENVENID@", "Inicio de sesión exitoso", JOptionPane.INFORMATION_MESSAGE);
				}
				else{
					campoCorreoElectronico.setBorder(BorderFactory.createLineBorder(Color.red, 7));
					campoContrasena.setBorder(BorderFactory.createLineBorder(Color.red, 7));
					JOptionPane.showMessageDialog(null, "Los datos ingresados son incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
			}
			
		});
		grupo1.add(boton6);
		Registro.add(boton6);
		
		this.repaint();
		
	}
	
	//TABLA
	/*
	public Ventana (String title) {
		Font etiquetas = new Font("Andale Mono", Font.BOLD, 22);
		Font etiquetas_Pequeñas = new Font("Andale Mono", Font.BOLD, 18);
		Font pequeño = new Font("Andale Mono", Font.ROMAN_BASELINE, 14);
		Font subrayado = new Font("Andale Mono", Font.ROMAN_BASELINE, 14);

		this.setTitle("TABLA"); //Agrega titulo

		this.setVisible(true); //Hace visible la ventana
		this.setSize(1400, 700); //Ajuste del tamaño de la ventana
		this.setResizable(true); //Permite ajustar el tamaño de la ventana

		this.setLayout(null); //Elimina el formato predeterminado de la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Ejecuta el cierre o finaliza el programa cuando se cierra la ventana

		this.setMaximumSize(new Dimension(1500, 1500));
		this.setMinimumSize(new Dimension(400, 400));
		this.setLocationRelativeTo(null);


		JPanel tabla = new JPanel();
		tabla.setLocation(0, 0);
		tabla.setSize(1400, 800);
		tabla.setBackground(Color.getHSBColor(209, 143, 171)); //Color de fondo para la etiqueta
		tabla.setOpaque(true);
		tabla.setLayout(null);
		this.add(tabla);

		JLabel	titulo_Usuario = new JLabel("USUARIO"); //Creacion de una etiqueta junto con su contenido
		titulo_Usuario.setSize(200, 50);
		titulo_Usuario.setLocation(600, 10); //Posicion donde se imprime la etiqueta
		titulo_Usuario.setBackground(Color.getHSBColor(3, 24, 86)); //Color de fondo para la etiqueta
		titulo_Usuario.setOpaque(true);
		titulo_Usuario.setFont(etiquetas); //Tipo y tamaño del texto
		titulo_Usuario.setHorizontalAlignment(JLabel.CENTER);
		tabla.add(titulo_Usuario); //Agrega la etiqueta en la ventana

		JLabel widget = new JLabel();
		widget.setBounds(35,150,300,200);
		widget.setOpaque(true);
		widget.setBackground(Color.getHSBColor(100, 200, 70));
		widget.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		tabla.add(widget);

		JLabel etiqueta1 = new JLabel("Total de usuario"); //Creacion de una etiqueta junto con su contenido
		etiqueta1.setBounds(50, 50, 200, 30);
		etiqueta1.setOpaque(false);
		etiqueta1.setFont(pequeño); //Tipo y tamaño del texto
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		widget.add(etiqueta1); //Agrega la etiqueta en la ventana

		JLabel etiqueta_Num_TotalUsuario = new JLabel("80"); //Creacion de una etiqueta junto con su contenido
		etiqueta_Num_TotalUsuario.setBounds(50, 95, 200, 30); //Color de fondo para la etiqueta
		etiqueta_Num_TotalUsuario.setOpaque(false);
		etiqueta_Num_TotalUsuario.setFont(pequeño); //Tipo y tamaño del texto
		etiqueta_Num_TotalUsuario.setHorizontalAlignment(JLabel.CENTER);
		widget.add(etiqueta_Num_TotalUsuario); //Agrega la etiqueta en la ventana

		JButton	exportar = new JButton("EXPORTAR"); //Creacion de una etiqueta junto con su contenido
		exportar.setSize(150, 50);
		exportar.setLocation(1000, 200); //Posicion donde se imprime la etiqueta
		exportar.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		exportar.setOpaque(true);
		exportar.setFont(etiquetas_Pequeñas); //Tipo y tamaño del texto
		exportar.setHorizontalAlignment(JLabel.CENTER);
		tabla.add(exportar); //Agrega la etiqueta en la ventana

		JButton	Anadir = new JButton("AÑADIR"); //Creacion de una etiqueta junto con su contenido
		Anadir.setSize(150, 50);
		Anadir.setLocation(1200, 200); //Posicion donde se imprime la etiqueta
		Anadir.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		Anadir.setOpaque(true);
		Anadir.setFont(etiquetas_Pequeñas); //Tipo y tamaño del texto
		Anadir.setHorizontalAlignment(JLabel.CENTER);
		tabla.add(Anadir); //Agrega la etiqueta en la ventana

		String[] nombre_De_Columnas= {"AGE", 
				"VEGETARIAN", 
				"HOLA"};
		Object[][] data = {{"Pedro", 2005, true},
				{"Pedro", 2005, true},
				{"Pedro", 2005, true},
				{"Pedro", 2005, true},
				{"Pedro", 2005, true},
				{"Pedro", 2005, true},
				{"Pedro", 2005, true},
				{"Pedro", 2005, true},
				{"Pedro", 2005, true},
				{"Pedro", 2005, true},
				{"Pedro", 2005, true},
				{"Pedro", 2005, true},
				{"Pedro", 2005, true},
				{"Pedro", 2005, true},
				{"Pedro", 2005, true},
				{"Pedro", 2005, true},
				{"Pedro", 2005, true}};

		JTable table = new JTable(data, nombre_De_Columnas);
		JScrollPane scrollPane = new JScrollPane(table);

		scrollPane.setSize(500, 300);
		scrollPane.setLocation(450, 200);

		tabla.add(scrollPane);
		this.repaint();	
		
		*/
	//CALCULADORA
	/*
	public Ventana (String title){
		Font etiquetas = new Font("Andale Mono", Font.BOLD, 28);
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
		//this.add(fondoCalculadora);
		
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
		etiqueta1.setSize(80, 80);
		etiqueta1.setLocation(210, 430); //Posicion donde se imprime la etiqueta
		etiqueta1.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		etiqueta1.setOpaque(true);
		etiqueta1.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		fondoCalculadora.add(etiqueta1); //Agrega la etiqueta en la ventana
		
		JButton etiqueta3 = new JButton("2"); //Creacion de una etiqueta junto con su contenido
		etiqueta3.setSize(80, 80);
		etiqueta3.setLocation(110, 430); //Posicion donde se imprime la etiqueta
		etiqueta3.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		etiqueta3.setOpaque(true);
		etiqueta3.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta3.setHorizontalAlignment(JLabel.CENTER);
		fondoCalculadora.add(etiqueta3); //Agrega la etiqueta en la ventana
		
		JButton etiqueta4 = new JButton("1"); //Creacion de una etiqueta junto con su contenido
		etiqueta4.setSize(80, 80);
		etiqueta4.setLocation(10, 430); //Posicion donde se imprime la etiqueta
		etiqueta4.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		etiqueta4.setOpaque(true);
		etiqueta4.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta4.setHorizontalAlignment(JLabel.CENTER);
		fondoCalculadora.add(etiqueta4);
		
		JButton etiqueta5 = new JButton("6"); //Creacion de una etiqueta junto con su contenido
		etiqueta5.setSize(80, 80);
		etiqueta5.setLocation(210, 325); //Posicion donde se imprime la etiqueta
		etiqueta5.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		etiqueta5.setOpaque(true);
		etiqueta5.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta5.setHorizontalAlignment(JLabel.CENTER);
		fondoCalculadora.add(etiqueta5); //Agrega la etiqueta en la ventana
		
		JButton etiqueta6 = new JButton("5"); //Creacion de una etiqueta junto con su contenido
		etiqueta6.setSize(80, 80);
		etiqueta6.setLocation(110, 325); //Posicion donde se imprime la etiqueta
		etiqueta6.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		etiqueta6.setOpaque(true);
		etiqueta6.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta6.setHorizontalAlignment(JLabel.CENTER);
		fondoCalculadora.add(etiqueta6); //Agrega la etiqueta en la ventana
		
		JButton etiqueta7 = new JButton("4"); //Creacion de una etiqueta junto con su contenido
		etiqueta7.setSize(80, 80);
		etiqueta7.setLocation(10, 325); //Posicion donde se imprime la etiqueta
		etiqueta7.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		etiqueta7.setOpaque(true);
		etiqueta7.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta7.setHorizontalAlignment(JLabel.CENTER);
		fondoCalculadora.add(etiqueta7);
		
		JButton etiqueta8 = new JButton("9"); //Creacion de una etiqueta junto con su contenido
		etiqueta8.setSize(80, 80);
		etiqueta8.setLocation(210, 220); //Posicion donde se imprime la etiqueta
		etiqueta8.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		etiqueta8.setOpaque(true);
		etiqueta8.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta8.setHorizontalAlignment(JLabel.CENTER);
		fondoCalculadora.add(etiqueta8); //Agrega la etiqueta en la ventana
		
		JButton etiqueta9 = new JButton("8"); //Creacion de una etiqueta junto con su contenido
		etiqueta9.setSize(80, 80);
		etiqueta9.setLocation(110, 220); //Posicion donde se imprime la etiqueta
		etiqueta9.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		etiqueta9.setOpaque(true);
		etiqueta9.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta9.setHorizontalAlignment(JLabel.CENTER);
		fondoCalculadora.add(etiqueta9); //Agrega la etiqueta en la ventana
		
		JButton etiqueta10 = new JButton("7"); //Creacion de una etiqueta junto con su contenido
		etiqueta10.setSize(80, 80);
		etiqueta10.setLocation(10, 220); //Posicion donde se imprime la etiqueta
		etiqueta10.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		etiqueta10.setOpaque(true);
		etiqueta10.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta10.setHorizontalAlignment(JLabel.CENTER);
		fondoCalculadora.add(etiqueta10); //Agrega la etiqueta en la ventana
		fondoCalculadora.add(etiqueta10); //Agrega la etiqueta en la ventana
		
		JButton etiqueta13 = new JButton("0"); //Creacion de una etiqueta junto con su contenido
		etiqueta13.setSize(180,80);
		etiqueta13.setLocation(10, 535); //Posicion donde se imprime la etiqueta
		etiqueta13.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		etiqueta13.setOpaque(true);
		etiqueta13.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta13.setHorizontalAlignment(JLabel.CENTER);
		fondoCalculadora.add(etiqueta13); //Agrega la etiqueta en la ventana
		
		JButton etiqueta14 = new JButton("."); //Creacion de una etiqueta junto con su contenido
		etiqueta14.setSize(80,80);
		etiqueta14.setLocation(210, 535); //Posicion donde se imprime la etiqueta
		etiqueta14.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		etiqueta14.setOpaque(true);
		etiqueta14.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta14.setHorizontalAlignment(JLabel.CENTER);
		fondoCalculadora.add(etiqueta14); //Agrega la etiqueta en la ventana
		
		JButton signoSuma = new JButton("x"); //Creacion de una etiqueta junto con su contenido
		signoSuma.setSize(80, 80);
		signoSuma.setLocation(330, 325); //Posicion donde se imprime la etiqueta
		signoSuma.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		signoSuma.setOpaque(true);
		signoSuma.setFont(etiquetas); //Tipo y tamaño del texto
		signoSuma.setHorizontalAlignment(JLabel.CENTER);
		fondoCalculadora.add(signoSuma); //Agrega la etiqueta en la ventana
		
		JButton signoResta = new JButton("-"); //Creacion de una etiqueta junto con su contenido
		signoResta.setSize(80, 80);
		signoResta.setLocation(330, 430); //Posicion donde se imprime la etiqueta
		signoResta.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		signoResta.setOpaque(true);
		signoResta.setFont(etiquetas); //Tipo y tamaño del texto
		signoResta.setHorizontalAlignment(JLabel.CENTER);
		fondoCalculadora.add(signoResta); //Agrega la etiqueta en la ventana
		
		JButton signoMultiplicacion = new JButton("+"); //Creacion de una etiqueta junto con su contenido
		signoMultiplicacion.setSize(80, 80);
		signoMultiplicacion.setLocation(330, 535); //Posicion donde se imprime la etiqueta
		signoMultiplicacion.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		signoMultiplicacion.setOpaque(true);
		signoMultiplicacion.setFont(etiquetas); //Tipo y tamaño del texto
		signoMultiplicacion.setHorizontalAlignment(JLabel.CENTER);
		fondoCalculadora.add(signoMultiplicacion); //Agrega la etiqueta en la ventana
		
		JButton signoDivision = new JButton("÷"); //Creacion de una etiqueta junto con su contenido
		signoDivision.setSize(80, 80);
		signoDivision.setLocation(330, 220); //Posicion donde se imprime la etiqueta
		signoDivision.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		signoDivision.setOpaque(true);
		signoDivision.setFont(etiquetas); //Tipo y tamaño del texto
		signoDivision.setHorizontalAlignment(JLabel.CENTER);
		fondoCalculadora.add(signoDivision); //Agrega la etiqueta en la ventana
		JButton etiqueta2 = new JButton("="); //Creacion de una etiqueta junto con su contenido
		etiqueta2.setSize(80, 185);
		etiqueta2.setLocation(420, 430); //Posicion donde se imprime la etiqueta
		etiqueta2.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		etiqueta2.setOpaque(true);
		etiqueta2.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		fondoCalculadora.add(etiqueta2); //Agrega la etiqueta en la ventana
		
		JButton borrarTodo = new JButton("C"); //Creacion de una etiqueta junto con su contenido
		borrarTodo.setSize(80,80);
		borrarTodo.setLocation(420, 325); //Posicion donde se imprime la etiqueta
		borrarTodo.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		borrarTodo.setOpaque(true);
		borrarTodo.setFont(etiquetas); //Tipo y tamaño del texto
		borrarTodo.setHorizontalAlignment(JLabel.CENTER);
		fondoCalculadora.add(borrarTodo); //Agrega la etiqueta en la ventana
		
		JButton etiqueta12 = new JButton("CE"); //Creacion de una etiqueta junto con su contenido
		etiqueta12.setSize(80,80);
		etiqueta12.setLocation(420, 220); //Posicion donde se imprime la etiqueta
		etiqueta12.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		etiqueta12.setOpaque(true);
		etiqueta12.setFont(etiquetas); //Tipo y tamaño del texto
		etiqueta12.setHorizontalAlignment(JLabel.CENTER);
		fondoCalculadora.add(etiqueta12); //Agrega la etiqueta en la ventana
		
		this.repaint();
		
		*/
	}
