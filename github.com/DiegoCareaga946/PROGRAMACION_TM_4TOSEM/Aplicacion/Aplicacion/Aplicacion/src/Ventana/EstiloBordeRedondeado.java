package Ventana;

import java.awt.*;
import java.awt.event.MouseAdapter;

import javax.swing.*;
import javax.swing.border.*;
 
public class EstiloBordeRedondeado implements Border
{
	protected int m_w = 6;
	protected int m_h = 6;
	protected Color m_topColor = Color.black;
	protected Color m_bottomColor = Color.black;
	protected boolean roundc = false; // Do we want rounded corners on the border?


	public EstiloBordeRedondeado(boolean round_corners)
	{
	                roundc = round_corners;
	}
		public Insets getBorderInsets(Component c)
		{
		return new Insets(m_h, m_w, m_h, m_w);
		}
		public boolean isBorderOpaque()
		{
		return true;
		}
		public void paintBorder(Component c, Graphics g, int x, int y, int w, int h)
		{
			w = w - 3;
			h = h - 3;
			x ++;
			y ++;
			// Rounded corners
		if(roundc)
		{
		g.setColor(m_topColor);
			g.drawLine(x, y + 6, x, y + h - 6);
			g.drawLine(x + 6, y, x + w - 6, y);
			g.drawLine(x, y + 6, x + 6, y); // Top left diagonal
			g.drawLine(x, y + h - 6, x + 6, y + h); // Bottom left diagonal
			g.setColor(m_bottomColor);
			g.drawLine(x + w, y + 6, x + w, y + h - 6);
			g.drawLine(x + 6, y + h, x + w -6, y + h);
			g.drawLine(x + w - 6, y, x + w, y + 6); // Top right diagonal
			g.drawLine(x + w, y + h - 6, x + w -6, y + h); // Bottom right diagonal
		}
		
		// Square corners
		else
		{
			g.setColor(m_topColor);
			g.drawLine(x, y, x, y + h);
			g.drawLine(x, y, x + w, y);
			g.setColor(m_bottomColor);
			g.drawLine(x + w, y, x + w, y + h);
			g.drawLine(x, y + h, x + w, y + h);
		}
	}
}
