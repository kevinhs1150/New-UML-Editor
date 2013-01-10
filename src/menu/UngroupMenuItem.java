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
			container.get(i).ungroup(container);
		}
		
//		for(Shape object : container) {
//			if(object.getIsSelected() == true) {
//				object.ungroup(container);
//			}
//		}
		
		canvas.repaint();
	}

}
