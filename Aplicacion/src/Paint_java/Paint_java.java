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

	Image l = icono_lapiz.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING);
	
	Image b = icono_borrador.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING);
	
	Image f_cir = circulo.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING);
	
	Image f_cua = cuadrado.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING);
	
	Image f_tri = triangulo.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING);

	public Paint_java() {

		JFrame ventana_principal = new JFrame();

		this.setBounds(100, 100, 1200, 700);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setLayout(null);

		this.setVisible(true);

		

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

		triangulo.setBounds(100, 100, 30, 30);

		triangulo.setIcon(new ImageIcon(f_tri));

		triangulo.setVisible(true);

		triangulo.revalidate();
		
		triangulo.setBackground(null);
		
		triangulo.setBorder(null);

		figuras.add(triangulo);
		

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

		azul.setBackground(new Color(126, 200, 240));

		azul.setOpaque(true);

		colores.add(azul);
		
		
		JButton verde = new JButton();

		verde.setBounds(50, 80, 30, 30);

		verde.setBackground(new Color(197, 240, 126));

		verde.setOpaque(true);

		colores.add(verde);
	
		
		JButton rojo = new JButton();

		rojo.setBounds(100, 80, 30, 30);

		rojo.setBackground(new Color(240, 126, 126));

		rojo.setOpaque(true);

		colores.add(rojo);
		
		
		JButton naranja = new JButton();

		naranja.setBounds(100, 30, 30, 30);

		naranja.setBackground(new Color(240, 195, 126));

		naranja.setOpaque(true);

		colores.add(naranja);

		
		JButton morado = new JButton();

		morado.setBounds(150, 30, 30, 30);

		morado.setBackground(new Color(193, 126, 240));

		morado.setOpaque(true);

		colores.add(morado);
		
		
		JButton rosa = new JButton();

		rosa.setBounds(150, 80, 30, 30);

		rosa.setBackground(new Color(240, 126, 225));

		rosa.setOpaque(true);

		colores.add(rosa);
		
		
		JButton rosa_fuxia = new JButton();

		rosa_fuxia.setBounds(200, 80, 30, 30);

		rosa_fuxia.setBackground(new Color(240, 126, 171));

		rosa_fuxia.setOpaque(true);

		colores.add(rosa_fuxia);
		
		
		JButton azul_oscuro = new JButton();

	 azul_oscuro.setBounds(200, 30, 30, 30);

	 azul_oscuro.setBackground(new Color(126, 141, 240));

	 azul_oscuro.setOpaque(true);

		colores.add (azul_oscuro);
		
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