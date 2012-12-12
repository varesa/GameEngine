package fi.dy.esav.GameEngine;

import java.awt.Graphics;
import java.util.EnumSet;

import fi.dy.esav.GameEngine.enums.ENTITY;

public class Entity {
	
	private EnumSet<ENTITY> properties;
	private int x, y;
	
	/**
	 * Default constructor
	 */
	public Entity() {
		
	}
	
	
	
	/**
	 * Method that is used to draw the entity on the screen (if applicable).
	 * To be implemented by a subclass.
	 * @param g The instance of graphics to draw on.
	 */
	public void draw(Graphics g) {
		
	}

	/**
	 * Set entity special properties (overwrite)
	 * @param enumSet properties
	 */
	public void setProperties(EnumSet<ENTITY> enumSet) {
		this.properties = enumSet;
	}
	
	/**
	 * Get entity special properties
	 * @return enumSet of entity properties
	 */
	public EnumSet<ENTITY> getProperties() {
		return this.properties;
	}
	
	/**
	 * Add special properties to entity
	 * @param property Property to be set
	 */
	public void setProperty(ENTITY property) {
		this.properties.add(property);
	}
	
	/**
	 * Remove special property from entity
	 * @param property Property to be removed
	 * @return If the operation succeeded
	 */
	public boolean removeProperty(ENTITY property) {
		if(this.properties.contains(property)) {
			this.properties.remove(property);
			return true;
		}
		return false;
	}
	
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
	
}
