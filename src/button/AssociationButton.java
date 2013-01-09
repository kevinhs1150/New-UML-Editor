package button;

import java.awt.event.ActionEvent;

import mode.AssociationMode;
import gui.UMLCanvas;

public class AssociationButton extends Button {
	private static final long serialVersionUID = 1L;
	public AssociationButton(UMLCanvas canvas, String name) {
		super(canvas, name);
	}
	public void actionPerformed(ActionEvent e) {
		this.canvas.setCurrentMode(new AssociationMode(canvas));
	}
}
