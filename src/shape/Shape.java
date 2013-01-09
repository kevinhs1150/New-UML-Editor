package shape;

import java.awt.Point;
import java.awt.Dimension;
import java.awt.Graphics;

public abstract class Shape {
	protected String name;
	protected Point xy;
	protected Dimension weightHeight;
	protected int depth;
	protected boolean isSelected = false;
	
	public Shape(String name, Point xy, Dimension weightHeight, int depth) {
		this.name = name;
		this.xy = xy;
		this.weightHeight = weightHeight;
		this.depth = depth;
	}
	public void paint(Graphics g)
	{
		System.out.println("name Paint!");
	}
}