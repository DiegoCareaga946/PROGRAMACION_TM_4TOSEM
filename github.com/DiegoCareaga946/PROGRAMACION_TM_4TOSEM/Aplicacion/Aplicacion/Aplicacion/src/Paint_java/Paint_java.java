package Paint_java;



import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;

import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.BorderFactory;

import javax.swing.ImageIcon;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JSlider;


public class Paint_java extends JFrame implements  MouseListener, MouseMotionListener{

	private JFrame ventana_principal;
	private Lienzo panelDibujo;
	private int grosorPincel = 3;
	int tool = 1;
	Color color_personalizado = Color.black;
	
	private ArrayList<punto> puntos = new ArrayList<punto>();
	private ArrayList<Figura> figuras = new ArrayList<Figura>();
	
	List<List<punto>> listaDePuntos = new ArrayList<>(); 
	
	ImageIcon icono_lapiz = new ImageIcon(("Aplicacion/icono_lapiz.png"));
	ImageIcon icono_borrador = new ImageIcon(("Aplicacion/icono_borrador.png"));
	ImageIcon triangulo = new ImageIcon(("Aplicacion/icono_triangulo.png"));
	ImageIcon cuadrado = new ImageIcon(("Aplicacion/icono_cuadrado.png"));
	ImageIcon circulo = new ImageIcon(("Aplicacion/icono_circulo.png"));
	ImageIcon linea = new ImageIcon(("Aplicacion/icono_linea.png"));


	Image l = icono_lapiz.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	
	Image b = icono_borrador.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING);
	
	Image f_cir = circulo.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING);
	
	Image f_cua = cuadrado.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING);
	
	Image f_tri = triangulo.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING);
	
	Image f_lin = linea.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING);

	public void inicializar() {
		
		ventana_principal = new JFrame();
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
		limpiar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("boton");
				listaDePuntos.clear();
				figuras.clear();
				puntos.clear();
				panelDibujo.repaint();
			}
		});

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

		JSlider grosor = new JSlider(1, 10, 3);
		grosor.setBounds(15, 180, 130, 30);
		grosor.setVisible(true);
		grosor.setBackground(Color.white);

		grosor.addChangeListener(e -> {
		    grosorPincel = grosor.getValue();
		    repaint();
		});
		
		herramientas.add(grosor);
		
		JButton borrador = new JButton();
		borrador.setBounds(70, 100, 30, 30);
		borrador.setIcon(new ImageIcon(b));
		borrador.setVisible(true);
		borrador.revalidate();
		borrador.setBackground(null);
		borrador.setBorder(null);
		borrador.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tool = 2;
				color_personalizado = Color.white;
				grosorPincel = 30;
			}
		});
		herramientas.add(borrador);
		
		JButton lapiz = new JButton();
		lapiz.setBounds(70, 50, 30, 30);
		lapiz.setIcon(new ImageIcon(l));
		lapiz.setVisible(true);
		lapiz.revalidate();
		lapiz.setBackground(null);
		lapiz.setBorder(null);
		lapiz.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tool = 1;
				color_personalizado = Color.black;
				grosorPincel = grosor.getValue();
				
			}
		});
		herramientas.add(lapiz);
		
		JPanel colores = new JPanel();
		colores.setBounds(50, 10, 850, 125);
		colores.setBackground( new Color(234, 234, 234));
		colores.setBorder(BorderFactory.createTitledBorder("COLORES"));
		colores.setOpaque(true);
		panel_arriba.add(colores);
		
		JButton azul = new JButton();
		azul.setBounds(50, 30, 30, 30);
		azul.setBackground(Color.blue);
		azul.setOpaque(true);
		azul.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color_personalizado = Color.blue;
			}
		});
		colores.add(azul);
		
		JButton rojo = new JButton();
		rojo.setBounds(100, 80, 30, 30);
		rojo.setBackground(Color.red);
		rojo.setOpaque(true);
		rojo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color_personalizado = Color.red;
			}
		});
		colores.add(rojo);
		
		this.repaint();
		
		panelDibujo = new Lienzo();
		panelDibujo.setBounds(200, 150, 1000, 500);
		panelDibujo.setBackground(Color.WHITE);
		panelDibujo.addMouseListener(this);
		panelDibujo.addMouseMotionListener(this);
		this.add(panelDibujo);
	}
		
	
	public Paint_java() {
		inicializar();
	}
	
	class Lienzo extends JPanel{
		
		public Lienzo()
		{
			this.setBackground(Color.white);
		}
		
		@Override
	   public void paintComponent(Graphics g) {
	       super.paintComponent(g);
	       
	       Graphics2D g2 = (Graphics2D) g; 
	       g2.setColor(Color.black); 
	       g2.setStroke(new BasicStroke(3));
		   
	      
	       if(puntos.size()>1) {
	    	   
	    	   for (int i = 1; i < puntos.size(); i++) {
	    		   
	    		   punto p1 = puntos.get(i-1);
	    		   punto p2 = puntos.get(i);   
	    		  
	    		   g2.setStroke(new BasicStroke(p1.g));
	    		   g2.setColor(p1.c); 
	    		   g2.drawLine(p1.x,p1.y,p2.x,p2.y);
	    	   }
	    	   
	       }
	       
	       for (Iterator iterator = listaDePuntos.iterator(); iterator.hasNext();) {
			List<punto> trazo = (List<punto>) iterator.next();
			
				if(trazo.size()>1) {
		    	   
		    	   for (int i = 1; i < trazo.size(); i++) {
		    		   
		    		   punto p1 = trazo.get(i-1);
		    		   punto p2 = trazo.get(i);
		    		   
		    		   g2.setStroke(new BasicStroke(p1.g));
		    		   g2.setColor(p1.c); 
		    		   g2.drawLine(p1.x,p1.y,p2.x,p2.y);
		    	   }
		    	   
		       }
			
	       }
	   }
	}



	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if(tool == 1 || tool == 2) {
			
			puntos.add(new punto(e.getX(), e.getY(), grosorPincel, color_personalizado));	
			System.out.println(tool);
		}
		panelDibujo.repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(tool == 1 || tool == 2) {
			ArrayList ArrList2  = (ArrayList)puntos.clone();
			listaDePuntos.add(ArrList2);
			puntos.clear();
		}
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseMoved(MouseEvent e) {
		panelDibujo.repaint();
	}


	@Override
	public void mouseClicked(MouseEvent e) {
	}
	
	
	class punto{
		public int x,y,g;
		Color c;
		public punto(int x, int y, int g, Color c) {
			this.x = x;
			this.y = y;
			this.g = g;
			this.c = c;
			
			
		}
	}
	
	class Figura{
		public int x,y,w,h;
		public Color c;
		public Figura(int x, int y, int w, int h, Color c) {
			this.x = x;
			this.y = y;
			this.w = w;
			this.h = h;
			this.c = c;
			
		}
	}
	
	public static void main(String[] args) {

		Paint_java lienzo_nuevo = new Paint_java();

	}
	
	//COLORES
	
	/*
	JPanel colores = new JPanel();
	colores.setBounds(50, 10, 850, 125);
	colores.setBackground( new Color(234, 234, 234));
	colores.setBorder(BorderFactory.createTitledBorder("COLORES"));
	colores.setOpaque(true);
	panel_arriba.add(colores);
	
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
	*/
	
	//FIGURAS
	
	/*
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
	cuadrado.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			tool = 2;
		}
	});

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
*/
}