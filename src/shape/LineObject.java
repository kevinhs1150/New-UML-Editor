package shape;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.List;

public class LineObject extends Shape {
	protected Shape object1;
	protected Shape object2;
	protected Port selectedPort1;
	protected Port selectedPort2;
	
	public LineObject(Shape object1, Shape object2) {
		this.object1 = object1;
		this.object2 = object2;
	}
	
	protected void chooseConnectionPorts() {
		Port [] portArray1 = this.object1.getPortArray();
		Port [] portArray2 = this.object2.getPortArray();
		
		int minDistSquare = 0;
		selectedPort1 = portArray1[0];
		selectedPort2 = portArray2[0];
		
		for(Port port1 : portArray1) {
			for(Port port2 : portArray2) {
				int dist = (int) ((port1.getXY().getX() - port2.getXY().getX()) * (port1.getXY().getX() - port2.getXY().getX())
					+ (port1.getXY().getY() - port2.getXY().getY()) * (port1.getXY().getY() - port2.getXY().getY()));
				if(minDistSquare == 0 || dist < minDistSquare) {
					minDistSquare = dist;
					selectedPort1 = port1;
					selectedPort2 = port2;
				}
			}
		}
	}
	
	public void setName(String name) {
	}
	
	public Point getXY() {
		return new Point(0, 0);
	}

	public Dimension getWidthHeight() {
		return new Dimension(0, 0);
	}

	public void setWidthHeight(int width, int height) {
	}
	
	public void setIsSelected(boolean isSelected) {
	}

	public int getDepth() {
		return -1;
	}

	public Port[] getPortArray() {
		return null;
	}

	public boolean getIsSelected() {
		return false;
	}
	
	public void translate(int dx, int dy) {
	}
	
	public void ungroup(List<Shape> container) {
	}
	
	public void paint(Graphics g) {
		System.out.println("LineObject paint!");
		chooseConnectionPorts();
	}

	
}
