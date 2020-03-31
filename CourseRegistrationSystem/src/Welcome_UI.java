import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Welcome_UI extends JFrame implements ActionListener
{
	JLabel welcome;
	JButton admin_l,stud_l;
	
	Welcome_UI()
	{
		setLayout(new GridLayout(2,1));
		welcome = new JLabel("COURSE REGISTRATION SYSTEM");
		welcome.setFont(new Font("Courier New", Font.ITALIC, 25));
		
		admin_l = new JButton("ADMIN_LOGIN");
		admin_l.addActionListener(this);
		
		stud_l = new JButton("STUDENT_LOGIN");
		stud_l.addActionListener(this);  
		
		add(welcome);
		
		JPanel first = new JPanel();
		first.setLayout(new GridLayout(2,1));
		first.add(admin_l);
		first.add(stud_l);
		add(first);
		
		setVisible(true);
		setSize(600,600);
		setTitle("Welcome");
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		connectDB();
	}
	public void connectDB()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","rakesh301");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from students");
			while(rs.next())
				System.out.println(rs.getInt(1) + " "+rs.getString(2)+" "+rs.getInt(3));
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == admin_l)
		{
			new Admin_Login();
		}
		{
			new Student_Login();
		}
	}
	
	public static void main(String args[])
	{
		new Welcome_UI();
	}	
}
