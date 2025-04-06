package Teclado;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class Teclado extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("TIMER: ");
	int x = 0;
	int y = 0;
	Lienzo cuadrito;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teclado frame = new Teclado();
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
	public Teclado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 500, 648);
		addKeyListener(this);
		setFocusable(true);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("REINICIAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x = 0;
				y = 0;
				cuadrito.setLocation(x,y);
				cuadrito.setFocusable(true);
				cuadrito.requestFocusInWindow();
			}
		});
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.gray);
		panel_2.setLayout(null);
		contentPane.add(panel_2);
		
		cuadrito = new Lienzo();
		cuadrito.setBounds(x, y, 30, 30);
		cuadrito.setFocusable(true);
		cuadrito.addKeyListener(this);
		cuadrito.requestFocusInWindow();
		cuadrito.setBackground(Color.green);
		panel_2.add(cuadrito);
		
		
	}
	class Lienzo extends JPanel{
			
		@Override
	   public void paintComponent(Graphics g) {
	       super.paintComponent(g);
	       Graphics2D g2 = (Graphics2D) g; 
	       g2.setColor(Color.green);
	       g2.fillRect(x, y, 50, 50);
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyChar()) {
		case 'a':
			if(x > 0)
			x = x-5;
			cuadrito.setLocation(x, y);
			break;
		case 'd':
			if(x < 445)
			x = x+5;
			cuadrito.setLocation(x, y);
			break;
		case 'w':
			if(y > 0)
			y = y-5;
			cuadrito.setLocation(x, y);
			break;
		case 's':
			if(y < 510)
			y = y+5;
			cuadrito.setLocation(x, y);
			break;	
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
