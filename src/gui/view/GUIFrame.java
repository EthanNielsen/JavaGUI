package gui.view;

import gui.controller.GUIAppController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class GUIFrame extends JFrame
{
	private GUIAppController appController;
	private GUIPanel appPanel;
	
	public GUIFrame(GUIAppController appController)
	{
		super();
		this.appController = appController;
		this.appPanel = new GUIPanel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("I'm a Window Title");
		this.setSize(500, 500);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	private void setupListeners()
	{
		
	}
	
	
}
