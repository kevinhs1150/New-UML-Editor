package gui;


import javax.swing.JFrame;

import gui.UMLFrame;

public class UMLMain {
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
				UMLFrame frame = new UMLFrame("Kevin's UML Editor");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(640, 480);
				frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frame.createAndShowGUI();
				frame.setVisible(true);
            }
        });
	}
	
}