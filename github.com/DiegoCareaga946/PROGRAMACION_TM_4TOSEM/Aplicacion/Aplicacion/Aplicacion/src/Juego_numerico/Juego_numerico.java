package Juego_numerico;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import Ventana.EstiloBordeRedondeado;

public class Juego_numerico extends JFrame{
	int movimiento = 0;
	
	public class Roundbutton extends JFrame {

	    private static final long serialVersionUID = 34534511L;

	    public static void main(String[] args) {
	        try {
	            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (Exception e) {
	            // If Nimbus is not available, you can set the GUI to another look and feel.
	        }
	        //       
	        JFrame.setDefaultLookAndFeelDecorated(true);
	        JFrame frame = new JFrame("Rounded Button Example");
	        frame.setLayout(new FlowLayout());
	        frame.setSize(150, 150);

	        JButton addBtn = new JButton("X");

	        frame.add(addBtn);

	        frame.setVisible(true);

	    }

	}
		JFrame Juego_numerico = new JFrame();

		public Juego_numerico() {
			Font etiquetas = new Font("Andale Mono", Font.BOLD, 22);
			Font etiquetas_grande = new Font("Andale Mono", Font.BOLD, 40);
			this.setBounds(0, 0, 700, 700);
			this.setLayout(null);
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			JPanel fondo = new JPanel();
			fondo.setBounds(0,0,700,700);
			fondo.setBackground(new Color(188, 162, 231));
			fondo.setOpaque(true);
			fondo.setLayout(null);
			this.add(fondo);
			
			JLabel contador = new JLabel("MOVIMIENTO: " + movimiento);
			contador.setBounds(140, 550, 200, 30);
			contador.setFont(etiquetas);
			fondo.add(contador);
			
			JLabel titulo_juego = new JLabel("KLOTSKI");
			titulo_juego.setBounds(250, 50, 200, 40);
			titulo_juego.setFont(etiquetas_grande);
			fondo.add(titulo_juego);

			JPanel panel_botones = new JPanel();

			panel_botones.setBounds(140, 140, 400, 400);
			panel_botones.setLayout(new GridLayout(4,4,2,2));
			panel_botones.setBackground(new Color(147, 120, 190));
			fondo.add(panel_botones);

			Random rand = new Random();
			int num_boton = 0;	

			for(int x = 0; x<=14; x++) {
				int contadores = rand.nextInt(16);
					JButton boton = new JButton(contadores + "");
					boton.setSize(10,10);
					boton.setBackground(new Color(255, 204, 232));
					boton.setFont(etiquetas);
					boton.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							movimiento++;
							System.out.println(movimiento);
							contador.repaint();
							contador.setText("MOVIMIENTO: " + movimiento);
						}
					});
					panel_botones.add(boton);
					num_boton = contadores;
			}
			
			
			this.revalidate();
			this.repaint();

		}

		

		

		

		public static void main(String[] args) {

			// TODO Auto-generated method stub

			Juego_numerico ventana = new Juego_numerico();

		}

	}
