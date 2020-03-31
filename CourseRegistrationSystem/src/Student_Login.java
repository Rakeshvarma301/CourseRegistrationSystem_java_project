import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Student_Login extends JFrame implements ActionListener
{
	JLabel user_id,password,forget_psw, new_user;
	JTextField user_id_tf,password_tf;
	JButton login,back,new_user_button;
	
	Student_Login()
	{
		setLayout(new FlowLayout());
		user_id = new JLabel("Email_id");
		user_id.setFont(new Font("Courier New", Font.ITALIC, 18));
		password = new JLabel("PASSWORD");
		password.setFont(new Font("Courier New", Font.ITALIC, 18));
		
		forget_psw = new JLabel("Forgot Password ???");
		forget_psw.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) 
				{
                    if(e.getSource() == forget_psw)
					{
						new Guest_Home_UI();
					}
                }
            });
		
		user_id_tf = new JTextField(20);
		password_tf = new JTextField(10);
		
		login = new JButton("Login");
		login.addActionListener(this);
		
		back = new JButton("RETURN");
		back.addActionListener(this);
		
		new_user = new JLabel("New User ???");
		
		new_user_button = new JButton("Register");
		new_user_button.addActionListener(this);
		
		Panel second = new Panel();
		second.setLayout(new GridLayout(2,2));
		second.add(user_id);
		second.add(user_id_tf);
		second.add(password);
		second.add(password_tf);
		add(second);
		
		JPanel fourth = new JPanel();
		fourth.setLayout(new GridLayout(2,1));
		fourth.add(login);
		fourth.add(back);
		add(fourth);
		
		JPanel third = new JPanel();
		third.add(new_user);
		third.add(new_user_button);
		add(third);
		add(forget_psw);
		
		setVisible(true);
		setTitle("Student_Login");
		setSize(600,600);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});	
	}
	
	public void actionPerformed(ActionEvent sd)
	{
		if(sd.getSource() == login)
		{
			new Guest_Home_UI();
		}
		else if(sd.getSource() == back)
		{
			new Welcome_UI();
		}
		else if(sd.getSource() == new_user_button)
		{
			new Student_Registration();
		}
		else if(sd.getSource() == forget_psw)
		{
			new Guest_Home_UI();
		}
	}
}
		
		