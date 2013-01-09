package fi.dy.esav.GameEngine;

import java.awt.Point;

public class Utils {
	
	/**
	 * Calculates the distance between the closest corners of objects
	 * @return The distance between corners
	 */
	public double getDistanceCorners(Entity ent1, Entity ent2) {
		throw new UnsupportedOperationException("This feature is not yet implemented"); // TODO: Implement!
	}
	
	/**
	 * Calculates the distance between the centerpoints of objects
	 * @return The distance between centerpoints
	 */
	public double getDistanceCenters(Entity ent1, Entity ent2) {
		return Point.distance(ent1.x+(ent1.getWidth()/2), ent1.y+(ent1.getHeight()/2), ent2.x+(ent2.getWidth()/2), ent2.y+(ent2.getHeight()/2));
	}
	
	/**
	 * Calculates the distance between the closest corners of objects on the X axis
	 * @return The distance between closest corners on the X axis
	 */
	public double getXDistanceCorners(Entity ent1, Entity ent2) {
		throw new UnsupportedOperationException("This feature is not yet implemented"); // TODO: Implement!
	}
	
	/**
	 * Calculates the distance between the centerpoints of objects on the X axis
	 * @return The distance between centerpoints on the X axis
	 */
	public double getXDistanceCenters(Entity ent1, Entity ent2) {
		return Point.distance(ent1.x+(ent1.getWidth()/2), 0, ent2.x+(ent2.getWidth()/2), 0);
	}
	
	/**
	 * Calculates the distance between the closest corners of objects on the X axis
	 * @return The distance between closest corners on the X axis
	 */
	public double getYDistanceCorners(Entity ent1, Entity ent2) {
		throw new UnsupportedOperationException("This feature is not yet implemented"); // TODO: Implement!
	}
	
	/**
	 * Calculates the distance between the centerpoints of objects on the Y axis
	 * @return The distance between centerpoints on the Y axis
	 */
	public double getYDistanceCenters(Entity ent1, Entity ent2) {
		return Point.distance(0, ent1.y+(ent1.getHeight()/2), 0, ent2.y+(ent2.getHeight()/2));
	}
}
