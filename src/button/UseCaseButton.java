package button;

import java.awt.event.ActionEvent;

import mode.UseCaseMode;
import gui.UMLCanvas;

public class UseCaseButton extends Button {
	private static final long serialVersionUID = 1L;
	public UseCaseButton(UMLCanvas canvas, String name) {
		super(canvas, name);
	}
	public void actionPerformed(ActionEvent e) {
		this.canvas.setCurrentMode(new UseCaseMode(canvas));
	}
}
