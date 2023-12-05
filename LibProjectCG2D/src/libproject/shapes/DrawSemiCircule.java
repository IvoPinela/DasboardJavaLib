package libproject.shapes;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class DrawSemiCircule implements Shape {
	GeneralPath doubleSemicircle;

	   public DrawSemiCircule(int CentroX,int CentroY,int radius ) {
	    
	   float x, y;
	   int numSegments = 180;  // Número de segmentos para criar os semicírculos
	   float dt=(float) (180.0 /numSegments);
	   doubleSemicircle=new GeneralPath();
	   for (int i = 0; i <= numSegments; i++) {
	    	double angle = Math.toRadians((dt*i*i)/ numSegments);
	    	x = CentroX + (float) (radius * Math.cos(angle));
	    	y = CentroY - (float) (radius * Math.sin(angle));

	    if (i == 0) {
	    	        	doubleSemicircle.moveTo(x, y);
	    	        } else {
	    	        	doubleSemicircle.lineTo(x, y);
	    	        }
	    	    }
	    	    doubleSemicircle.closePath();	    
}

	@Override
	public Rectangle getBounds() {
		return doubleSemicircle.getBounds();
		
	}

	@Override
	public Rectangle2D getBounds2D() {
		return doubleSemicircle.getBounds2D();
	}

	@Override
	public boolean contains(double x, double y) {
		return doubleSemicircle.contains(x,y);
	}

	@Override
	public boolean contains(Point2D p) {
		return doubleSemicircle.contains(p);
	}

	@Override
	public boolean intersects(double x, double y, double w, double h) {
		return doubleSemicircle.intersects(x,y,w,h);
	}

	@Override
	public boolean intersects(Rectangle2D r) {
		return doubleSemicircle.intersects(r);
	}

	@Override
	public boolean contains(double x, double y, double w, double h) {
		return doubleSemicircle.contains(x,y,w,h);
	}

	@Override
	public boolean contains(Rectangle2D r) {
		return doubleSemicircle.contains(r);
	}

	@Override
	public PathIterator getPathIterator(AffineTransform at) {
		return doubleSemicircle.getPathIterator(at);
	}

	@Override
	public PathIterator getPathIterator(AffineTransform at, double flatness) {
		return doubleSemicircle.getPathIterator(at,flatness);
	}
}
