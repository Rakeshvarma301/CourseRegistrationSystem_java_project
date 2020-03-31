import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class Courses_UI extends JFrame //implements MouseListener
{
	JLabel c,cpp,java,python,ds,dbms,daa,os,dc,cn;
	Courses_UI()
	{
		setLayout(new GridLayout(5,2));
		
		c= new JLabel("C Programming");
		c.setFont(new Font("Courier New",Font.ITALIC,20));
		c.addMouseListener(new MouseAdapter() {
			  public void mouseClicked(MouseEvent e) 
			  {
			    new C_Course_Registration();
			  }
			});
		
		cpp= new JLabel("C++ Programming");
		cpp.setFont(new Font("Courier New",Font.ITALIC,20));
		cpp.addMouseListener(new MouseAdapter() {
			  public void mouseClicked(MouseEvent e) 
			  {
			    new CPP_Course_Registration();
			  }
			});
		
		java = new JLabel("Object Oriented Programming Using Java");
		java.setFont(new Font("Courier New",Font.ITALIC,20));
		java.addMouseListener(new MouseAdapter() {
			  public void mouseClicked(MouseEvent e) 
			  {
				  new Java_Course_Registration();
			  }
			});
		
		python= new JLabel("Python Programming");
		python.setFont(new Font("Courier New",Font.ITALIC,20));
		python.addMouseListener(new MouseAdapter() {
			  public void mouseClicked(MouseEvent e) 
			  {
				  new Python_Course_Registration();
			  }
			});
		
		ds= new JLabel("Fundamentals Of DataStructurec");
		ds.setFont(new Font("Courier New",Font.ITALIC,20));
		ds.addMouseListener(new MouseAdapter() {
			  public void mouseClicked(MouseEvent e) 
			  {
				  new DS_Course_Registration();
			  }
			});
		
		dbms = new JLabel("database Management System");
		dbms.setFont(new Font("Courier New",Font.ITALIC,20));
		dbms.addMouseListener(new MouseAdapter() {
			  public void mouseClicked(MouseEvent e) 
			  {
				  new DBMS_Course_Registration();
			  }
			});
		
		daa = new JLabel("Design and Analysis Of Algorithms");
		daa.setFont(new Font("Courier New",Font.ITALIC,20));
		daa.addMouseListener(new MouseAdapter() {
			  public void mouseClicked(MouseEvent e) 
			  {
				  new DAA_Course_Registration();
			  }
			});
		
		os = new JLabel("Introduction to Operating Systems");
		os.setFont(new Font("Courier New",Font.ITALIC,20));
		os.addMouseListener(new MouseAdapter() {
			  public void mouseClicked(MouseEvent e) 
			  {
				  new OS_Course_Registration();
			  }
			});
		
		dc = new JLabel("Data Communication");
		dc.setFont(new Font("Courier New",Font.ITALIC,20));
		dc.addMouseListener(new MouseAdapter() {
			  public void mouseClicked(MouseEvent e) 
			  {
				  new DC_Course_Registration();
			  }
			});
		
		cn = new JLabel("Computer Networks");
		cn.setFont(new Font("Courier New",Font.ITALIC,20));
		cn.addMouseListener(new MouseAdapter() {
			  public void mouseClicked(MouseEvent e) 
			  {
				  new CN_Course_Registration();
			  }
			});
		
		add(c);
		add(cpp);
		add(java);
		add(python);
		add(ds);
		add(dbms);
		add(daa);
		add(os);
		add(dc);
		add(cn);
		
		setVisible(true);
		setTitle("Course Page");
		setSize(800,600);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});	
	}
}
