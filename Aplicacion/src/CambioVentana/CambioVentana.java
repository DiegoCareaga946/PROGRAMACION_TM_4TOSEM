package CambioVentana;


	import java.awt.BasicStroke;
	import java.awt.BorderLayout;
	import java.awt.Color;
	import java.awt.Font;
	import java.awt.Graphics;
	import java.awt.Graphics2D;
	import java.awt.GridLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.font.TextAttribute;
	import java.awt.image.BufferedImage;
	import java.io.File;
	import java.io.IOException;
	import java.util.Iterator;
	import java.util.Map;

	import javax.imageio.ImageIO;
	import javax.swing.BorderFactory;
	import javax.swing.ButtonGroup;
	import javax.swing.JComboBox;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JMenu;
	import javax.swing.JMenuBar;
	import javax.swing.JMenuItem;
	import javax.swing.JPanel;
	import javax.swing.JRadioButton;
	import javax.swing.JRadioButtonMenuItem;

	import java.awt.Dimension;
	import javax.swing.JButton;
	import javax.swing.JCheckBoxMenuItem;
	import javax.swing.JTextField;
	import javax.swing.border.TitledBorder;

	public class CambioVentana extends JFrame{
		
		Font etiquetas = new Font("Annai MN",Font.BOLD,32);
		Font tags = new Font("Annai MN",Font.BOLD,22);

		public CambioVentana(String title) {
			
			this.setTitle(title);
			this.setVisible(true);
			this.setSize(1000, 600);
			
			//this.setBackground(Color.black);		
			this.setResizable(true);
			this.setLayout(null);
			
			//que_pasa_cuando_cierro_mi_aplicación
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			//sobre_que_elemento_colocaré_el_item
			this.setLocationRelativeTo(null);
			
			
			this.add(this.login());
			
			//this.add(this.registro());
			
			//this.add(this.test());
			
			
			
			
			//this.setMinimumSize(new Dimension(400,400));
			//this.setMaximumSize(new Dimension(600,600));
			
			
			JMenuBar barra = new JMenuBar(); //barra de menus
			
			JMenu menu1 = new JMenu("Archivo");
			JMenu menu2 = new JMenu("Ayuda");
			JMenu menu4 = new JMenu("Cuenta");
			JMenu menu5 = new JMenu("Usuario");
						
			JMenuItem op_new = new JMenuItem("Nuevo");
			JMenuItem op_open = new JMenuItem("Abrir");
			JMenuItem op_save = new JMenuItem("Guardar");
			JMenuItem op_close = new JMenuItem("Cerrar");
			
			JMenuItem ir_login = new JMenuItem("Acceder");
			JMenuItem ir_registro = new JMenuItem("Registrarse");
			JMenuItem ir_recuperacion = new JMenuItem("Recuperacion cuenta");
			
			JMenuItem dar_de_alta = new JMenuItem("Dar de alta una cuenta");
			JMenuItem dar_de_baja = new JMenuItem("Dar de baja una cuenta");
			JMenuItem consultar = new JMenuItem("Consultar cuenta");
			
			JMenuItem como_crear_cuenta = new JMenuItem("¿Cómo crear cuenta?");
			JMenuItem como_acceder_sistema = new JMenuItem("¿Cómo acceder al sistema?");
			JMenuItem olvide_contrasena = new JMenuItem("¿Qué pasa si olvide mi contraseña?");

			

			
			//Cuenta
			ir_login.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					manager("login");
					
				}});
			
			ir_registro.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					manager("register");
					
				}});
			ir_recuperacion.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					manager("recuperacion");
					
				}});
			
			//Usuario
			dar_de_alta.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					manager("darAlta");
					
				}});
			dar_de_baja.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					manager("darBaja");
					
				}});
			consultar.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					manager("consultar");
					
				}});
			
			//Ayuda
			como_crear_cuenta.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					manager("ayudaCrear");
					
				}});
			como_acceder_sistema.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					manager("ayudaAcceder");
					
				}});
			olvide_contrasena.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					manager("olvideContrasena");
					
				}});
			
			menu1.add(op_new);
			menu1.add(op_open);
			menu1.add(op_save);
			menu1.add(op_close);
			
			menu2.add(como_crear_cuenta);
			menu2.add(como_acceder_sistema);
			menu2.add(olvide_contrasena);


			
			menu4.add(ir_login);
			menu4.add(ir_registro);
			menu4.add(ir_recuperacion);
			
			menu5.add(dar_de_alta);
			menu5.add(dar_de_baja);
			menu5.add(consultar);
			
			
			JMenu menu3 = new JMenu("Segundo nivel");
			menu1.add(menu3);
			
			JRadioButtonMenuItem op_help = new JRadioButtonMenuItem("Manual de usuario");
			JCheckBoxMenuItem op_support = new JCheckBoxMenuItem("Soporte");
			
			menu2.add(op_help);
			menu2.add(op_support);
			
			
			barra.add(menu1);
			barra.add(menu2);
			barra.add(menu4);
			barra.add(menu5);
			
			this.setJMenuBar(barra);
			
			this.repaint();
			this.revalidate(); 
			
		}
		
		public JPanel login() {
			
			JPanel login = new JPanel();
			login.setLocation(0, 0);
			login.setSize(500, 500);
			login.setOpaque(true);
			login.setBackground(new Color(229, 114, 126));
			login.setVisible(true);
			login.setLayout(null);
			
			JLabel etiqueta1 = new JLabel("Bienvenido");
			etiqueta1.setSize(200, 40);
			etiqueta1.setLocation(160,10);
			etiqueta1.setBackground(Color.ORANGE);
			etiqueta1.setOpaque(true);
			etiqueta1.setHorizontalAlignment(JLabel.CENTER);
			etiqueta1.setFont(etiquetas);
			login.add(etiqueta1);
			
			JLabel etiqueta2 = new JLabel("Correo");
			etiqueta2.setBounds(60, 150,160, 30);   
			etiqueta2.setFont(tags);
			etiqueta2.setForeground(Color.white);
			login.add(etiqueta2);
			
			JTextField email = new JTextField();
			email.setBounds(60, 200,260, 30);  
			email.setFont(tags);
			//email.setBackground(Color.GREEN);
			//email.setOpaque(true);
			login.add(email);
			
			JButton access = new JButton("Acceder");
			access.setBounds(60, 300,260, 60);  
			access.setFont(etiquetas);
			access.setBackground(Color.GREEN);
			access.setOpaque(true);
			
			access.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("Hola");
					
					if( email.getText().equals("") ) {
						
						email.setBorder(BorderFactory.createLineBorder(Color.red,10));
						
					}
					
				} 
			});
			
			JButton ir_al_registro = new JButton("¿Aún no tienes cuenta?");
			ir_al_registro.setLocation(60, 380);
			ir_al_registro.setSize(200, 40);
			
			ir_al_registro.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					manager("register");
				}
				
			});
			
			login.add(ir_al_registro);
			
			
			login.add(access);
				
			login.revalidate();
			
			return login;
		}
		
		public JPanel registro()
		{
			JPanel mipanel = new JPanel();
			mipanel.setSize(500,500);
			mipanel.setLocation(500, 0);
			mipanel.setLayout(null);
			
			JLabel etiqueta1 = new JLabel("Registro");
			
			etiqueta1.setSize(180, 30);
			etiqueta1.setLocation(150, 10);
			etiqueta1.setBackground(Color.ORANGE);
			etiqueta1.setOpaque(true);
			etiqueta1.setHorizontalAlignment(JLabel.CENTER);
			etiqueta1.setFont(etiquetas);
			
			mipanel.add(etiqueta1);
			
			
			JLabel email_tag = new JLabel();
			email_tag.setText("Ingrese su correo electrónico: ");
			email_tag.setLocation(30, 90);
			email_tag.setSize(200, 30);
			email_tag.setBorder(BorderFactory.createLineBorder(Color.black) );
			mipanel.add(email_tag);
			
			
			JTextField email = new JTextField();
			email.setSize(180, 40);
			email.setLocation(30, 130);
			mipanel.add(email);
			
			String [] colonias_dataset = {"Centro","villas del encanto","pedregal","Agua escondida","Balandra","Camino real"};
			
			JComboBox colonias = new JComboBox(colonias_dataset);
			colonias.setLocation(30, 180);
			colonias.setSize(180, 40);
			mipanel.add(colonias);
			
			ButtonGroup terminos = new ButtonGroup();
			
			JRadioButton terms1 = new JRadioButton("Acepto los términos",true);
			terms1.setLocation(30, 220);
			terms1.setSize(180, 40);
			terms1.setBorder(BorderFactory.createLineBorder(Color.red));
			mipanel.add(terms1);
			
			JRadioButton terms2 = new JRadioButton("No acepto los términos");
			terms2.setLocation(220, 220);
			terms2.setSize(180, 40);
			terms2.setBorderPainted(true);
			terms2.setBorder(BorderFactory.createLineBorder(Color.red,3));
			mipanel.add(terms2);
			
			terminos.add(terms1);
			terminos.add(terms2);
			
			
			JButton ir_al_login = new JButton("¿Ya tienes cuenta?");
			ir_al_login.setLocation(60, 380);
			ir_al_login.setSize(200, 40);
			
			ir_al_login.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					manager("login");
				}
				
			});
			
			mipanel.add(ir_al_login);
			
			return mipanel;
		}
		
		public JPanel recuperacion()
		{
			JPanel mipanel1 = new JPanel();
			mipanel1.setSize(500,500);
			mipanel1.setLocation(500, 0);
			mipanel1.setLayout(null);
			
			JLabel etiqueta1 = new JLabel("Recuperacion de cuenta");
			
			etiqueta1.setSize(180, 30);
			etiqueta1.setLocation(150, 10);
			etiqueta1.setBackground(Color.GREEN);
			etiqueta1.setOpaque(true);
			etiqueta1.setHorizontalAlignment(JLabel.CENTER);
			etiqueta1.setFont(etiquetas);
			
			mipanel1.add(etiqueta1);
			
			
			JLabel email_tag = new JLabel();
			email_tag.setText("Ingrese su correo electrónico: ");
			email_tag.setLocation(30, 90);
			email_tag.setSize(200, 30);
			email_tag.setBorder(BorderFactory.createLineBorder(Color.black) );
			mipanel1.add(email_tag);
			
			
			JTextField email = new JTextField();
			email.setSize(180, 40);
			email.setLocation(30, 130);
			mipanel1.add(email);
			
			
			JButton ir_a_recuperacion = new JButton("Recuperar cuenta");
			ir_a_recuperacion.setLocation(60, 380);
			ir_a_recuperacion.setSize(200, 40);
			
			ir_a_recuperacion.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					manager("recuperacion");
				}
				
			});
			
			mipanel1.add(ir_a_recuperacion);
			
			return mipanel1;
		}
		
		public JPanel darAlta()
		{
			JPanel mipanel2 = new JPanel();
			mipanel2.setSize(500,500);
			mipanel2.setLocation(0, 0);
			mipanel2.setLayout(null);
			
			JLabel etiqueta1 = new JLabel("Dar de Alta una cuenta");
			
			etiqueta1.setSize(500, 30);
			etiqueta1.setLocation(0, 10);
			etiqueta1.setBackground(Color.BLUE);
			etiqueta1.setOpaque(true);
			etiqueta1.setHorizontalAlignment(JLabel.CENTER);
			etiqueta1.setFont(etiquetas);
			
			mipanel2.add(etiqueta1);
			
			
			return mipanel2;
		}
		public JPanel darBaja()
		{
			JPanel mipanel3 = new JPanel();
			mipanel3.setSize(500,500);
			mipanel3.setLocation(500, 0);
			mipanel3.setLayout(null);
			
			JLabel etiqueta1 = new JLabel("Dar de Baja una cuenta");
			
			etiqueta1.setSize(500, 30);
			etiqueta1.setLocation(0, 10);
			etiqueta1.setBackground(Color.GRAY);
			etiqueta1.setOpaque(true);
			etiqueta1.setHorizontalAlignment(JLabel.CENTER);
			etiqueta1.setFont(etiquetas);
			
			mipanel3.add(etiqueta1);
			
			
			return mipanel3;
		}
		public JPanel consulta()
		{
			JPanel mipanel4 = new JPanel();
			mipanel4.setSize(500,500);
			mipanel4.setLocation(200, 0);
			mipanel4.setLayout(null);
			
			JLabel etiqueta1 = new JLabel("Consultar cuenta");
			
			etiqueta1.setSize(500, 30);
			etiqueta1.setLocation(0, 10);
			etiqueta1.setBackground(Color.CYAN);
			etiqueta1.setOpaque(true);
			etiqueta1.setHorizontalAlignment(JLabel.CENTER);
			etiqueta1.setFont(etiquetas);
			
			mipanel4.add(etiqueta1);
			
			
			return mipanel4;
		}
		public JPanel comoCrear()
		{
			JPanel mipanel5 = new JPanel();
			mipanel5.setSize(500,500);
			mipanel5.setLocation(0, 0);
			mipanel5.setLayout(null);
			
			JLabel etiqueta1 = new JLabel("¿Cómo crear una cuenta?");
			
			etiqueta1.setSize(700, 30);
			etiqueta1.setLocation(0, 10);
			etiqueta1.setBackground(Color.YELLOW);
			etiqueta1.setOpaque(true);
			etiqueta1.setHorizontalAlignment(JLabel.LEFT);
			etiqueta1.setFont(etiquetas);
			
			mipanel5.add(etiqueta1);
			
			
			return mipanel5;
		}
		public JPanel comoAcceder()
		{
			JPanel mipanel6 = new JPanel();
			mipanel6.setSize(500,500);
			mipanel6.setLocation(0, 0);
			mipanel6.setLayout(null);
			
			JLabel etiqueta1 = new JLabel("¿Cómo Acceder al sistema?");
			
			etiqueta1.setSize(500, 30);
			etiqueta1.setLocation(0, 10);
			etiqueta1.setBackground(Color.MAGENTA);
			etiqueta1.setOpaque(true);
			etiqueta1.setHorizontalAlignment(JLabel.CENTER);
			etiqueta1.setFont(etiquetas);
			
			mipanel6.add(etiqueta1);
			
			
			return mipanel6;
		}
		public JPanel olvideContrasena()
		{
			JPanel mipanel7 = new JPanel();
			mipanel7.setSize(500,500);
			mipanel7.setLocation(500, 0);
			mipanel7.setLayout(null);
			
			JLabel etiqueta1 = new JLabel("¿Qué pasa si olvidé mi contraseña?");
			
			etiqueta1.setSize(500, 30);
			etiqueta1.setLocation(0, 10);
			etiqueta1.setBackground(Color.PINK);
			etiqueta1.setOpaque(true);
			etiqueta1.setHorizontalAlignment(JLabel.CENTER);
			etiqueta1.setFont(etiquetas);
			
			mipanel7.add(etiqueta1);
			
			
			return mipanel7;
		}
		
		public JPanel test() {
			
			JPanel test = new JPanel();
			test.setLocation(0, 0);
			test.setSize(500, 500);
			test.setOpaque(true);
			test.setBackground(new Color(229, 114, 126));
			test.setVisible(true);
			test.setLayout(new BorderLayout());
			
			JLabel etiqueta1 = new JLabel("Interés");
			etiqueta1.setSize(200, 40);
			etiqueta1.setLocation(160,10);
			etiqueta1.setBackground(Color.ORANGE);
			etiqueta1.setOpaque(true);
			etiqueta1.setHorizontalAlignment(JLabel.LEFT);
			etiqueta1.setFont(etiquetas);
			test.add(etiqueta1,BorderLayout.NORTH);
			
			TitledBorder title = BorderFactory.createTitledBorder("Calcular interés");
			
			JPanel calculadora = new JPanel(); 
			calculadora.setOpaque(true);
			calculadora.setBackground(new Color(130, 220, 121));
			calculadora.setVisible(true); 
			calculadora.setBorder(title);
			calculadora.setLayout(new GridLayout(4,2));
			test.add(calculadora,BorderLayout.CENTER);
			
			//items de la calculadora
			

			//items de la calculadora
			
			JPanel footer = new JPanel();
			footer.setOpaque(true);
			footer.setBackground(new Color(207,147,240));
			footer.setVisible(true);
			footer.setLayout(new GridLayout(2,2,20,20));
			
			//items del footer
			
			JLabel interes_tag = new JLabel("Interés:");
			JTextField interes_input = new JTextField("315.000002");
			
			interes_tag.setBorder(BorderFactory.createMatteBorder(10,60,10,10,new Color(207,147,240)));
			
			JLabel amount_tag = new JLabel("Monto:");
			JTextField amount_input = new JTextField("1815.000002");
			
			footer.add(interes_tag);
			footer.add(interes_input);
			
			footer.add(amount_tag);
			footer.add(amount_input);
			
			//items del footer
			
			
			test.add(footer,BorderLayout.PAGE_END);
		
			return test;
			
		}
		
		public void manager(String target) {
		
			this.getContentPane().removeAll();
			
			
			if(target.equals("register")) {
				this.add(this.registro());
			}
			
			if(target.equals("login")) {
				this.add(this.login());
			} 
			if(target.equals("recuperacion")) {
				this.add(this.recuperacion());
			} 
			if(target.equals("darAlta")) {
				this.add(this.darAlta());
			} 
			if(target.equals("darBaja")) {
				this.add(this.darBaja());
			} 
			if(target.equals("consultar")) {
				this.add(this.consulta());
			} 
			if(target.equals("ayudaCrear")) {
				this.add(this.comoCrear());
			} 
			if(target.equals("ayudaAcceder")) {
				this.add(this.comoAcceder());
			}
			if(target.equals("olvideContrasena")) {
				this.add(this.olvideContrasena());
			}
			
			this.repaint();
			this.revalidate(); 
			
		}
		
		
	
	public static void main(String[] args) {
		CambioVentana prueba = new CambioVentana("Inicio de sesion");

	}

}
