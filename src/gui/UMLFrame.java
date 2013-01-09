package gui;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;

import button.SelectButton;
import button.UseCaseButton;

public class UMLFrame extends JFrame implements ActionListener {
	private UMLCanvas canvasPanel;
	private SelectButton selectButton;
	private UseCaseButton useCaseButton;
	
	public UMLFrame() {
		super();
	}
	public UMLFrame(String title) {
		super(title);
	}
	public void createAndShowGUI() {
		BorderLayout panelLayout = new BorderLayout();
		this.setLayout(panelLayout);
		
		JPanel buttonPanel = new JPanel();
		this.canvasPanel = new UMLCanvas();
		JMenuBar menuBar = new JMenuBar();
		
		this.canvasPanel.setBackground(Color.WHITE);
		
		this.add(menuBar, BorderLayout.NORTH);
		this.add(buttonPanel, BorderLayout.WEST);
		this.add(new JLabel("UML Editor"), BorderLayout.SOUTH);
		this.add(this.canvasPanel, BorderLayout.CENTER);
		
		GridLayout buttonLayout = new GridLayout(6, 1);
		buttonPanel.setLayout(buttonLayout);
		
		this.selectButton = new SelectButton(this.canvasPanel, "Select");
		// associationButton = new JButton("Association Line");
		// generaliztionButton = new JButton("Generaliztion Line");
		// compositionButton = new JButton("Composition Line");
		// classButton = new JButton("Class");
		this.useCaseButton = new UseCaseButton(this.canvasPanel, "Use Case");
		
		buttonPanel.add(this.selectButton);
		// buttonPanel.add(associationButton);
		// buttonPanel.add(generaliztionButton);
		// buttonPanel.add(compositionButton);
		// buttonPanel.add(classButton);
		buttonPanel.add(this.useCaseButton);
		
		//set menubar
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		JMenuItem groupMenuItem = new JMenuItem("Group");
		JMenuItem ungroupMenuItem = new JMenuItem("Ungroup");
		JMenuItem editMenuItem = new JMenuItem("Edit");
		editMenu.add(groupMenuItem);
		editMenu.add(ungroupMenuItem);
		editMenu.add(editMenuItem);
		
		// groupMenuItem.addActionListener(canvasPanel);
		// groupMenuItem.setActionCommand("groupMenuItemClicked");
		// ungroupMenuItem.addActionListener(canvasPanel);
		// ungroupMenuItem.setActionCommand("ungroupMenuItemClicked");
		// editMenuItem.addActionListener(canvasPanel);
		// editMenuItem.setActionCommand("editMenuItemClicked");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
