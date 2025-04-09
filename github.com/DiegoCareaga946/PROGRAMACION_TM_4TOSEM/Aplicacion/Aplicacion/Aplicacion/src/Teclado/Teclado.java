package Teclado;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class Teclado extends JFrame implements KeyListener {

    private JPanel contentPane;
    private Lienzo lienzo;
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
        panel_1.add(new JLabel("TIMER: "));
        contentPane.add(panel_1, BorderLayout.NORTH);
        
        
        lienzo = new Lienzo();
        lienzo.setBounds(x, y, w, h);
        lienzo.setFocusable(true);
        lienzo.requestFocusInWindow();
        lienzo.addKeyListener(this);
        lienzo.setBackground(Color.black);
        this.add(lienzo);
    }
    
    class Lienzo extends JPanel {
        Player jugador;
        Obstaculo obstaculo = new Obstaculo(150, 350, 220, 40);
        Obstaculo obstaculo2 = new Obstaculo(150, 100, 220, 40);
        
        
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
                     System.out.println("Colisión detectada");
                     return;
                 }
                 else if (movimientoX<0 || movimientoY < 0 || jRight > lienzo.getWidth() || Bottom > lienzo.getHeight()) {
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
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_A:
                lienzo.moverJugador(-5, 0);
                break;
            case KeyEvent.VK_D:
                lienzo.moverJugador(5, 0);
                break;
            case KeyEvent.VK_W:
                lienzo.moverJugador(0, -5);
                break;
            case KeyEvent.VK_S:
                lienzo.moverJugador(0, 5);
                break;
            case KeyEvent.VK_R:
            	lienzo.jugador.reiniciar();
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
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

        public Rectangle getBounds() {
            return new Rectangle(x, y, w, h);
        }

        public void move(int dx, int dy) {
            x += dx;
            y += dy;
            repaint();
        }

        public void reiniciar() {
            x = 0;
            y = 0;
            repaint();
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
