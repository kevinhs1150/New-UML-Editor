package button;

import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import mode.GeneralizationMode;
import gui.UMLCanvas;

public class GeneralizationButton extends Button {
	private static final long serialVersionUID = 1L;
	public GeneralizationButton(UMLCanvas canvas, JPanel buttonPanel, String name) {
		super(canvas, buttonPanel, name);
		this.setIcon(new ImageIcon("res/generalization.gif"));
	}
	public void actionPerformed(ActionEvent e) {
		super.actionPerformed(e);
		this.canvas.setCurrentMode(new GeneralizationMode(canvas));
	}
}
