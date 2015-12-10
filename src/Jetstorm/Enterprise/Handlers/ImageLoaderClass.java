package Jetstorm.Enterprise.Handlers;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class ImageLoaderClass {

	public static BufferedImage DRAGONINTRO = load("/backgrounds/redDragon.jpg");

	private static BufferedImage load(String s) {
		BufferedImage image = null;
		try {
			image = ImageIO.read(ImageLoaderClass.class.getResourceAsStream(s));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return image;
	}

	private static BufferedImage loadChunk(String s, int width, int height, int x, int y) {
		BufferedImage image = null;
		try {
			image = ImageIO.read(ImageLoaderClass.class.getResourceAsStream(s)).getSubimage(x, y,
					width, height);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return image;
	}


}
