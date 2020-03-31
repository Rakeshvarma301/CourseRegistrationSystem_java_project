import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class DS_Course_Registration extends JFrame
{
	JLabel welcome;
	DS_Course_Registration()
	{
		setLayout(new FlowLayout());
		
		welcome = new JLabel("welcome to DATA STRUCTURES course registration");
		welcome.setFont(new Font("Courier New",Font.ITALIC,20));
		
		add(welcome);
		
		setVisible(true);
		setTitle("DATA STRUCTURES");
		setSize(600,600);
	}
}
