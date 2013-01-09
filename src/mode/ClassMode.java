package mode;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.util.List;

import mode.Mode;
import gui.UMLCanvas;
import shape.Shape;
import shape.ClassObject;

public class ClassMode implements Mode {
	private final int CLASS_WIDTH = 120;
	private final int CLASS_HEIGHT = 120;
	private UMLCanvas canvas;
	
	public ClassMode(UMLCanvas canvas) {
		this.canvas = canvas;
	}
	public void mousePressed(MouseEvent e) {
		System.out.println("in ClassMode: mousePressed()");
		List<Shape> container = canvas.getObjContainer();
		container.add(new ClassObject("testClass", e.getPoint(), new Dimension(CLASS_WIDTH, CLASS_HEIGHT), canvas.getObjContainer().size()));
		canvas.repaint();
	}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	public void mouseMoved(MouseEvent e) {}
	public void mouseDragged(MouseEvent e) {}
}
