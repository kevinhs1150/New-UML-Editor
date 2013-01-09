package mode;

import java.awt.event.MouseEvent;

import mode.Mode;
import gui.UMLCanvas;

public class CompositionMode implements Mode {
	private UMLCanvas canvas;
	
	public CompositionMode(UMLCanvas canvas) {
		this.canvas = canvas;
	}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	public void mouseMoved(MouseEvent e) {}
	public void mouseDragged(MouseEvent e) {}
}
