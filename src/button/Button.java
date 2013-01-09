package button;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import gui.UMLCanvas;

public abstract class Button extends JButton implements ActionListener {
	protected UMLCanvas canvas;
	
	public Button(UMLCanvas canvas, String name) {
		super(name);
		this.canvas = canvas;
		this.addActionListener(this);
		this.setBackground(Color.LIGHT_GRAY);
	}
	abstract public void actionPerformed(ActionEvent e);
}
