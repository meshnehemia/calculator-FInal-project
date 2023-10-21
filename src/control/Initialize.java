package control;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import model.Calculate;
import model.filter_calculate;
import view.Display;

public class Initialize {

	private static Display ds;
	private static String text;
	private static Calculate calculate;
	private static filter_calculate fil;
	
	public static void start_Calculator(Display display) {
		ds =display;
		text =null;
		fil = new filter_calculate();
		calculate =new Calculate();
		add_actionListener(ds.buttons_panel.add_number_buttons());
		ds.buttons_panel.panel2.repaint();
		
	}
	public static void add_actionListener(JButton[] btn) {
		for(int i=0;i<btn.length;i++) {
			if(btn[i]==null) {
				continue;
			}
			btn[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JButton clickedButton = (JButton) e.getSource();
                    //dt.respond(clickedButton.getText());
					respond(clickedButton.getText());
					
				}
				
			});
		}
		
	}
	public static void respond(String btn) {
		if(btn=="on/off") {
			if(ds.status=="on") {
				ds.status ="off";
				ds.field1.setText("power "+ds.status);
				ds.field2.setEditable(false);
				ds.field2.setBackground(Color.gray);
				ds.field3.setText(null);
				ds.field2.setText(null);
			}else {
				ds.status ="on";
				ds.field1.setText("power "+ds.status);
				ds.field2.setEditable(false);
				ds.field2.setBackground(Color.WHITE);
				ds.field3.setText("0");
				text="0";
				ds.field2.setText("0");
			}
			
		}
		else if(btn =="="){
			ds.field3.setText(fil.filter(text));
		}else if(btn=="clr"){
			ds.field3.setText("0");
			text="";
			ds.field2.setText("0");
		}else if(btn=="del") {
			text=calculate.del_number();
			if(text.length()==0) {
				ds.field3.setText("0");
				text="";
				ds.field2.setText("0");
			}else {
				ds.field2.setText(text);
			}
		}
		else {
			if(ds.status =="on") {
				char[] textfield =ds.field2.getText().toCharArray();
				if(textfield[0]=='0') {
					ds.field2.setText(btn);
					text =btn;
					calculate.update_numbers(text);
					
				}else {
					text+=btn;
					calculate.update_numbers(text);
					ds.field2.setText(text);
				}
			}
		}
		
	}

	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		start_Calculator(new Display());

	}

}
