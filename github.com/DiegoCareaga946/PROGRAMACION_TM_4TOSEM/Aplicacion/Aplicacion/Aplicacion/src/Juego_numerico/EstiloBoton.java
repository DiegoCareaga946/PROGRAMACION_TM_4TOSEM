package Juego_numerico;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;

public class EstiloBoton extends JButton{
	
	private boolean over;
	private Color color;
	private Color colorOver;
	private Color colorClick;
	private Color borderColor;
	private int radius = 0;

	public boolean isOver() {
		return over;
	}
	public void setOver(boolean over) {
		this.over = over;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
		setBackground(color);
	}
	public Color getColorOver() {
		return colorOver;
	}
	public void setColorOver(Color colorOver) {
		this.colorOver = colorOver;
	}
	public Color getColorClick() {
		return colorClick;
	}
	public void setColorClick(Color colorClick) {
		this.colorClick = colorClick;
	}
	public Color getBorderColor() {
		return borderColor;
	}
	public void setBorderColor(Color borderColor) {
		this.borderColor = borderColor;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	Font textoBoton = new Font("Arial", Font.CENTER_BASELINE, 20);
	public EstiloBoton(String string) {
		setText(string);
		setFont(textoBoton);
		// Init Color
		setContentAreaFilled(false);
		setBorderPainted(false);
		colorOver = new Color (243, 114, 152);
		colorClick = new Color(160, 28, 67 );
		borderColor = new Color(205, 67, 108 );
		//add event mouse
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent me){
				setBackground(colorOver);
				over = true;
			}
			@Override
			public void mouseExited(MouseEvent e) {
				setBackground(color);
				over = false;
			}
			@Override
			public void mousePressed(MouseEvent e) {
				setBackground(colorClick);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if(over) {
					setBackground(colorOver);
				}
				else {
					setBackground(color);
				}
			}
		});	
	}
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		// Paint Border
		g2.setColor(borderColor);
		g2.fillRoundRect(0, 0, getWidth(), getHeight(), 50, 50);
		g2.setColor(getBackground());
		g2.fillRoundRect(2, 2, getWidth()-4, getHeight()-4, 50, 50);
		super.paintComponent(g);
	}
}
