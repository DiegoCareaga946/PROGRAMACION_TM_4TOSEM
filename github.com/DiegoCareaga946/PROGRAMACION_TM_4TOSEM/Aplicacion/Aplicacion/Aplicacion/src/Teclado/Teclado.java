package Teclado;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class Teclado extends JFrame implements KeyListener {
	
	
	
	Player jugador;
    Obstaculo obstaculo = new Obstaculo(150, 350, 220, 40);
    Obstaculo obstaculo2 = new Obstaculo(150, 100, 220, 40);
    private JPanel contentPane;
    private Lienzo lienzo;
    Timer timer, timer2;
    int lastPress;
    int seg;
    int mil = 1;
    int dx = 0;
    int dy = 0;
    int x = 0;
    int y = 0;
    int w = 700;
    int h = 700;
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
        setBounds(300, 100, 500, 648);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));
        
        JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.SOUTH);
        JLabel cartel = new JLabel("Reiniciar pulsa + " + "R");
        panel.add(cartel);

        JPanel panel_1 = new JPanel();
        
        JLabel tiempo = new JLabel("Timer --> 0:0");
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
        this.add(lienzo);
    }
    
    class Lienzo extends JPanel {
       
        
        
        public Lienzo() {
        	setFocusable(true); 
    	    requestFocusInWindow(); 
    	    setBackground(Color.black);
    	    jugador = new Player(0, 0, 50, 50, Color.green);
    	    figuras.add(obstaculo);
    	    figuras.add(obstaculo2);
    	   
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;

            for (Obstaculo obstaculo : figuras) {
				obstaculo.draw(g2);
			}
            jugador.draw(g2);
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
			 
        		boolean colision = !(jRight <= oLeft || jLeft >= oRight || jBottom <= oTop || jTop >= oBottom);
			 
        		if (colision) {
        			jugador.colorNuevo();
        			System.out.println("Colisión detectada");
			     return;
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
            	dx = -5;
            	dy = 0;
                break;
            case KeyEvent.VK_D:
            	dx = 5;
            	dy = 0;
                break;
            case KeyEvent.VK_W:
            	dx = 0;
            	dy = -5;
                break;
            case KeyEvent.VK_S:
            	dx = 0;
            	dy = 5;
                break;
            case KeyEvent.VK_R:
            	dx = 0;
            	dy = 0;
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
        Color color;

        public Player(int x, int y, int w, int h, Color color) {
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

        public void move(int dx, int dy) {
            x += dx;
            y += dy;
            repaint();
        }

        public void reiniciar() {
            x = 0;
            y = 0;
          
            jugador.color = color.green;
            
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

    class Obstaculo {
        int x, y, w, h;
        Color color = Color.orange;

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
   
    
    
    
}
