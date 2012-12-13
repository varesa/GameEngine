/**
 * This code is created by:
 * @author Esa Varemo (2012-2013)
 * It is released with license: 
 * @license This work is licensed under a Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License.
 *          View it at: http://creativecommons.org/licenses/by-nc-sa/3.0/
 */

package fi.dy.esav.GameEngine;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JFrame;

import fi.dy.esav.GameEngine.enums.ENTITY;

public class Stage extends JFrame implements KeyListener, MouseListener, MouseMotionListener{
	
	/**
	 * Generated class serial version UID
	 */
	private static final long serialVersionUID = -2864189451696026929L;

	private GameEngine engine;
	
	private Image backgroundImage;
	
	/**
	 * Disabled the default constructor method
	 */
	@SuppressWarnings("unused")
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

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
