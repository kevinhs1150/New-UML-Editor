package shape;

import java.awt.Point;
import java.awt.Dimension;
import java.awt.Graphics;

public abstract class Shape {
	protected String name;
	protected Point xy;
	protected Dimension widthHeight;
	protected int depth;
	protected boolean isSelected;
	
	public abstract void setName(String name);
	public abstract Point getXY();
	public abstract Dimension getWidthHeight();
	public abstract void setIsSelected(boolean isSelected);
	public abstract boolean getIsSelected();
	public abstract int getDepth();
	public abstract Port [] getPortArray();
	public abstract void paint(Graphics g);
	
}