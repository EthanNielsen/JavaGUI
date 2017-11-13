package gui.view;

import javax.swing.JPanel;
import gui.controller.GUIAppController;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SpringLayout;


public class GUIPanel extends JPanel
{
	private GUIAppController appController;
	private JButton firstButton;
	private SpringLayout appLayout;
	
	public GUIPanel(GUIAppController appController)
	{
		super();
		this.appController = appController;
		firstButton = new JButton("Click on the button");
		appLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
	}
	
	/**
	 * Used to add all components to the screen and install a layout manager.
	 * Also set color :D
	 */
	private void setupPanel()
	{
		this.setBackground(Color.GREEN);
		this.setLayout(appLayout);
		this.add(firstButton);
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.SOUTH, firstButton, -134, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, firstButton, -135, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		
	}
}
