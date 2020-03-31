import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class C_Course_Registration extends JFrame
{
	JLabel welcome,back,description;
	C_Course_Registration()
	{
		setLayout(new GridLayout(3,1));
		
		welcome = new JLabel("welcome to C PROGRAMMING course registration");
		welcome.setFont(new Font("Courier New",Font.ITALIC,20));
		
		back = new JLabel("Back");
		
		String text = "<html><p><font size=5> C programming language is a MUST for students and working professionals to become a great Software Engineer specially when they are working in Software Development Domain. I will list down some of the key advantages of learning C Programming:\r\n" + 
				"\r\n" + 
				"Easy to learn\r\n" + 
				"\r\n" + 
				"Structured language\r\n" + 
				"\r\n" + 
				"It produces efficient programs\r\n" + 
				"\r\n" + 
				"It can handle low-level activities\r\n" + 
				"\r\n" + 
				"It can be compiled on a variety of computer platforms</font></p></html>";
		
		description = new JLabel(text);
		description.setFont(new Font("Courier New",Font.ITALIC,20));
		
		description = new JLabel(text);
		
		add(welcome);
		add(description);
		add(back);
		
		setVisible(true);
		setTitle("C PROGRAMMING");
		setSize(600,600);
	}
}
