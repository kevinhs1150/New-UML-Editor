package menu;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.util.List;

import shape.Composite;
import shape.Shape;

import gui.UMLCanvas;

public class GroupMenuItem extends MenuItem {
	private static final long serialVersionUID = 1L;

	public GroupMenuItem(UMLCanvas canvas, String name) {
		super(canvas, name);
	}

	public void actionPerformed(ActionEvent e) {
		int leftTopX = 0, leftTopY = 0;
		int rightDownX = 0, rightDownY = 0 ;
		final int OFFSET = 10;
		
		List<Shape> container = canvas.getObjContainer();

		Composite group = new Composite("test_Group", new Point(), new Dimension(), container.size());
		container.add(group);
		for(Shape object : container) {
			if(object.getIsSelected() == true) {
				if(leftTopX == 0 || object.getXY().getX() < leftTopX) {
					leftTopX = (int)object.getXY().getX();
				}
				if(leftTopY == 0 || object.getXY().getY() < leftTopY) {
					leftTopY = (int)object.getXY().getY();
				}
				if(rightDownX == 0 || (object.getXY().getX() + object.getWidthHeight().getWidth()) > rightDownX) {
					rightDownX = (int) (object.getXY().getX() + object.getWidthHeight().getWidth());
				}
				if(rightDownY == 0 || (object.getXY().getY() + object.getWidthHeight().getHeight()) > rightDownY) {
					rightDownY = (int) (object.getXY().getY() + object.getWidthHeight().getHeight());
				}
				group.addObject(object);
			}
		}
		group.getXY().setLocation(leftTopX - OFFSET, leftTopY - OFFSET);
		group.getWidthHeight().setSize(rightDownX - leftTopX + OFFSET + OFFSET, rightDownY - leftTopY + OFFSET + OFFSET);
		canvas.repaint();
	}

}
