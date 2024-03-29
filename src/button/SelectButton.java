package button;

import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import gui.UMLCanvas;
import mode.SelectMode;

public class SelectButton extends Button {
	private static final long serialVersionUID = 1L;
	public SelectButton(UMLCanvas canvas, JPanel buttonPanel, String name) {
		super(canvas, buttonPanel, name);
		this.setIcon(new ImageIcon("res/select.gif"));
	}
	public void actionPerformed(ActionEvent e) {
		super.actionPerformed(e);
		this.canvas.setCurrentMode(new SelectMode(canvas));
	}
}
