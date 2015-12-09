package Jetstorm.Enterprise.Main;

import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class MainClass {

	public static final int VISIBLE = 0;
	public static final int INVISIBLE = 1;

	public static JFrame window;

	public static void main(String[] args) {
		window = new JFrame("Learning Curve");
		window.add(new WindowClass());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		// window.setUndecorated(true);
		window.pack();
		window.setLocationRelativeTo(null);
		window.setVisible(true);

	}

	public static void setCursor(int i) {
		Cursor c = null;
		if (i == INVISIBLE) {
			BufferedImage bi = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
			c = Toolkit.getDefaultToolkit().createCustomCursor(bi, new Point(0, 0), ".");
		}
		window.setCursor(c);
	}

}
