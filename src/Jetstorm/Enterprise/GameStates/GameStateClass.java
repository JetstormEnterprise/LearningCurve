package Jetstorm.Enterprise.GameStates;

import java.awt.Graphics2D;

public abstract class GameStateClass {

	protected GameStateManagerClass gsm;

	public GameStateClass(GameStateManagerClass gsm) {
		this.gsm = gsm;
	}

	public abstract void init();

	public abstract void update();

	public abstract void draw(Graphics2D g);

	public abstract void handleInput();

}
