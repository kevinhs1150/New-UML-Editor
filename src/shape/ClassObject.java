package shape;

import java.awt.Point;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;

public class ClassObject extends BasicObject{
	public ClassObject(String name, Point xy, Dimension widthHeight, int depth) {
		super(name, xy, widthHeight, depth);
	}
	public void paint(Graphics g) {
		System.out.println("Class Paint!");
		super.paint(g);
		g.setColor(Color.BLACK);
		g.drawRect((int)this.xy.getX(),(int) this.xy.getY(), (int)this.widthHeight.getWidth(), (int)this.widthHeight.getHeight());
		g.drawLine((int)this.xy.getX(), (int)this.xy.getY() + (int)this.widthHeight.getHeight() / 3, (int)this.xy.getX() + (int)this.widthHeight.getWidth(), (int)this.xy.getY() + (int)this.widthHeight.getHeight() / 3);
		g.drawLine((int)this.xy.getX(), (int)this.xy.getY() + (int)this.widthHeight.getHeight() * 2 / 3, (int)this.xy.getX() + (int)this.widthHeight.getWidth(), (int)this.xy.getY() + (int)this.widthHeight.getHeight() * 2 / 3);
		g.drawString(this.name, (int)this.xy.getX() + (int)this.widthHeight.getWidth() / 3, (int)this.xy.getY() + 10);
	}
}
