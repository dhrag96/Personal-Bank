import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class ModifyAccount extends Panel implements ActionListener
{
	Label jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12,jl13,jl14,jl15,jl16,jl17,jl18,jl19,jl20,jl21,jl22,jl23,jl24;
	TextField jt1,jt2,jt3,jt4,jt5,jt6,jt7,jt8,jt9,jt10,jt11,jt12,jt13;
	JTextField jt14,jt15;
	Button jb1,jb2,jb3;
	JTextArea jta1;
	JRadioButton jr1,jr2,jr3,jr4,jr5,jr6,jr7,jr8,jr9,jr10;
	Checkbox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13;
	CheckboxGroup cg1,cg2,cg3,cg4,cg5;
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
	ModifyAccount(JInternalFrame Frame1)
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
		
		jb1=new Button("OK");
		jb1.setBounds(250,230,70,20);
		add(jb1);
		
		jb2=new Button("Cancel");
		jb2.setBounds(330,230,100,20);
		add(jb2);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
	}
	void rem()
	{
		setLayout(null);
		jl1=new Label("Branch: Sriganganagar");
		jl1.setBounds(10,0,150,20);
		add(jl1);
		
		jl2=new Label("Please open an A/C of your choice:");
		jl2.setBounds(10,30,250,20);
		add(jl2);
		
		cg1=new CheckboxGroup();
		c1=new Checkbox("Saving A/C",cg1,false);
		c1.setBounds(260,30,120,20);
		add(c1);
		
		c2=new Checkbox("Current A/C",cg1,false);
		c2.setBounds(390,30,120,20);
		add(c2);
		
		jl3=new Label("Customer Type:");
		jl3.setBounds(10,60,150,20);
		add(jl3);
		
		cg2=new CheckboxGroup();
		c3=new Checkbox("Public",cg2,false);
		c3.setBounds(160,60,60,20);
		add(c3);
		
		c4=new Checkbox("Staff",cg2,false);
		c4.setBounds(240,60,120,20);
		add(c4);
		
		jl20=new Label("Account NO.:");
		jl20.setBounds(380,60,70,20);
		add(jl20);
		
		jt11=new TextField();
		jt11.setBounds(460,60,150,25);
		add(jt11);
		
		jl4=new Label("(A) PERSONAL DETAILS");
		jl4.setBounds(10,90,150,30);
		add(jl4);
				
		jl6=new Label("Full Name:");
		jl6.setBounds(10,130,150,20);
		add(jl6);
		
		jt1=new TextField();
		jt1.setBounds(170,130,200,25);
		add(jt1);
		
		jl7=new Label("Father/Husband Name:");
		jl7.setBounds(10,160,150,20);
		add(jl7);
		
		jt2=new TextField();
		jt2.setBounds(170,160,200,25);
		add(jt2);
		
		jl8=new Label("Date Of Birth:");
		jl8.setBounds(10,190,150,20);
		add(jl8);
		
		jt3=new TextField();
		jt3.setBounds(170,190,200,25);
		add(jt3);
		
		jl9=new Label("Sex:");
		jl9.setBounds(10,220,60,20);
		add(jl9);
		
		cg3=new CheckboxGroup();
		c5=new Checkbox("Male",cg3,false);
		c5.setBounds(170,220,60,20);
		add(c5);
		
		c6=new Checkbox("Female",cg3,false);
		c6.setBounds(230,220,80,20);
		add(c6);
		
		jl10=new Label("Marital Status:");
		jl10.setBounds(10,250,150,20);
		add(jl10);
		
		cg4=new CheckboxGroup();
		c7=new Checkbox("Married",cg4,false);
		c7.setBounds(170,250,60,20);
		add(c7);
		
		c8=new Checkbox("Unmarried",cg4,false);
		c8.setBounds(240,250,80,20);
		add(c8);
				
		jl11=new Label("Mode of Operation:");
		jl11.setBounds(10,280,150,20);
		add(jl11);
		
		cg5=new CheckboxGroup();
		c9=new Checkbox("Self",cg5,false);
		c9.setBounds(170,280,60,20);
		add(c9);
		
		c10=new Checkbox("Either/Surviver",cg5,false);
		c10.setBounds(230,280,100,20);
		add(c10);
		
		jl12=new Label("Services Acquired:");
		jl12.setBounds(10,310,150,20);
		add(jl12);
		
		c11=new Checkbox("ATM",false);
		c11.setBounds(170,310,40,20);
		add(c11);
		
		c12=new Checkbox("SMS",false);
		c12.setBounds(220,310,40,20);
		add(c12);
		
		c13=new Checkbox("Internet Banking",false);
		c13.setBounds(270,310,110,20);
		add(c13);
		
		jl5=new Label("(B) RESIDENTIAL DETAILS");
		jl5.setBounds(450,90,150,30);
		add(jl5);
		
		jl13=new Label("Address:");
		jl13.setBounds(450,130,80,20);
		add(jl13);
		
		jta1=new JTextArea();
		jta1.setBounds(530,130,380,55);
		add(jta1);
		
		jl14=new Label("City:");
		jl14.setBounds(450,190,70,20);
		add(jl14);
		
		jt5=new TextField();
		jt5.setBounds(530,190,150,25);
		add(jt5);
		
		jl15=new Label("State:");
		jl15.setBounds(450,220,70,20);
		add(jl15);
		
		jt6=new TextField();
		jt6.setBounds(530,220,150,25);
		add(jt6);
		
		jl16=new Label("Mobile No.:");
		jl16.setBounds(450,250,80,20);
		add(jl16);
		
		jl21=new Label("Login Id:");
		jl21.setBounds(450,280,80,20);
		add(jl21);
		
		jt12=new TextField();
		jt12.setBounds(530,280,150,25);
		add(jt12);
		
		jt7=new TextField();
		jt7.setBounds(530,250,150,25);
		add(jt7);
		
		jl17=new Label("Email Id:");
		jl17.setBounds(690,190,70,20);
		add(jl17);
		
		jl22=new Label("Password:");
		jl22.setBounds(690,280,70,20);
		add(jl22);
		
		jt13=new TextField();
		jt13.setBounds(770,280,150,25);
		add(jt13);
		
		jt8=new TextField();
		jt8.setBounds(770,190,150,25);
		add(jt8);
			
		jl18=new Label("Nationality:");
		jl18.setBounds(690,220,70,20);
		add(jl18);
		
		jt9=new TextField();
		jt9.setBounds(770,220,150,25);
		add(jt9);
		
		jl19=new Label("Balance:");
		jl19.setBounds(690,250,70,20);
		add(jl19);
		
		jt10=new TextField();
		jt10.setBounds(770,250,150,25);
		add(jt10);
	}
	public void actionPerformed(ActionEvent ae)
	{
		Object ob=ae.getSource();
		if(ob==jb1)
		{
			String s;
			s=jt14.getText();
			if(jb1.getLabel().equals("OK"))
			{
				try
				{
					//String s;
					//s=jt14.getText();
					rs=st.executeQuery("Select*from personal where Id='"+s+"' ");
					if(rs.next())
					{
						remove(jb1);
						remove(jb2);
						remove(jt14);
						remove(jt15);
						remove(jl23);
						remove(jl24);
						JOptionPane.showMessageDialog(null,"Record Found","Bank",1);
						rem();
						jb1.setBounds(380,350,70,20);
						add(jb1);
						jb2.setBounds(465,350,90,20);
						add(jb2);
						jt11.setText(rs.getString("AccountNo"));
						jt12.setText(rs.getString("Id"));
						jt11.setEnabled(false);
						jt12.setEnabled(false);
						jt1.setText(rs.getString("FullName"));
						jt2.setText(rs.getString("F/HName"));
						jt3.setText(rs.getString("DOB"));
						jta1.setText(rs.getString("Address"));
						jt5.setText(rs.getString("City"));
						jt6.setText(rs.getString("State"));
						jt7.setText(rs.getString("Mobile"));
						jt8.setText(rs.getString("Email"));
						jt9.setText(rs.getString("Nationality"));
						jt10.setText(""+(Integer.parseInt(rs.getString("Balance"))));
						jt13.setText(rs.getString("password"));
						if(rs.getString("AccountType").equals("Saving"))
						{
							c1.setState(true);
						}
						else
						{
							c2.setState(true);
						}
						if(rs.getString("CustomerType").equals("Public"))
						{
							c3.setState(true);
						}
						else
						{
							c4.setState(true);
						}
						if(rs.getString("Sex").equals("Male"))
						{
							c5.setState(true);
						}
						else
						{
							c6.setState(true);
						}
						if(rs.getString("MaritalStatus").equals("Married"))
						{	
							c7.setState(true);
						}
						else
						{
							c8.setState(true);
						}
						if(rs.getString("Mop").equals("Self"))
						{
							c9.setState(true);
						}
						else
						{
							c10.setState(true);
						}
						if(rs.getString("s1").equals("ATM"))
						{
							c11.setState(true);
						}
						else
						{
							c11.setState(false);
						}
						if(rs.getString("s2").equals("SMS"))
						{
							c12.setState(true);
						}
						else
						{
							c12.setState(false);
						}
						if(rs.getString("s3").equals("Internet Banking"))
						{	
							c13.setState(true);
						}
						else
						{
							c13.setState(false);
						}
						jb1.setLabel("Update");
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Record not found","Bank",0);
					}
				} 
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,e,"Bank",0);
				}
			}
			else
			{
				String a10,a11,a12,a13,a14,a16,a20,a21;
				try
				{
					if(c11.getState()==true)
				{
					a10="ATM";
				}
				else
				{
					a10="No";
				}
				if(c12.getState()==true)
				{
					a20="SMS";
				}
				else
				{
					a20="No";
				}
				if(c13.getState()==true)
				{
					a21="Internet Banking";
				}
				else
				{
					a21="No";
				}
				if(c1.getState()==true)
				{
					a16="Saving";
				}
				else
				{
					a16="Current";
				}
				if(c3.getState()==true)
				{
					a11="Public";
				}
				else
				{
					a11="Staff";
				}
				if(c5.getState()==true)
				{
					a12="Male";
				}
				else
				{
					a12="Female";
				}
				if(c7.getState()==true)
				{
					a13="Married";
				}
				else
				{
					a13="Unmarried";
				}
				if(c9.getState()==true)
				{
					a14="Self";
				}
				else
				{
					a14="Either/Surviver";
				}
					st.executeUpdate("Update personal set Mop='"+a14+"',MaritalStatus='"+a13+"',Sex='"+a12+"',CustomerType='"+a11+"',AccountType='"+a16+"',s1='"+a10+"',s2='"+a20+"',s3='"+a21+"',FullName='"+jt1.getText()+"',DOB='"+jt3.getText()+"',Address='"+jta1.getText()+"',City='"+jt5.getText()+"',State='"+jt6.getText()+"',Mobile='"+jt7.getText()+"',Email='"+jt8.getText()+"',Nationality='"+jt9.getText()+"',Balance="+(Integer.parseInt(jt10.getText()))+", password='"+jt13.getText()+"' where Id='"+s+"' ");
					JOptionPane.showMessageDialog(null,"Record Updated","Modify Account",1);
					jb1.setLabel("OK");
				}				
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,e,"Modify Account",0);
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