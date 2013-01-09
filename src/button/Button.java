package button;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import gui.UMLCanvas;

public abstract class Button extends JButton implements ActionListener {
	private static final long serialVersionUID = 1L;
	protected UMLCanvas canvas;
	
	public Button(UMLCanvas canvas, String name) {
		super(name);
		this.canvas = canvas;
		this.addActionListener(this);
		this.setBackground(Color.LIGHT_GRAY);
	}
	public void actionPerformed(ActionEvent e) {
	}
}
