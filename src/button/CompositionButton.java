package button;

import gui.UMLCanvas;

import java.awt.event.ActionEvent;

import mode.CompositionMode;

public class CompositionButton extends Button {
	private static final long serialVersionUID = 1L;
	public CompositionButton(UMLCanvas canvas, String name) {
		super(canvas, name);
	}
	public void actionPerformed(ActionEvent e) {
		this.canvas.setCurrentMode(new CompositionMode(canvas));
	}
}
