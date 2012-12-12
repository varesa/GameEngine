package fi.dy.esav.GameEngine;

public class RenderThread implements Runnable{
	
	private GameEngine engine;
	
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
		// TODO Auto-generated method stub
		
	}
	
}
