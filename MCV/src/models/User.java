package models;

import javax.swing.JButton;

public class User {
	Integer id;
	String nombre;
	String email;
	String role;
	String phone;
	String create_at;
	String update;
	
	public User(Integer id, String nombre, String email, String role, String phone, String create_at, String update) {
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.role = role;
		this.phone = phone;
		this.create_at = create_at;
		this.update = update;
	}

	public Integer getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}

	public String getRole() {
		return role;
	}

	public String getPhone() {
		return phone;
	}

	public String getCreate_at() {
		return create_at;
	}

	public String getUpdate() {
		return update;
	}
	
	
}
