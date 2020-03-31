import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class OS_Course_Registration extends JFrame
{
	JLabel welcome;
	OS_Course_Registration()
	{
		setLayout(new FlowLayout());
		
		welcome = new JLabel("welcome to OPERATING SYSTEMS course registration");
		welcome.setFont(new Font("Courier New",Font.ITALIC,20));
		
		add(welcome);
		
		setVisible(true);
		setTitle("OPERATING SYSTEMS");
		setSize(600,600);
	}
}
