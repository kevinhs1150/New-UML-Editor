package menu;

import java.awt.event.ActionEvent;
import java.util.List;
import shape.Shape;

import gui.UMLCanvas;

public class UngroupMenuItem extends MenuItem {

	private static final long serialVersionUID = 1L;

	public UngroupMenuItem(UMLCanvas canvas, String name) {
		super(canvas, name);
	}

	public void actionPerformed(ActionEvent e) {
		List<Shape> container = canvas.getObjContainer();
		
		for(int i = 0;i < container.size();i++) {
			if(container.get(i).getIsSelected() == true) {
				container.get(i).ungroup(container);
			}
		}
		
		canvas.repaint();
	}

}
