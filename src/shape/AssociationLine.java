package shape;

import java.awt.Graphics;

public class AssociationLine extends LineObject {

	public AssociationLine(Port port1, Port port2) {
		super(port1, port2);
	}

	public void paint(Graphics g) {
		System.out.println("AssociationLine paint!");
		g.drawLine((int)port1.getXY().getX(), (int)port1.getXY().getY()
				, (int)port2.getXY().getX(), (int)port2.getXY().getY());
	}
}
