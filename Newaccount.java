import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class Newaccount extends Panel implements ActionListener
{
	JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12,jl13,jl14,jl15,jl16,jl17,jl18,jl19,jl20,jl21,jl22;
	JTextField jt1,jt2,jt3,jt4,jt5,jt6,jt7,jt8,jt9,jt10,jt11,jt12,jt13;
	JTextArea jta1;
	JRadioButton jr1,jr2,jr3,jr4,jr5,jr6,jr7,jr8,jr9,jr10;
	Checkbox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13;
	CheckboxGroup cg1,cg2,cg3,cg4,cg5;
	JButton jb1,jb2;
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
	Newaccount(JInternalFrame Frame1)
	{
		jif=Frame1;
		setLayout(null);
		jl1=new JLabel("Branch: Sriganganagar");
		jl1.setBounds(10,0,150,20);
		add(jl1);
		
		jl2=new JLabel("Please open an A/C of your choice:");
		jl2.setBounds(10,30,250,20);
		add(jl2);
		
		cg1=new CheckboxGroup();
		c1=new Checkbox("Saving A/C",cg1,false);
		c1.setBounds(260,30,120,20);
		add(c1);
		
		c2=new Checkbox("Current A/C",cg1,false);
		c2.setBounds(390,30,120,20);
		add(c2);
		
		jl3=new JLabel("Customer Type:");
		jl3.setBounds(10,60,150,20);
		add(jl3);
		
		cg2=new CheckboxGroup();
		c3=new Checkbox("Public",cg2,false);
		c3.setBounds(160,60,60,20);
		add(c3);
		
		c4=new Checkbox("Staff",cg2,false);
		c4.setBounds(240,60,120,20);
		add(c4);
		
		jl20=new JLabel("Account NO.:");
		jl20.setBounds(380,60,150,20);
		add(jl20);
		
		jt11=new JTextField();
		jt11.setBounds(460,60,150,25);
		add(jt11);
		
		jl4=new JLabel("(A) PERSONAL DETAILS");
		jl4.setBounds(10,90,150,30);
		//jl4.setFont(new Font("TimesNewRoman",Font.PLAIN,14));
		add(jl4);
				
		jl6=new JLabel("Full Name:");
		jl6.setBounds(10,130,150,20);
		add(jl6);
		
		jt1=new JTextField();
		jt1.setBounds(170,130,200,25);
		add(jt1);
		
		jl7=new JLabel("Father/Husband Name:");
		jl7.setBounds(10,160,150,20);
		add(jl7);
		
		jt2=new JTextField();
		jt2.setBounds(170,160,200,25);
		add(jt2);
		
		jl8=new JLabel("Date Of Birth:");
		jl8.setBounds(10,190,150,20);
		add(jl8);
		
		jt3=new JTextField();
		jt3.setBounds(170,190,200,25);
		add(jt3);
		
		jl9=new JLabel("Sex:");
		jl9.setBounds(10,220,60,20);
		add(jl9);
		
		cg3=new CheckboxGroup();
		c5=new Checkbox("Male",cg3,false);
		c5.setBounds(170,220,60,20);
		add(c5);
		
		c6=new Checkbox("Female",cg3,false);
		c6.setBounds(230,220,80,20);
		add(c6);
		
		jl10=new JLabel("Marital Status:");
		jl10.setBounds(10,250,150,20);
		add(jl10);
		
		cg4=new CheckboxGroup();
		c7=new Checkbox("Married",cg4,false);
		c7.setBounds(170,250,60,20);
		add(c7);
		
		c8=new Checkbox("Unmarried",cg4,false);
		c8.setBounds(240,250,80,20);
		add(c8);
				
		jl11=new JLabel("Mode of Operation:");
		jl11.setBounds(10,280,150,20);
		add(jl11);
		
		cg5=new CheckboxGroup();
		c9=new Checkbox("Self",cg5,false);
		c9.setBounds(170,280,60,20);
		add(c9);
		
		c10=new Checkbox("Either/Surviver",cg5,false);
		c10.setBounds(230,280,100,20);
		add(c10);
		
		jl12=new JLabel("Services Acquired:");
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
		
		jl5=new JLabel("(B) RESIDENTIAL DETAILS");
		jl5.setBounds(450,90,150,30);
		add(jl5);
		
		jl13=new JLabel("Address:");
		jl13.setBounds(450,130,150,20);
		add(jl13);
		
		jta1=new JTextArea();
		jta1.setBounds(530,130,380,55);
		add(jta1);
		
		/*jt4=new JTextField();
		jt4.setBounds(530,130,150,38);
		add(jt4);*/
		
		jl14=new JLabel("City:");
		jl14.setBounds(450,190,150,20);
		add(jl14);
		
		jt5=new JTextField();
		jt5.setBounds(530,190,150,25);
		add(jt5);
		
		jl15=new JLabel("State:");
		jl15.setBounds(450,220,150,20);
		add(jl15);
		
		jt6=new JTextField();
		jt6.setBounds(530,220,150,25);
		add(jt6);
		
		jl16=new JLabel("Mobile No.:");
		jl16.setBounds(450,250,150,20);
		add(jl16);
		
		jl21=new JLabel("Login Id:");
		jl21.setBounds(450,280,150,20);
		add(jl21);
		
		jt12=new JTextField();
		jt12.setBounds(530,280,150,25);
		add(jt12);
		
		jt7=new JTextField();
		jt7.setBounds(530,250,150,25);
		add(jt7);
		
		jl17=new JLabel("Email Id:");
		jl17.setBounds(690,190,150,20);
		add(jl17);
		
		jl22=new JLabel("Password:");
		jl22.setBounds(690,280,150,20);
		add(jl22);
		
		jt13=new JTextField();
		jt13.setBounds(760,280,150,25);
		add(jt13);
		
		jt8=new JTextField();
		jt8.setBounds(760,190,150,25);
		add(jt8);
			
		jl18=new JLabel("Nationality:");
		jl18.setBounds(690,220,150,20);
		add(jl18);
		
		jt9=new JTextField();
		jt9.setBounds(760,220,150,25);
		add(jt9);
		
		jl19=new JLabel("Balance:");
		jl19.setBounds(690,250,150,20);
		add(jl19);
		
		jt10=new JTextField();
		jt10.setBounds(760,250,150,25);
		add(jt10);
		
		jb1=new JButton("Save");
		jb1.setBounds(380,350,70,20);
		add(jb1);
		
		jb2=new JButton("Cancel");
		jb2.setBounds(465,350,90,20);
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
				String a1,a2,a3,a4,a5,a6,a8,a9,a7,a10,a11,a12,a13,a14,a15,a16,a18,a19,a20,a21;
				int a17;
				a1=jt1.getText();
				a2=jt2.getText();
				a3=jt3.getText();
				a4=jta1.getText();
				a5=jt5.getText();
				a6=jt6.getText();
				a7=jt7.getText();
				a8=jt8.getText();
				a9=jt9.getText();
				a18=jt12.getText();
				a19=jt13.getText();
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
				a17=Integer.parseInt(jt10.getText());
				a15=jt11.getText();
				st.execute("Insert into personal values('"+a18+"','"+a19+"','"+a15+"','"+a16+"','"+a11+"','"+a1+"','"+a2+"','"+a3+"','"+a12+"','"+a13+"','"+a14+"','"+a10+"','"+a20+"','"+a21+"','"+a4+"','"+a5+"','"+a6+"','"+a7+"','"+a8+"','"+a9+"',"+a17+");");
				JOptionPane.showMessageDialog(null,"Record Saved","NewAccount",1);
				jt1.setText("");
				jt2.setText("");
				jt3.setText("");
				jt4.setText("");
				jt5.setText("");
				jt6.setText("");
				jt7.setText("");
				jt8.setText("");
				jt9.setText("");
				jt10.setText("");
				jt11.setText("");
				jt12.setText("");
				jt13.setText("");
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,e,"NewAccount",0);
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