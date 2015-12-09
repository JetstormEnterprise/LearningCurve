package Jetstorm.Enterprise.GameStates;

import java.awt.Color;
import java.awt.Graphics2D;

import Jetstorm.Enterprise.Main.WindowClass;

public class MainMenuState extends GameStateClass {

	private short red, green, blue;
	private Color bgColor;
	
	public MainMenuState(GameStateManagerClass gsm) {
		super(gsm);
		init();
	}

	public void init() {
		
		red = 255;
		green = 0;
		blue = 0;
		bgColor = new Color(red, green, blue);
		
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
		
		bgColor = new Color(red, green, blue);
		
	}

	public void draw(Graphics2D g) {
		
		g.setColor(bgColor);
		g.fillRect(0, 0, WindowClass.WIDTH, WindowClass.HEIGHT);
		
		g.setColor(Color.BLACK);
		for (int i = 0; i < 50; i++) {
			g.drawRect(i, i, WindowClass.WIDTH - (i * 2), WindowClass.HEIGHT - (i * 2));
		}
		
	}

	public void handleInput() {
		
	}

}
