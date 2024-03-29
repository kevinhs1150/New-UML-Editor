package shape;

import java.awt.Point;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.List;

import shape.Port;

public abstract class BasicObject extends Shape {
	private final int NUM_OF_PORT = 4;
	protected Port [] portArray;
	
	public BasicObject(String name, Point xy, Dimension widthHeight, int depth) {
		this.name = name;
		this.xy = xy;
		this.widthHeight = widthHeight;
		this.depth = depth;
		
		this.portArray = new Port[NUM_OF_PORT];
		for(int i = 0;i < 4;i++) {
			this.portArray[i] = new Port(new Point(xy));
		}
		this.updatePortArray();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Point getXY() {
		return this.xy;
	}
	
	public Dimension getWidthHeight() {
		return this.widthHeight;
	}
	
	public void setIsSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}
	
	public boolean getIsSelected() {
		return this.isSelected;
	}
	
	public int getDepth() {
		return this.depth;
	}
	
	public Port [] getPortArray() {
		return this.portArray;
	}

	public void updatePortArray() {
		this.portArray[0].setPort((int)this.xy.getX() + (int)this.widthHeight.getWidth() / 2, (int)this.xy.getY());
		this.portArray[1].setPort((int)this.xy.getX() + (int)this.widthHeight.getWidth() / 2, (int)this.xy.getY() + (int)this.widthHeight.getHeight());
		this.portArray[2].setPort((int)this.xy.getX(), (int)this.xy.getY() + (int)this.widthHeight.getHeight() / 2);
		this.portArray[3].setPort((int)this.xy.getX() + (int)this.widthHeight.getWidth(), (int)this.xy.getY() + (int)this.widthHeight.getHeight() / 2);
	}
	
	public void translate(int dx, int dy) {
		this.xy.setLocation(xy.getX() + dx, xy.getY() + dy);
	}
	
	public void ungroup(List<Shape> container) {
	}
	
	public void paint(Graphics g)
	{
		System.out.println("BasicObject Paint!");
		updatePortArray();
		if (this.isSelected == true) {
			for(Port port : this.portArray) {
				port.paint(g);
			}
		}
	}
}
