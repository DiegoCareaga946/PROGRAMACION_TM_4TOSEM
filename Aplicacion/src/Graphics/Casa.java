package Graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

public class Casa extends JFrame {

    public Casa() {
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
       
        g2.setColor(new Color(255, 217, 236)); //Color Fondo (oscuro)      
        g2.fillOval(-400, -400, 2500, 2500);
        
        g2.setColor(new Color(255, 201, 228)); //Color Fondo (Medio)    
        g2.fillOval(-80, -80, 2500, 2500);
        
        g2.setColor(new Color(255, 163, 209)); //Color Fondo (claro)  
        g2.fillOval(200, 100, 1700, 1700);
        
        g2.setColor(new Color(171, 145, 84)); // Tronco
        int[] xs_3 = {625, 630, 400, 430, 420, 365};
        int[] ys_3 = {570, 390, 200, 190, 150, 140};
        g2.fillPolygon(xs_3, ys_3, 6);
        
        g2.setColor(new Color(168, 225, 101)); // Hojas Arbol
        g2.fillOval(300, 200, 200, 200);
        g2.fillOval(300, 100, 300, 150);
        g2.fillOval(200, 10, 300, 250);
        
        g2.setColor(new Color(160, 219, 121)); // Hojas Arbol (sombra)
        g2.fillOval(300, 205, 180, 180);
        g2.fillOval(300, 105, 280, 130);
        g2.fillOval(200, 15, 260, 230);
        
        g2.setColor(new Color(50, 119, 15)); // color verde piso (marco)
        g2.fillArc(0, 190, 3000, 2000, 0, 180);

        g2.setColor(new Color(157, 229, 120)); // color verde piso
        g2.fillArc(-100, 200, 3000, 2500, 0, 180);        
        
        g2.setColor(new Color(129, 204, 70)); // cupula (sombra)
        g2.fillOval(610, 300, 900, 400);

        g2.setColor(new Color(237, 228, 150)); // color amarillo
        g2.fillArc(600, 100, 700, 700, 20, 180);
                
        g2.setColor(new Color(225, 180, 37)); //delineado de cupula
        g2.drawArc(600, 100, 700, 700, 20, 180);
        g2.drawArc(599, 99, 700, 700, 20, 180);
        g2.drawArc(598, 98, 700, 700, 20, 180);
        g2.drawArc(597, 97, 700, 700, 20, 180);

        g2.setColor(new Color(161, 74, 8)); //puerta
        g2.fillArc(650, 342, 100, 400, 5, 180);
        
        g2.setColor(new Color(117, 66, 27)); // cupula
        g2.fillArc(670, 349, 80, 380, 5, 179);
        
        int[] xs = {780, 790, 980, 1000}; // cupula (ventana)
        int[] ys = {430, 360, 300, 350};
        g2.fillPolygon(xs, ys, 4);
        
        g2.setColor(new Color(71, 35, 8)); //cupula (ventana interior)
        int[] xs_7 = {853, 843, 980,1000};
        int[] ys_7 = {400, 350, 305, 350};
        g2.fillPolygon(xs_7, ys_7, 4);
        
        g2.setColor(new Color(245, 237, 182)); // cupula (ventana marco)
        int[] xs_4 = {780, 800, 996, 1000};
        int[] ys_4 = {430, 400, 340, 350};
        g2.fillPolygon(xs_4, ys_4, 4);
        
        int[] xs_5 = {780, 790, 800, 810}; // cupula (ventana profundidad)
        int[] ys_5 = {430, 360, 400, 405};
        g2.fillPolygon(xs_5, ys_5, 4);
      
        g2.setColor(new Color(202, 205, 198)); //Camino
        int[] xs_6 = {310, 400, 500, 600, 900, 1300};
        int[] ys_6 = {710, 515, 450, 700, 1000, 2200};
        g2.fillPolygon(xs_6, ys_6, 6);
        
        /*
        g2.setColor(new Color(233, 108, 108)); // color rojo claro
        g2.fillRect(700, 100, 400, 350);
        g2.setColor(new Color(195, 44, 26)); //color rojo oscuro
        int[] xs = {1100, 1200, 1200, 1100};
        int[] ys = {102, 100, 350, 446};
        g2.fillPolygon(xs, ys, 4);
        
        g2.setColor(new Color(247, 49, 127)); //color rojo oscuro
        int[] xs_1 = {1100, 740, 1110, 700};
        int[] ys_1 = {100, -100, -100, 100};
        g2.fillPolygon(xs_1, ys_1, 4);
        
        g2.setColor(new Color(213, 30, 102)); //color rojo oscuro
        int[] xs_2 = {1100, 700, 800, 1200};
        int[] ys_2 = {102, -102, -102, 102};
        g2.fillPolygon(xs_2, ys_2, 4);
         */
        
    }

    public static void main(String[] args) {
        new Casa();
    }

}
