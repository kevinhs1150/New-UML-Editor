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

import button.AssociationButton;
import button.ClassButton;
import button.CompositionButton;
import button.GeneralizationButton;
import button.SelectButton;
import button.UseCaseButton;

public class UMLFrame extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
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
		UMLCanvas canvasPanel = new UMLCanvas();
		JMenuBar menuBar = new JMenuBar();
		
		canvasPanel.setBackground(Color.WHITE);
		
		this.add(menuBar, BorderLayout.NORTH);
		this.add(buttonPanel, BorderLayout.WEST);
		this.add(new JLabel("UML Editor"), BorderLayout.SOUTH);
		this.add(canvasPanel, BorderLayout.CENTER);
		
		GridLayout buttonLayout = new GridLayout(6, 1);
		buttonPanel.setLayout(buttonLayout);
		
		SelectButton selectButton = new SelectButton(canvasPanel, "Select");
		AssociationButton associationButton = new AssociationButton(canvasPanel, "Association Line");
		GeneralizationButton generaliztionButton = new GeneralizationButton(canvasPanel, "Generaliztion Line");
		CompositionButton compositionButton = new CompositionButton(canvasPanel, "Composition Line");
		ClassButton classButton = new ClassButton(canvasPanel, "Class");
		UseCaseButton useCaseButton = new UseCaseButton(canvasPanel, "Use Case");
		
		buttonPanel.add(selectButton);
		buttonPanel.add(associationButton);
		buttonPanel.add(generaliztionButton);
		buttonPanel.add(compositionButton);
		buttonPanel.add(classButton);
		buttonPanel.add(useCaseButton);
		
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
