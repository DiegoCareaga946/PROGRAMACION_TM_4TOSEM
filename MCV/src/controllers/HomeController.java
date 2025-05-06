package controllers;

import views.HomeView;

public class HomeController {
	public HomeView view;
	
	public void HomeController(){
		view = new HomeView();
	}
	public void registro() {
		view.registro();
	}
	public void configuracion() {
		view.configuracion();
	}
	public void usuarios() {
		view.usuarios();
	}
	
}
