package models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import controllers.HomeController;
import views.AuthView;
import views.HomeView;

public class AuthModel {

	public AuthModel() {
		
	}
	public boolean access(String u, String p) throws IOException {
	    Path path = Paths.get("src/Files/users.txt");
	    if (!Files.exists(path)) {
	        System.err.println("ERROR: users.txt no encontrado en " + path.toAbsolutePath());
	        return false;
	    }

	    try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
	        String linea;
	        while ((linea = reader.readLine()) != null) {
	            System.out.println("Leyendo línea: " + linea);
	            String[] datos = linea.split(",");
	            if (datos.length < 2) continue;
	            String user = datos[0].trim();
	            String pass = datos[1].trim();
	            if (user.equals(u) && pass.equals(p)) {
	            	HomeView entrada = new HomeView();
	            	entrada.HomeView();
	                return true;
	            }
	        }
	    }
	    return false;
	}

}