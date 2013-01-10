package button;

import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import mode.AssociationMode;
import gui.UMLCanvas;

public class AssociationButton extends Button {
	private static final long serialVersionUID = 1L;
	public AssociationButton(UMLCanvas canvas, JPanel buttonPanel, String name) {
		super(canvas, buttonPanel, name);
		this.setIcon(new ImageIcon("res/association.gif"));
	}
	public void actionPerformed(ActionEvent e) {
		super.actionPerformed(e);
		this.canvas.setCurrentMode(new AssociationMode(canvas));
	}
}
