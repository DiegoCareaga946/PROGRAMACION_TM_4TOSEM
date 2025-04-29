package Ventana;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
public class Main {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Ventana ventana = new Ventana("Acceso");
		        try {
		            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		                if ("Nimbus".equals(info.getName())) {
		                    UIManager.setLookAndFeel(info.getClassName());
		                    break;
		                }
		            }
		        } catch (Exception e) {
		            // If Nimbus is not available, you can set the GUI to another look and feel.
		        }
		}
}