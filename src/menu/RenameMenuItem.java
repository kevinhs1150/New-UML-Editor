package menu;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import shape.Shape;
import gui.UMLCanvas;

public class RenameMenuItem extends MenuItem {
	private static final long serialVersionUID = 1L;

	public RenameMenuItem(UMLCanvas canvas, String name) {
		super(canvas, name);
	}

	public void actionPerformed(ActionEvent e) {
		String objectName = JOptionPane.showInputDialog("Rename it!");
		if(objectName != null) {
			for(Shape object : canvas.getObjContainer()) {
				if(object.getIsSelected() == true) {
					object.setName(objectName);
				}
			}
		}
		canvas.repaint();
	}

}
