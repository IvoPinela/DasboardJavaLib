package libproject.shapes;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class DrawGraphProfit implements Shape {
	
	GeneralPath path;
	public DrawGraphProfit(int x, int y, int[] ValuesX, int[] ValuesY) {

		path=new GeneralPath();
		path.moveTo(x, y);
		path.lineTo(x, 60);
		for (int i = 1; i < 13; i++) {
			path.lineTo(ValuesX[i], ValuesY[i]);
		}
		path.lineTo(ValuesX[12], y);
		path.closePath();
		
	}
	@Override
	public Rectangle getBounds() {
		return path.getBounds();
	}
	@Override
	public Rectangle2D getBounds2D() {
		return path.getBounds2D();
	}
	@Override
	public boolean contains(double x, double y) {
		return path.contains(x,y);
	}
	@Override
	public boolean contains(Point2D p) {
		return path.contains(p);
	}
	@Override
	public boolean intersects(double x, double y, double w, double h) {
		return path.intersects(x,y,w,h);
	}
	@Override
	public boolean intersects(Rectangle2D r) {
		return path.intersects(r);
	}
	@Override
	public boolean contains(double x, double y, double w, double h) {
		return path.contains(x,y,w,h);
	}
	@Override
	public boolean contains(Rectangle2D r) {
		return path.contains(r);
	}
	@Override
	public PathIterator getPathIterator(AffineTransform at) {
		return path.getPathIterator(at);
	}
	@Override
	public PathIterator getPathIterator(AffineTransform at, double flatness) {
		return path.getPathIterator(at,flatness);
	}
	
	

}
