package Graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

public class mario3Fondo extends JFrame{

	public mario3Fondo() {
	        this.setTitle("Acceso");
	        this.setSize(1155, 700);
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
	        
	        //Fondo
	        g2.setColor(new Color(178, 238, 254));
	        g2.fillRoundRect(0, 0, 1400, 900, 10, 10);

	        //Cuadro azul
	        
	        g2.setColor(new Color(0, 0, 0)); //Sombra azul
	        g2.fillRoundRect(535, 330, 200, 350, 10, 10);
	        
	        g2.setColor(new Color(40, 141, 217)); // parte derecha azul
	        g2.fillRoundRect(500, 300, 200, 350, 10, 10);
	        
	        g2.setColor(new Color(131, 192, 255)); // parte frontal azul
	        g2.fillRoundRect(500, 300, 190, 350, 10, 10);
	        
	        g2.setColor(new Color(51, 131, 201)); //Parte baja azul
	        g2.fillRoundRect(500, 612, 200, 8, 10, 10);
	        
	        g2.setColor(new Color(0, 0, 0)); //Barra arriba
	        g2.fillRoundRect(505, 298, 190, 5, 10, 10);
	        
	        g2.setColor(new Color(0, 0, 0));
	        g2.fillRoundRect(505, 297, 7, 9, 10, 10);
	        
	        g2.setColor(new Color(0, 0, 0));
	        g2.fillRoundRect(693, 299, 10, 8, 10, 10);
	        
	        g2.setColor(new Color(0, 0, 0)); //Barra arriba
	        g2.fillRoundRect(500, 298, 7, 140, 10, 10);
	        
	        g2.setColor(new Color(0, 0, 0)); //Barra arriba
	        g2.fillRoundRect(700, 302, 5, 135, 10, 10);
	        
	        
	        //Botones caja azul
	        g2.setColor(new Color(187, 201, 217));
	        g2.fillOval(670, 310, 20, 20);
	        g2.fillOval(670, 590, 20, 20);
	        g2.fillOval(510, 307, 20, 20);
	        
	        //Cuadro Verde
	        

	        g2.setColor(new Color(40, 141, 217)); // parte derecha azul
	        g2.fillRoundRect(1020, 470, 200, 150, 10, 10);
	        
	        g2.setColor(new Color(81, 217, 107)); // parte frontal azul
	        g2.fillRoundRect(1020, 420, 290, 200, 10, 10);
	        
	        g2.setColor(new Color(38, 125, 47)); //Parte baja azul
	        g2.fillRoundRect(1020, 615, 200, 8, 10, 10);
	        
	        g2.setColor(new Color(0, 0, 0)); //Barra arriba
	        g2.fillRoundRect(1025, 418, 190, 5, 10, 10);
	        
	        g2.setColor(new Color(0, 0, 0)); //Barra arriba
	        g2.fillRoundRect(1020, 420, 6, 200, 10, 10);
	        

	      //Tornillos Verdes
	        g2.setColor(new Color(187, 201, 217));
	        g2.fillOval(1035, 430, 20, 20);
	        g2.fillOval(1035, 590, 20, 20);
	        
	        g2.setColor(new Color(0, 0, 0));
	        g2.fillRect(1050, 432, 6, 15);
	        g2.fillRect(1047, 443, 3, 7);
	        g2.fillRect(1047, 443, 8, 4);
	        g2.fillRect(1038, 447, 13, 3);
	        g2.fillRect(1035, 443, 5, 4);
	        g2.fillRect(1033, 443, 5, 5);
	        g2.fillRect(1033, 434, 3, 10);
	        g2.fillRect(1033, 429, 5, 6);
	        g2.fillRect(1037, 429, 13, 3);    
	        
	        g2.setColor(new Color(0, 0, 0));
	        g2.fillRect(1050, 592, 6, 15);
	        g2.fillRect(1047, 603, 3, 7);
	        g2.fillRect(1047, 603, 8, 4);
	        g2.fillRect(1038, 607, 13, 3);
	        g2.fillRect(1035, 603, 5, 4);
	        g2.fillRect(1033, 603, 5, 5);
	        g2.fillRect(1033, 594, 3, 10);
	        g2.fillRect(1033, 589, 5, 6);
	        g2.fillRect(1037, 589, 13, 3);   
	        
	        //Interior tornillos verdes
	        g2.fillRect(1040, 440, 3, 3);
	        g2.fillRect(1043, 435, 5, 5);
	        
	        g2.fillRect(1040, 600, 3, 3);
	        g2.fillRect(1043, 595, 5, 5);
	        
	        //Borde tornillos rosa arriba derecha
	        g2.setColor(new Color(0, 0, 0));
	        g2.fillRect(686, 311, 6, 15);
	        g2.fillRect(683, 322, 3, 7);
	        g2.fillRect(683, 322, 8, 4);
	        g2.fillRect(675, 326, 13, 3);
	        g2.fillRect(672, 322, 5, 4);
	        g2.fillRect(670, 322, 5, 5);
	        g2.fillRect(670, 313, 3, 10);
	        g2.fillRect(670, 308, 5, 6);
	        g2.fillRect(674, 308, 13, 3);       
	        
	      //Borde tornillos rosa arriba izquierda
	        g2.setColor(new Color(0, 0, 0));
	        g2.fillRect(526, 311, 6, 15);
	        g2.fillRect(523, 322, 3, 7);
	        g2.fillRect(523, 322, 8, 4);
	        g2.fillRect(515, 326, 13, 3);
	        g2.fillRect(512, 322, 5, 4);
	        g2.fillRect(510, 322, 5, 5);
	        g2.fillRect(510, 313, 3, 10);
	        g2.fillRect(510, 308, 5, 6);
	        g2.fillRect(514, 308, 13, 3);
	        
	      //Borde tornillos rosa arriba derecha
	        g2.setColor(new Color(0, 0, 0));
	        g2.fillRect(686, 591, 6, 15);
	        g2.fillRect(683, 602, 3, 7);
	        g2.fillRect(683, 602, 8, 4);
	        g2.fillRect(675, 606, 13, 3);
	        g2.fillRect(672, 602, 5, 4);
	        g2.fillRect(670, 602, 5, 5);
	        g2.fillRect(670, 593, 3, 10);
	        g2.fillRect(670, 588, 5, 6);
	        g2.fillRect(674, 588, 13, 3);
	        
	        g2.fillRect(677, 320, 3, 3);
	        g2.fillRect(680, 315, 5, 5);
	        
	        g2.fillRect(677, 590, 3, 3);
	        g2.fillRect(680, 585, 5, 5);
	        
	        g2.fillRect(517, 320, 3, 3);
	        g2.fillRect(520, 315, 5, 5);
	        
	        //Cuadro rosa
	        
	        g2.setColor(new Color(255, 151, 102));
	        g2.fillRoundRect(150, 620, 1400, 400, 10, 10);
	        
	        g2.setColor(new Color(24, 143, 223));
	        g2.fillRoundRect(900, 620, 1400, 30, 10, 10);
	        
	        g2.setColor(new Color(0, 0, 0)); // Sombra rosa
	        g2.fillRoundRect(535, 453, 50, 190, 10, 10);       

	        g2.setColor(new Color(255, 201, 189));
	        g2.fillRoundRect(150, 620, 1400, 30, 10, 10);
	        	      
	        g2.setColor(new Color(50, 42, 29));
	        g2.fillRoundRect(150, 620, 1400, 6, 5, 5);

	        g2.setColor(new Color(95, 40, 24));
	        g2.fillRoundRect(150, 647, 1400, 6, 5, 5);
	        	        
	        g2.setColor(new Color(243, 149, 104));
	        g2.fillRoundRect(350, 420, 200, 200, 30, 30);
	        
	        g2.setColor(new Color(255, 195, 184)); 
	        g2.fillRoundRect(350, 420, 193, 196, 30, 30);
	        	            
	        g2.setColor(new Color(230, 159, 129));
	        g2.fillRoundRect(350, 610, 193, 10, 15, 15);
	        	        
	        g2.setColor(new Color(0, 0, 0)); // barra izquierda
	        g2.fillRoundRect(350, 428, 5, 190, 10, 10);
	        
	        g2.setColor(new Color(0, 0, 0)); //Barra arriba
	        g2.fillRoundRect(353, 420, 196, 7, 10, 10);
	        
	        g2.setColor(new Color(0, 0, 0));
	        g2.fillRoundRect(543, 424, 8, 10, 10, 10);
	        
	        g2.setColor(new Color(0, 0, 0));
	        g2.fillRoundRect(353, 422, 8, 10, 10, 10);
	        
	        g2.setColor(new Color(0, 0, 0));
	        g2.fillRoundRect(541, 612, 10, 9, 10, 10);
	        
	        g2.setColor(new Color(0, 0, 0));
	        g2.fillRoundRect(353, 612, 10, 9, 10, 10);
	        
	        g2.setColor(new Color(0, 0, 0)); // barra derecha
	        g2.fillRoundRect(548, 425, 5, 190, 10, 10);
	        
	        //Tornillos rosa
	        g2.setColor(new Color(187, 201, 217));
	        g2.fillOval(520, 430, 20, 20);
	        g2.fillOval(520, 590, 20, 20);
	        g2.fillOval(360, 590, 20, 20);
	        g2.fillOval(360, 430, 20, 20);
	        
	        //Borde tornillos rosa arriba derecha
	        g2.setColor(new Color(0, 0, 0));
	        g2.fillRect(536, 433, 6, 15);
	        g2.fillRect(533, 444, 3, 7);
	        g2.fillRect(533, 444, 8, 4);
	        g2.fillRect(525, 448, 13, 3);
	        g2.fillRect(522, 444, 5, 4);
	        g2.fillRect(520, 444, 5, 5);
	        g2.fillRect(520, 435, 3, 10);
	        g2.fillRect(520, 433, 5, 6);
	        g2.fillRect(524, 430, 13, 3);
	        
	      //Borde tornillos rosa abajo derecha
	        g2.setColor(new Color(0, 0, 0));
	        g2.fillRect(536, 593, 6, 15);
	        g2.fillRect(533, 604, 3, 7);
	        g2.fillRect(533, 604, 8, 4);
	        g2.fillRect(525, 608, 13, 3);
	        g2.fillRect(522, 604, 5, 4);
	        g2.fillRect(520, 604, 5, 5);
	        g2.fillRect(520, 595, 3, 10);
	        g2.fillRect(520, 593, 5, 6);
	        g2.fillRect(524, 590, 13, 3);
	        
	      //Borde tornillos rosa abajo izquierda
	        g2.setColor(new Color(0, 0, 0));
	        g2.fillRect(374, 593, 6, 15);
	        g2.fillRect(371, 604, 3, 7);
	        g2.fillRect(371, 604, 8, 4);
	        g2.fillRect(363, 608, 13, 3);
	        g2.fillRect(360, 604, 5, 4);
	        g2.fillRect(358, 604, 5, 5);
	        g2.fillRect(358, 595, 3, 10);
	        g2.fillRect(358, 593, 5, 6);
	        g2.fillRect(362, 590, 13, 3);

	      //Borde tornillos rosa abajo izquierda
	        g2.setColor(new Color(0, 0, 0));
	        g2.fillRect(374, 433, 6, 15);
	        g2.fillRect(371, 444, 3, 7);
	        g2.fillRect(371, 444, 8, 4);
	        g2.fillRect(363, 448, 13, 3);
	        g2.fillRect(360, 444, 5, 4);
	        g2.fillRect(358, 434, 5, 5);
	        g2.fillRect(358, 435, 3, 10);
	        g2.fillRect(358, 433, 5, 6);
	        g2.fillRect(362, 430, 13, 3);
	        
	        g2.fillRect(527, 442, 3, 3);
	        g2.fillRect(530, 437, 5, 5);
	        
	        g2.fillRect(527, 602, 3, 3);
	        g2.fillRect(530, 597, 5, 5);
	        
	        g2.fillRect(364, 602, 3, 3);
	        g2.fillRect(367, 597, 5, 5);
	        
	        g2.fillRect(364, 442, 3, 3);
	        g2.fillRect(367, 437, 5, 5);
	        
	        int x_delta = 0;
	        for(int x=0; x<36; x++) {
	        	g2.setColor(new Color(255, 192, 182));
	        	int[] xs_1 = {180 + x_delta, 160 + x_delta  , 165 + x_delta , 185 + x_delta};
	            int[] ys_1 = {653, 653, 660, 660};
	            g2.fillPolygon(xs_1, ys_1, 4);
	        	
	            g2.setColor(new Color(95, 40, 24));
	        	int[] xs_2 = {150 + x_delta, 165 + x_delta  , 210 + x_delta , 150 + x_delta};
	            int[] ys_2 = {660, 660, 690, 660};
	            g2.fillPolygon(xs_2, ys_2, 4);
	            x_delta += 35;
	        }
	        
	        // Jump-Man
	           
	      //Cuerpo
	        g2.setColor(new Color(0, 0, 0));
	        g2.fillOval(670, 550, 45, 60);

	        g2.fillOval(674, 568, 45, 40);
	        g2.fillRect(687, 573, 40, 40);
	        
	      //Botas
	        g2.setColor(new Color(221, 73, 41));
	        g2.fillRect(690, 613, 13, 7);
	        g2.fillRect(690, 617, 17, 3);
	        
	        g2.setColor(new Color(254, 193, 193));
	        g2.fillRect(690, 530, 23, 31);
	        
	        g2.setColor(new Color(254, 193, 193));
	        g2.fillRect(680, 547, 23, 7);
	        
	        g2.setColor(new Color(254, 193, 193));
	        g2.fillRect(690, 539, 6, 6);
	        
	        //cabello
	        g2.setColor(new Color(0, 0, 0));
	        g2.fillRect(690, 544, 8, 7);
	        g2.setColor(new Color(0, 0, 0));
	        g2.fillRect(684, 539, 6, 13);
	        g2.setColor(new Color(0, 0, 0));
	        g2.fillRect(678, 539, 13, 2);
	        g2.setColor(new Color(0, 0, 0));
	        g2.fillRect(684, 530, 9, 7);
	        g2.setColor(new Color(0, 0, 0));
	        g2.fillRect(684, 530, 13, 9);
	        g2.setColor(new Color(0, 0, 0));
	        g2.fillRect(684, 528, 29, 3);
	        
	        // ojo
	        g2.setColor(new Color(0, 0, 0));
	        g2.fillRect(705, 537, 6, 6);
	        
	        //gorra
	        g2.setColor(new Color(221, 73, 41));
	        g2.fillRect(679, 528, 10, 11);
	        g2.setColor(new Color(221, 73, 41));
	        g2.fillRect(679, 525, 13, 5);
	        g2.setColor(new Color(221, 73, 41));
	        g2.fillRect(688, 519, 14, 9);
	        g2.setColor(new Color(221, 73, 41));
	        g2.fillRect(695, 517, 17, 9);
	        
	        g2.setColor(new Color(0, 0, 0));
	        g2.fillRect(678, 526, 3, 14);
	        g2.fillRect(680, 524, 8, 3);
	        g2.fillRect(688, 518, 8, 3);
	        g2.fillRect(695, 515, 10, 3);
	        
	        //oreja
            g2.setColor(new Color(254, 193, 193));
	        g2.fillRect(676, 540, 8, 12);
	        g2.setColor(new Color(254, 193, 193));
	        g2.fillRect(712, 543, 13, 8);
	        g2.setColor(new Color(254, 193, 193));
	        g2.fillRect(712, 543, 10, 12);
	        g2.setColor(new Color(254, 193, 193));
	        g2.fillRect(712, 543, 10, 12);
	        
	        // Bigote
	        g2.setColor(new Color(0, 0, 0));
	        g2.fillRect(701, 550, 10, 4);
	        g2.fillRect(704, 548, 4, 4);
	        g2.fillRect(704, 552, 10, 7);
	      
	        // line art
	        g2.setColor(new Color(0, 0, 0));
	        g2.fillRect(680, 553, 10, 8);
	        g2.fillRect(675, 558, 5, 5);
	        
	        //Manga
	        g2.setColor(new Color(221, 73, 41));
	        g2.fillOval(675, 563, 13, 17);
	        g2.fillOval(675, 563, 13, 17);
	        g2.fillRect(685, 576, 11, 9);
	        
	        //Mano
	        g2.setColor(new Color(254, 193, 193));
	        g2.fillOval(693, 563, 20, 15);
	        
	        //Broches
	        g2.setColor(new Color(227, 218, 218));
	        g2.fillOval(718, 579, 5, 10);
	        g2.fillRect(699, 584, 8, 3);

	        
	        //Bloque interrogacion
	        
	        //Bloque uno
	        g2.setColor(new Color(255, 144, 99));
	        g2.fillRect(150, 375, 50, 50);
	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(150, 375, 5, 50);
	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(150, 375, 50, 5);
	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(200, 375, 3, 50);
	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(150, 425, 53, 3);
	        
	        
	        //Puntos del bloque
	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(160, 419, 3, 3);
	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(160, 382, 3, 3);
	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(195, 419, 3, 3);
	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(195, 382, 3, 3);
	        
	        
	        //Bloque dos
	        g2.setColor(new Color(255, 144, 99));
	        g2.fillRect(300, 200, 50, 50);
	        
	        //Sombra signo
	        g2.setColor(new Color(44, 8, 1));
	        g2.fillRoundRect(305, 210, 18, 20, 20, 20);
	        
	        g2.setColor(new Color(44, 8, 1));
	        g2.fillRect(308, 218, 5, 15);
	        
	        //Signo
	        g2.setColor(new Color(233, 198, 191));
	        g2.fillRoundRect(302, 207, 18, 18, 20, 20);
	        
	        g2.setColor(new Color(233, 198, 191));
	        g2.fillRoundRect(304, 207, 4, 30, 20, 20);
	        
	        g2.setColor(new Color(233, 198, 191));
	        g2.fillRoundRect(335, 207, 18, 14, 3, 3);
	        
	        g2.setColor(new Color(233, 198, 191));
	        g2.fillRoundRect(348, 215, 5, 20, 3, 3);
	        	    
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(336, 220, 15, 3);
	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRoundRect(345, 215, 5, 8, 10, 10);
	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(300, 200, 5, 50);
	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(300, 200, 50, 3);
	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(350, 200, 3, 50);
	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(300, 250, 53, 5);
	        
	        
	        //Puntos del bloque dos
	   	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(345, 205, 3, 3);
	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(345, 245, 3, 3);
	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(308, 245, 3, 3);
	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(308, 205, 3, 3);
	        

	        
	      //Bloque tres
	        g2.setColor(new Color(255, 144, 99));
	        g2.fillRect(350, 200, 50, 50);
	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(350, 200, 5, 50);
	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(350, 200, 50, 3);
	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(400, 200, 3, 50);
	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(350, 250, 53, 5);
	        
	      
	        
	        //Puntos del bloque tres
   	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(358, 205, 3, 3);
	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(358, 245, 3, 3);
	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(394, 245, 3, 3);
	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(394, 205, 3, 3);
	       	        
	        //Bloque cuatro
	        
	        
	        g2.setColor(new Color(255, 144, 99));
	        g2.fillRect(1070, 240, 50, 50);
	        
	        //Sombra signo
	        g2.setColor(new Color(44, 8, 1));
	        g2.fillRoundRect(1072, 250, 18, 20, 20, 20);
	        
	        g2.setColor(new Color(44, 8, 1));
	        g2.fillRect(1075, 258, 5, 15);
	        
	        
	        //Signo
	        g2.setColor(new Color(233, 198, 191));
	        g2.fillRoundRect(1068, 247, 18, 18, 20, 20);
	        
	        g2.setColor(new Color(233, 198, 191));
	        g2.fillRoundRect(1071, 247, 4, 30, 20, 20);
	        
	        g2.setColor(new Color(233, 198, 191));
	        g2.fillRoundRect(1103, 251, 18, 14, 3, 3);
	        
	        g2.setColor(new Color(233, 198, 191));
	        g2.fillRoundRect(1117, 255, 5, 20, 3, 3);
	        	    
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(1104, 263, 15, 3);
	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRoundRect(1114, 255, 5, 8, 10, 10);
	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(1067, 240, 5, 50);
	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(1070, 240, 50, 3);
	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(1120, 240, 5, 50);
	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(1068, 287, 54, 3);
	        
	        
	        //Puntos del bloque cuatro
   	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(1073, 245, 3, 3);
	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(1073, 281, 3, 3);
	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(1114, 245, 3, 3);
	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(1114, 281, 3, 3);
	        
	        
	        //tubo
	        
	        g2.fillRect(830, 430, 130, 60);
	        g2.fillRect(835, 430, 120, 190);
	        
	        
	        g2.setColor(new Color(34, 129, 27));
	        g2.fillRect(835, 434, 120, 50);
	        g2.fillRect(840, 434, 110, 185);
	        
	        
	        g2.setColor(new Color(99, 218, 110));
	        g2.fillRoundRect(849, 434, 10, 48, 3, 3);
	        g2.fillRoundRect(840, 434, 5, 48, 3, 3);
	        g2.fillRoundRect(870, 434, 3, 48, 3, 3);
	        g2.fillRoundRect(910, 434, 3, 48, 3, 3);
	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(835, 480, 120, 8);
	        g2.fillRect(913, 435, 5, 48);
	        g2.fillRect(920, 435, 3, 48);
	        g2.fillRect(928, 435, 17, 48);
	        g2.fillRect(950, 435, 5, 48);
	        
	        g2.setColor(new Color(99, 218, 110));
	        g2.fillRoundRect(846, 488, 4, 130, 0, 0);
	        g2.fillRoundRect(853, 488, 10, 130, 0, 0);
	        g2.fillRoundRect(873, 488, 3, 130, 0, 0);
	        g2.fillRoundRect(905, 488, 5, 130, 0, 0);
	        
	        g2.setColor(new Color(20, 8, 5));
	        g2.fillRect(910, 488, 3, 131);
	        g2.fillRect(916, 488, 3, 131);
	        g2.fillRect(921, 488, 20, 131);
	        g2.fillRect(945, 488, 10, 131);
	        
	        g2.setColor(new Color(185, 234, 185, 150));
	        g2.fillRect(835, 434, 120, 3);
	        
	        //plata piraña
	        g2.setColor(new Color(105, 200, 142));
	        g2.fillRect(885, 330, 15, 100);
	        g2.setColor(new Color(238, 67, 40));
	        g2.fillArc(855, 297, 65, 65, -130, 320);
	        
	        //Puntos blancos
	        g2.setColor(new Color(255, 255, 255));
        	g2.fillArc(907, 330, 7, 7, 0, 360);
        	g2.fillArc(909, 310, 7, 7, 0, 360);
        	g2.fillArc(890, 299, 7, 7, 0, 360);
        	g2.fillArc(875, 301, 7, 7, 0, 360);
        	g2.fillArc(890, 350, 8, 8, 0, 360);
        	g2.fillArc(899, 345, 4, 4, 0, 360);
	        
	        //Color blanco labios
	        g2.setColor(new Color(255, 255, 255));
        	g2.fillRect(873, 318, 22, 14);
        	g2.fillRect(850, 323, 23, 12);
        	g2.fillRect(885, 323, 19, 16);
        	g2.fillRect(885, 323, 13, 20);
        	g2.fillRect(885, 328, 11, 20);
        	g2.fillRect(875, 340, 10, 12);
        	g2.fillRect(868, 345, 12, 12);
        	g2.fillRect(863, 353, 6, 6);

	        //Borde labios
	        g2.setColor(new Color(20, 8, 5));
        	g2.fillRect(883, 330, 8, 8);
        	g2.fillRect(855, 335, 20, 6);
        	g2.fillRect(876, 330, 18, 3);
        	g2.fillRect(853, 333, 3, 5);
        	g2.fillRect(850, 324, 3, 10);
        	g2.fillRect(853, 323, 10, 5);
        	g2.fillRect(858, 318, 18, 5);
        	g2.fillRect(867, 314, 28, 5);
        	g2.fillRect(895, 314, 5, 8);
        	g2.fillRect(900, 318, 3, 4);
        	g2.fillRect(904, 323, 3, 16);
        	g2.fillRect(898, 340, 3, 5);
        	g2.fillRect(893, 344, 3, 5);
        	g2.fillRect(893, 342, 5, 3);
        	g2.fillRect(898, 338, 3, 5);
        	g2.fillRect(886, 347, 8, 3);
        	g2.fillRect(880, 352, 8, 4);
        	g2.fillRect(876, 354, 4, 4);
        	g2.fillRect(868, 357, 8, 6);
        	g2.fillRect(863, 354, 3, 7);
        	g2.fillRect(866, 346, 3, 7);
        	g2.fillRect(866, 344, 10, 3);
        	g2.fillRect(875, 341, 5, 3);
        	g2.fillRect(879, 338, 5, 3);
        	
        	//Borde cabeza
        	g2.fillRect(853, 317, 3, 7);
        	g2.fillRect(858, 310, 3, 7);
        	g2.fillRect(858, 308, 7, 3);
        	g2.fillRect(865, 303, 8, 3);
        	g2.fillRect(875, 296, 18, 3);
        	g2.fillRect(893, 298, 11, 3);
        	g2.fillRect(906, 302, 7, 10);
        	g2.fillRect(915, 310, 3, 8);
        	g2.fillRect(919, 320, 3, 20);
        	g2.fillRect(915, 340, 3, 8);
        	g2.fillRect(910, 348, 5, 6);
        	g2.fillRect(907, 354, 5, 3);
        	g2.fillRect(900, 357, 9, 6);
        	g2.fillRect(878, 362, 20, 3);
        	
        	//Color verde tallo
        	g2.setColor(new Color(105, 200, 142));

        	g2.fillRect(907, 370, 20, 20);
        	g2.fillRect(860, 370, 20, 20);
        	g2.fillRect(900, 375, 23, 23);
        	g2.fillRect(865, 375, 23, 23);
        	
        	g2.fillRect(860, 405, 20, 20);
        	g2.fillRect(905, 405, 20, 20);
        	g2.fillRect(900, 410, 20, 20);
        	g2.fillRect(865, 410, 20, 20);
        	
        	//Borde tallo
        	g2.setColor(new Color(20, 8, 5));
        	g2.fillRect(883, 365, 3, 20);
        	g2.fillRect(883, 365, 3, 20);
        	g2.fillRect(899, 360, 3, 30);
        	g2.fillRect(899, 398, 3, 32);
        	g2.fillRect(883, 398, 3, 32);
        	
        	//petalo arriba derecha
        	g2.fillRect(900, 389, 5, 3);
        	g2.fillRect(905, 387, 3, 5);
        	g2.fillRect(905, 386, 5, 2);
        	g2.fillRect(907, 382, 5, 4);
        	g2.fillRect(910, 368, 12, 4);
        	g2.fillRect(922, 370, 5, 8);
        	g2.fillRect(925, 370, 3, 15);
        	g2.fillRect(923, 385, 3, 10);
        	g2.fillRect(923, 385, 3, 11);
        	g2.fillRect(910, 395, 13, 3);
        	
        	//Petalo arriba izquierdo
        	g2.fillRect(880, 387, 5, 3);
        	g2.fillRect(877, 382, 4, 5);
        	g2.fillRect(874, 381, 5, 2);
        	g2.fillRect(878, 374, 5, 3);
        	g2.fillRect(874, 370, 5, 7);
        	g2.fillRect(865, 368, 10, 3);
        	g2.fillRect(860, 368, 8, 8);
        	g2.fillRect(858, 373, 3, 10);
        	g2.fillRect(860, 383, 6, 10);
        	g2.fillRect(864, 393, 7, 3);
        	g2.fillRect(866, 396, 17, 5);
        	
        	//petalo abajo izquierdo
        	g2.fillRect(860, 400, 13, 5);
        	g2.fillRect(860, 405, 7, 4);
        	g2.fillRect(858, 405, 3, 20);
        	g2.fillRect(860, 425, 7, 7);
        	
        	g2.fillRect(880, 410, 4, 4);
        	g2.fillRect(875, 405, 4, 4);
        	g2.fillRect(870, 414, 4, 8);
        	g2.fillRect(873, 420, 4, 4);
        	g2.fillRect(873, 420, 4, 4);
        	
        	//petalo abajo derecha
        	g2.fillRect(900, 425, 5, 5);
        	g2.fillRect(905, 420, 5, 6);
        	g2.fillRect(910, 416, 3, 5);
        	g2.fillRect(900, 410, 6, 3);
        	g2.fillRect(905, 406, 3, 6);
        	g2.fillRect(908, 403, 15, 5);
        	g2.fillRect(923, 407, 3, 15);
        	g2.fillRect(920, 421, 4, 4);
        	g2.fillRect(918, 423, 3, 8);
        
        	//Bolita de Fuego
        	g2.setColor(new Color(238, 60, 76));
        	g2.fillRect(750, 442, 13, 18);
        	g2.fillRect(745, 445, 18, 11);
        	g2.fillRect(750, 448, 18, 13);
        	g2.fillRect(754, 448, 11, 20);
        	g2.fillRect(754, 454, 11, 7);
        	g2.fillRect(748, 465, 12, 5);
        	g2.fillRect(745, 460, 3, 6);
        	
        	g2.setColor(new Color(250, 227, 206));
        	g2.fillRect(752, 444, 10, 12);
        	g2.fillRect(750, 450, 12, 5);
        	g2.fillRect(755, 450, 10, 11);
        	g2.fillRect(760, 450, 4, 15);
        	
        	g2.setColor(new Color(67, 136, 73));
        	g2.fillArc(155, 575, 55, 48, -65, 200);
        	
        	g2.setColor(new Color(113, 173, 129));
        	g2.fillOval(160, 560, 20, 20);
	          	
        	g2.setColor(new Color(87, 212, 114));
        	g2.fillOval(150, 574, 40, 47);
        	g2.fillOval(160, 582, 40, 38);
        	
        	g2.setColor(new Color(67, 136, 73));
        	g2.fillArc(165, 560, 30, 40, -70, 190);
        	
        	
        	g2.setColor(new Color(0, 0, 0));
        	g2.fillRect(148, 595, 5, 20);
        	g2.fillRect(155, 618, 50, 3);
        	g2.fillRect(153, 585, 5, 10);
        	g2.fillRect(158, 573, 3, 13);
        	g2.fillRect(160, 570, 10, 3);
        	g2.fillRect(170, 568, 15, 3);
        	g2.fillRect(184, 570, 10, 3);
        	g2.fillRect(192, 570, 3, 18);
        	g2.fillRect(195, 580, 10, 3);
        	g2.fillRect(203, 583, 3, 7);
        	g2.fillRect(206, 590, 3, 7);
        	g2.fillRect(203, 612, 3, 7);
        	g2.fillRect(206, 595, 3, 20);
        	g2.fillRect(190, 565, 3, 5);
        	g2.fillRect(185, 563, 5, 3);
        	g2.fillRect(169, 560, 20, 3);
        	g2.fillRect(164, 563, 5, 5);
        	g2.fillRect(162, 568, 3, 3);
        	g2.fillRect(154, 614, 5, 5);
        	
        	g2.setColor(new Color(255, 255, 255,  80));
        	g2.fillOval(160, 600, 5, 15);
        	g2.fillOval(155, 605, 15, 5);

        	g2.fillOval(168, 587, 5, 12);
        	g2.fillOval(165, 590, 12, 5);
        	
        	g2.fillOval(185, 600, 4, 12);
        	g2.fillOval(183, 605, 10, 4);
        	
        	
	    }
	            

	    public static void main(String[] args) {
	        new mario3Fondo();
	    }

	}


