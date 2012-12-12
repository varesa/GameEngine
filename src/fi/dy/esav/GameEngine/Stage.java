package fi.dy.esav.GameEngine;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JFrame;

import fi.dy.esav.GameEngine.enums.ENTITY;

public class Stage extends JFrame{
	
	GameEngine engine;
	
	Image backgroundImage;
	
	/**
	 * Disabled the default constructor method
	 */
	private Stage() {}
	
	/**
	 * Constructor
	 * @param The main GameEngine instance
	 */
	public Stage(GameEngine engine) {
		this.engine = engine;
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
	
	/**
	 * Draw all entities on screen
	 * @param display Frame graphics to draw on
	 */
	@Override
	public void paint(Graphics display) {
		Image buffer = createImage(getWidth(), getHeight());
		Graphics bg = buffer.getGraphics();
	
		ArrayList<Entity> entities = this.engine.getEntities();
		Collections.sort(entities);
		for(Entity ent : entities) {
			if(!ent.getProperties().contains(ENTITY.NO_DRAW)) {
				ent.draw(bg);
			}
		}
		
		display.drawImage(buffer, 0, 0, this);
	}
}
