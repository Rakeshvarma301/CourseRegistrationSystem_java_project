import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class CN_Course_Registration extends JFrame
{
	JLabel welcome;
	CN_Course_Registration()
	{
		setLayout(new FlowLayout());
		
		welcome = new JLabel("welcome to COMPUTER NETWORKS course registration");
		welcome.setFont(new Font("Courier New",Font.ITALIC,20));
		
		add(welcome);
		
		setVisible(true);
		setTitle("COMPUTER NETWORKS");
		setSize(600,600);
	}
}
