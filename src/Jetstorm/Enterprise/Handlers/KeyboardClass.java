package Jetstorm.Enterprise.Handlers;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardClass implements KeyListener {

	public static final int NUM_KEYS = 15;

	public static boolean keyState[] = new boolean[NUM_KEYS];
	public static boolean prevKeyState[] = new boolean[NUM_KEYS];

	public static int ESCAPE = 0;
	public static int ENTER = 1;
	public static int SHIFT = 2;
	public static int SPACE = 3;
	public static int BACKSPACE = 4;
	public static int LEFTARROW = 5;
	public static int RIGHTARROW = 6;
	public static int UPARROW = 7;
	public static int DOWNARROW = 8;
	public static int DBUTTON = 9;
	public static int ABUTTON = 10;

	public static int PLAYER_A = 3;
	public static int PLAYER_B = 2;
	public static int PLAYER_START = 1;
	public static int PLAYER_SELECT = 2;
	public static int PLAYER_RB;
	public static int PLAYER_LB;

	public static void keyset(int i, boolean b) {
		if (i == KeyEvent.VK_ESCAPE)
			keyState[ESCAPE] = b;
		else if (i == KeyEvent.VK_SHIFT)
			keyState[SHIFT] = b;
		else if (i == KeyEvent.VK_SPACE)
			keyState[SPACE] = b;
		else if (i == KeyEvent.VK_ENTER)
			keyState[ENTER] = b;
		else if (i == KeyEvent.VK_BACK_SPACE)
			keyState[BACKSPACE] = b;
		else if (i == KeyEvent.VK_LEFT)
			keyState[LEFTARROW] = b;
		else if (i == KeyEvent.VK_RIGHT)
			keyState[RIGHTARROW] = b;
		else if (i == KeyEvent.VK_UP)
			keyState[UPARROW] = b;
		else if (i == KeyEvent.VK_DOWN)
			keyState[DOWNARROW] = b;
		else if (i == KeyEvent.VK_D)
			keyState[DBUTTON] = b;
		else if (i == KeyEvent.VK_A)
			keyState[ABUTTON] = b;
	}

	public static void update() {

		for (int i = 0; i < NUM_KEYS; i++) {
			prevKeyState[i] = keyState[i];
		}
	}

	public static boolean isPressed(int i) {
		return keyState[i] && !prevKeyState[i];
	}

	public static boolean isHeld(int i) {
		return keyState[i];
	}

	public static boolean arrowKeysPress() {
		if (keyState[UPARROW] || keyState[DOWNARROW] || keyState[LEFTARROW] || keyState[RIGHTARROW])
			return true;
		return false;
	}

	public static boolean upKeyPress() {
		if (keyState[UPARROW])
			return true;
		return false;
	}

	public static boolean downKeyPress() {
		if (keyState[DOWNARROW])
			return true;
		return false;
	}

	public static boolean leftKeyPress() {
		if (keyState[LEFTARROW])
			return true;
		return false;
	}

	public static boolean rightKeyPress() {
		if (keyState[RIGHTARROW])
			return true;
		return false;
	}

	public static boolean anyKeyPress() {
		for (int i = 0; i < NUM_KEYS; i++) {
			if (keyState[i])
				return true;
		}
		return false;
	}

	public static void setPLAYERA(int newA) {
		PLAYER_A = newA;
	}

	public static void setPLAYERB(int newB) {
		PLAYER_B = newB;
	}

	public void keyPressed(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {
	}

}
