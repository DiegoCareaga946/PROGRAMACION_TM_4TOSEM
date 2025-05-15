package main;

import controllers.ProductController;
import controllers.UserController;
import views.AuthView;
import views.UserView;

public class main {

	public static void main(String[] args) {
		AuthView application = new AuthView();
		//ProductController application = new ProductController();
		//UserView application = new UserView();
		
			application.login();
			//application.users();
		}
	
	}