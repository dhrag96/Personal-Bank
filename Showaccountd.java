import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class Showaccountd extends Panel implements ActionListener
{	
	Label jl23,jl24;
	TextField jt14,jt15;
	Button jb1,jb2;
	JTable tb;
	JScrollPane sp;
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
	Showaccountd(JInternalFrame Frame1)
	{
		jif=Frame1;
		setLayout(null);
		
		jl23=new Label("Login Id:");
		jl23.setBounds(50,100,100,50);
		add(jl23);
		
		jt14=new TextField();
		jt14.setBounds(170,100,200,40);
		add(jt14);
		
		jl24=new Label("Password");
		jl24.setBounds(50,160,100,50);
		add(jl24);
		
		jt15=new TextField();
		jt15.setBounds(170,160,200,40);
		add(jt15);
		
		jb1=new Button("Show A/C Details");
		jb1.setBounds(250,230,120,20);
		add(jb1);
		
		jb2=new Button("Cancel");
		jb2.setBounds(380,230,100,20);
		add(jb2);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		Object ob=ae.getSource();
		if(ob==jb1)
		{
			try
			{
				String s=jt14.getText();
				String s1=jt15.getText();
				rs=st.executeQuery("Select*from personal where Id='"+s+"' and password='"+s1+"' ");
				if(rs.next())
				{
					remove(jb1);
					remove(jb2);
					remove(jt14);
					remove(jt15);
					remove(jl23);
					remove(jl24);
					JOptionPane.showMessageDialog(null,"You have entered correct details","Show Account details",1);
					String a="Account no is:"+rs.getString("AccountNo");
					a=a+"\nId is:"+rs.getString("Id");
					a=a+"\nAccount type  is:"+rs.getString("AccountType");
					a=a+"\nName is:"+rs.getString("FullName");
					a=a+"\nF/H Name is:"+rs.getString("F/HName");
					a=a+"\nDOB  is:"+rs.getString("DOB");
					a=a+"\nSex is:"+rs.getString("Sex");
					a=a+"\nMarital Status is:"+rs.getString("MaritalStatus");
					a=a+"\nMop  is:"+rs.getString("Mop");
					a=a+"\nService 1 is:"+rs.getString("s1");
					a=a+"\nService 2 is:"+rs.getString("s2");
					a=a+"\nService 3  is:"+rs.getString("s3");
					a=a+"\nAdd is:"+rs.getString("Address");
					a=a+"\nCity is:"+rs.getString("City");
					a=a+"\nState  is:"+rs.getString("State");
					a=a+"\nMobile is:"+rs.getString("Mobile");
					a=a+"\nEmail is:"+rs.getString("Email");
					a=a+"\nNationality  is:"+rs.getString("Nationality");
					a=a+"\nBalance is:"+rs.getString("Balance");
					JOptionPane.showMessageDialog(null,a,"Record Found",1);
					
					add(jb1);
					add(jb2);
					add(jt14);
					jt14.setText("");
					jt14.requestFocus();
					add(jt15);
					jt15.setText("");
					add(jl23);
					add(jl24);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"You have entered wrong details","Show Account details",1);
				}
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,e,"Show Account details",0);
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