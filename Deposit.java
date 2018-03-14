import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class Deposit extends Panel implements ActionListener
{
	Label jl23,jl24,jl25;
	TextField jt14,jt15,jt16;
	Button jb1,jb2,jb3,jb4;
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
	Deposit(JInternalFrame Frame1)
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
		
		jb1=new Button("OK");
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
			if((jb1.getLabel()).equals("OK"))
			{
				
				try
				{
					jt14.requestFocus();
					rs=st.executeQuery("Select*from personal where Id='"+s+"' and password='"+s1+"' ");
					if(rs.next())
					{
						JOptionPane.showMessageDialog(null,"You have entered correct details","Deposit",1);
						remove(jb1);
						remove(jb2);
						remove(jt14);
						remove(jt15);
						remove(jl23);
						remove(jl24);
										
						jl25=new Label("Enter money you want to Deposit");
						jl25.setBounds(50,100,200,20);
						add(jl25);		
						jt16=new TextField();
						jt16.setBounds(260,100,200,25);
						add(jt16);	
						jb1.setLabel("Deposit");
						jb1.setBounds(260,135,80,20);
						add(jb1);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"You have entered wrong details","Dposit",1);
					}
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,e,"Deposit",0);
				}
			}			
			else
			{
				try
				{
					int a,b,c;
					b=(Integer.parseInt(rs.getString("Balance")));
					a=Integer.parseInt(jt16.getText());
					{
						c=b+a;
						st.executeUpdate("Update personal set Balance="+c+"  where Id='"+s+"' ");
						JOptionPane.showMessageDialog(null,"Your old balance is "+b+"\nYour updated balance is "+c,"Deposit",1);
						
						remove(jb4);
						remove(jt16);
						remove(jl25);
						jb1.setLabel("OK");
						jb1.setBounds(250,230,70,20);
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
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,e,"Deposit",0);
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