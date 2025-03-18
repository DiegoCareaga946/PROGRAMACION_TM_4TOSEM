package Examen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Examen extends JFrame{

	Font etiquetas = new Font("Andale Mono", Font.BOLD, 22);
	Font etiquetasCursiva = new Font("Andale Mono", Font.ITALIC, 22);
	Font pequeño = new Font("Andale Mono", Font.ROMAN_BASELINE, 14);
	Font subtitulo = new Font("Arial", Font.ITALIC, 14);
	Font normal = new Font("Arial", Font.BOLD, 16);
	Map attributes = subtitulo.getAttributes();
	

		public Examen (String title) {
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
		}
	public static void main(String[] args) {
		Examen examen = new Examen("");

	}

}
