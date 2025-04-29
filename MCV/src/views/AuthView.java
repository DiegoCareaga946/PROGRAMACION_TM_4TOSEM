package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import models.AuthModel;


public class AuthView {

	private JFrame frame, contentPane;
	private JTextField textField, textField_1, textField_2;
	private JPasswordField passwordField;
	private AuthModel functions;
	public boolean llave;
	Font etiquetas = new Font("Andale Mono", Font.BOLD, 22);
	Font pequeño = new Font("Andale Mono", Font.BOLD, 14);
	Font subrayado = new Font("Andale Mono", Font.ROMAN_BASELINE, 14);

	public AuthView() {
		
		functions = new AuthModel();
	}

	public void login()
	{

		System.out.println("Acceso");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1400, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel etiqueta = new JLabel("INICIAR SESIÓN");
		etiqueta.setBounds(570, 90, 250, 50);
		etiqueta.setBackground(Color.getHSBColor(223, 163, 131));
		etiqueta.setFont(etiquetas);
		etiqueta.setHorizontalAlignment(JLabel.CENTER);
		panel.add(etiqueta);
		
		JLabel etiqueta2 = new JLabel("Correo Electrónico: ");
		etiqueta2.setBounds(477, 160, 250, 50);
		etiqueta2.setBackground(null);
		etiqueta2.setFont(etiquetas);
		etiqueta2.setHorizontalAlignment(JLabel.LEFT);
		panel.add(etiqueta2);
		
		textField = new JTextField();
		textField.setBackground(new Color(218, 230, 225));
		textField.setBounds(525, 220, 350, 50);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel contraseña = new JLabel("Contraseña: ");
		contraseña.setBounds(477, 280, 250, 50);
		contraseña.setBackground(null);
		contraseña.setHorizontalAlignment(JLabel.LEFT);
		contraseña.setFont(etiquetas);
		panel.add(contraseña);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(218, 230, 225));
		passwordField.setBounds(525, 340, 350, 50);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("Acceder");
		
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setOpaque(true);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(550, 500, 300, 70);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String passText = new String(passwordField.getPassword());
				Boolean flag1 = false, flag2 = false;
				
				String username = textField.getText();
				
				if( passText.equals("") ) {
					
					passwordField.setBorder(BorderFactory.createLineBorder(Color.red,2));
					
				}else {
					
					passwordField.setBorder(BorderFactory.createLineBorder(Color.green,2));
					flag1 = true;
				}
				
				
				if(textField.getText().equals("")) {
					textField.setBorder(BorderFactory.createLineBorder(Color.red,2));
				}else {
					
					textField.setBorder(BorderFactory.createLineBorder(Color.green,2));
					flag2 = true;
				}
				
				if(flag1 && flag2) {
					
					
					boolean user_auth = false;
					try {
						user_auth = functions.access(username,passText);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
					 
					if(user_auth) {
						
						JOptionPane.showMessageDialog(frame, "Bienvenido.");
						
					}else {
						JOptionPane.showMessageDialog(frame, "Error al acceder","verifique su información",JOptionPane.WARNING_MESSAGE);
					}
					 
					
					
				}
				
			}
		});
		panel.add(btnNewButton);

		
		ImageIcon imagenIcono1 = new ImageIcon(AuthView.class.getResource("/images/usuario.png")); //Agrega una imagen
		
		JLabel etiquetaIcono1 = new JLabel(imagenIcono1); //Se adjunta la imagen a una etiqueta para su ajuste
		etiquetaIcono1.setBounds(475, 225, 35, 35);
		etiquetaIcono1.setIcon(new ImageIcon(imagenIcono1.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH))); //Permite el control del tamaño y reajuste de la imagen
		panel.add(etiquetaIcono1);
		
		ImageIcon imagenIcono = new ImageIcon(AuthView.class.getResource("/images/hidden.png")); //Agrega una imagen
		
		JLabel etiquetaIcono = new JLabel(imagenIcono); //Se adjunta la imagen a una etiqueta para su ajuste
		etiquetaIcono.setBounds(475, 350, 35, 35);
		etiquetaIcono.setIcon(new ImageIcon(imagenIcono.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH))); //Permite el control del tamaño y reajuste de la imagen
		panel.add(etiquetaIcono);
		
		JLabel etiqueta4 = new JLabel("Recordarme");
		etiqueta4.setBounds(510, 430, 125, 40);
		etiqueta4.setHorizontalAlignment(JLabel.RIGHT);
		etiqueta4.setFont(pequeño);
		panel.add(etiqueta4);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Recordar contraseña");
		chckbxNewCheckBox.setBounds(510, 440, 20, 20);
		chckbxNewCheckBox.setOpaque(false);
		panel.add(chckbxNewCheckBox);
		
		JButton etiquetaCrearCuenta = new JButton("¿Aún no tienes cuenta?");
		etiquetaCrearCuenta.setBounds(720, 430, 170, 40);
		etiquetaCrearCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.getDefaultCloseOperation();
				register();
			}
		});
		panel.add(etiquetaCrearCuenta);
		
		ImageIcon fondo = new ImageIcon (AuthView.class.getResource("/images/imagenFondoLogin.jpg"));
		JLabel etiquetaFondo = new JLabel(fondo);
		etiquetaFondo.setBounds(0, 0, 1400, 700);
		etiquetaFondo.setIcon(new ImageIcon(fondo.getImage().getScaledInstance(1400, 800, Image.SCALE_SMOOTH)));
		panel.add(etiquetaFondo);	
		panel.repaint();
		
		frame.add(panel);
		frame.repaint();
		panel.repaint();
	}
	
	
	public void register() {
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1400, 700);
		
		frame.setVisible(true);
	
		frame.setBounds(100, 100, 541, 608);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setForeground(new Color(255, 0, 0));
		contentPane.setBorder(BorderFactory.createTitledBorder(null, "Registro de Usuarios"));
		
		frame.setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(224, 255, 255));
		panel_5.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		contentPane.add(panel_5);
		
		panel_5.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(BorderFactory.createTitledBorder("Datos Generales"));
		panel.setBackground(new Color(250, 235, 215));
		panel_5.add(panel);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(53, 31, 64, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido Paterno:");
		lblNewLabel_1.setBounds(10, 55, 107, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Apellido Materno:");
		lblNewLabel_1_1.setBounds(10, 80, 107, 14);
		panel.add(lblNewLabel_1_1);
		
		JTextField textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(127, 28, 98, 20);
		panel.add(textField);
		
		JTextField textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(127, 52, 98, 20);
		panel.add(textField_1);
		
		JTextField textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(127, 77, 98, 20);
		panel.add(textField_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 239, 213));
		panel_4.setLayout(null);
		panel_4.setBounds(127, 108, 98, 45);
		panel.add(panel_4);
		

		JTextField lblNewLabel_3 = new JTextField("11/02/2014");
		lblNewLabel_3.setBorder(BorderFactory.createLineBorder(new Color(246, 192, 136), 2));
		lblNewLabel_3.setBounds(4, 11, 66, 25);
		panel_4.add(lblNewLabel_3);
		
		
		JButton btnNewButton = new JButton("...");
		btnNewButton.setBounds(76, 12, 22, 23);
		panel_4.add(btnNewButton);
		
		JLabel lblNewLabel_3_1 = new JLabel("Fecha de nacimiento:");
		lblNewLabel_3_1.setBounds(10, 118, 122, 25);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_2 = new JLabel("Sexo:");
		lblNewLabel_2.setBounds(66, 169, 44, 14);
		panel.add(lblNewLabel_2);
		
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setBackground(new Color(250, 235, 215));
		rdbtnNewRadioButton.setBounds(116, 165, 109, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.setBackground(new Color(250, 235, 215));
		rdbtnFemenino.setBounds(116, 191, 109, 23);
		panel.add(rdbtnFemenino);
		
		
		JLabel lblNewLabel_2_1 = new JLabel("Procedimiento: ");
		lblNewLabel_2_1.setBounds(10, 225, 96, 14);
		panel.add(lblNewLabel_2_1);
		
		Object[] data = {"Perú", "México", "Bélgica"};
		
		JComboBox comboBox = new JComboBox(data);
		comboBox.setBounds(116, 221, 109, 22);
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 192, 203));
		ImageIcon imagenUsuario = new ImageIcon("iconoVentana.png");
		JLabel etiquetaContrasena = new JLabel(imagenUsuario); 
		etiquetaContrasena.setBackground(new Color(244, 164, 96));
		etiquetaContrasena.setBounds(34, 38, 179, 129);
		etiquetaContrasena.setIcon(new ImageIcon(imagenUsuario.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
		panel_1.setBorder(BorderFactory.createTitledBorder("Perfil del Usuario"));
		panel_1.setLayout(null);
		panel_1.add(etiquetaContrasena);
		panel_5.add(panel_1);
		
		JCheckBox chckbxMostrarFechaDe = new JCheckBox("Mostrar Fecha de Nacimiento");
		chckbxMostrarFechaDe.setBackground(new Color(255, 192, 203));
		chckbxMostrarFechaDe.setBounds(19, 200, 194, 23);
		panel_1.add(chckbxMostrarFechaDe);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mostrar Foto de Pefil");
		chckbxNewCheckBox_1.setBackground(new Color(255, 192, 203));
		chckbxNewCheckBox_1.setBounds(19, 174, 194, 23);
		panel_1.add(chckbxNewCheckBox_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(245, 222, 179));
		panel_2.setBorder(BorderFactory.createTitledBorder("Datos Opcionales"));
		panel_5.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Descripción:");
		lblNewLabel_4.setBounds(10, 44, 81, 14);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Preferencias:");
		lblNewLabel_4_1.setBounds(123, 44, 81, 14);
		panel_2.add(lblNewLabel_4_1);
		
		JScrollPane panel_6 = new JScrollPane();
		panel_6.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		panel_6.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		panel_6.setBounds(10, 69, 98, 128);
		panel_2.add(panel_6);
		
		JTextArea textArea_1 = new JTextArea();
		panel_6.setViewportView(textArea_1);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(123, 69, 108, 128);
		panel_2.add(scrollPane);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Cantar", "Escuchar Música", "Leer", "Deportes", "Otros"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 182, 193));
		panel_5.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Nuevo");
		btnNewButton_1.setBounds(66, 71, 111, 34);
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Guardar");
		btnNewButton_2.setBounds(66, 116, 111, 34);
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				    String username = textField.getText().trim();
				    String password = textField_1.getText().trim();

				    // Validaciones básicas
				    if (username.isEmpty() || password.isEmpty()) {
				        JOptionPane.showMessageDialog(frame,
				            "Usuario o contraseña vacíos",
				            "Error de registro",
				            JOptionPane.ERROR_MESSAGE);
				        return;
				    }

				    // Intentamos abrir el archivo en modo append
				    try (BufferedWriter bw = new BufferedWriter(
				             new FileWriter("users.txt", /* append = */ true))) {
				        // Escribimos usando el mismo delimitador que lee tu modelo:
				        bw.write(username + "," + password);
				        bw.newLine();  // salto de línea para el siguiente registro

				        JOptionPane.showMessageDialog(frame,
				            "Usuario registrado correctamente.",
				            "Registro OK",
				            JOptionPane.INFORMATION_MESSAGE);

				    } catch (IOException ex) {
				        ex.printStackTrace();
				        JOptionPane.showMessageDialog(frame,
				            "No se pudo guardar el usuario:\n" + ex.getMessage(),
				            "Error de E/S",
				            JOptionPane.ERROR_MESSAGE);
				    }
			}
		});
		
		panel_3.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Salir");
		btnNewButton_3.setBounds(66, 161, 111, 34);
		btnNewButton_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		panel_3.add(btnNewButton_3);
		
		panel.add(panel_5);
		
		frame.add(panel);
		frame.repaint();
		panel.repaint();
		
	}
	
	public void home() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1400, 700);
		
		frame.setVisible(true);
	
		frame.setBounds(100, 100, 541, 608);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setForeground(new Color(255, 0, 0));
		contentPane.setFont(etiquetas);
		contentPane.setBorder(BorderFactory.createTitledBorder(null, "INICIO, PRUEBA DE QUE FUNCIONA :)"));
		
		frame.setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
	}
}