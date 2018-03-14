import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.*;
public class Show extends JPanel
{
	JTable t;
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
	
	Show()
	{
		setLayout(null);
		try
		{
			rs=st.executeQuery("Select*from personal");
			String d[][]=new String[200][200];
			String h[]={"AccountNo","Id","A/CType","CustomerType","Name","F/HName","DOB","Sex","MS","MOP","s1","s2","s3","Add","City","State","Mob","Email","Nationality","Balance"};
            int r=0;
			while(rs.next())
			{
				d[r][0]=rs.getString("AccountNo");
				d[r][1]=rs.getString("Id");
				d[r][2]=rs.getString("AccountType");
				d[r][3]=rs.getString("CustomerType");
				d[r][4]=rs.getString("FullName");
				d[r][5]=rs.getString("F/HName");
				d[r][6]=rs.getString("DOB");
				d[r][7]=rs.getString("Sex");
				d[r][8]=rs.getString("MaritalStatus");
				d[r][9]=rs.getString("Mop");
				d[r][10]=rs.getString("s1");
				d[r][11]=rs.getString("s2");
				d[r][12]=rs.getString("s3");
				d[r][13]=rs.getString("Address");
				d[r][14]=rs.getString("City");
				d[r][15]=rs.getString("State");
				d[r][16]=rs.getString("Mobile");
				d[r][17]=rs.getString("Email");
				d[r][18]=rs.getString("Nationality");
				d[r][19]=rs.getString("Balance");
				r++;
			}
			t=new JTable(d,h);
			//table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			/*public void resizeColumnWidth(JTable table)
			{
				final TableColumnModel columnModel = table.getColumnModel();
				for (int column = 0; column < table.getColumnCount(); column++) 
				{	
					int width = 15; // Min width
					for (int row = 0; row < table.getRowCount(); row++) 
					{
						TableCellRenderer renderer = table.getCellRenderer(row, column);
						Component comp = table.prepareRenderer(renderer, row, column);
						width = Math.max(comp.getPreferredSize().width +1 , width);
					}
					if(width > 300)
					width=300;
					columnModel.getColumn(column).setPreferredWidth(width);
				}
			}
			};*/
			/*table.getColumnModel().getColumn(0).setPreferredWidth(47);
			table.getColumnModel().getColumn(1).setPreferredWidth(27);
			table.getColumnModel().getColumn(2).setPreferredWidth(100);
			table.getColumnModel().getColumn(3).setPreferredWidth(90);
			table.getColumnModel().getColumn(4).setPreferredWidth(90);
			table.getColumnModel().getColumn(6).setPreferredWidth(120);
			table.getColumnModel().getColumn(7).setPreferredWidth(100);
			table.getColumnModel().getColumn(8).setPreferredWidth(95);
			table.getColumnModel().getColumn(9).setPreferredWidth(40);
			table.getColumnModel().getColumn(10).setPreferredWidth(400);*/
			
			sp = new JScrollPane(t);
			sp.setSize(938,440);
			add(sp);
		
	}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,e,"Emulation",0);
		}
	}
}