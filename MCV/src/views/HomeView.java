package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import models.HomeModel;

public class HomeView{
	JFrame frame;
	HomeModel datos;
	
	public HomeView() {
		frame  = new JFrame("HOME");
		frame.setLayout(null);
		frame.setBounds(400,100, 500, 400);
		frame.setVisible(true);
		
		JPanel widget_1 = new JPanel();
		widget_1.setBounds(30, 100, 200, 100);
		widget_1.setBackground(new Color(234, 210, 255));
		widget_1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		widget_1.setLayout(null);
		
		JLabel titulo_widget1 = new JLabel("Usuarios registrados");
		titulo_widget1.setBounds(10, 10, 180, 40);
		titulo_widget1.setForeground(new Color(225, 200, 254));
		titulo_widget1.setBackground(new Color(189, 134, 255));
		titulo_widget1.setOpaque(true); 
		titulo_widget1.setHorizontalAlignment(SwingConstants.CENTER);

		widget_1.add(titulo_widget1);
		
		frame.add(widget_1);
		
		JPanel widget_2 = new JPanel();
		widget_2.setBounds(30, 230, 200, 100);
		widget_2.setBackground(new Color(255, 222, 210));
		widget_2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		widget_2.setLayout(null);
		
		JLabel titulo_widget2 = new JLabel("Mensajes o notificaciones");
		titulo_widget2.setBounds(10, 10, 180, 40);
		titulo_widget2.setForeground(new Color(255, 227, 194));
		titulo_widget2.setBackground(new Color(255, 182, 94));
		titulo_widget2.setOpaque(true);
		titulo_widget2.setHorizontalAlignment(SwingConstants.CENTER);
		widget_2.add(titulo_widget2);
		
		frame.add(widget_2);
		
		JPanel widget_3 = new JPanel();
		widget_3.setBounds(250, 100, 200, 100);
		widget_3.setBackground(new Color(195, 200, 254));
		widget_3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		widget_3.setLayout(null);
		
		JLabel titulo_widget3 = new JLabel("Hora Actual");
		titulo_widget3.setBounds(10, 10, 180, 40);
		titulo_widget3.setForeground(new Color(221, 224, 255));
		titulo_widget3.setBackground(new Color(140, 151, 255));
		titulo_widget3.setOpaque(true);
		titulo_widget3.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel contador_widget3 = new JLabel("");
		contador_widget3.setBounds(10, 10, 180, 40);
		
		widget_3.add(titulo_widget3);
		
		frame.add(widget_3);
		
		JPanel widget_4 = new JPanel();
		widget_4.setBounds(250, 230, 200, 100);
		widget_4.setBackground(new Color(255, 210, 231));
		widget_4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		widget_4.setLayout(null);
		
		JLabel titulo_widget4 = new JLabel("Estadísticas");
		titulo_widget4.setBounds(10, 10, 180, 40);
		titulo_widget4.setForeground(new Color(255, 196, 208));
		titulo_widget4.setBackground(new Color(255, 107, 139));
		titulo_widget4.setOpaque(true);
		titulo_widget4.setHorizontalAlignment(SwingConstants.CENTER);
		widget_4.add(titulo_widget4);
		
		frame.add(widget_4);
		
		
		JButton boton1 = new JButton("USUARIOS");
		boton1.setBounds(20,0,130,50);
		boton1.setVisible(true);
		boton1.setOpaque(true);
		boton1.setLayout(null);
		boton1.setBackground(null);
		
		ImageIcon imagenIcono1 = new ImageIcon(AuthView.class.getResource("/images/usuario.png"));
		JLabel etiquetaIcono1 = new JLabel(imagenIcono1);
		etiquetaIcono1.setBounds(0, 15, 20, 20);
		etiquetaIcono1.setIcon(new ImageIcon(imagenIcono1.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
		boton1.add(etiquetaIcono1);
		
		boton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				usuarios();
			}
		});
		frame.add(boton1);
		
		JButton boton2 = new JButton("REGISTRO");
		boton2.setBounds(150,0,140,50);
		boton2.setOpaque(true);
		
		ImageIcon imagenIcono3 = new ImageIcon(AuthView.class.getResource("/images/registro.png"));
		JLabel etiquetaIcono3 = new JLabel(imagenIcono3);
		etiquetaIcono3.setBounds(0, 15, 20, 20);
		etiquetaIcono3.setIcon(new ImageIcon(imagenIcono3.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
		boton2.add(etiquetaIcono3);
		
		boton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				registro();
			}
		});
		frame.add(boton2);
		
		JButton boton3 = new JButton("CONFIGURACION");
		boton3.setBounds(290,0,178,50);
		boton3.setOpaque(true);
		
		ImageIcon imagenIcono2 = new ImageIcon(AuthView.class.getResource("/images/configuracion.png"));
		JLabel etiquetaIcono2 = new JLabel(imagenIcono2);
		etiquetaIcono2.setBounds(0, 15, 20, 20);
		etiquetaIcono2.setIcon(new ImageIcon(imagenIcono2.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
		boton3.add(etiquetaIcono2);
		
		boton3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				configuracion();
			}
		});
		frame.add(boton3);
		frame.repaint();
		frame.revalidate();
	}
	
	public void registro() {
		frame = new JFrame("REGISTRO");
		frame.setLayout(null);
		frame.setBounds(100, 100, 700, 700);
		frame.setVisible(true);
		frame.revalidate();
		
		JLabel titulo = new JLabel("REGISTRO");
		titulo.setBounds(350, 0, 150, 20);
		titulo.setOpaque(true);
		frame.add(titulo);
		
		JButton regresar = new JButton("REGRESAR");
		regresar.setBounds(0, 0, 100, 100);
		regresar.setOpaque(true);
		regresar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();			
			}
		});
		frame.add(regresar);
	}
	
	public void configuracion() {
		frame = new JFrame("CONFIGURACION");
		frame.setBounds(100, 100, 700, 700);
		frame.setLayout(null);
		frame.setVisible(true);
		
		JLabel titulo = new JLabel("CONFIGURACION");
		titulo.setBounds(350, 0, 150, 20);
		titulo.setOpaque(true);
		frame.add(titulo);
		
		JButton regresar = new JButton("REGRESAR");
		regresar.setBounds(0, 0, 100, 100);
		regresar.setOpaque(true);
		regresar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();			
			}
		});
		frame.add(regresar);
	}
	
	public void usuarios() {
		frame = new JFrame("USUARIOS");
		frame.setBounds(100, 100, 700, 700);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		JLabel titulo = new JLabel("USUARIOS");
		titulo.setBounds(350, 0, 150, 20);
		titulo.setOpaque(true);
		frame.add(titulo);

		
		
		JButton regresar = new JButton("REGRESAR");
		regresar.setBounds(0, 0, 100, 100);
		regresar.setOpaque(true);
		regresar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();			
			}
		});
		frame.add(regresar);
	}
	
	
}
