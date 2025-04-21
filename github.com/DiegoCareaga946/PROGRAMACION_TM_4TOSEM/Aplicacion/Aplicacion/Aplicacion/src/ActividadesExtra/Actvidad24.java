package ActividadesExtra;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.ScrollPaneConstants;

public class Actvidad24 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Actvidad24 frame = new Actvidad24();
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
	
	

	public Actvidad24() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 692, 664);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 5, 658, 180);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 228, 624, 148);
		contentPane.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
		
		JLabel label = new JLabel("");
		panel_2.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_2.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		panel_2.add(label_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cedúla:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_2.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Dirección:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_2.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_2 = new JLabel("");
		panel_2.add(label_2);
		
		JLabel lblNewLabel_4 = new JLabel("Teléfono:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_2.add(lblNewLabel_4);
		
		JLabel label_3 = new JLabel("");
		panel_2.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label_4 = new JLabel("");
		panel_2.add(label_4);
		
		JLabel label_5 = new JLabel("");
		panel_2.add(label_5);
		
		JLabel label_6 = new JLabel("");
		panel_2.add(label_6);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 459, 658, 168);
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		String[] nombre_De_Columnas= {"Producto", 
				"Modelo", 
				"Cantidad",
				"Precio"};
		Object[][] data = {{"Pedro", 2005, true, 123},
				{"Pedro", 2005, true, 123},
				{"Pedro", 2005, true, 123},
				{"Pedro", 2005, true, 123}};
		JScrollPane sp = new JScrollPane(table);

		table = new JTable(data, nombre_De_Columnas);
		table.setBorder(null);
		
        sp.setSize(200, 300);
        sp.setLocation(450, 200);
        sp.setFont(new Font("Tahoma", Font.PLAIN, 16));
        
        panel.add(table);
		
		JLabel lblDatosDelCliente = new JLabel("Datos del Cliente:");
		lblDatosDelCliente.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDatosDelCliente.setBounds(5, 182, 153, 36);
		contentPane.add(lblDatosDelCliente);
		
		JLabel lblDatosDelCliente_1 = new JLabel("Lista de productos:");
		lblDatosDelCliente_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDatosDelCliente_1.setBounds(5, 421, 153, 36);
		contentPane.add(lblDatosDelCliente_1);
	}
}
