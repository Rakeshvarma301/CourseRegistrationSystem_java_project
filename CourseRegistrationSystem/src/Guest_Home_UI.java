import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Guest_Home_UI extends JFrame implements ActionListener
{
	JLabel welcome,course;
	JMenuBar menubar;
	JButton courseB;
	JPanel second;
	Guest_Home_UI()
	{
		setLayout(new FlowLayout());
		
		welcome= new JLabel("....ONLINE   COURSE   REGISTRATION   SYSTEM....");
		
		course = new JLabel("COURSES-->");
		
		courseB= new JButton("Click Here");
		courseB.addActionListener(this);
		
		second = new JPanel();
		second.setLayout(new FlowLayout());
		
		add(welcome);
		second.add(course);
		second.add(courseB);
		add(second);
		
		setVisible(true);
		setTitle("Guest Homepage");
		setSize(600,600);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});	
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==courseB)
		{
			new Courses_UI();
		}
	}
	
}