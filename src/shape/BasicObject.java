package shape;

import java.awt.Point;
import java.awt.Dimension;
import java.awt.Graphics;

public abstract class BasicObject extends Shape {
	protected Port [] portArray;
	
	public BasicObject(String name, Point xy, Dimension weightHeight, int depth) {
		super(name, xy, weightHeight, depth);
		
	}
	public void paint(Graphics g)
	{
		System.out.println("BasicObject Paint!");
	}
}
