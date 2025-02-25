package Ventana;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JPanel;

public class PanelRound extends JPanel {
	
	public int getRoundTopLeft() {
		return roundTopLeft;
	}

	public void setRoundTopLeft(int roundTopLeft) {
		this.roundTopLeft = roundTopLeft;
		repaint();
	}

	public int getRoundTopRight() {
		return roundTopRight;
	}

	public void setRoundTopRight(int roundTopRight) {
		this.roundTopRight = roundTopRight;
		repaint();
	}

	public int getRoundBottomLeft() {
		return roundBottomLeft;
	}

	public void setRoundBottomLeft(int roundBottomLeft) {
		this.roundBottomLeft = roundBottomLeft;
		repaint();
	}

	public int getRoundBottomRight() {
		return roundBottomRight;
	}

	public void setRoundBottomRight(int roundBottomRight) {
		this.roundBottomRight = roundBottomRight;
	}
	
	private int roundTopLeft = 0;
	private int roundTopRight = 0;
	private int roundBottomLeft = 0;
	private int roundBottomRight = 0;
	
	public PanelRound() {
		setOpaque(false);
	}
	
	protected void paintComponent(Graphics grphcs) {
		Graphics2D g2 = (Graphics2D) grphcs.create();
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setColor(getBackground());
		Area area= new Area(createRoundTopLeft());
		if(roundTopRight>0) {
			area.intersect(new Area(createRoundTopRight()));
		}
		if(roundBottomLeft>0) {
			area.intersect(new Area(createRoundBottomLeft()));
		}
		if(roundBottomRight>0) {
			area.intersect(new Area(createRoundBottomRight()));
		}
		g2.fill(area);
		g2.dispose();
		super.paintComponent(grphcs);
	}
	
	private Shape createRoundTopLeft() {
		int widht = getWidth();
		int height = getHeight();
		int roundX = Math.min(widht, roundTopLeft);
		int roundY = Math.min(height, roundTopLeft);
		Area area = new Area (new RoundRectangle2D.Double(0, 0, widht, height, roundX, roundY));
		area.add(new Area(new Rectangle2D.Double(roundX/2, 0, widht-roundX/2, height)));
		area.add(new Area(new Rectangle2D.Double(0, roundY/2, widht, height-roundY / 2)));
		return area;
	}
	
	private Shape createRoundTopRight() {
		int widht = getWidth();
		int height = getHeight();
		int roundX = Math.min(widht, roundTopRight);
		int roundY = Math.min(height, roundTopRight);
		Area area = new Area (new RoundRectangle2D.Double(0, 0, widht, height, roundX, roundY));
		area.add(new Area(new Rectangle2D.Double(0, 0, widht-roundX/2, height)));
		area.add(new Area(new Rectangle2D.Double(0, roundY/2, widht, height-roundY / 2)));
		return area;
	}
		
	private Shape createRoundBottomLeft() {
		int widht = getWidth();
		int height = getHeight();
		int roundX = Math.min(widht, roundBottomLeft);
		int roundY = Math.min(height, roundBottomLeft);
		Area area = new Area (new RoundRectangle2D.Double(0, 0, widht, height, roundX, roundY));
		area.add(new Area(new Rectangle2D.Double(roundX/2, 0, widht-roundX/2, height)));
		area.add(new Area(new Rectangle2D.Double(0, 0, widht, height-roundY / 2)));
		return area;
	}
	
	private Shape createRoundBottomRight() {
		int widht = getWidth();
		int height = getHeight();
		int roundX = Math.min(widht, roundBottomRight);
		int roundY = Math.min(height, roundBottomRight);
		Area area = new Area (new RoundRectangle2D.Double(0, 0, widht, height, roundX, roundY));
		area.add(new Area(new Rectangle2D.Double(0, 0, widht-roundX/2, height)));
		area.add(new Area(new Rectangle2D.Double(0, 0, widht, height-roundY / 2)));
		return area;
	}
	
}
