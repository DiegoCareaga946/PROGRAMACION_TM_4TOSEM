package JuegoGato;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
public class JuegoGato_Window extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	boolean turno = false;
	JButton boton1;
	JButton boton2;
	JButton boton3;
	JButton boton4;
	JButton boton5;
	JButton boton6;
	JButton boton7;
	JButton boton8;
	JButton boton9;
	JButton reiniciar;
	ImageIcon imagenX = new ImageIcon("Aplicacion/ImagenParaX.png");
	ImageIcon imagenO = new ImageIcon("Aplicacion/ImaenParaO.png");
	Image x = imagenX.getImage().getScaledInstance(120, 120, Image.SCALE_AREA_AVERAGING);
	Image o = imagenO.getImage().getScaledInstance(120, 120, Image.SCALE_AREA_AVERAGING);
	
	boolean gano = false;
	int cX = 0;
	int cO = 0;

	/**
	 * Launch the application.
	 */
	public static void main1(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JuegoGato_Window frame = new JuegoGato_Window();
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


			public JuegoGato_Window () {
				Font contadores_letra= new Font("Dialog", Font.BOLD, 14);
				
				JFrame juego = new JFrame();
				this.setSize(700,700);
				this.setVisible(true);
				getContentPane().setLayout(null);
				
				JPanel contadores_espacio = new JPanel();
				contadores_espacio.setBackground(new Color(128, 255, 128));
				contadores_espacio.setSize(100,40);
				contadores_espacio.setVisible(true);
				getContentPane().setLayout(new BorderLayout(0, 0));
				getContentPane().add(contadores_espacio);
				contadores_espacio.setLayout(null);
				
				JLabel contadorX = new JLabel("Contador X: " + cX);
				contadorX.setBounds(6, 5, 150, 19);
				contadorX.setFont(new Font("Dialog", Font.BOLD, 20));
				contadores_espacio.add(contadorX);
				
				JLabel contadorO = new JLabel("Contador O: " + cO);
				contadorO.setFont(new Font("Dialog", Font.BOLD, 20));
				contadorO.setBounds(6, 34, 141, 19);
				contadores_espacio.add(contadorO);
				this.repaint();
				this.revalidate();

				JPanel fondo = new JPanel();
				fondo.setBackground(new Color(0, 128, 0));
				fondo.setBounds(52, 69, 572, 560);
				fondo.setLayout(new GridLayout(3,3));
				fondo.setVisible(true);
				fondo.setOpaque(true);
				contadores_espacio.add(fondo);
				
				boton1 = new JButton();
				boton1.setBounds(0, 0, 30, 30);
				boton1.setVisible(true);
				boton1.addActionListener(new ActionListener() {
					
					
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String player = "X";
						if(turno) {
							turno = false;
							boton1.setIcon(new ImageIcon(x));
							boton1.setText("X");
						}
						
						else {
							turno = true;
							boton1.setIcon(new ImageIcon(o));
							boton1.setText("O");
						}
						boton1.setEnabled(false);
						boton1.repaint();
						boton1.revalidate();
						revisar();

					}
				});
				fondo.add(boton1);
				
				boton2 = new JButton();
				boton2.setBounds(0, 0, 30, 30);
				boton2.setVisible(true);
				boton2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String player = "X";
						if(turno) {
							turno = false;
							boton2.setIcon(new ImageIcon(x));
							boton2.setText("X");
						}
						else {
							turno = true;
							boton2.setIcon(new ImageIcon(o));
							boton2.setText("O");
						}
						boton2.setEnabled(false);
						revisar();

					}
				});
				fondo.add(boton2);
				
				boton3 = new JButton();
				boton3.setBounds(0, 0, 30, 30);
				boton3.setVisible(true);
				boton3.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String player = "X";
						if(turno) {
							turno = false;
							boton3.setIcon(new ImageIcon(x));
							boton3.setText("X");
						}
						else {
							turno = true;
							boton3.setIcon(new ImageIcon(o));
							boton3.setText("O");
						}
						boton3.setEnabled(false);
						revisar();

					}
				});
				fondo.add(boton3);
				boton4 = new JButton();
				boton4.setBounds(0, 0, 30, 30);
				boton4.setVisible(true);
				boton4.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String player = "X";
						if(turno) {
							turno = false;
							boton4.setIcon(new ImageIcon(x));
							boton4.setText("X");
						}
						else {
							turno = true;
							boton4.setIcon(new ImageIcon(o));
							boton4.setText("O");
						}
						boton4.setEnabled(false);
						revisar();

					}
				});
				fondo.add(boton4);
				boton5 = new JButton();
				boton5.setBounds(0, 0, 30, 30);
				boton5.setVisible(true);
				boton5.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String player = "X";
						if(turno) {
							turno = false;
							boton5.setIcon(new ImageIcon(x));
							boton5.setText("X");
						}
						else {
							turno = true;
							boton5.setIcon(new ImageIcon(o));
							boton5.setText("O");
						}
						boton5.setEnabled(false);
						revisar();

					}
				});
				fondo.add(boton5);
				boton6 = new JButton();
				boton6.setBounds(0, 0, 30, 30);
				boton6.setVisible(true);
				boton6.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String player = "X";
						if(turno) {
							turno = false;
							boton6.setIcon(new ImageIcon(x));
							boton6.setText("X");
						}
						else {
							turno = true;
							boton6.setIcon(new ImageIcon(o));
							boton6.setText("O");
						}
						boton6.setEnabled(false);
						revisar();

					}
				});
				fondo.add(boton6);
				
				boton7 = new JButton();
				boton7.setBounds(0, 0, 30, 30);
				boton7.setVisible(true);
				boton7.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String player = "X";
						if(turno) {
							turno = false;
							boton7.setIcon(new ImageIcon(x));
							boton7.setText("X");
						}
						else {
							turno = true;
							boton7.setIcon(new ImageIcon(o));
							boton7.setText("O");
						}
						boton7.setEnabled(false);
						revisar();

					}
				});
				fondo.add(boton7);
				
				boton8 = new JButton();
				boton8.setBounds(0, 0, 30, 30);
				boton8.setVisible(true);
				boton8.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String player = "X";
						if(turno) {
							turno = false;
							boton8.setIcon(new ImageIcon(x));
							boton8.setText("X");
						}
						else {
							turno = true;
							boton8.setIcon(new ImageIcon(o));
							boton8.setText("O");
						}
						boton8.setEnabled(false);
						revisar();

					}
				});
				fondo.add(boton8);
				
				boton9 = new JButton();
				boton9.setBounds(0, 0, 30, 30);
				boton9.setVisible(true);
				boton9.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String player = "X";
						if(turno) {
							turno = false;
							boton9.setIcon(new ImageIcon(x));
							boton9.setText("X");
						}
						else {
							turno = true;
							boton9.setIcon(new ImageIcon(o));
							boton9.setText("O");
						}
						boton9.setEnabled(false);
						revisar();
					}
				});
				fondo.add(boton9);
				
				reiniciar = new JButton("Reiniciar");
				reiniciar.setFont(contadores_letra);
				reiniciar.setBounds(525, 20, 100, 30);
				reiniciar.setVisible(true);
				reiniciar.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
				        boton1.setText("");
				        boton1.setIcon(null);
				        boton1.setEnabled(true);
				        
				        boton2.setText("");
				        boton2.setIcon(null);
				        boton2.setEnabled(true);
				        
				        boton3.setText("");
				        boton3.setIcon(null);
				        boton3.setEnabled(true);
				        
				        boton4.setText("");
				        boton4.setIcon(null);
				        boton4.setEnabled(true);
				        
				        boton5.setText("");
				        boton5.setIcon(null);
				        boton5.setEnabled(true);
				        
				        boton6.setText("");
				        boton6.setIcon(null);
				        boton6.setEnabled(true);
				        
				        boton7.setText("");
				        boton7.setIcon(null);
				        boton7.setEnabled(true);
				        
				        boton8.setText("");
				        boton8.setIcon(null);
				        boton8.setEnabled(true);
				        
				        boton9.setText("");
				        boton9.setIcon(null);
				        boton9.setEnabled(true);
					    turno = true;
					    gano = false;
					}
				});
				contadores_espacio.add(reiniciar);
				this.repaint();
				
				
			}
			
			public void restart() {
				boton1.setText("");
		        boton1.setIcon(null);
		        boton1.setEnabled(true);
		        
		        boton2.setText("");
		        boton2.setIcon(null);
		        boton2.setEnabled(true);
		        
		        boton3.setText("");
		        boton3.setIcon(null);
		        boton3.setEnabled(true);
		        
		        boton4.setText("");
		        boton4.setIcon(null);
		        boton4.setEnabled(true);
		        
		        boton5.setText("");
		        boton5.setIcon(null);
		        boton5.setEnabled(true);
		        
		        boton6.setText("");
		        boton6.setIcon(null);
		        boton6.setEnabled(true);
		        
		        boton7.setText("");
		        boton7.setIcon(null);
		        boton7.setEnabled(true);
		        
		        boton8.setText("");
		        boton8.setIcon(null);
		        boton8.setEnabled(true);
		        
		        boton9.setText("");
		        boton9.setIcon(null);
		        boton9.setEnabled(true);
			    turno = true;
			    gano = false;
			}
			

			public void revisar() {
				if(boton1.getText().equals(boton2.getText()) && 
						boton2.getText().equals(boton3.getText()) && 
						!boton1.getText().equals("") && gano == false ) {
					if(boton1.getText() == "X" || boton1.getIcon() == x) {
						cX++;
						restart();
					}
					else if (boton1.getText() == "O" || boton1.getIcon() == o){
						cO++;
						restart();
					}
					JOptionPane.showMessageDialog(null, "Ganaste " + boton1.getText());
					
					gano = true;
				}
				if(boton4.getText().equals(boton5.getText()) && 
						boton5.getText().equals(boton6.getText()) && 
						!boton4.getText().equals("") && gano == false) {
					JOptionPane.showMessageDialog(null, "Ganaste " + boton4.getText());
					gano = true;

				}
				if(boton7.getText().equals(boton8.getText()) && 
						boton8.getText().equals(boton9.getText()) && 
						!boton7.getText().equals("") && gano == false) {
					JOptionPane.showMessageDialog(null, "Ganaste " + boton7.getText());
					gano = true;
				}
				if(boton1.getText().equals(boton4.getText()) && 
						boton4.getText().equals(boton7.getText()) && 
						!boton1.getText().equals("") && gano == false) {

					JOptionPane.showMessageDialog(null, "Ganaste " + boton1.getText());
					gano = true;
				}
				if(boton2.getText().equals(boton5.getText()) && 
						boton5.getText().equals(boton8.getText()) && 
						!boton2.getText().equals("") && gano == false) {
					JOptionPane.showMessageDialog(null, "Ganaste " + boton2.getText());
					gano = true;
				}
				if(boton3.getText().equals(boton6.getText()) && 
						boton6.getText().equals(boton9.getText()) && 
						!boton3.getText().equals("") && gano == false) {
					JOptionPane.showMessageDialog(null, "Ganaste " + boton3.getText());
					gano = true;
				}
				if(boton1.getText().equals(boton5.getText()) && 
						boton5.getText().equals(boton9.getText()) && 
						!boton1.getText().equals("") && gano == false) {

					JOptionPane.showMessageDialog(null, "Ganaste " + boton1.getText());
					gano = true;
				}
				if(boton3.getText().equals(boton5.getText()) && 
						boton5.getText().equals(boton7.getText()) && 
						!boton3.getText().equals("") && gano == false) {
					JOptionPane.showMessageDialog(null, "Ganaste " + boton3.getText());
					gano = true;
					
				}
				this.repaint();
			}
			
			public static void main(String[] args) {
				JuegoGato_Window prueba = new JuegoGato_Window();
			}
}


