package mode;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.List;

import shape.GeneralizationLine;
import shape.Shape;

import mode.Mode;
import gui.UMLCanvas;

public class GeneralizationMode implements Mode {
	private UMLCanvas canvas;
	private Point mousePress;
	private Point mouseRelease;
	
	public GeneralizationMode(UMLCanvas canvas) {
		this.canvas = canvas;
		mousePress = new Point();
		mouseRelease = new Point();
	}
	public void mousePressed(MouseEvent e) {
		mousePress.setLocation(e.getPoint());
	}
	public void mouseReleased(MouseEvent e) {
		mouseRelease.setLocation(e.getPoint());
		List<Shape> container = canvas.getObjContainer();
		Shape object1 = canvas.getObjectOfLocation(mousePress);
		Shape object2 = canvas.getObjectOfLocation(mouseRelease);
		if( object1 != null && object2 != null ) {
			container.add(new GeneralizationLine(object1, object2));
			canvas.repaint();
		}
	}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	public void mouseMoved(MouseEvent e) {}
	public void mouseDragged(MouseEvent e) {}
}
