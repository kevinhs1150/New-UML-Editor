package shape;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

public class Port {
	private Point xy;
	private Dimension widthHeight;
		
	public Port(Point xy, Dimension widthHeight) {
		this.xy = xy;
		this.widthHeight = widthHeight;
	}
	
//	public void setPort(Point xy) {
//		this.xy = xy;
//	}
	
	public Point getXY() {
		return this.xy;
	}
	
	public void setPort(int x, int y) {
		this.xy.setLocation(x, y);
	}
	
	public void paint(Graphics g) {
		g.fillRect((int)this.xy.getX() - (int)this.widthHeight.getWidth() / 2, (int)this.xy.getY() - (int)this.widthHeight.getHeight() / 2, 
				(int)this.widthHeight.getWidth(), (int)this.widthHeight.getHeight());
	}

}
