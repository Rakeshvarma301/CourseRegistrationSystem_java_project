import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class DBMS_Course_Registration extends JFrame
{
	JLabel description;
	Label welcome;
	DBMS_Course_Registration()
	{
		setLayout(new GridLayout(2,1));
		
		welcome = new Label("welcome to Registration Page");
		welcome.setAlignment(Label.CENTER);
		welcome.setFont(new Font("Courier New",Font.ITALIC,20));
		welcome.setForeground(Color.blue);
		
		String text = "<html><p><font size=5>Database Management System or DBMS in short refers to the technology of storing and retrieving usersí data with utmost efficiency along with appropriate security measures. This tutorial explains the basics of DBMS such as its architecture, data models, data schemas, data independence, E-R model, relation model, relational database design, and storage and file structure and much more.</font></p></html>";
		description= new JLabel(text);
		
		add(welcome);
		add(description);
		
		setVisible(true);
		setTitle("DBMS");
		setSize(600,600);
	}
}
