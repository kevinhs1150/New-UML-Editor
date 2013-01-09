package shape;

import java.awt.Point;
import java.awt.Dimension;
import java.awt.Graphics;

import shape.Port;

public abstract class BasicObject extends Shape {
	private final int NUM_OF_PORT = 4;
	private final int PORT_WIDTH = 10;
	private final int PORT_HEIGHT = PORT_WIDTH;
	protected Port [] portArray;
	
	public BasicObject(String name, Point xy, Dimension widthHeight, int depth) {
		this.name = name;
		this.xy = xy;
		this.widthHeight = widthHeight;
		this.depth = depth;
		
		portArray = new Port[NUM_OF_PORT];
		for(int i = 0;i < 4;i++) {
			portArray[i] = new Port(new Point(xy), new Dimension(PORT_WIDTH, PORT_HEIGHT));
		}
	}
	
	public Point getXY() {
		return xy;
	}
	
	public Dimension getWidthHeight() {
		return widthHeight;
	}
	
	public void setIsSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}
	
	public boolean getIsSelected() {
		return isSelected;
	}
	
	public int getDepth() {
		return this.depth;
	}
	
	public Port [] getPortArray() {
		return this.portArray;
	}

	public void updatePortArray() {
		portArray[0].setPort((int)this.xy.getX() + (int)this.widthHeight.getWidth() / 2, (int)this.xy.getY());
		portArray[1].setPort((int)this.xy.getX() + (int)this.widthHeight.getWidth() / 2, (int)this.xy.getY() + (int)this.widthHeight.getHeight());
		portArray[2].setPort((int)this.xy.getX(), (int)this.xy.getY() + (int)this.widthHeight.getHeight() / 2);
		portArray[3].setPort((int)this.xy.getX() + (int)this.widthHeight.getWidth(), (int)this.xy.getY() + (int)this.widthHeight.getHeight() / 2);
	}
	
	public void paint(Graphics g)
	{
		System.out.println("BasicObject Paint!");
		updatePortArray();
		if (isSelected == true) {
			for(Port port : portArray) {
				port.paint(g);
			}
		}
	}
}
