package menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

import gui.UMLCanvas;

public abstract class MenuItem extends JMenuItem implements ActionListener {
	private static final long serialVersionUID = 1L;
	protected UMLCanvas canvas;
	
	public MenuItem(UMLCanvas canvas, String name) {
		super(name);
		this.canvas = canvas;
		this.addActionListener(this);
	}
	
	abstract public void actionPerformed(ActionEvent e);
}
