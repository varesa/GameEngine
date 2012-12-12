/**
 * This code is created by:
 * @author Esa Varemo (2012-2013)
 * It is released with license: 
 * @license This work is licensed under a Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License.
 *          View it at: http://creativecommons.org/licenses/by-nc-sa/3.0/
 */

package fi.dy.esav.GameEngine;

import fi.dy.esav.GameEngine.enums.ENTITY;

public class RenderThread implements Runnable{
	
	private GameEngine engine;
	
	private int FPS = 30;
	
	/** 
	 * Disabled default constructor
	 */
	@SuppressWarnings("unused")
	private RenderThread() {}
	
	/**
	 * Constructor
	 * @param engine Engine to get the stage, entities & etc. from
	 */
	public RenderThread(GameEngine engine) {
		this.engine = engine;
	}

	@Override
	public void run() {
		long oldTime = System.currentTimeMillis();
		while(true) {
			for(Entity ent : engine.getEntities()) {
				if(!ent.getProperties().contains(ENTITY.NO_ACT)) {
					ent.act();
				}
			}
			engine.getStage().repaint();
			if(System.currentTimeMillis() < oldTime + 1000/FPS) {
				try {
					Thread.sleep(oldTime + 1000/FPS - System.currentTimeMillis());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			oldTime = System.currentTimeMillis();
		}
	}
	
}
