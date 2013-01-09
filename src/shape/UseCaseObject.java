package shape;

import java.awt.Point;
import java.awt.Dimension;
import java.awt.Graphics;

public class UseCaseObject extends BasicObject {
	public UseCaseObject(String name, Point xy, Dimension weightHeight, int depth) {
		super(name, xy, weightHeight, depth);
	}
	public void paint(Graphics g) {
		super.paint(g);  //draw ports
		System.out.println("UseCaseObject Paint!");
		g.drawOval((int)this.xy.getX(), (int)this.xy.getY(), (int)this.widthHeight.getWidth(), (int)this.widthHeight.getHeight());
		g.drawString(this.name, (int)this.xy.getX() + (int)this.widthHeight.getWidth() / 4, (int)this.xy.getY() + (int)this.widthHeight.getHeight() / 2);
	}
}
