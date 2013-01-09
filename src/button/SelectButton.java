package button;

import java.awt.event.ActionEvent;

import gui.UMLCanvas;
import mode.SelectMode;

public class SelectButton extends Button {
	private static final long serialVersionUID = 1L;
	public SelectButton(UMLCanvas canvas, String name) {
		super(canvas, name);
	}
	public void actionPerformed(ActionEvent e) {
		this.canvas.setCurrentMode(new SelectMode(canvas));
	}
}
