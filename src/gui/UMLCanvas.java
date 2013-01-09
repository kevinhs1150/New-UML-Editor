package gui;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import mode.Mode;
import shape.Shape;

import javax.swing.JPanel;

public class UMLCanvas extends JPanel {
	private static final long serialVersionUID = 1L;
	private Mode currentMode;
	
	private int numOfObjects = 0;
	private List<Shape> container;
	
	public UMLCanvas() {
		super();
		container = new ArrayList<Shape>();
	}
	public void setCurrentMode(Mode currentMode) {
		System.out.println("in UMLCanvas: setCurrentMode()");
		this.currentMode = currentMode;
		this.addMouseListener(this.currentMode);
		this.addMouseMotionListener(this.currentMode);
	}
	public void addObject(Shape Object) {
		container.add(Object);
		numOfObjects++;
		this.repaint();
	}
	public int getNumOfObjects() {
		return numOfObjects;
	}
	public void paintComponent(Graphics g) {
		//TODO figure out why using super.paintComponent(g)
		super.paintComponent(g);
		for(Shape shape : container) {
			shape.paint(g);
		}
	}
}
