package libproject.shapes;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class DrawDrag implements Shape {
	GeneralPath path; 
	public  DrawDrag(int CentroX, int CentroY, int w, int h, int t) {
		// t-thickness
		// h-height
		// w-width
		int x = CentroX - (w / 2);
		int y = CentroY - (h / 2);

		float x0 = x;
		float y0 = y;

		float x1 = x0 + t;
		float y1 = y;

		float x2 = x1;
		float y2 = y1 + (h / 2) - (t / 2);

		float x3 = x2 + w - (2 * t);
		float y3 = y2;

		float x4 = x3;
		float y4 = y0;

		float x5 = x4 + t;
		float y5 = y4;

		float x6 = x5;
		float y6 = y5 + h;

		float x7 = x6 - t;
		float y7 = y6;

		float x8 = x7;
		float y8 = y7 - (h / 2) + (t / 2);

		float x9 = x8 - w + (2 * t);
		float y9 = y8;

		float x10 = x9;
		float y10 = y9 + (y3 - y4);

		float x11 = x0;
		float y11 = y10;

	    path = new GeneralPath();
		path.moveTo(x0, y0);
		path.lineTo(x1, y1);
		path.lineTo(x2, y2);
		path.lineTo(x3, y3);
		path.lineTo(x4, y4);
		path.lineTo(x5, y5);
		path.lineTo(x6, y6);
		path.lineTo(x7, y7);
		path.lineTo(x8, y8);
		path.lineTo(x9, y9);
		path.lineTo(x10, y10);
		path.lineTo(x11, y11);

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
