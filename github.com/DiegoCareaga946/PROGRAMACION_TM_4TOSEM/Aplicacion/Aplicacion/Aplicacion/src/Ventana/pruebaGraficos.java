package Ventana;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

public class pruebaGraficos extends JFrame {

    public pruebaGraficos() {
        this.setTitle("Acceso");
        this.setSize(1400, 700);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(400, 400));
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        
        g2.setColor(Color.red);
        g2.drawRect(100, 100, 100, 100);
        g2.fillRect(200, 200, 200, 200);
        
        g2.setColor(Color.gray);
        g2.fillRoundRect(400, 80, 80, 80, 20, 20);
        
        g2.setStroke(new BasicStroke(5));
        g2.drawLine(100, 100, 900, 500);
        
        g2.setColor(Color.black);
        g2.drawOval(10, 20, 90, 90);
        g2.fillOval(10, 20, 95, 95);
        
        g2.drawArc(160, 300, 190, 190, 0, -180);
        g2.fillArc(160, 300, 190, 190, 0, 180);
        
        g2.setFont(new Font("Andale Mono", Font.BOLD, 22));
        g2.drawString("WAWAWAWAWA", 15, 250);
        
        int[] xs = {100, 100, 400};
        int[] ys = {100, 100, 400};
        g2.drawPolygon(xs, ys, 3);
        
        int[] xs2 = {650, 200, 400};
        int[] ys2 = {650, 200, 400};
        g2.drawPolygon(xs2, ys2, 3);
    }

    public static void main(String[] args) {
        new pruebaGraficos();
    }
}