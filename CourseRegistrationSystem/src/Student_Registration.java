import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Student_Registration extends JFrame implements ActionListener
{
	JLabel stud_name,college,mobile_number,email_id,password,gender;
	JTextField stud_name_tf,college_tf,mobile_number_tf,email_id_tf,password_tf;
	JButton submit,back;
	CheckboxGroup cbg;
	Checkbox cbg1,cbg2;
	JPanel first,second;
	Student_Registration()
	{
		setLayout(new GridLayout(3,1));
		stud_name = new JLabel("Student Name:");
		stud_name.setFont(new Font("Courier New", Font.ITALIC, 18));
		stud_name_tf = new JTextField(30);
		
		gender = new JLabel("Gender");
		cbg = new CheckboxGroup();
		cbg1 = new Checkbox("Male", cbg, false);
		cbg2 = new Checkbox("Female", cbg, false);
		
		college  = new JLabel("College Name:");
		college.setFont(new Font("Courier New", Font.ITALIC, 18));
		college_tf = new JTextField(30);
		
		mobile_number = new JLabel("Mobile Number:");
		mobile_number.setFont(new Font("Courier New", Font.ITALIC, 18));
		mobile_number_tf = new JTextField(10);
		
		email_id = new JLabel("email_id:");
		email_id.setFont(new Font("Courier New", Font.ITALIC, 18));
		email_id_tf = new JTextField(30);
		
		password = new JLabel("Passowrd:");
		password.setFont(new Font("Courier New", Font.ITALIC, 18));
		password_tf = new JTextField(10);
		
		submit = new JButton("Submit");
		
		back = new JButton("Back");
		back.addActionListener(this);
		
		first = new JPanel();
		second = new JPanel();
		first.setLayout(new GridLayout(7,2));
		second.setLayout(new GridLayout(2,3));
		first.add(stud_name);
		first.add(stud_name_tf);
		first.add(second);
		second.add(gender);
		second.add(cbg1);
		second.add(cbg2);
		first.add(college);
		first.add(college_tf);
		first.add(mobile_number);
		first.add(mobile_number_tf);
		first.add(email_id);
		first.add(email_id_tf);
		first.add(password);
		first.add(password_tf);
		add(first);
		add(second);
		second.add(back);
		second.add(submit);
		
		
		
		setVisible(true);
		setTitle("Student_Login");
		setSize(700,500);
		
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
		if(ae.getSource()==back)
		{
			new Student_Login();
		}
	}
		
}
		
		