import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class Deleteaccount extends Panel implements ActionListener
{
	Label jl23,jl24;
	JTextField jt14,jt15;
	Button jb1,jb2;
	Connection con;
	Statement st;
	ResultSet rs;
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newaccount","root","");
			st=con.createStatement();
			JOptionPane.showMessageDialog(null,"Connection Successfully Created","Bank",1);
		}
		catch(Exception e)
		{
		JOptionPane.showMessageDialog(null,e,"Bank",0);
		}
    }
	JInternalFrame jif;
	Deleteaccount(JInternalFrame Frame1)
	{
		jif=Frame1;
		setLayout(null);
		
		jl23=new Label("Login Id:");
		jl23.setBounds(50,100,100,50);
		add(jl23);
		
		jt14=new JTextField();
		jt14.setBounds(170,100,200,40);
		add(jt14);
		
		jl24=new Label("Password");
		jl24.setBounds(50,160,100,50);
		add(jl24);
		
		jt15=new JTextField();
		jt15.setBounds(170,160,200,40);
		add(jt15);
		
		jb1=new Button("Delete");
		jb1.setBounds(250,230,70,20);
		add(jb1);
		
		jb2=new Button("Cancel");
		jb2.setBounds(330,230,100,20);
		add(jb2);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		Object ob=ae.getSource();
		if(ob==jb1)
		{
			String s=jt14.getText();
			String s1=jt15.getText();
			if(jb1.getLabel().equals("Delete"))
			{
				try
				{
					rs=st.executeQuery("Select*from personal where Id='"+s+"' and password='"+s1+"' ");
					if(rs.next())
					{
						JOptionPane.showMessageDialog(null,"You have entered correct details","Delete Account",1);
						JOptionPane.showInputDialog(null,"Are you sure you want to delete this account","Delete Account",0);
						st.executeUpdate("Delete from personal where Id='"+s+"' ");
						JOptionPane.showMessageDialog(null,"Account has been deleted","Delete Account",1);	
						jt14.setText("");
						jt15.setText("");
					}
					else
					{
						JOptionPane.showMessageDialog(null,"You have entered wrong details","Delete Account",1);
					}
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,e,"Delete Account",0);
				}
				
			}
		}
		if(ob==jb2)
		{
			try
			{
				jif.setClosed(true);
			}
			catch(Exception e)
			{
				
			}
			
		}
	}
}