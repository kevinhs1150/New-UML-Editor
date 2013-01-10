package mode;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.List;

import shape.Shape;
import mode.Mode;
import gui.UMLCanvas;

public class SelectMode implements Mode {
	private UMLCanvas canvas;
	private List<Shape> container;
	private Point mousePress;
	private Point mouseMove;
	private Point mouseRelease;
	
	public SelectMode(UMLCanvas canvas) {
		this.canvas = canvas;
		this.container = canvas.getObjContainer();
		this.mousePress = new Point();
		this.mouseMove = new Point();
		this.mouseRelease = new Point();
	}
	public void mousePressed(MouseEvent e) {
		this.mousePress.setLocation(e.getPoint());
		this.mouseMove.setLocation(e.getPoint());
		
		for(Shape object : this.container) {
			object.setIsSelected(false);
		}
		
		Shape objectSelected = canvas.getObjectOfLocation(this.mousePress);
		if(objectSelected != null) {
			objectSelected.setIsSelected(true);
		}
		
		canvas.repaint();
	}
	public void mouseReleased(MouseEvent e) {
		this.mouseRelease.setLocation(e.getPoint());
	
		for(Shape object : this.container) {
			if(object.getXY().getX() > this.mousePress.getX() && object.getXY().getY() >  this.mousePress.getY()
				&& object.getXY().getX() < this.mouseRelease.getX() && object.getXY().getY() < this.mouseRelease.getY()) {
				object.setIsSelected(true);
			}
		}
		
		canvas.repaint();
	}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	public void mouseMoved(MouseEvent e) {}
	public void mouseDragged(MouseEvent e) {
		int offsetX = e.getX() - (int)this.mouseMove.getX();
		int offsetY = e.getY() - (int)this.mouseMove.getY();
		this.mouseMove.setLocation(e.getPoint());
		
		for(Shape object : this.container) {
			if(object.getIsSelected() == true) {
//				object.getXY().setLocation(basicObject1.getXY().getX() + offsetX, basicObject1.getXY().getY() + offsetY);
				object.translate(offsetX, offsetY);
			}
		}
		canvas.repaint();
	}
}
