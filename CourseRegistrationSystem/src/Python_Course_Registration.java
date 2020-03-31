import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Python_Course_Registration extends JFrame
{
	JLabel welcome;
	
	Python_Course_Registration()
	{
		setLayout(new FlowLayout());
		
		welcome = new JLabel("welcome to PYTHON course registration");
		welcome.setFont(new Font("Courier New",Font.ITALIC,20));
		
		add(welcome);
		
		setVisible(true);
		setTitle("PYTHON");
		setSize(600,600);
	}
}
