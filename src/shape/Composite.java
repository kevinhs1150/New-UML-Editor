package shape;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Composite extends Shape {
	List<Shape> container;
	public Composite(String name, Point xy, Dimension weightHeight, int depth) {
		container = new ArrayList<Shape>();
	}
		
	public void paint(Graphics g) {
	}

	public Point getXY() {
		return null;
	}

	public Dimension getWidthHeight() {
		return null;
	}

	public void setWidthHeight(int width, int height) {
		
	}

	public void setIsSelected(boolean isSelected) {
		
	}

	public int getDepth() {
		return 0;
	}

	@Override
	public Port[] getPortArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getIsSelected() {
		// TODO Auto-generated method stub
		return false;
	}
}
