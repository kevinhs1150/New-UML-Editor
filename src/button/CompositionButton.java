package button;

import gui.UMLCanvas;

import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import mode.CompositionMode;

public class CompositionButton extends Button {
	private static final long serialVersionUID = 1L;
	public CompositionButton(UMLCanvas canvas, JPanel buttonPanel, String name) {
		super(canvas, buttonPanel, name);
		this.setIcon(new ImageIcon("res/composition.gif"));
	}
	public void actionPerformed(ActionEvent e) {
		super.actionPerformed(e);
		this.canvas.setCurrentMode(new CompositionMode(canvas));
	}
}
