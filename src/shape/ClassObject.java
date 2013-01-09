package shape;

import java.awt.Point;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;

public class ClassObject extends BasicObject{
	public ClassObject(String name, Point xy, Dimension weightHeight, int depth) {
		super(name, xy, weightHeight, depth);
	}
	public void paint(Graphics g) {
		System.out.println("Class Paint!");
		g.setColor(Color.BLACK);
		g.drawRect((int)this.xy.getX(),(int) this.xy.getY(), (int)this.weightHeight.getWidth(), (int)this.weightHeight.getHeight());
		g.drawLine((int)this.xy.getX(), (int)this.xy.getY() + (int)this.weightHeight.getHeight() / 3, (int)this.xy.getX() + (int)this.weightHeight.getWidth(), (int)this.xy.getY() + (int)this.weightHeight.getHeight() / 3);
		g.drawLine((int)this.xy.getX(), (int)this.xy.getY() + (int)this.weightHeight.getHeight() * 2 / 3, (int)this.xy.getX() + (int)this.weightHeight.getWidth(), (int)this.xy.getY() + (int)this.weightHeight.getHeight() * 2 / 3);
		g.drawString(this.name, (int)this.xy.getX() + (int)this.weightHeight.getWidth() / 3, (int)this.xy.getY() + 10);
	}
}
