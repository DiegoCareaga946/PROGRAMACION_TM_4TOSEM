package main;

import controllers.ProductController;
import views.AuthView;

public class main {

	public static void main(String[] args) {
		//AuthView application = new AuthView();
		ProductController application = new ProductController();
			//application.login();
			application.products();
		}
	
	}