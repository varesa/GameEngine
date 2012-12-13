package fi.dy.esav.GameEngine;

public class InputState {
	
	
	
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
	
}
