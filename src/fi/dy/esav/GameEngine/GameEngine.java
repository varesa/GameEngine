package fi.dy.esav.GameEngine;

import java.util.ArrayList;

public class GameEngine {
	
	ArrayList<Entity> entities = new ArrayList<Entity>();
	Stage stage;
	
	
	/**
	 * Constructor method.
	 */
	public GameEngine() {
		
	}
	
	/**
	 * @return the stage
	 */
	public Stage getStage() {
		return stage;
	}


	/**
	 * @param stage the stage to set
	 */
	public void setStage(Stage stage) {
		this.stage = stage;
	}

	
}
