package view;

import java.awt.Color;

import javax.swing.*;

//import user_controller.Calculate;

public class Display extends Screen{
	public JFrame frame;
	public Buttons buttons_panel;
	public Display(){
		frame =new JFrame ("simple calculator project");
		buttons_panel =new Buttons(frame);
		frame.setBounds(500,50,350,470);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.CYAN);;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		display_Screen(frame);
		add_panel(panel1); 
		add_panel(buttons_panel.display_buttons_panel());
		frame.repaint();
	}
	protected void add_panel(JPanel panel) {
		frame.add(panel);
		frame.repaint();
	}
	
}
