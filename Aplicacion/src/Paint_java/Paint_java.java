package Paint_java;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;

import java.awt.Image;



import javax.swing.BorderFactory;

import javax.swing.ImageIcon;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.Border;



public class Paint_java extends JFrame{

	ImageIcon icono_lapiz = new ImageIcon(("src/icono_lapiz.png"));
	ImageIcon icono_borrador = new ImageIcon(("src/borrador.png"));
	ImageIcon triangulo = new ImageIcon(("src/triangulo.png"));
	ImageIcon cuadrado = new ImageIcon(("src/cuadrado.png"));
	ImageIcon circulo = new ImageIcon(("src/circulo.png"));
	ImageIcon linea = new ImageIcon(("src/linea.png"));


	Image l = icono_lapiz.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING);
	
	Image b = icono_borrador.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING);
	
	Image f_cir = circulo.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING);
	
	Image f_cua = cuadrado.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING);
	
	Image f_tri = triangulo.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING);
	
	Image f_lin = linea.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING);

	public Paint_java() {

		JFrame ventana_principal = new JFrame();

		this.setBounds(100, 100, 1200, 700);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setLayout(null);

		this.setVisible(true);

		
		
		JButton limpiar = new JButton("Limpiar");

		limpiar.setBounds(50,20, 100, 30);

		limpiar.setVisible(true);

		limpiar.revalidate();
		
		limpiar.setBackground(Color.white);
		
		limpiar.setBorder(BorderFactory.createLineBorder(Color.black));

		this.add(limpiar);

		
		
		JPanel panel_izquierdo = new JPanel();

		panel_izquierdo.setBounds(0, 0, 200, 700);

		panel_izquierdo.setBackground( new Color(194, 194, 194));

		panel_izquierdo.setLayout(null);

		panel_izquierdo.setOpaque(true);

		

		this.add(panel_izquierdo);

		

		JPanel panel_arriba = new JPanel();

		panel_arriba.setBounds(200, 0, 1000, 150);

		panel_arriba.setBackground( new Color(194, 194, 194));

		panel_arriba.setLayout(null);

		panel_arriba.setOpaque(true);

		this.add(panel_arriba);

		

		JPanel herramientas = new JPanel();

		herramientas.setBounds(20, 80, 160, 250);

		herramientas.setBackground( new Color(234, 234, 234));

		herramientas.setBorder(BorderFactory.createTitledBorder("HERRAMIENTAS"));

		herramientas.setLayout(new GridLayout(3,1,5,5));

		herramientas.setOpaque(true);

		panel_izquierdo.add(herramientas);

		

		

		JButton lapiz = new JButton();

		lapiz.setBounds(70, 50, 30, 30);

		lapiz.setIcon(new ImageIcon(l));

		lapiz.setVisible(true);

		lapiz.revalidate();
		
		lapiz.setBackground(null);
		
		lapiz.setBorder(null);

		herramientas.add(lapiz);

		

		JButton borrador = new JButton();

		borrador.setBounds(70, 100, 30, 30);

		borrador.setIcon(new ImageIcon(b));

		borrador.setVisible(true);

		borrador.revalidate();
		
		borrador.setBackground(null);
		
		borrador.setBorder(null);

		herramientas.add(borrador);
		
		
		JSlider grosor = new JSlider();

		grosor.setBounds(15, 180, 130, 30);

		grosor.setVisible(true);

		grosor.revalidate();
		
		grosor.setBackground(Color.white);

		herramientas.add(grosor);



		JPanel figuras = new JPanel();

		figuras.setBounds(20, 350, 160, 250);

		figuras.setBackground( new Color(234, 234, 234));

		figuras.setBorder(BorderFactory.createTitledBorder("FIGURAS"));

		figuras.setOpaque(true);

		panel_izquierdo.add(figuras);
		
	
		
		JButton circulo = new JButton();

		circulo.setBounds(30, 70, 30, 30);

		circulo.setIcon(new ImageIcon(f_cir));

		circulo.setVisible(true);

		circulo.revalidate();
		
		circulo.setBackground(null);
		
		circulo.setBorder(null);

		figuras.add(circulo);
		
		
		
		JButton cuadrado = new JButton();

		cuadrado.setBounds(30, 130, 30, 30);

		cuadrado.setIcon(new ImageIcon(f_cua));

		cuadrado.setVisible(true);

		cuadrado.revalidate();
		
		cuadrado.setBackground(null);
		
		cuadrado.setBorder(null);

		figuras.add(cuadrado);
		
		
		
		JButton triangulo = new JButton();

		triangulo.setBounds(100, 70, 30, 30);

		triangulo.setIcon(new ImageIcon(f_tri));

		triangulo.setVisible(true);

		triangulo.revalidate();
		
		triangulo.setBackground(null);
		
		triangulo.setBorder(null);

		figuras.add(triangulo);
		
		
		
		JButton linea = new JButton();

		linea.setBounds(100, 130, 30, 30);

		linea.setIcon(new ImageIcon(f_lin));

		linea.setVisible(true);

		linea.revalidate();
		
		linea.setBackground(null);
		
		linea.setBorder(null);

		figuras.add(linea);
		
		
		
		
		

		JPanel colores = new JPanel();

		colores.setBounds(50, 10, 850, 125);

		colores.setBackground( new Color(234, 234, 234));

		colores.setBorder(BorderFactory.createTitledBorder("COLORES"));

		colores.setOpaque(true);

		panel_arriba.add(colores);
		
		
		Lienzo panelDibujo = new Lienzo();
        panelDibujo.setBounds(200, 0, 1000, 700);
        panelDibujo.setBackground(Color.WHITE);
        this.add(panelDibujo);
		
		
		JButton azul = new JButton();

		azul.setBounds(50, 30, 30, 30);

		azul.setBackground(Color.black);

		azul.setOpaque(true);

		colores.add(azul);
		
		
		JButton verde = new JButton();

		verde.setBounds(50, 80, 30, 30);

		verde.setBackground(Color.white);

		verde.setOpaque(true);

		colores.add(verde);
	
		
		JButton rojo = new JButton();

		rojo.setBounds(100, 80, 30, 30);

		rojo.setBackground(Color.red);

		rojo.setOpaque(true);

		colores.add(rojo);
		
		
		JButton naranja = new JButton();

		naranja.setBounds(100, 30, 30, 30);

		naranja.setBackground(Color.gray);

		naranja.setOpaque(true);

		colores.add(naranja);

		
		JButton morado = new JButton();

		morado.setBounds(150, 30, 30, 30);

		morado.setBackground(Color.blue);

		morado.setOpaque(true);

		colores.add(morado);
		
		
		JButton rosa = new JButton();

		rosa.setBounds(150, 80, 30, 30);

		rosa.setBackground(Color.green);

		rosa.setOpaque(true);

		colores.add(rosa);
		
		this.repaint();
	}
	
	private class Lienzo extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
        }
    }
	



	public static void main(String[] args) {

		Paint_java lienzo_nuevo = new Paint_java();



	}



}