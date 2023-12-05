package libproject.utilities;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ProjectFunction {
	
	public static void drawCenteredText(Graphics2D g2,Font font, FontRenderContext frc,String text,int x,int y) {
		Rectangle2D r=font.getStringBounds(text, frc);
		g2.drawString(text,(int)(x-r.getWidth()/2.0),y);
	}
	public static BufferedImage getImage(Object o,String imageFileName) {
		BufferedImage bi =null;
		URL url= null;
		url=o.getClass().getClassLoader().getResource(imageFileName);
		try {
			bi=ImageIO.read(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bi;
		
	}
}
