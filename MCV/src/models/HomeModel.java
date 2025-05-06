package models;

import views.HomeView;

public class HomeModel {
	String usuariosRegistrados;
	String notificacion;
	int horaSistema;
	
	HomeView view = new HomeView();
	
	public HomeModel() {
		view = new HomeView();
	}

	public String getUsuariosRegistrados() {
		return usuariosRegistrados;
	}

	public void setUsuariosRegistrados(String usuariosRegistrados) {
		this.usuariosRegistrados = usuariosRegistrados;
	}

	public String getNotificacion() {
		return notificacion;
	}

	public void setNotificacion(String notificacion) {
		this.notificacion = notificacion;
	}

	public int getHoraSistema() {
		return horaSistema;
	}

	public void setHoraSistema(int horaSistema) {
		this.horaSistema = horaSistema;
	}

	public HomeView getView() {
		return view;
	}

	public void setView(HomeView view) {
		this.view = view;
	}
	
}
