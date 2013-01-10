package button;

import java.awt.event.ActionEvent;

import javax.swing.JPanel;

import mode.ClassMode;
import gui.UMLCanvas;

public class ClassButton extends Button {
	private static final long serialVersionUID = 1L;
	public ClassButton(UMLCanvas canvas, JPanel buttonPanel, String name) {
		super(canvas, buttonPanel, name);
	}
	public void actionPerformed(ActionEvent e) {
		super.actionPerformed(e);
		this.canvas.setCurrentMode(new ClassMode(canvas));
	}
}
