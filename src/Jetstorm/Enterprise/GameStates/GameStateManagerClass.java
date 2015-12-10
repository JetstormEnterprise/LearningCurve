package Jetstorm.Enterprise.GameStates;

import Jetstorm.Enterprise.Main.WindowClass;

public class GameStateManagerClass {

	private GameStateClass[] gameStates;
	private int currentState;

	public static final int NUMGAMESTATES = 10;
	public static final int JETSTORMLOGOSTATE = 0;
	public static final int MAINMENUSTATE = 1;

	public GameStateManagerClass() {

		gameStates = new GameStateClass[NUMGAMESTATES];

		currentState = JETSTORMLOGOSTATE;
		loadState(currentState);

	}

	private void loadState(int state) {

		//if (state == STARTUPSCREENSTATE)
			//gameStates[state] = new StartupScreenState(this);
		if (state == JETSTORMLOGOSTATE)
			gameStates[state] = new JetstormLogoState(this);
		else if (state == MAINMENUSTATE)
			gameStates[state] = new MainMenuState(this);

	}

	private void unloadState(int state) {
		gameStates[state] = null;
	}

	public void setState(int state) {
		unloadState(currentState);
		currentState = state;
		loadState(currentState);
	}



	public void update() {

		if (gameStates[currentState] != null)
			gameStates[currentState].update();


	}

	public void draw(java.awt.Graphics2D g) {

		if (gameStates[currentState] != null)
			gameStates[currentState].draw(g);
		else {
			g.setColor(java.awt.Color.BLACK);
			g.fillRect(0, 0, WindowClass.WIDTH, WindowClass.HEIGHT);
		}

	}

}
