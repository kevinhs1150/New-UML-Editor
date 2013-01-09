package gui;

import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import mode.Mode;
import shape.Shape;

import javax.swing.JPanel;

public class UMLCanvas extends JPanel {
	private static final long serialVersionUID = 1L;
	private Mode currentMode;
	private List<Shape> objContainer;
	
	public UMLCanvas() {
		super();
		objContainer = new ArrayList<Shape>();
	}
	
	public void setCurrentMode(Mode currentMode) {
		System.out.println("in UMLCanvas: setCurrentMode()");
		this.removeMouseListener(this.currentMode);
		this.removeMouseMotionListener(this.currentMode);
		this.currentMode = currentMode;
		this.addMouseListener(this.currentMode);
		this.addMouseMotionListener(this.currentMode);
	}
	
	public List<Shape> getObjContainer() {
		return this.objContainer;
	}
	
	public Shape getObjectOfLocation(Point point) {
		Shape objectSelected = null;
		
		for(Shape object : objContainer) {
			if(point.getX() > object.getXY().getX() && point.getY() > object.getXY().getY()
				&& point.getX() < object.getXY().getX() + object.getWidthHeight().getWidth()
				&& point.getY() < object.getXY().getY() + object.getWidthHeight().getHeight()) {
				if(objectSelected == null || object.getDepth() > objectSelected.getDepth()) {
						objectSelected = object;
				}
			}
		}
		return objectSelected;
	}
	
	public void paintComponent(Graphics g) {
		//TODO figure out why using super.paintComponent(g)
		super.paintComponent(g);
		for(Shape shape : objContainer) {
			shape.paint(g);
		}
	}
}
