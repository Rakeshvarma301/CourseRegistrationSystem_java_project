import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class DC_Course_Registration extends JFrame
{
	JLabel welcome;
	DC_Course_Registration()
	{
		setLayout(new FlowLayout());
		
		welcome = new JLabel("welcome to DATA COMMUNICATION course registration");
		welcome.setFont(new Font("Courier New",Font.ITALIC,20));
		
		add(welcome);
		
		setVisible(true);
		setTitle("DATA COMMUNICATION");
		setSize(600,600);
	}
}
