import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Java_Course_Registration extends JFrame
{
	JLabel welcome;
	
	Java_Course_Registration()
	{
		setLayout(new FlowLayout());
		
		welcome = new JLabel("welcome to OBJECT ORIENTED PROGRAMMING  USING JAVA course registration");
		welcome.setFont(new Font("Courier New",Font.ITALIC,20));
		
		add(welcome);
		
		setVisible(true);
		setTitle("JAVA");
		setSize(600,600);
	}
}
