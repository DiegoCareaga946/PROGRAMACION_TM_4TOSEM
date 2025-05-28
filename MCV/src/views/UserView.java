package views;

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

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

import controllers.UserController;
import models.User;
import models.UserModel;

public class UserView {
    private JFrame ventana;
    private ArrayList<User> usuarios;

    JLabel nameTittle;
    JLabel emailTittle;
    JLabel roleTittle;
    JTextField nameInput;
    JTextField emailInput;
    JTextField roleInput;
    JButton guardar;
	JFrame agregarUsuario;
	int usuarioEditandoId = -1;
	
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
        
        String[] columnas = {"ID", "Name", "Email", "Role", "Phone", "Editar", "Eliminar"};
        DefaultTableModel modeloTabla = new DefaultTableModel(columnas, 0);
        
        usuarios = obtenerUsuarios();
        
        for (User usuario : usuarios) {
            Object[] fila = {
                usuario.getId(),
                usuario.getNombre(),
                usuario.getEmail(),
                usuario.getRole(),
                usuario.getPhone(),
                "Editar",
                "Eliminar"
            };
            modeloTabla.addRow(fila);
        }
        
        JTable tablaUsuarios = new JTable(modeloTabla);
        tablaUsuarios.getColumn("Editar").setCellRenderer(new ButtonRenderer());
        tablaUsuarios.getColumn("Editar").setCellEditor(new ButtonEditor(new JCheckBox(), tablaUsuarios));
        
        tablaUsuarios.getColumn("Eliminar").setCellRenderer(new ButtonRenderer());
        tablaUsuarios.getColumn("Eliminar").setCellEditor(new ButtonEliminar(new JCheckBox(), tablaUsuarios));
        
        nameTittle = new JLabel("nombre");
        nameTittle.setBounds(100, 80, 80, 20);
        emailTittle = new JLabel("email");
        emailTittle.setBounds(100, 180, 80, 20);
        
        roleTittle = new JLabel("rol");
        roleTittle.setBounds(100, 280, 80, 20);
        
        nameInput = new JTextField("");
        nameInput.setBounds(100, 100, 200, 20);
        nameInput.setText("");
        
        emailInput = new JTextField("");
        emailInput.setBounds(100, 200, 200, 20);
        emailInput.setText("");
        
        roleInput = new JTextField("");
        roleInput.setBounds(100, 300, 200, 20);
        roleInput.setText("");
        
        guardar = new JButton("GUARDAR");
        guardar.setBounds(40, 400, 100, 40);
        guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserModel um = new UserModel();
                String name = nameInput.getText();
                String email = emailInput.getText();
                String role = roleInput.getText();

                if (usuarioEditandoId == -1) {
                    um.add(name, email, role);
                } else {
                    um.update(usuarioEditandoId, name, email, role);
                }
                agregarUsuario.dispose();
            }
        });

        
        JButton anadir = new JButton("AÑADIR");
        anadir.setBounds(400, 25, 200, 40);
        anadir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				usuarioEditandoId = -1;
				
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


    class ButtonRenderer extends JButton implements TableCellRenderer {
        public ButtonRenderer() {
            setOpaque(true);
        }
        public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
            setText((value == null) ? "Editar" : value.toString());
            setText((value == null) ? "Eliminar" : value.toString());
            return this;
        }
    }

    class ButtonEditor extends DefaultCellEditor {
        protected JButton button;
        private String label;
        private boolean clicked;
        private int row;
        private JTable table;

        public ButtonEditor(JCheckBox checkBox, JTable table) {
            super(checkBox);
            this.table = table;
            
            button = new JButton();
            button.setOpaque(true);
            
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    fireEditingStopped();
                    
                    int id = (int) table.getValueAt(row, 0);

                	usuarioEditandoId = id;
                    
                    String nombre = (String) table.getValueAt(row, 1);
                    String email = (String) table.getValueAt(row, 2);
                    String rol = (String) table.getValueAt(row, 3);

                    agregarUsuario = new JFrame();
    				agregarUsuario.setBounds(100, 100, 500, 600);
    				agregarUsuario.setLayout(null);
    				agregarUsuario.setVisible(true);
    				
    				agregarUsuario.add(guardar);
    				agregarUsuario.add(nameTittle);
    				agregarUsuario.add(emailTittle);
    				agregarUsuario.add(roleTittle);
    				
    				agregarUsuario.add(nameInput);
    				nameInput.setText(nombre);
    				agregarUsuario.add(emailInput);
    				emailInput.setText(email);
    				agregarUsuario.add(roleInput);
    				roleInput.setText(rol);
    				
    				
                }
            });
        }
        
        public Component getTableCellEditorComponent(JTable table, Object value,
            boolean isSelected, int row, int column) {
            this.row = row;
            button.setText((value == null) ? "Editar" : value.toString());
            clicked = true;
            return button;
        }
        public Object getCellEditorValue() {
            return new String("Editar");
        }

        public boolean stopCellEditing() {
            clicked = false;
            return super.stopCellEditing();
        }

        protected void fireEditingStopped() {
            super.fireEditingStopped();
        }
    }
    
    
    class ButtonEliminar extends DefaultCellEditor {
        protected JButton eliminar;
        private String label;
        private boolean clicked;
        private int row;
        private JTable table;

        public ButtonEliminar(JCheckBox checkBox, JTable table) {
            super(checkBox);
            this.table = table;
            
            eliminar = new JButton();
            eliminar.setOpaque(true);
            
            eliminar = new JButton();
            eliminar.setOpaque(true);
            
            eliminar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    fireEditingStopped();
                    
                    int id = (int) table.getValueAt(row, 0);
                	usuarioEditandoId = id;
                	
                	int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas eliminar el usuario?", "confirmacion", JOptionPane.YES_NO_OPTION);
                	
                	if(respuesta == 0) {
                		UserModel um = new UserModel();
                		um.delete(id);
                	}
                	else {
                		JOptionPane.showMessageDialog(null, "No se elimino al usuario");
                	}
                	
                }
            });
        }
        
        @Override
        public Component getTableCellEditorComponent(JTable table, Object value,
            boolean isSelected, int row, int column) {
            this.row = row;
            eliminar.setText((value == null) ? "Eliminar" : value.toString());
            clicked = true;
            return eliminar;
        }

        @Override
        public Object getCellEditorValue() {
            return "Eliminar";
        }

        @Override
        public boolean stopCellEditing() {
            clicked = false;
            return super.stopCellEditing();
        }

        @Override
        protected void fireEditingStopped() {
            super.fireEditingStopped();
        }
    }
}