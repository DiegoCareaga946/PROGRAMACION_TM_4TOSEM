package image;

import java.awt.Image;
import java.awt.Toolkit;

public class imageIcon {
	public Image setIconImage() {
	   Image retValue = Toolkit.getDefaultToolkit().
	         getImage(ClassLoader.getSystemResource("resource/iconoVentana.png"));


	   return retValue;
	}
}
