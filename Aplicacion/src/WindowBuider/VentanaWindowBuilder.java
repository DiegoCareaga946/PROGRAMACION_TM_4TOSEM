package WindowBuider;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.BorderUIResource;

import Texto.TextRound;
import Ventana.EstiloBoton;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JProgressBar;
import javax.swing.ScrollPaneConstants;
import javax.swing.JCheckBox;
import javax.swing.BoxLayout;

public class VentanaWindowBuilder extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaWindowBuilder frame = new VentanaWindowBuilder();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaWindowBuilder() {
		Font etiquetasCursiva = new Font("Andale Mono", Font.ITALIC, 22);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 608);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setForeground(new Color(255, 0, 0));
		contentPane.setBorder(BorderFactory.createTitledBorder(null, "Registro de Usuarios"));
		
		setContentPane(contentPane);
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
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(127, 28, 98, 20);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(127, 52, 98, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(127, 77, 98, 20);
		panel.add(textField_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 239, 213));
		panel_4.setLayout(null);
		panel_4.setBounds(127, 108, 98, 45);
		panel.add(panel_4);
		
		TextRound lblNewLabel_3 = new TextRound("11/02/2014");
		lblNewLabel_3.setBorder(BorderFactory.createLineBorder(new Color(246, 192, 136), 2, rootPaneCheckingEnabled));
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
		
		EstiloBoton btnNewButton_1 = new EstiloBoton("Nuevo");
		btnNewButton_1.setBounds(66, 71, 111, 34);
		panel_3.add(btnNewButton_1);
		
		EstiloBoton btnNewButton_2 = new EstiloBoton("Guardar");
		btnNewButton_2.setBounds(66, 116, 111, 34);
		panel_3.add(btnNewButton_2);
		
		EstiloBoton btnNewButton_3 = new EstiloBoton("Salir");
		btnNewButton_3.setBounds(66, 161, 111, 34);
		panel_3.add(btnNewButton_3);
	}
}
