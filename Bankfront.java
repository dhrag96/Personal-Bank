import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Bankfront implements ActionListener
{
	Frame f;
	ImageIcon img,img1,img2,img3,img4,img5,img6,img7;
	Panel p;
	Label l1,l2,l3;
	JLabel jl1,jl2,jl3,jl4;
	JMenuBar mb;
	JMenu m1,m2,m3,m4,m5;
	JMenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9,mi10,mi11,mi12,mi13,mi14,mi15,mi16,mi17,mi18,mi19,mi20,mi21,mi22,mi23,mi24,mi25,mi26,mi27,mi28;
	JInternalFrame jif1,jif2,jif3,jif4,jif5,jif6,jif7;
	JDesktopPane dp;
	JScrollPane jsp1,jsp2,jsp3,jsp4,jsp5,jjsp6,jsp7;
	
	Bankfront()
	{
		f=new Frame("BankFront");
		f.setLayout(null);
		f.setResizable(false);
		Thread t=new Thread(new Runnable()
		{
		public void run()
		{	
			try
			{
				img1=new ImageIcon("pnb11.png");
				jl1=new JLabel();
				jl1.setIcon(img1);
				jl1.setBounds(0,0,1370,260);
				f.add(jl1);
				Thread.sleep(3000);
				img4=new ImageIcon("pnb24.jpg");
				jl1.setIcon(img4);
				jl1.setBounds(0,0,1370,260);
				f.add(jl1);
				Thread.sleep(3000);
				img5=new ImageIcon("pnb23.jpg");
				jl1.setIcon(img5);
				jl1.setBounds(0,0,1370,260);
				f.add(jl1);
				Thread.sleep(3000);
				img6=new ImageIcon("pnb25.jpg");
				jl1.setIcon(img6);
				jl1.setBounds(0,0,1370,260);
				f.add(jl1);
				Thread.sleep(3000);
				img7=new ImageIcon("pnb11.png");
				jl1.setIcon(img7);
				jl1.setBounds(0,0,1370,260);
				f.add(jl1);
			}
			catch(Exception e)
			{
			}
		}
		}
		);
		t.start();
	
		mb=new JMenuBar();
		mb.setBounds(2,260,1370,30);
		f.add(mb);
		
		m1=new JMenu("Customers");
		mb.add(m1);
		
		mi1=new JMenuItem("New Account");
		m1.add(mi1);
		mi2=new JMenuItem("Modify Account");
		m1.add(mi2);
		mi3=new JMenuItem("Delete Account");
		m1.add(mi3);
		mi4=new JMenuItem("Show Account");
		m1.add(mi4);
		mi5=new JMenuItem("Show All A/C Details");
		m1.add(mi5);
		mi6=new JMenuItem("Exit");
		m1.add(mi6);
		
		m2=new JMenu("Transaction");
		mb.add(m2);
		mi7=new JMenuItem("Withdrawal");
		m2.add(mi7);
		mi8=new JMenuItem("Deposit");
		m2.add(mi8);
		mi9=new JMenuItem("Balance Enquiry");
		m2.add(mi9);
		mi10=new JMenuItem("Bank Statements");
		m2.add(mi10);
		mi11=new JMenuItem("Other Activities");
		m2.add(mi11);
		
		f.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		m3=new JMenu("Loan");
		mb.add(m3);
		mi12=new JMenuItem("New Loan Application");
		m3.add(mi12);
		mi13=new JMenuItem("Add Installment");
		m3.add(mi13);
		mi14=new JMenuItem("Modify Installment");
		m3.add(mi14);
		mi15=new JMenuItem("Delete Installment");
		m3.add(mi15);
		mi16=new JMenuItem("Mdify Loan");
		m3.add(mi16);
		mi17=new JMenuItem("Delete Loan");
		m3.add(mi17);
		
		m4=new JMenu("Services");
		mb.add(m4);
		mi18=new JMenuItem("ATM Facility");
		m4.add(mi18);
		mi19=new JMenuItem("Debit Card");
		m4.add(mi19);
		mi20=new JMenuItem("Credit Card");
		m4.add(mi20);
		mi21=new JMenuItem("SMS Alert");
		m4.add(mi21);
		mi22=new JMenuItem("E-Banking");
		m4.add(mi22);
		mi23=new JMenuItem("E-Commerce");
		m4.add(mi23);
		mi24=new JMenuItem("Cheque Book");
		m4.add(mi24);
		mi25=new JMenuItem("Complain Book");
		m4.add(mi25);
		
		m5=new JMenu("Help Desk");
		mb.add(m5);
		mi26=new JMenuItem("Imp Contacts");
		m5.add(mi26);
		mi27=new JMenuItem("RBI Policies");
		m5.add(mi27);
		mi28=new JMenuItem("Bank Policies");
		m5.add(mi28);
		
		dp=new JDesktopPane();
		dp.setBounds(231,290,948,450);
		dp.setBackground(Color.gray);
		f.add(dp);
		
		img2=new ImageIcon("ad3.jpg");
		jl2=new JLabel();
		jl2.setIcon(img2);
		jl2.setBounds(0,290,230,450);
		f.add(jl2);
		
		img3=new ImageIcon("ad2.jpg");
		jl3=new JLabel();
		jl3.setIcon(img3);
		jl3.setBounds(1180,290,230,450);
		f.add(jl3);
		
		p=new Panel();
		p.setLayout(null);
		p.setBounds(0,741,1366,20);
		f.add(p);
		
		l1=new Label("@SGNR Branch");
		l1.setBounds(10,0,100,20);
		Font f1;
		f1=new Font("TimesNewRoman",Font.PLAIN,12);
		l1.setFont(f1);
		p.add(l1);
		
		l2=new Label("@PNB Bank");
		l2.setBounds(1256,0,80,20);
		Font f2;
		f2=new Font("TimesNewRoman",Font.PLAIN,12);
		l2.setFont(f2);
		p.add(l2);
		
		l3=new Label("@BankFront");
		l3.setBounds(600,0,80,20);
		Font f3;
		f3=new Font("TimesNewRoman",Font.PLAIN,12);
		l3.setFont(f3);
		p.add(l3);
		
		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);
		mi5.addActionListener(this);
		mi4.addActionListener(this);
		mi6.addActionListener(this);
		mi7.addActionListener(this);
		mi8.addActionListener(this);
		mi9.addActionListener(this);
		
		f.setBounds(0,0,1370,770);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		Object ob=ae.getSource();
		if(ob==mi1)
		{
			jif1=new JInternalFrame("New Account",true,true,true,false);
			jif1.setLayout(null);
			
			Newaccount B=new Newaccount(jif1);
			jif1.add(B);
			jif1.setBounds(0,0,948,450);
			jif1.setVisible(true);
			dp.add(jif1);
			
			jsp1=new JScrollPane(B);
			jsp1.setBounds(0,0,938,440);
			jif1.add(jsp1);
			B.setLayout(null);
			B.setBounds(0,0,938,440);
			
		}
		
		if(ob==mi2)
		{
			jif2=new JInternalFrame("Modify Account",true,true,true,false);
			jif2.setLayout(null);
			
			ModifyAccount C=new ModifyAccount(jif2);
			jif2.add(C);
			jif2.setBounds(0,0,948,450);
			jif2.setVisible(true);
			dp.add(jif2);
			
			jsp2=new JScrollPane(C);
			jsp2.setBounds(0,0,938,440);
			jif2.add(jsp2);
			C.setLayout(null);
			C.setBounds(0,0,938,440);
		}
		if(ob==mi3)
		{
			jif3=new JInternalFrame("Delete Account",true,true,true,false);
			jif3.setLayout(null);
			
			Deleteaccount D=new Deleteaccount(jif3);
			jif3.add(D);
			jif3.setBounds(0,0,948,450);
			jif3.setVisible(true);
			dp.add(jif3);
			
			jsp3=new JScrollPane(D);
			jsp3.setBounds(0,0,938,440);
			jif3.add(jsp3);
			D.setLayout(null);
			D.setBounds(0,0,938,440);
		}
		if(ob==mi4)
		{
			jif5=new JInternalFrame("Show Accounts",true,true,true,false);
			jif5.setLayout(null);
			
			Show F=new Show();
			jif5.add(F);
			jif5.setBounds(0,0,948,450);
			jif5.setVisible(true);
			dp.add(jif5);
			
			jsp5=new JScrollPane(F);
			jsp5.setBounds(0,0,938,440);
			jif5.add(jsp5);
			F.setLayout(null);
			F.setBounds(0,0,938,440);
		}
		if(ob==mi5)
		{
			jif4=new JInternalFrame("Show Account Details",true,true,true,false);
			jif4.setLayout(null);
			
			Showaccountd E=new Showaccountd(jif4);
			jif4.add(E);
			jif4.setBounds(0,0,948,450);
			jif4.setVisible(true);
			dp.add(jif4);
		
			
			jsp4=new JScrollPane(E);
			jsp4.setBounds(0,0,938,440);
			jif4.add(jsp4);
			E.setLayout(null);
			E.setBounds(0,0,938,440);
		}
		if(ob==mi6)
		{
			Exit E=new Exit();
		}
		if(ob==mi7)
		{
			jif7=new JInternalFrame("Withdrawal",true,true,true,false);
			jif7.setLayout(null);
			
			Withdrawal E=new Withdrawal(jif7);
			jif7.add(E);
			jif7.setBounds(0,0,948,450);
			jif7.setVisible(true);
			dp.add(jif7);
		
			
			jsp7=new JScrollPane(E);
			jsp7.setBounds(0,0,938,440);
			jif7.add(jsp7);
			E.setLayout(null);
			E.setBounds(0,0,938,440);
		}
		if(ob==mi8)
		{
			jif7=new JInternalFrame("Depsoit",true,true,true,false);
			jif7.setLayout(null);
			
			Deposit E=new Deposit(jif7);
			jif7.add(E);
			jif7.setBounds(0,0,948,450);
			jif7.setVisible(true);
			dp.add(jif7);
		
			
			jsp7=new JScrollPane(E);
			jsp7.setBounds(0,0,938,440);
			jif7.add(jsp7);
			E.setLayout(null);
			E.setBounds(0,0,938,440);
		}
		if(ob==mi9)
		{
			jif7=new JInternalFrame("Balance",true,true,true,false);
			jif7.setLayout(null);
			
			Balance E=new Balance(jif7);
			jif7.add(E);
			jif7.setBounds(0,0,948,450);
			jif7.setVisible(true);
			dp.add(jif7);
		
			
			jsp7=new JScrollPane(E);
			jsp7.setBounds(0,0,938,440);
			jif7.add(jsp7);
			E.setLayout(null);
			E.setBounds(0,0,938,440);
		}
	
	}
	public static void main(String []z)
	{
		Bankfront A=new Bankfront();
	}
	
}