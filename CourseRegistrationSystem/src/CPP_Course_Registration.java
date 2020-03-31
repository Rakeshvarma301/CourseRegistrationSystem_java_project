import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class CPP_Course_Registration extends JFrame
{
	JLabel welcome;
	
	CPP_Course_Registration()
	{
		setLayout(new FlowLayout());
		
		welcome = new JLabel("welcome to C++ PROGRAMMING course registration");
		welcome.setFont(new Font("Courier New",Font.ITALIC,20));
		
		add(welcome);
		
		setVisible(true);
		setTitle("C++");
		setSize(600,600);
	}
}
