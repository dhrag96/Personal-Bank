import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Bank 
{
	Frame f;
	JLabel jl1;
	ImageIcon img;
	Label l1,l2,l3;
	Panel p;
	JProgressBar jpb;
	
	Bank()
	{
		f=new Frame("Bank");
		f.setLayout(null);
		f.setResizable(false);
				
		img=new ImageIcon("pnblogo.png");
		jl1=new JLabel();
		jl1.setIcon(img);
		jl1.setBounds(300,290,795,101);
		f.add(jl1);
		
		jpb=new JProgressBar(1,100);
		jpb.setBounds(590,400,200,30);
		f.add(jpb);
		
		l3=new Label("Loading");
		l3.setBounds(550,435,100,20);
		Font f3;
		f3=new Font("TimesNewRoman",Font.ITALIC,18);
		l3.setFont(f3);
		f.add(l3);
				
		p=new Panel();
		p.setLayout(null);
		p.setBounds(0,728,1366,40);
		f.add(p);
		
		l1=new Label("@SGNR Branch");
		l1.setBounds(10,5,100,20);
		Font f1;
		f1=new Font("TimesNewRoman",Font.PLAIN,12);
		l1.setFont(f1);
		p.add(l1);
		
		l2=new Label("@PNB Bank");
		l2.setBounds(1256,5,80,20);
		Font f2;
		f2=new Font("TimesNewRoman",Font.PLAIN,12);
		l2.setFont(f2);
		p.add(l2);
		
		f.setVisible(true);
		f.setBounds(0,0,1370,770);
		
		for(int i=0;i<=100;i=i+5)
		{
			try
			{
				jpb.setValue(i);
				Thread.sleep(150);
			}	
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
		f.setVisible(false);
		Bankfront B=new Bankfront();
	}
	public static void main(String []z)
	{
		Bank A=new Bank();
	}
}