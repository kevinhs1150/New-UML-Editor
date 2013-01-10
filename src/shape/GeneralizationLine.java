package shape;

import java.awt.Graphics;

public class GeneralizationLine extends LineObject {
	private final double ARROW_HEIGHT = 20;
	private final double ARRIW_BOTTOM = ARROW_HEIGHT;
	
	public GeneralizationLine(Shape object1, Shape object2) {
		super(object1, object2);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		System.out.println("GeneralizationLine paint!");
		drawGL((int)selectedPort1.getXY().getX(), (int)selectedPort1.getXY().getY()
				, (int)selectedPort2.getXY().getX(), (int)selectedPort2.getXY().getY(), g);
	}
	
	public void drawGL(int sx, int sy, int ex, int ey, Graphics g)
	{
		double H = ARROW_HEIGHT;
		double L = ARRIW_BOTTOM;
		int x3 = 0;
		int y3 = 0;
		int x4 = 0;
		int y4 = 0;
		int x5 = 0;
		int y5 = 0;

		double awrad = Math.atan(L / H);
		double arraow_len = Math.sqrt(L * L + H * H);

		double[] arrXY_1 = rotateVec(ex - sx, ey - sy, awrad, true, arraow_len);
		double[] arrXY_2 = rotateVec(ex - sx, ey - sy, -awrad, true, arraow_len);
		double[] arrXY_3 = rotateVec(ex - sx, ey - sy, 0, true, H);

		double x_3 = ex - arrXY_1[0];
		double y_3 = ey - arrXY_1[1];
		double x_4 = ex - arrXY_2[0];
		double y_4 = ey - arrXY_2[1];

		double x_5 = ex - arrXY_3[0];
		double y_5 = ey - arrXY_3[1];

		Double X3 = new Double(x_3);
		x3 = X3.intValue();
		Double Y3 = new Double(y_3);
		y3 = Y3.intValue();
		Double X4 = new Double(x_4);
		x4 = X4.intValue();
		Double Y4 = new Double(y_4);
		y4 = Y4.intValue();

		Double X5 = new Double(x_5);
		x5 = X5.intValue();
		Double Y5 = new Double(y_5);
		y5 = Y5.intValue();

		g.drawLine(sx, sy, x5, y5);
		g.drawLine(ex, ey, x3, y3);
		g.drawLine(ex, ey, x4, y4);

		g.drawLine(x3, y3, x4, y4);
	}
	
	private double[] rotateVec(int px, int py, double ang, boolean isChLen, double newLen)
	{
		double mathstr[] = new double[2];
		double vx = px * Math.cos(ang) - py * Math.sin(ang);
		double vy = px * Math.sin(ang) + py * Math.cos(ang);
		if (isChLen)
		{
			double d = Math.sqrt(vx * vx + vy * vy);
			vx = vx / d * newLen;
			vy = vy / d * newLen;
			mathstr[0] = vx;
			mathstr[1] = vy;
		}
		return mathstr;
	}

}
