package Examen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Examen extends JFrame {

	Font etiquetas = new Font("Andale Mono", Font.BOLD, 22);
	Font etiquetasCursiva = new Font("Andale Mono", Font.ITALIC, 22);
	Font pequeño = new Font("Andale Mono", Font.ROMAN_BASELINE, 14);
	Font subtitulo = new Font("Arial", Font.ITALIC, 14);
	Font normal = new Font("Arial", Font.BOLD, 16);
	
	public Examen (String title) {
		Font etiquetas = new Font("Andale Mono", Font.BOLD, 22);
		Font etiquetas_Pequeñas = new Font("Andale Mono", Font.BOLD, 18);
		Font pequeño = new Font("Andale Mono", Font.ROMAN_BASELINE, 14);
		Font subrayado = new Font("Andale Mono", Font.ROMAN_BASELINE, 14);

		this.setTitle("TABLA"); //Agrega titulo

		this.setVisible(true); //Hace visible la ventana
		this.setSize(700, 800); //Ajuste del tamaño de la ventana
		this.setResizable(true); //Permite ajustar el tamaño de la ventana

		this.setLayout(null); //Elimina el formato predeterminado de la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Ejecuta el cierre o finaliza el programa cuando se cierra la ventana

		this.setMaximumSize(new Dimension(700, 1500));
		this.setMinimumSize(new Dimension(400, 400));
		this.setLocationRelativeTo(null);


		JPanel tabla = new JPanel();
		tabla.setLocation(0, 0);
		tabla.setSize(700, 800);
		tabla.setBackground(Color.white); //Color de fondo para la etiqueta
		tabla.setOpaque(true);
		tabla.setLayout(null);
		this.add(tabla);

		JLabel widget = new JLabel();
		widget.setBounds(35,150,300, 00);
		widget.setOpaque(true);
		widget.setBorder(BorderFactory.createTitledBorder("Datos del cliente"));
		widget.setBackground(Color.white);
		tabla.add(widget);
		
		JPanel etiqueta5 = new JPanel();
		etiqueta5.setBounds(15,150,650,100);
		etiqueta5.setBorder(BorderFactory.createTitledBorder("Datos del cliente"));
		etiqueta5.setBackground(Color.white);
		etiqueta5.setLayout(null);
		tabla.add(etiqueta5);
		
		JTextField campoCapital = new JTextField("1500");
		campoCapital.setFont(normal);
		
		JPanel etiqueta2 = new JPanel();
		etiqueta2.setBounds(15,150,650,100);
		etiqueta2.setBorder(BorderFactory.createTitledBorder("Datos de factura"));
		etiqueta2.setBackground(Color.white);
		etiqueta2.setLayout(null);
		tabla.add(etiqueta2);
		
		JLabel etiqueta3 = new JLabel("N°Factura: 1");
		etiqueta3.setFont(pequeño);
		etiqueta3.setBounds(10,50,300,20);
		etiqueta2.add(etiqueta3);
		
		JLabel etiqueta4 = new JLabel("Fecha: 2021/50/21");
		etiqueta4.setFont(pequeño);
		etiqueta4.setBounds(50,50,300,20);
		etiqueta2.add(etiqueta3);
		
		JButton	exportar = new JButton("Finalizar Factura"); //Creacion de una etiqueta junto con su contenido
		exportar.setSize(200, 50);
		exportar.setLocation(800, 400); //Posicion donde se imprime la etiqueta
		exportar.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		exportar.setOpaque(true);
		exportar.setFont(etiquetas_Pequeñas); //Tipo y tamaño del texto
		exportar.setHorizontalAlignment(JLabel.CENTER);
		tabla.add(exportar); //Agrega la etiqueta en la ventana

		JButton	Anadir = new JButton("Limpiar"); //Creacion de una etiqueta junto con su contenido
		Anadir.setSize(150, 50);
		Anadir.setLocation(1200, 200); //Posicion donde se imprime la etiqueta
		Anadir.setBackground(Color.LIGHT_GRAY); //Color de fondo para la etiqueta
		Anadir.setOpaque(true);
		Anadir.setFont(etiquetas_Pequeñas); //Tipo y tamaño del texto
		Anadir.setHorizontalAlignment(JLabel.CENTER);
		tabla.add(Anadir); //Agrega la etiqueta en la ventana

		String[] nombre_De_Columnas= {"Producto", 
				"Cantidad", 
				"Valor",
				"Sub Total"};
		Object[][] data = {{"Agua", 2, 500, 1000.0},
				{"Cereal", 5, 1000, 5000.0},
				{"Leche", 2, 300, 600.0}};

		JTable table = new JTable(data, nombre_De_Columnas);
		JScrollPane scrollPane = new JScrollPane(table);

		scrollPane.setSize(650, 100);
		scrollPane.setLocation(25, 300);

		tabla.add(scrollPane);
		this.repaint();	
	}
	public static void main(String[] args) {
		Examen examen = new Examen("");

	}

}
