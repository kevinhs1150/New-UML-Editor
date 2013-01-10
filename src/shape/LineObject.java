package shape;

//import java.awt.Dimension;
import java.awt.Dimension;
import java.awt.Graphics;
//import java.lang.Math;
//
//import shape.BasicObject;
import java.awt.Point;

public class LineObject extends Shape {
	protected Port port1;
	protected Port port2;
	
	public LineObject(Port port1, Port port2) {
		this.port1 = port1;
		this.port2 = port2;
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
	
	public void paint(Graphics g) {
		System.out.println("LineObject paint!");
		g.drawLine((int)port1.getXY().getX(), (int)port1.getXY().getY()
				, (int)port2.getXY().getX(), (int)port2.getXY().getY());
	}

	
}
