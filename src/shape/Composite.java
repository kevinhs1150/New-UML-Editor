package shape;

import java.awt.Dimension;
import java.awt.Point;
import java.util.List;

public class Composite extends Shape {
	List<Shape> container;
	public Composite(String name, Point xy, Dimension weightHeight, int depth) {
		super(name, xy, weightHeight, depth);
	}
}
