package mode;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.util.List;

import mode.Mode;
import gui.UMLCanvas;
import shape.Shape;
import shape.UseCaseObject;

public class UseCaseMode implements Mode {
	private UMLCanvas canvas;
	private final int USECASE_WIDTH = 120;
	private final int USECASE_HEIGHT = 60;
	
	public UseCaseMode(UMLCanvas canvas) {
		this.canvas = canvas;
	}
	public void mousePressed(MouseEvent e) {
		System.out.println("in UseCaseMode: mousePressed()");
		List<Shape> container = canvas.getObjContainer();
		container.add(new UseCaseObject("testUseCase", e.getPoint(), new Dimension(USECASE_WIDTH, USECASE_HEIGHT), canvas.getObjContainer().size()));
		canvas.repaint();
	}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	public void mouseMoved(MouseEvent e) {}
	public void mouseDragged(MouseEvent e) {}
}
