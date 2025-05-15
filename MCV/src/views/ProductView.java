package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import controllers.ProductController;
import models.ProductModel;

public class ProductView {
    JFrame ventana;
    ProductModel pm;
    
    public void products(JSONArray data) {
        pm = new ProductModel();
        
        ventana = new JFrame("Productos");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setBounds(0, 0, 920, 534);
        
        JPanel panelBase = new JPanel();
        ventana.getContentPane().add(panelBase, BorderLayout.CENTER);
        panelBase.setLayout(null);

        JLabel lblNewLabel = new JLabel("PRODUCTOS");
        lblNewLabel.setFont(new Font("Kefa", Font.PLAIN, 24));
        lblNewLabel.setBounds(107, 35, 210, 26);
        lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
        panelBase.add(lblNewLabel);
        
        JButton add = new JButton("+ AÑADIR");
        add.setBounds(635, 30, 200, 40);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.dispose();
                ProductController pc = new ProductController();
                pc.add();
            }
        });
        panelBase.add(add);
        
        JButton regresar = new JButton();
        
        ImageIcon imagenIcono = new ImageIcon(AuthView.class.getResource("/images/regresar.png"));
		JLabel etiquetaIcono = new JLabel(imagenIcono);
		
		etiquetaIcono.setBounds(0, 15, 20, 20);
		etiquetaIcono.setIcon(new ImageIcon(imagenIcono.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
		
		regresar.add(etiquetaIcono);
		
        regresar.setBounds(0, 30, 50, 30);
        regresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               ventana.dispose();
               home();
            }
        });
        panelBase.add(regresar);
        
        int y = 90;

        for (Object product1 : data) {
            JSONObject product = (JSONObject) product1; 
            
            JLabel lblNewLabel2 = new JLabel((String) product.get("nombre"));
            lblNewLabel2.setForeground(new Color(0, 0, 0));
            lblNewLabel2.setBounds(107, y, 150, 26);
            lblNewLabel2.setBorder(BorderFactory.createLineBorder(new Color(135, 135, 135), 2));
            lblNewLabel2.setHorizontalAlignment(JLabel.CENTER);
            lblNewLabel2.setBackground(new Color(228, 188, 240));
            lblNewLabel2.setOpaque(true);
            panelBase.add(lblNewLabel2);
            
            JLabel lblNewLabel3 = new JLabel( "" + product.get("precio"));
            lblNewLabel3.setForeground(new Color(0, 0, 0));
            lblNewLabel3.setBounds(255, y, 100, 26);
            lblNewLabel3.setBorder(BorderFactory.createLineBorder(new Color(135, 135, 135), 2));
            lblNewLabel3.setHorizontalAlignment(JLabel.CENTER);
            lblNewLabel3.setOpaque(true);
            panelBase.add(lblNewLabel3);
            
            JButton Borrar = new JButton("X BORRAR");
            Borrar.setBounds(400, y, 100, 26);
            Borrar.setName(product.get("id").toString());
            Borrar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    long id = Long.parseLong(((JButton)e.getSource()).getName());
                    ProductModel pm = new ProductModel();
                    pm.remove(id);
                    ventana.dispose();
                    new ProductController().products();
                }
            });
            panelBase.add(Borrar);
            
            y += 50;
        }
        
        ventana.setVisible(true);
    }
    
    public void add() {
        JFrame ventana = new JFrame();
        ventana.setBounds(500, 100, 400, 534);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        ventana.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(null);
        
        JLabel tituloProducto = new JLabel("Nombre del producto: ");
        tituloProducto.setBounds(100, 100, 200, 40);
        panel.add(tituloProducto);
        
        JTextField nameInput = new JTextField();
        nameInput.setBounds(100, 160, 200, 40);
        nameInput.setBorder(null);
        nameInput.setBackground(new Color(200, 200, 200));
        panel.add(nameInput);
        
        JLabel precioProducto = new JLabel("Precio del producto: ");
        precioProducto.setBounds(100, 250, 200, 40);
        panel.add(precioProducto);
        
        JTextField precioInput = new JTextField();
        precioInput.setBounds(100, 310, 200, 40);
        precioInput.setBorder(null);
        precioInput.setBackground(new Color(200, 200, 200));
        panel.add(precioInput);
        
        JButton add = new JButton("+ AÑADIR PRODUCTO");
        add.setBounds(100, 450, 200, 40);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	try {
            		String name = nameInput.getText();
            		double precio = Double.parseDouble(precioInput.getText());
            		
            		ProductModel pm = new ProductModel();
            		pm.addProduct(name, precio);
            		ventana.dispose();
            		
            		new ProductController().products();
            		
            	}
            	finally{
            		System.out.println("ESTA MAL");
            		}
            }
        });
        panel.add(add); 
        
        ventana.setVisible(true);
    }
    
    public void home() {
    	HomeView prueba  = new HomeView();
    	prueba.HomeView();
    }
}