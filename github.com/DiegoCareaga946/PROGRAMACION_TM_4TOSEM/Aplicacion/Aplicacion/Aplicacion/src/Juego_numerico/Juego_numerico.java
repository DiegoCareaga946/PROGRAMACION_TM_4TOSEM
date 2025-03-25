package Juego_numerico;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class Juego_numerico extends JFrame{
	int movimiento = 0;
	JButton[] grupo = new JButton[16];
	JPanel panel_botones = new JPanel();
	
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
			
			
			ArrayList<Integer> numeros = new ArrayList<Integer>();
			numeros.add(1);
			numeros.add(2);
			numeros.add(3);
			numeros.add(4);
			numeros.add(5);
			numeros.add(6);
			numeros.add(7);
			numeros.add(8);
			numeros.add(9);
			numeros.add(10);
			numeros.add(11);
			numeros.add(12);
			numeros.add(13);
			numeros.add(14);
			numeros.add(15);
			numeros.add(0);
			
			//Collections.shuffle(numeros);
			for(int i = 0;i<grupo.length;i++) {
				grupo[i] = new JButton(String.valueOf(numeros.get(i))); 
				System.out.println(grupo[i]);
			}
			


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
			
			for(int x = 0; x <grupo.length;x++) {
		    	System.out.println(grupo[x]);
		    }
			

			panel_botones.setBounds(140, 140, 400, 400);
			panel_botones.setLayout(new GridLayout(4,4,2,2));
			panel_botones.setBackground(new Color(147, 120, 190));
			fondo.add(panel_botones);

			JButton reiniciar = new JButton("Reiniciar");
			reiniciar.setBounds(260, 100, 150, 30);
			reiniciar.setFont(etiquetas);
			reiniciar.setVisible(true);
			reiniciar.setBackground(new Color(255, 242, 114));
			fondo.add(reiniciar);
			
			JButton boton1 = new JButton(numeros.get(0)+"");
			boton1.setSize(10,10);
			boton1.setBackground(new Color(255, 204, 232));
			boton1.setFont(etiquetas);
			grupo[0] = boton1;
			
			JButton boton2 = new JButton(numeros.get(1)+"");
			boton2.setSize(10,10);
			boton2.setBackground(new Color(255, 204, 232));
			boton2.setFont(etiquetas);
			grupo[1] = boton2;
			
			JButton boton3 = new JButton(numeros.get(2)+"");
			boton3.setSize(10,10);
			boton3.setBackground(new Color(255, 204, 232));
			boton3.setFont(etiquetas);
			grupo[2] = boton3;
			
			JButton boton4 = new JButton(numeros.get(3)+"");
			boton4.setSize(10,10);
			boton4.setBackground(new Color(255, 204, 232));
			boton4.setFont(etiquetas);
			grupo[3] = boton4;
			
			JButton boton5 = new JButton(numeros.get(4)+"");
			boton5.setSize(10,10);
			boton5.setBackground(new Color(255, 204, 232));
			boton5.setFont(etiquetas);
			grupo[4] = boton5;
			
			JButton boton6 = new JButton(numeros.get(5)+"");
			boton6.setSize(10,10);
			boton6.setBackground(new Color(255, 204, 232));
			boton6.setFont(etiquetas);
			grupo[5] = boton6;
			
			JButton boton7 = new JButton(numeros.get(6)+"");
			boton7.setSize(10,10);
			boton7.setBackground(new Color(255, 204, 232));
			boton7.setFont(etiquetas);
			grupo[6] = boton7;
			
			JButton boton8 = new JButton(numeros.get(7)+"");
			boton8.setSize(10,10);
			boton8.setBackground(new Color(255, 204, 232));
			boton8.setFont(etiquetas);
			grupo[7] = boton8;
			
			JButton boton9 = new JButton(numeros.get(8)+"");
			boton9.setSize(10,10);
			boton9.setBackground(new Color(255, 204, 232));
			boton9.setFont(etiquetas);
			grupo[8] = boton9;
			
			JButton boton10 = new JButton(numeros.get(9)+"");
			boton10.setSize(10,10);
			boton10.setBackground(new Color(255, 204, 232));
			boton10.setFont(etiquetas);
			grupo[9] = boton10;
			
			JButton boton11 = new JButton(numeros.get(10)+"");
			boton11.setSize(10,10);
			boton11.setBackground(new Color(255, 204, 232));
			boton11.setFont(etiquetas);
			grupo[10] = boton11;
			
			JButton boton12 = new JButton(numeros.get(11)+"");
			boton12.setSize(10,10);
			boton12.setBackground(new Color(255, 204, 232));
			boton12.setFont(etiquetas);
			grupo[11] = boton12;
			
			JButton boton13 = new JButton(numeros.get(12)+"");
			boton13.setSize(10,10);
			boton13.setBackground(new Color(255, 204, 232));
			boton13.setFont(etiquetas);
			grupo[12] = boton13;
			
			JButton boton14 = new JButton(numeros.get(13)+"");
			boton14.setSize(10,10);
			boton14.setBackground(new Color(255, 204, 232));
			boton14.setFont(etiquetas);
			grupo[13] = boton14;
			
			JButton boton15 = new JButton(numeros.get(14)+"");
			boton15.setSize(10,10);
			boton15.setBackground(new Color(255, 204, 232));
			boton15.setFont(etiquetas);
			grupo[14] = boton15;
			
			JButton boton0 = new JButton(numeros.get(15)+"");
			boton0.setSize(10,10);
			boton0.setBackground(new Color(199, 248, 87));
			boton0.setFont(etiquetas);
			grupo[15] = boton0;
				
			for (JButton boton : grupo) {
				
				
				panel_botones.add(boton);
				boton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						movimiento++;
						System.out.println(movimiento);
						contador.repaint();
						contador.setText("MOVIMIENTO: " + movimiento);
						
						int index = -1;
			     
			            for (int i = 0; i < grupo.length; i++) {
			                if (grupo[i] == boton) {
			                    index = i;
			                    break; 
			                }
			            }
			            System.out.println(boton);
			            movimientoBoton(index);
				}});
			}
			
				
			this.revalidate();
			this.repaint();
		}

		public void movimientoBoton(int mover) {
			int fila = mover /4;
			int columna = mover %4;
			
			if (columna > 0 && grupo[mover-1].getText().equals("0")) {
			    // Intercambiar con el botón a la izquierda
			    int leftIndex = mover - 1;
			    intercambiarBotones(mover, leftIndex);
			}

			// Mover hacia la derecha
			if (columna < 4 - 1 && grupo[mover+1].getText().equals("0")) {
			    // Intercambiar con el botón a la derecha
			    int rightIndex = mover + 1;
			    intercambiarBotones(mover, rightIndex);
			}

			// Mover hacia arriba
			if (fila > 0 && grupo[mover-4].getText().equals("0")) {
			    // Intercambiar con el botón de arriba
			    int upIndex = mover - 4;
			    intercambiarBotones(mover, upIndex);
			}

			// Mover hacia abajo
			if (fila < 4 - 1 && grupo[mover+4].getText().equals("0")) {
			    // Intercambiar con el botón de abajo
			    int downIndex = mover + 4;
			    intercambiarBotones(mover, downIndex);
			}
        }

		private void intercambiarBotones(int index1, int index2) {
		    JButton boton1 = grupo[index1];
		    JButton boton2 = grupo[index2];

		    // Intercambiar las etiquetas de los botones
		    String temp = boton1.getText();
		    boton1.setText(boton2.getText());
		    boton2.setText(temp);
		    panel_botones.removeAll();


		    panel_botones.revalidate();
		    for(int x = 0; x <grupo.length;x++) {
		    	if(grupo[x].getText().equals("0")) {
		    		grupo[x].setBackground(new Color(199, 248, 87));
				}
		    	else if(grupo[x].getText()!= "0") {
		    		grupo[x].setBackground(new Color(255, 204, 232));
		    	}
		    	panel_botones.add(grupo[x]);
		    }
		}


		

		

		

		public static void main(String[] args) {

			// TODO Auto-generated method stub

			Juego_numerico ventana = new Juego_numerico();

		}

	}
