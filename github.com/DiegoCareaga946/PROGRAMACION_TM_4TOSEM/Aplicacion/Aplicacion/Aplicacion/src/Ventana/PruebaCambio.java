package Ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class PruebaCambio extends JFrame{
	public JPanel PruebaCambio (String title) {
		Font etiquetas = new Font("Andale Mono", Font.BOLD, 22);
		Font etiquetasCursiva = new Font("Andale Mono", Font.ITALIC, 22);
		Font pequeño = new Font("Andale Mono", Font.ROMAN_BASELINE, 14);
		Font subtitulo = new Font("Arial", Font.ITALIC, 14);
		Font normal = new Font("Arial", Font.BOLD, 16);
		Map attributes = subtitulo.getAttributes();
		attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		
		JMenuBar barra = new JMenuBar(); // Barra de menus
		
		JMenu menu1 = new JMenu("Archivo");
		JMenu menu2 = new JMenu("Ayuda");
		JMenu menu3 = new JMenu("Navegación");

		
		
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
		
		JMenuItem op_login = new JMenuItem("Acceder");
		JMenuItem op_registro = new JMenuItem("Registrarse");
		
		menu3.add(op_login);
		menu3.add(op_support);

		
		
		barra.add(menu1);
		barra.add(menu2);
		barra.add(menu3);

		this.setJMenuBar(barra);
		this.repaint();
		this.revalidate();
		
		this.setTitle("Acceso"); //Agrega titulo
		
		this.setVisible(true); //Hace visible la ventana
		this.setSize(1400, 700); //Ajuste del tamaño de la ventana
		this.setResizable(true); //Permite ajustar el tamaño de la ventana
		
		this.setLayout(null); //Elimina el formato predeterminado de la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Ejecuta el cierre o finaliza el programa cuando se cierra la ventana
		
		this.setMaximumSize(new Dimension(1500, 1500)); //Limite de redimencion (maxima)
		this.setMinimumSize(new Dimension(400, 400));//Limite de redimencion (minima)
		this.setLocationRelativeTo(null);
		return Registro();
	}
		
		public JPanel Login (){
		
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
		
		JPanel Login = new JPanel();
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
		JButton ir_registro = new JButton("NO TIENES CUENTA?");
		ir_registro.setBounds(220, 600, 200, 50);
		ir_registro.setOpaque(true);
		ir_registro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				manager("Registro");
			}
			
		});
		Login.add(ir_registro);
		Login.add(botonAcceder);
		Login.repaint();
		this.add(Login);
		Login.add(ir_registro);
		return Registro();
		}
	
		
		
	
			
			public JPanel Registro () {
				
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
				

				JPanel Registro = new JPanel();
				Registro.setLocation(700, 0);
				Registro.setSize(700, 700);
				Registro.setBackground(Color.getHSBColor(180, 143, 171)); //Color de fondo para la etiqueta
				Registro.setOpaque(true);
				Registro.setLayout(null);
				this.add(Registro);
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

				grupo1.add(boton6);
				Registro.add(boton6);
				this.add(Registro);
				
				return Registro;
			}
			public void manager(String target) {
				this.getContentPane().removeAll();
				
				if(target.equals("Registro")) {
					this.add(this.Registro());
				}
				if(target.equals("Login")) {
					this.add(this.Login());
				}
			}
}
