package Teclado;

import java.awt.*;
import java.awt.event.*;
import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class Teclado extends JFrame implements KeyListener {
	
	
	
	Player jugador;
	Meta meta;
    Obstaculo obstaculo = new Obstaculo(150, 350, 220, 40);
    Obstaculo obstaculo2 = new Obstaculo(150, 100, 220, 40);
    private JPanel contentPane;
    private Lienzo lienzo, lienzo2;
    
    Font titulos = new Font(Font.SERIF, Font.PLAIN,  20);
    
    ImageIcon pacman_derecha = new ImageIcon(("Aplicacion/Aplicacion/src/Teclado/pacman_derecha.png"));
    ImageIcon pacman_izquierda = new ImageIcon(("Aplicacion/Aplicacion/src/Teclado/pacman_izquierda.png"));
    ImageIcon pacman_arriba = new ImageIcon(("Aplicacion/Aplicacion/src/Teclado/pacman_arriba.png"));
    ImageIcon pacman_abajo = new ImageIcon(("Aplicacion/Aplicacion/src/Teclado/pacman_abajo.png"));
    
    Timer timer, timer2;
    JLabel textoNivel;
    int nivel = 1;
	int ganaste = 0;
    int respuesta = 1;
    int lastPress;
    int seg;
    int mil = 1;
    int dx = 0;
    int dy = 0;
    int x = 0;
    int y = 0;
    int w = 700;
    int h = 700;
    
    int tam = 40;
    int tamLineaHorizontal = 10;
    int tamLineaVertical = 10;
    
    int [][] mapa1 = {
    		{0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1},
    		{1, 6, 1, 5, 4, 1, 6, 4, 0, 4, 4, 4, 6, 1},
    		{1, 4, 4, 1, 2, 2, 1, 6, 4, 4, 5, 2, 6, 1},
    		{1, 1, 6, 2, 2, 0, 1, 4, 4, 4, 4, 4, 4, 1},
    		{1, 1, 6, 4, 4, 4, 4, 4, 4, 1, 4, 2, 6, 1},
    		{1, 2, 1, 6, 1, 4, 1, 6, 2, 1, 6, 1, 2, 1},
    		{1, 0, 2, 6, 1, 2, 1, 6, 4, 1, 6, 1, 6, 1},
    		{1, 6, 6, 1, 4, 4, 1, 4, 4, 4, 6, 1, 0, 1},
    		{1, 6, 4, 4, 6, 0, 4, 6, 0, 6, 6, 1, 4, 1},
    		{1, 4, 0, 0, 6, 6, 0, 6, 0, 6, 1, 4, 6, 1},
    		{1, 6, 2, 2, 6, 6, 1, 6, 6, 4, 4, 1, 6, 1},
    		{1, 0, 6, 2, 1, 6, 4, 4, 1, 4, 4, 4, 6, 1},
    		{1, 2, 6, 4, 1, 6, 1, 6, 1, 2, 1, 6, 4, 1},
    		{1, 4, 4, 6, 2, 4, 1, 6, 4, 6, 1, 6, 0, 4},
    		{2, 2, 2, 6, 4, 4, 4, 4, 4, 4, 4, 4, 4, 8},
    		};
    
    int [][] mapa2 = {
    		{0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1},
    		{1, 4, 6, 1, 6, 4, 0, 6, 2, 0, 6, 4, 1, 1},
    		{1, 6, 4, 4, 4, 6, 6, 6, 6, 4, 4, 4, 4, 1},
    		{1, 4, 6, 1, 6, 6, 6, 6, 4, 4, 6, 4, 4, 4},
    		{1, 2, 6, 2, 2, 6, 6, 4, 4, 6, 4, 4, 4, 5},
    		{1, 6, 2, 6, 2, 2, 1, 6, 4, 4, 4, 4, 6, 1},
    		{1, 2, 2, 2, 0, 4, 1, 0, 6, 0, 6, 4, 4, 1},
    		{1, 4, 6, 0, 6, 6, 2, 1, 0, 1, 0, 0, 6, 1},
    		{1, 6, 6, 6, 5, 0, 6, 2, 2, 2, 2, 1, 6, 1},
    		{1, 6, 6, 6, 2, 2, 2, 2, 2, 2, 2, 1, 6, 1},
    		{1, 6, 7, 6, 6, 2, 1, 6, 2, 2, 1, 1, 6, 1},
    		{1, 0, 0, 6, 6, 4, 2, 2, 6, 2, 1, 1, 6, 1},
    		{1, 1, 2, 6, 4, 6, 1, 4, 6, 1, 1, 0, 6, 1},
    		{1, 2, 1, 2, 6, 6, 4, 2, 6, 1, 2, 2, 6, 0},
    		{2, 2, 2, 4, 4, 4, 7, 6, 4, 4, 4, 4, 4, 8},
    		};
    private ArrayList<Obstaculo> figuras = new ArrayList<Obstaculo>();

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Teclado frame = new Teclado();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
    
    public Teclado() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 100, 560, 700);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));
        
        JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.SOUTH);
        JLabel cartel = new JLabel("Reiniciar pulsa + " + "R");
        cartel.setFont(titulos);
        panel.add(cartel);

        JPanel panel_1 = new JPanel();
        
        textoNivel = new JLabel("Nivel "+ nivel + "   ");
        textoNivel.setFont(titulos);
        panel_1.add(textoNivel);
        contentPane.add(panel_1, BorderLayout.NORTH);
        
        JLabel tiempo = new JLabel("Timer 0:0");
        tiempo.setFont(titulos);
        panel_1.add(tiempo);
        contentPane.add(panel_1, BorderLayout.NORTH);
                
        ActionListener taskPerformer = new ActionListener() {
        	
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		// TODO Auto-generated method stub
        		String [] split_string = tiempo.getText().split(":");
        		mil = Integer.parseInt(split_string[1]);
        		
        		mil+=1;
        		
        		if(mil>=10) {
        			seg++;
        			mil = 1;        			
        		}
        		
        		tiempo.setText("Timer " + seg + ":" + mil + "");
        	}
        };
        timer = new Timer(100, taskPerformer);
        
        ActionListener movimiento = new ActionListener() {
        	
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		// TODO Auto-generated method stub
        		lienzo.moverJugador(dx, dy);
        		updated();
        	}
        };
        
        timer2 = new Timer(5, movimiento);
        
        lienzo = new Lienzo();
        lienzo.setBounds(x, y, w, h);
        lienzo.setFocusable(true);
        lienzo.requestFocusInWindow();
        lienzo.addKeyListener(this);
        lienzo.setBackground(Color.black);
        seleccionMapa(respuesta);
        this.add(lienzo);
    }
    
    class Lienzo extends JPanel {
       
        
        
        public Lienzo() {
        	
        	setFocusable(true); 
    	    requestFocusInWindow(); 
    	    setBackground(Color.black);
    	    jugador = new Player(0, 0, 20, 20, Color.green, pacman_derecha);
    	    meta = new Meta (0, 0, 30, 30, Color.red);
    	    
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            for (Obstaculo obstaculo : figuras) {
				obstaculo.draw(g2);
			}
            jugador.draw(g2);
            meta.draw(g2);
        }

        public void moverJugador(int dx, int dy) {
        	
        	for (Obstaculo obstaculo : figuras) {
        		int movimientoX = jugador.x + dx;
        		int movimientoY = jugador.y + dy;
        		
        		int jLeft = movimientoX;
        		int jRight = movimientoX + jugador.w;
        		int jTop = movimientoY;
        		int jBottom = movimientoY + jugador.h;
        		
        		int oLeft = obstaculo.x;
        		int oRight = obstaculo.x + obstaculo.w;
        		int oTop = obstaculo.y;
        		int oBottom = obstaculo.y + obstaculo.h;
        		
        		int mLeft = meta.x;
        		int mRight = meta.x + meta.w;
        		int mTop = meta.y;
        		int mBottom = meta.y + meta.h;
			 
        		boolean colision = !(jRight <= oLeft || jLeft >= oRight || jBottom <= oTop || jTop >= oBottom);
        		boolean colisionMeta = !(jRight <= mLeft || jLeft >= mRight || jBottom <= mTop || jTop >= mBottom);

        		if (colision) {
        			jugador.colorNuevo();
        			System.out.println("Colisión detectada");
			     return;
        		}
        		if(colisionMeta && ganaste == 0) {
        			timer.stop();
        			timer2.stop();
        			JOptionPane.showMessageDialog(null, "GANASTE "+ "\n"+
        												" TIEMPO: " + seg + ":" + mil);
        			seleccionMapa(respuesta);
        			ganaste++;
        			reiniciar();
        			jugador.reiniciar();
        		}
        		else if (movimientoX < 0 || movimientoY < 0 || jRight > lienzo.getWidth() || jBottom > lienzo.getHeight()) {
        			jugador.colorNuevo();
        			System.out.println("Colision paredes");
        			return;
        		}
             }
             jugador.move(dx, dy);
             repaint();
        }

        public void reiniciarJugador() {
           jugador.reiniciar();
        }
    }
	    	
    

    @Override
    public void keyPressed(KeyEvent e) {
    	
    	timer.start();
    	timer2.start();
    	
    	lastPress = e.getKeyCode();
    	
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_A:
            	jugador.icono = pacman_izquierda;
            	dx = -5;
            	dy = 0;
                break;
            case KeyEvent.VK_D:
            	jugador.icono = pacman_derecha;
            	dx = 5;
            	dy = 0;
                break;
            case KeyEvent.VK_W:
            	jugador.icono = pacman_arriba;
            	dx = 0;
            	dy = -5;
                break;
            case KeyEvent.VK_S:
            	jugador.icono = pacman_abajo;
            	dx = 0;
            	dy = 5;
                break;
            case KeyEvent.VK_R:
            	jugador.icono = pacman_derecha;
            	dx = 0;
            	dy = 0;
            	if(respuesta == 1) {
            		respuesta = 2;
            		nivel = 2;
            	}
            	else {
            		respuesta = 1;
            		nivel = 1;
            	}
            	textoNivel.setText("Nivel "+ nivel + "   ");
            	seleccionMapa(respuesta);
            	repaint();
            	jugador.reiniciar();
                break;
        }
    }
    
    
    
    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
    
    public void updated() {
    	repaint();
    }
    
    class Player {
        int x, y, w, h;
        ImageIcon icono;
        Color color;

        public Player(int x, int y, int w, int h, Color color, ImageIcon icono) {
            this.x = x;
            this.y = y;
            this.w = w;
            this.h = h;
            this.icono = icono;
            this.color = color;
        }

        public void draw(Graphics2D g2) {
        	
        	Image img = icono.getImage();
            g2.setColor(color);
            g2.drawImage(img, x, y, w, h, null);

        }

        public void move(int dx, int dy) {
            x += dx;
            y += dy;
            repaint();
        }
        
        public void reiniciar() {
            x = 0;
            y = 0;
            ganaste = 0;
          
            jugador.color = Color.green;
            
            mil = 0;
            seg = 0;

            timer.stop();
            timer2.stop();
           
            repaint();
        }
        
    	public Color colorNuevo() {
    		Random random = new Random();
    		int colorR = random.nextInt(250);
    		int colorG = random.nextInt(250);
    		int colorB = random.nextInt(250);
    		
    		color = new Color(colorR,colorG,colorB);
    		
    		return color;
        		
    	}
    }
    public void reiniciar() {
        x = 0;
        y = 0;
        ganaste = 0;
      
        jugador.color = Color.green;
        
        mil = 0;
        seg = 0;

        timer.stop();
        timer2.stop();
       
        repaint();
    }
    
    public void seleccionMapa(int seleccion) {
    	seleccion = respuesta;
    	switch(seleccion) {
    	case 1:        
    		figuras.clear();
    	    for(int i = 0; i<mapa1.length; i++) {
            	for(int j = 0; j<mapa1[i].length; j++) {
            		if(mapa1[i][j] == 1) {
            		Obstaculo obstaculo = new Obstaculo(j*tam, i*tam, tamLineaHorizontal, 50);
            		figuras.add(obstaculo);
            		}
            		if(mapa1[i][j] == 2) {
            			Obstaculo obstaculo = new Obstaculo(j*tam, i*tam, tam, tamLineaVertical);
        				figuras.add(obstaculo);    
            			
                	}
            		if(mapa1[i][j] == 3) {
            			Obstaculo obstaculo = new Obstaculo(j*tam, i*tam+10, tam, tamLineaVertical);
        				figuras.add(obstaculo);    
            			
                	}
            		//linea horizontal dibujado a la izquierda
            		if(mapa1[i][j] == 4) {
            			Obstaculo obstaculo = new Obstaculo(j*tam-39, i*tam, tam, tamLineaVertical);
        				figuras.add(obstaculo);    
                	}
            		//lineas de tamaño doble
            		if(mapa1[i][j] == 5) {
            			Obstaculo obstaculo = new Obstaculo(j*tam, i*tam-39, tamLineaHorizontal, 89);
        				figuras.add(obstaculo);    
                	}
            		if(mapa1[i][j] == 6) {
            			Obstaculo obstaculo = new Obstaculo(j*tam, i*tam-40, tamLineaHorizontal, 50);
        				figuras.add(obstaculo);    
                	}
            		if(mapa1[i][j] == 7) {
            			Obstaculo obstaculo = new Obstaculo(j*tam-39, i*tam, 89, tamLineaVertical);
        				figuras.add(obstaculo);    
                	}
            		if(mapa1[i][j] == 8) {
            			meta.x = j * tam;
            		    meta.y = i * tam;
                	}
            	}
            }
    		break;
    	case 2:
    		figuras.clear();
    	    for(int i = 0; i<mapa2.length; i++) {
            	for(int j = 0; j<mapa2[i].length; j++) {
            		if(mapa2[i][j] == 1) {
            		Obstaculo obstaculo = new Obstaculo(j*tam, i*tam, tamLineaHorizontal, 50);
            		figuras.add(obstaculo);
            		}
            		if(mapa2[i][j] == 2) {
            			Obstaculo obstaculo = new Obstaculo(j*tam, i*tam, tam, tamLineaVertical);
        				figuras.add(obstaculo);    
            			
                	}
            		if(mapa2[i][j] == 3) {
            			Obstaculo obstaculo = new Obstaculo(j*tam, i*tam+10, tam, tamLineaVertical);
        				figuras.add(obstaculo);    
            			
                	}
            		//linea horizontal dibujado a la izquierda
            		if(mapa2[i][j] == 4) {
            			Obstaculo obstaculo = new Obstaculo(j*tam-39, i*tam, tam, tamLineaVertical);
        				figuras.add(obstaculo);    
                	}
            		//lineas de tamaño doble
            		if(mapa2[i][j] == 5) {
            			Obstaculo obstaculo = new Obstaculo(j*tam, i*tam-39, tamLineaHorizontal, 89);
        				figuras.add(obstaculo);    
                	}
            		if(mapa2[i][j] == 6) {
            			Obstaculo obstaculo = new Obstaculo(j*tam, i*tam-40, tamLineaHorizontal, 50);
        				figuras.add(obstaculo);    
                	}
            		if(mapa2[i][j] == 7) {
            			Obstaculo obstaculo = new Obstaculo(j*tam-39, i*tam, 89, tamLineaVertical);
        				figuras.add(obstaculo);    
                	}
            		if(mapa2[i][j] == 8) {
            			meta.x = j * tam;
            		    meta.y = i * tam;
                	}
            	}
            }
    		break;
		default:
			return;
    	}
    	
    }

    class Obstaculo {
        int x, y, w, h;
        Color color = new Color(86, 90, 158);

        public Obstaculo(int x, int y, int w, int h) {
            this.x = x;
            this.y = y;
            this.w = w;
            this.h = h;
        }

        public void draw(Graphics2D g2) {
            g2.setColor(color);
            g2.fillRect(x, y, w, h);
        }
    }
    class Meta {
    	int x, y, w, h;
    	Color color = Color.red;
    	
    	public Meta(int x, int y, int w, int h, Color color) {
    		this.x = x;
    		this.y = y;
    		this.w = w;
    		this.h = h;
    		this.color = color;
    	}
    	
    	public void draw(Graphics2D g2) {
    		g2.setColor(color);
    		g2.fillRect(x, y, w, h);
    	}
    }
    }
   
    
