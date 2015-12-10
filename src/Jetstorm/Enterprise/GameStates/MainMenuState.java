package Jetstorm.Enterprise.GameStates;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.util.Random;

import Jetstorm.Enterprise.Main.WindowClass;

public class MainMenuState extends GameStateClass {

	private short red, green, blue, opacity;
	private char[] titleCTop = {'L', 'E', 'A', 'R', 'N', 'I', 'N', 'G'}, titleCBottom = {'C', 'U', 'R', 'V', 'E'};
	
	private Font titleTop, titleBottom;
	private Color bgColor;
	private Color[] titleColors;
	
	private Random ranNum;
	
	public MainMenuState(GameStateManagerClass gsm) {
		super(gsm);
		init();
	}

	public void init() {
		
		red = 255;
		green = 0;
		blue = 0;
		opacity = 250;
		
		try {

			titleTop = new Font("TimesRoman", Font.BOLD, 24);
			titleBottom = new Font("TimesRoman", Font.ITALIC, 24);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		bgColor = new Color(red, green, blue);
		
		ranNum = new Random();
		
		titleColors = new Color[13];
		
		for (int i = 0; i < titleColors.length; i++) {
			titleColors[i] = new Color(ranNum.nextInt(255), ranNum.nextInt(255), ranNum.nextInt(255));
		}
		
	}

	public void update() {
		
		if (red == 255 && green < 255 && blue == 0) {
			green++;
		} else if (red > 0 && green == 255 && blue == 0) {
			red--;
		} else if (red == 0 && green == 255 && blue < 255) {
			blue++;
		} else if (red == 0 && green > 0 && blue == 255) {
			green--;
		} else if (red < 255 && green == 0 && blue == 255) {
			red++;
		} else if (red == 255 && green == 0 && blue > 0) {
			blue--;
		}
		
		bgColor = new Color(red, green, blue, 255);
		
	}

	public void draw(Graphics2D g) {
		
		g.setColor(bgColor);
		g.fillRect(0, 0, WindowClass.WIDTH, WindowClass.HEIGHT);
		
		for (int i = 0; i < 50; i++) {
			g.setColor(new Color(0, 0, 0, opacity));
			g.drawRect(i, i, WindowClass.WIDTH - (i * 2), WindowClass.HEIGHT - (i * 2));
			opacity -= 5;
		}
		
		opacity = 250;
		
		g.setColor(new Color(0, 0, 0, 255));
		g.setFont(titleTop);
		
		g.drawChars(titleCTop, 0, 8, WindowClass.WIDTH / 8, WindowClass.HEIGHT / 4);
//		
//		for (int i = 0; i < titleCTop.length; i++) {
//			g.setColor(titleColors[i]);
//			if (i < 6) {
//				g.drawString(String.valueOf(titleCTop[i]), (WindowClass.WIDTH / 8) + (i * 22), (WindowClass.HEIGHT / 4));
//			} else {
//				g.drawString(String.valueOf(titleCTop[i]), (WindowClass.WIDTH / 8) + (i * 21), (WindowClass.HEIGHT / 4));
//			}
//		}
//		
//		g.setFont(titleBottom);
//		
//		for (int i = 0; i < titleCBottom.length; i++) {
//			g.setColor(titleColors[i + 7]);
//			g.drawString(String.valueOf(titleCBottom[i]), (WindowClass.WIDTH / 6) + (i * 22), (WindowClass.HEIGHT / 2));
//		}
		
	}

	public void handleInput() {
		
	}

}
