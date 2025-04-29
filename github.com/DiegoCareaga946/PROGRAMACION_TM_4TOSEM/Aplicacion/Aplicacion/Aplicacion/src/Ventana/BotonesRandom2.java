package Ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.Random;

public class BotonesRandom2 extends JFrame{
public BotonesRandom2 (String title) {
		
		//Tipos de fuentes de texto
		Font etiquetas = new Font("Andale Mono", Font.BOLD, 22);
		Font etiquetasCursiva = new Font("Andale Mono", Font.ITALIC, 22);
		Font pequeño = new Font("Andale Mono", Font.ROMAN_BASELINE, 14);
		Font subtitulo = new Font("Arial", Font.ITALIC, 14);
		Font normal = new Font("Arial", Font.BOLD, 16);
		Map attributes = subtitulo.getAttributes();
		attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		
		Random random = new Random();
		int numeroAleatorio = random.nextInt(10) + 1;
		System.out.println("Número aleatorio entre 1 y 10: " + numeroAleatorio);
		
		this.setTitle("Acceso"); //Agrega titulo
		
		this.setVisible(true); //Hace visible la ventana
		this.setSize(700, 700); //Ajuste del tamaño de la ventana
		this.setResizable(true); //Permite ajustar el tamaño de la ventana
		
		this.setLayout(null); //Elimina el formato predeterminado de la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Ejecuta el cierre o finaliza el programa cuando se cierra la ventana
		
		this.setMaximumSize(new Dimension(1500, 1500)); //Limite de redimencion (maxima)
		this.setMinimumSize(new Dimension(400, 400));//Limite de redimencion (minima)
		this.setLocationRelativeTo(null);
		
		JPanel fondo = new JPanel();
		fondo.setBounds(0,0,700,700);
		fondo.setLayout(null);
		fondo.setBackground(new Color(247, 195, 98));
		
		JButton click = new JButton("Click me");
		click.setBounds(250, 300,100,50);
		click.setOpaque(true);
		click.addActionListener(new ActionListener() {
			
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				float colorR = random.nextFloat();
				float colorG = random.nextFloat();
				float colorB = random.nextFloat();
				
				Color randomColor = new Color(colorR, colorG, colorB);
				JButton nuevo = new JButton("click me");
				nuevo.setOpaque(true);
				nuevo.setBounds(random.nextInt(700), random.nextInt(700), random.nextInt(200), random.nextInt(100));
				nuevo.setBackground(new Color(colorR, colorG, colorB));
				
				nuevo.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						
						int valor = JOptionPane.showConfirmDialog(null, "Color: " + randomColor.toString() + "\n" +"¿Desea borrar el boton?");
						
						if(valor == JOptionPane.YES_OPTION) {
							fondo.remove(nuevo);	
							fondo.repaint();
						}
					}
				});
				fondo.add(nuevo);
				fondo.revalidate();
				fondo.repaint();
			}
		});
		
		fondo.add(click);
		this.repaint();

		this.add(fondo);
		
}
	public static void main(String[] args) {
		BotonesRandom2 prueba = new BotonesRandom2("");

	}

}