package button;

import java.awt.event.ActionEvent;

import mode.ClassMode;
import gui.UMLCanvas;

public class ClassButton extends Button {
	private static final long serialVersionUID = 1L;
	public ClassButton(UMLCanvas canvas, String name) {
		super(canvas, name);
	}
	public void actionPerformed(ActionEvent e) {
		this.canvas.setCurrentMode(new ClassMode(canvas));
	}
}
