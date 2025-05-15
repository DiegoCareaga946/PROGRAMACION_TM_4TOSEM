package controllers;

import models.UserModel;
import views.UserView;

public class UserController {
	
	private UserView view;
	
	public void userController() {
		view = new UserView();
	}
	 public void user() {
	        UserModel pm = new UserModel();
	        pm.get();
	        view.users();
	    }
}
