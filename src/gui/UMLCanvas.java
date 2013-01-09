package gui;

import mode.Mode;

import javax.swing.JPanel;

public class UMLCanvas extends JPanel {
	private static final long serialVersionUID = 1L;
	Mode currentMode;
	
	public UMLCanvas() {
		super();
	}
	public void setCurrentMode(Mode currentMode) {
		this.currentMode = currentMode;
	}
	
	
}
