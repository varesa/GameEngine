package fi.dy.esav.GameEngine;

import java.awt.Image;

import javax.swing.JFrame;

public class Stage extends JFrame{
	Image backgroundImage;
	
	/**
	 * Default constructor method
	 */
	public Stage() {
		super();
	}

	/**
	 * @return the background
	 */
	public Image getBackgroundImage() {
		return this.backgroundImage;
	}

	/**
	 * @param background the background to set
	 */
	public void setBackgroundImage(Image background) {
		this.backgroundImage = background;
	}
	
	
}
