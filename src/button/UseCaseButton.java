package button;

import java.awt.event.ActionEvent;

import javax.swing.JPanel;

import mode.UseCaseMode;
import gui.UMLCanvas;

public class UseCaseButton extends Button {
	private static final long serialVersionUID = 1L;
	public UseCaseButton(UMLCanvas canvas, JPanel buttonPanel, String name) {
		super(canvas, buttonPanel, name);
	}
	public void actionPerformed(ActionEvent e) {
		super.actionPerformed(e);
		this.canvas.setCurrentMode(new UseCaseMode(canvas));
	}
}
