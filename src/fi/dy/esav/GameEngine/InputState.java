package fi.dy.esav.GameEngine;

import java.awt.Point;
import java.util.ArrayList;

public class InputState {
	
	private ArrayList<Integer> keysDown = new ArrayList<Integer>();
	
	private int mouseX, mouseY;
	private boolean mouseLeft, mouseRight;
	
	/**
	 * Return the state of a key
	 * @param ADDME The key to be checked
	 * @return Is the key down?
	 */
	public boolean isKeyDown() {
		return false;
	}
	
	/**
	 * Return true if key is up
	 * @param ADDME The key to be checked
	 * @return Is the key up?
	 */
	public boolean isKeyUp() {
		return !isKeyDown();
	}

	/**
	 * @return the mouseX
	 */
	public int getMouseX() {
		return mouseX;
	}

	/**
	 * @param mouseX the mouseX to set
	 */
	void setMouseX(int mouseX) {
		this.mouseX = mouseX;
	}

	/**
	 * @return the mouseY
	 */
	public int getMouseY() {
		return mouseY;
	}

	/**
	 * @param mouseY the mouseY to set
	 */
	void setMouseY(int mouseY) {
		this.mouseY = mouseY;
	}
	
	/**
	 * Get the x and y of the mouse
	 * @return Mouse cursor coordinates
	 */
	public Point getMousePos() {
		return new Point(this.mouseX, this.mouseY);
	}
	
	/**
	 * Set the x and y of the mouse
	 * @param mousepos Mouse position
	 */
	void setMousePos(Point mousepos) {
		this.mouseX = mousepos.x;
		this.mouseY = mousepos.y;
	}
	
	/**
	 * Set the x and y of the mouse
	 * @param mousepos Mouse position
	 */
	void setMousePos(int mousex, int mousey) {
		this.mouseX = mousex;
		this.mouseY = mousey;
	}

	/**
	 * @return the mouseLeft
	 */
	public boolean isMouseLeft() {
		return mouseLeft;
	}

	/**
	 * @param mouseLeft the mouseLeft to set
	 */
	void setMouseLeft(boolean mouseLeft) {
		this.mouseLeft = mouseLeft;
	}

	/**
	 * @return the mouseRigth
	 */
	public boolean isMouseRight() {
		return mouseRight;
	}

	/**
	 * @param mouseRigth the mouseRigth to set
	 */
	void setMouseRight(boolean mouseRight) {
		this.mouseRight = mouseRight;
	}
	
	
	
}
