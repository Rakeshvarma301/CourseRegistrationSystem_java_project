import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class DAA_Course_Registration extends JFrame
{
	JLabel welcome;
	DAA_Course_Registration()
	{
		setLayout(new FlowLayout());
		
		welcome = new JLabel("welcome to DESIGN AND ANALYSIS OF ALGORITHMS course registration");
		welcome.setFont(new Font("Courier New",Font.ITALIC,20));
		
		add(welcome);
		
		setVisible(true);
		setTitle("DESIGN AND ANALYSYS OF ALGORITHMS");
		setSize(600,600);
	}
}
