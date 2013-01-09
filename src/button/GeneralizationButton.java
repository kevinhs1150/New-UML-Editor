package button;

import java.awt.event.ActionEvent;

import mode.GeneralizationMode;
import gui.UMLCanvas;

public class GeneralizationButton extends Button {
	private static final long serialVersionUID = 1L;
	public GeneralizationButton(UMLCanvas canvas, String name) {
		super(canvas, name);
	}
	public void actionPerformed(ActionEvent e) {
		this.canvas.setCurrentMode(new GeneralizationMode(canvas));
	}
}
