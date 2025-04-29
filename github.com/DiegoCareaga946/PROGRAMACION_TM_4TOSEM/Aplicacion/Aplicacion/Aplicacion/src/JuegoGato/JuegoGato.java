package JuegoGato;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JuegoGato extends JFrame {
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

	public JuegoGato () {
		Font contadores_letra= new Font("Dialog", Font.BOLD, 14);
		
		JFrame juego = new JFrame();
		this.setSize(700,700);
		this.setVisible(true);
		this.setLayout(null);
		
		JPanel contadores_espacio = new JPanel();
		contadores_espacio.setSize(100,40);
		contadores_espacio.setVisible(true);
		this.add(contadores_espacio);
		
		JLabel contadorX = new JLabel("Contador X: ");
		contadorX.setBounds(10, 0, 100, 30);
		contadorX.setFont(contadores_letra);
		contadores_espacio.add(contadorX);
		
		GridLayout medidas = new GridLayout(3,3);
		BorderLayout ventana = new BorderLayout();
		JPanel fondo = new JPanel();
		fondo.setBounds(0, 0, 700, 700);
		fondo.setLayout(medidas);
		fondo.setVisible(true);
		fondo.setOpaque(true);
		
		this.add(fondo);
		this.add(contadores_espacio);
		
		this.setLayout(new BorderLayout());
		this.repaint();
		this.revalidate();
		
		boton1 = new JButton();
		boton1.setBounds(0, 0, 30, 30);
		boton1.setVisible(true);
		boton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String player = "X";
				if(turno) {
					turno = false;
					boton1.setText("X");
				}
				else {
					turno = true;
					boton1.setText("O");
				}
				boton1.setEnabled(false);
				boton1.revalidate();
				System.out.println(boton1.getText());
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
					boton2.setText("X");
				}
				else {
					turno = true;
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
					boton3.setText("X");
				}
				else {
					turno = true;
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
					boton4.setText("X");
				}
				else {
					turno = true;
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
					boton5.setText("X");
				}
				else {
					turno = true;
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
					boton6.setText("X");
				}
				else {
					turno = true;
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
					boton7.setText("X");
				}
				else {
					turno = true;
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
					boton8.setText("X");
				}
				else {
					turno = true;
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
					boton9.setText("X");
				}
				else {
					turno = true;
					boton9.setText("O");
				}
				boton9.setEnabled(false);
				revisar();
			}
		});
		fondo.add(boton9);
		
		
	}
	boolean gano = false;
	int contadorX = 0;
	int contadorO = 0;

	public void revisar() {
		if(boton1.getText().equals(boton2.getText()) && 
				boton2.getText().equals(boton3.getText()) && 
				!boton1.getText().equals("") && gano == false ) {
			if(boton1.getText() == "X") {
				contadorX++;
			}
			else {
				contadorO++;
			}
			JOptionPane.showMessageDialog(null, "Ganaste " + boton1.getText()+contadorO);
			
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
	}
	
	public static void main(String[] args) {
		JuegoGato prueba = new JuegoGato();
	}

}
