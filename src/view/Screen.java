package view;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.SoftBevelBorder;

//import user_controller.Screen_logic;

public class Screen{
	public JPanel panel1;
	public JTextField field1;
	public JTextField field2;
	public JTextField field3;
	protected String calculate;
	public String status;
	protected String answer;
	protected Screen() {
		panel1 =new JPanel();
		field1 =new JTextField();
		field2 =new JTextField();
		field3 =new JTextField();
		calculate = "";
		status ="off";
		answer ="";
	}
	public void display_Screen(JFrame frame) {
		panel1.setSize(frame.getWidth()-30,frame.getHeight()/4);
		panel1.setBackground(Color.gray);
		SoftBevelBorder border = new SoftBevelBorder(SoftBevelBorder.LOWERED, Color.white, Color.white);
		panel1.setBorder(border);
		panel1.setLocation(5, 8);
		set_field1();
		set_field2();
		set_field3();
		add_textField(field1);
		add_textField(field2);
		add_textField(field3);
	}
	public void set_field1() {
		field1.setEditable(false);
		
		field1.setText("Power "+ status);
		field1.setBounds(0, 0, panel1.getWidth(), panel1.getHeight()/4);
		if(status=="on") {
			field1.setVisible(false);
		}
		field1.repaint();
		panel1.repaint();
		
	}
	private void add_textField(JTextField field) {
		panel1.add(field);
	}
	private void set_field2() {
		field2.setEditable(false);
		field2.setText(calculate);
		field2.setBorder(null);
		field2.setHorizontalAlignment(JTextField.RIGHT);
		field2.setBounds(0, 28, panel1.getWidth(), panel1.getHeight()/2);
		
	}
	private void set_field3() {
		field3.setEditable(false);
		field3.setText(answer);
		field3.setHorizontalAlignment(JTextField.RIGHT);
		field3.setBounds(0, 80, panel1.getWidth(), panel1.getHeight()/3);
		
	}
	
}
