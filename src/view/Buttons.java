package view;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;

public class Buttons{
	private JFrame frame;
	public JPanel panel2;
	//private button_respond dt;
	private String []default_buttons = {"on/off","clr","del","+","-","*","/","p","^","~","s","c","t","="};
	Buttons(JFrame super_frame) {
		frame =super_frame;
		panel2= new JPanel();
		String name= "meshack";
		char[]opt = name.toCharArray();
	}
	protected JPanel display_buttons_panel() {
		panel2.setSize(frame.getWidth()-30,(int)(frame.getHeight()/1.55));
		panel2.setBackground(Color.magenta);
		SoftBevelBorder border = new SoftBevelBorder(SoftBevelBorder.LOWERED, Color.white, Color.white);
		panel2.setBorder(border);
		panel2.setVisible(true);
		panel2.setLayout(null);
		panel2.setLocation(5,(frame.getHeight()/4)+10 );
		panel2.repaint();
		return panel2;
	}
	public JButton[] add_number_buttons() {
		int j =20;
		int k=5;
		int o=0;
		int l =0;
		JButton[] btns =new JButton[25];
		
		for(int i=-1;i<12;i++) {
			JButton btn =new JButton(Integer.toString(i));
			btn.setSize(60,40);	
			btn.setLocation(j,k);
			btn.setFocusable(false);
			if(k<=110) {
				btn.setText(default_buttons[l]);
				l++;
				i=-1;
			}
			if(i>=10) {
				btn.setText(default_buttons[l]);
				l++;
			}
			if(j<200) {
				j+=70;
			}else {
				j=20;
				k+=50;
			}
			btns[o]=btn;
			o++;
			add_button(btn);
		}
		return btns;
	}
	private void add_button(JButton button) {
		panel2.add(button);
	}

}
