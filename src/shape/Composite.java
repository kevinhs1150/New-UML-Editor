package shape;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Composite extends Shape {
	List<Shape> objContainer;
	private Port [] portArray;
	private final int NUM_OF_PORT = 4;
	
	public Composite(String name, Point xy, Dimension widthHeight, int depth) {
		this.name = name;
		this.xy = xy;
		this.widthHeight = widthHeight;
		this.depth = depth;
		this.objContainer = new ArrayList<Shape>();
		
		this.portArray = new Port[NUM_OF_PORT];
		for(int i = 0;i < 4;i++) {
			this.portArray[i] = new Port(new Point(xy));
		}
	}
	
	public void addObject(Shape object) {
		this.objContainer.add(object);
	}
	public List<Shape> getobjContainer() {
		return this.objContainer;
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

	public Port[] getPortArray() {
		return this.portArray;
	}
	
	public void updatePortArray() {
		this.portArray[0].setPort((int)this.xy.getX() + (int)this.widthHeight.getWidth() / 2, (int)this.xy.getY());
		this.portArray[1].setPort((int)this.xy.getX() + (int)this.widthHeight.getWidth() / 2, (int)this.xy.getY() + (int)this.widthHeight.getHeight());
		this.portArray[2].setPort((int)this.xy.getX(), (int)this.xy.getY() + (int)this.widthHeight.getHeight() / 2);
		this.portArray[3].setPort((int)this.xy.getX() + (int)this.widthHeight.getWidth(), (int)this.xy.getY() + (int)this.widthHeight.getHeight() / 2);
	}
	
	public void paint(Graphics g) {
		System.out.println("Composite Paint!");
		
		g.drawRect((int)this.xy.getX(), (int)this.xy.getY(), (int)this.widthHeight.getWidth(), (int)this.widthHeight.getHeight());
		g.drawString(this.name, (int)this.xy.getX() + (int)this.widthHeight.getWidth() / 3, (int)this.xy.getY() + 10);
		
		updatePortArray();
		if (this.isSelected == true) {
			for(Port port : this.portArray) {
				port.paint(g);
			}
		}
	}

	public void translate(int dx, int dy) {
		this.xy.setLocation(this.xy.getX() + dx, this.xy.getY() + dy);
		for(Shape object : this.objContainer) {
			object.getXY().setLocation(object.getXY().getX() + dx, object.getXY().getY() + dy);
		}
	}

	public void ungroup(List<Shape> container) {
		container.remove(this);
	}
}
