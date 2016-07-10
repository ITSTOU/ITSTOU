package Employment;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import FillForm.FillFormApplicant;
import FormDataBase.MenuForm;
import Report.MenuReport;

public class MainMenu extends JFrame implements ActionListener {
	
	JButton fillFormButton,menuFormAppButton,
			reportAppButton,closeButton;
	public MainMenu()
	{
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(3,1));
		
		JLabel logoLabel1 = new JLabel("บริษัท STOU-TEC จำกัด",
				SwingConstants.CENTER);
		logoLabel1.setForeground(Color.red);
		logoLabel1.setFont(new Font("TimesRoman",
				Font.ITALIC | Font.BOLD,30));
		c.add(logoLabel1);
		
		JLabel logoLabel2 = new JLabel("(STOU Temporary Employment Corporation)",
				SwingConstants.CENTER);
		logoLabel2.setForeground(Color.blue);
		logoLabel2.setFont(new Font("TimesRoman",
				Font.ITALIC | Font.BOLD,20));
		c.add(logoLabel2);
		
		 JPanel lowerPanel = new JPanel();
		 fillFormButton = 
				 new JButton("แบบฟอร์มใบสมัครพนักงาน");
		 fillFormButton.addActionListener(this);
		 menuFormAppButton = 
				 new JButton("ระบบจัดการข้อมูลพื้นฐาน");
		 menuFormAppButton.addActionListener(this);
		 reportAppButton = 
				 new JButton("ระบบรายงาน");
		 reportAppButton.addActionListener(this);
		 closeButton = 
				 new JButton("ออกจากโปรแกรม");
		 closeButton.addActionListener(this);
		 
		 
		 lowerPanel.add(fillFormButton);
		 lowerPanel.add(menuFormAppButton);
		 lowerPanel.add(reportAppButton);
		 lowerPanel.add(closeButton);
		 c.add(lowerPanel);
		 
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == menuFormAppButton)
		{
			MenuForm addMenuFormFrame = new MenuForm();
			addMenuFormFrame.setSize(500,400);
			addMenuFormFrame.setTitle("ระบบจัดการข้อมูลพื้นฐาน");
			addMenuFormFrame.setVisible(true);
		} else if(e.getSource() == fillFormButton)
		{
			FillFormApplicant addMenuFillFormFrame = new FillFormApplicant();
			addMenuFillFormFrame.setSize(500,400);
			addMenuFillFormFrame.setTitle("แบบฟอร์มใบสมัครพนักงาน");
			addMenuFillFormFrame.setVisible(true);
		} else if(e.getSource() == reportAppButton)
		{
			MenuReport newMenuReport = new MenuReport();
			newMenuReport.setSize(500,400);
			newMenuReport.setTitle("ระบบรายงาน");
			newMenuReport.setVisible(true);
		}
		else if(e.getSource() == closeButton)
		{
			System.exit(0);
		}
		
		
			
	}

	public static void main(String[] args) {
		MainMenu frame = new MainMenu();
		frame.setSize(650,250);
		frame.setTitle("โปรแกรมการจัดการธุรกิจ " +
				"(กรณีศึกษา : ธุรกิจจัดหางาน)");
		frame.setDefaultCloseOperation(3);
		frame.setVisible(true);
		
		/*
		Connection conn = MyConnect.getConnection();
		if(conn != null)
			System.out.println("OK");
		else
			System.out.println("ERROR");
		 */
		
		
		
		
		
		
			
	}
}
