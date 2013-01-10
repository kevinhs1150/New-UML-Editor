package shape;

import java.awt.Graphics;

public class AssociationLine extends LineObject {
	public AssociationLine(Shape object1, Shape object2) {
		super(object1, object2);
	}

	public void paint(Graphics g) {
		super.paint(g);
		System.out.println("AssociationLine paint!");
		g.drawLine((int)selectedPort1.getXY().getX(), (int)selectedPort1.getXY().getY()
				, (int)selectedPort2.getXY().getX(), (int)selectedPort2.getXY().getY());
	}
}
