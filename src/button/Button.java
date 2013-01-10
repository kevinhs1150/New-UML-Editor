package button;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;

import gui.UMLCanvas;

public class Button extends JButton implements ActionListener {
	private static final long serialVersionUID = 1L;
	protected UMLCanvas canvas;
	protected JPanel buttonPanel;
	
	public Button(UMLCanvas canvas, JPanel buttonPanel, String name) {
		super(name);
		this.canvas = canvas;
		this.buttonPanel = buttonPanel;
		this.addActionListener(this);
		this.setBackground(Color.LIGHT_GRAY);
	}
	public void actionPerformed(ActionEvent e) {
		for(Component button : buttonPanel.getComponents() ){
			button.setBackground(Color.LIGHT_GRAY);
			button.setForeground(Color.BLACK);
		}
		this.setBackground(Color.BLACK);
		this.setForeground(Color.WHITE);
	}
}
