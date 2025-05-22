package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controllers.UserController;
import models.User;
import models.UserModel;

public class UserView {
    private JFrame ventana;
    private ArrayList<User> usuarios;

	JFrame agregarUsuario;
    public void users() {
    	
    	ventana = new JFrame("USUARIOS");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setBounds(0, 0, 920, 534);
        
        JPanel panelBase = new JPanel();
        ventana.getContentPane().add(panelBase);
        panelBase.setLayout(null);

        JLabel lblNewLabel = new JLabel("USUARIOS");
        lblNewLabel.setFont(new Font("Kefa", Font.PLAIN, 24));
        lblNewLabel.setBounds(107, 35, 210, 26);
        lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
        panelBase.add(lblNewLabel);

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
        
        JButton reiniciar = new JButton();
        
        ImageIcon imagenIcono2 = new ImageIcon(AuthView.class.getResource("/images/reiniciar.png"));
		JLabel etiquetaIcono2 = new JLabel(imagenIcono2);
		
		etiquetaIcono2.setBounds(0, 15, 20, 20);
		etiquetaIcono2.setIcon(new ImageIcon(imagenIcono2.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
		
		reiniciar.add(etiquetaIcono2);
		
        reiniciar.setBounds(300, 30, 55, 30);
        reiniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               reiniciar();
            }
        });
        panelBase.add(reiniciar);
        
        String[] columnas = {"ID", "Name", "Email", "Role", "Phone"};
        DefaultTableModel modeloTabla = new DefaultTableModel(columnas, 0);
        
        usuarios = obtenerUsuarios();
        
        for(User usuario : usuarios) {
            Object[] fila = {
                usuario.getId(),
                usuario.getNombre(),
                usuario.getEmail(),
                usuario.getRole(),
                usuario.getPhone()
            };
            modeloTabla.addRow(fila);
        }
        JLabel nameTittle = new JLabel("nombre");
        nameTittle.setBounds(100, 80, 80, 20);
        JLabel emailTittle = new JLabel("email");
        emailTittle.setBounds(100, 180, 80, 20);
        JLabel roleTittle = new JLabel("rol");
        roleTittle.setBounds(100, 280, 80, 20);
        
        JTextField nameInput = new JTextField("");
        nameInput.setBounds(100, 100, 200, 20);
        nameInput.setText("");
        JTextField emailInput = new JTextField("");
        emailInput.setBounds(100, 200, 200, 20);
        emailInput.setText("");
        JTextField roleInput = new JTextField("");
        roleInput.setBounds(100, 300, 200, 20);
        roleInput.setText("");
        
        JButton guardar = new JButton("GUARDAR");
        guardar.setBounds(40, 400, 100, 40);
        guardar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				UserModel um = new UserModel();
				String name = nameInput.getText();
				String email = emailInput.getText();
				String role = roleInput.getText();
				um.add(name, email, role);
				agregarUsuario.dispose();
				
			}
		});
        
        JButton anadir = new JButton("AÑADIR");
        anadir.setBounds(400, 25, 200, 40);
        anadir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				agregarUsuario = new JFrame();
				agregarUsuario.setBounds(100, 100, 500, 600);
				agregarUsuario.setLayout(null);
				agregarUsuario.setVisible(true);
				
				agregarUsuario.add(guardar);
				agregarUsuario.add(nameTittle);
				agregarUsuario.add(emailTittle);
				agregarUsuario.add(roleTittle);
				agregarUsuario.add(nameInput);
				agregarUsuario.add(emailInput);
				agregarUsuario.add(roleInput);				
			}
		});
        panelBase.add(anadir);
        
        JTable tablaUsuarios = new JTable(modeloTabla);
        tablaUsuarios.setFillsViewportHeight(true);
        
        JScrollPane scrollPane = new JScrollPane(tablaUsuarios);
        scrollPane.setBounds(200, 100, 500, 300);
        panelBase.add(scrollPane);
        
        ventana.setVisible(true);
    }
    
    private ArrayList<User> obtenerUsuarios() {
    	UserModel um = new UserModel();
        return new ArrayList<>(um.get());
    }
    
    public void reiniciar() {
    	obtenerUsuarios();
    	ventana.dispose();
    	users();
    }
    
    public void home() {
       HomeView hm = new HomeView();
       hm.HomeView();
    }
}