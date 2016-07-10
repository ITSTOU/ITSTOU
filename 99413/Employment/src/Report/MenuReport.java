package Report;
import java.awt.*; 			// Font, Color, Layout managers		 

import javax.swing.*; 		// GUI components		 

import Employment.MainMenu;

import java.awt.event.*; 	// ActionEvent, ActionListener, WindowAdapter

public class MenuReport extends JFrame implements ActionListener
{
	JButton addReApButton,addExEmpButton, closeButton;
		 	  
	MainMenu mainMenu;
	// constructor
	public MenuReport()
	{
		
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(5,1));
		JPanel L1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel L2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel L8 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		// create logo
				
				JLabel logoLabel1 = new JLabel(" ",SwingConstants.CENTER);
				logoLabel1.setForeground(Color.red);
				logoLabel1.setFont(new Font("TimesRoman", Font.ITALIC,22));
				logoLabel1.setText("ระบบรายงาน : กรณีศึกษาธุรกิจนายหน้าจัดหางาน");
				c.add(logoLabel1); // add logo to the Frame
				
				
				// create Buttons for bottom panel
				addReApButton= new JButton("รายงานตามคำสั่งภาษา SQL : กรณีศึกษาธุรกิจนายหน้าจัดหางาน");
				addExEmpButton= new JButton("คำสั่งภาษา SQL : กรณีศึกษาธุรกิจนายหน้าจัดหางาน");								
				closeButton = new JButton("Close"); 
				// add the buttons
				L1.add(addExEmpButton);
				L2.add(addReApButton);
				L8.add(closeButton);
				c.add(L1);
				c.add(L2);				
				c.add(L8);
				//c.add(lowerPanel); // add lower panel to the Frame	
				// register frame as listener for button events
				addReApButton.addActionListener(this);
				addExEmpButton.addActionListener(this);				
				closeButton.addActionListener(this);
				
		   }
		   // actionPerformed is invoked when a Button is clicked 
		   public void actionPerformed(ActionEvent e)
		   {
				// see which button was clicked
				if(e.getSource() == addReApButton)
		     		{addReAp();} 
				if(e.getSource() == addExEmpButton)
	     			{addExEmp();}
				
				if(e.getSource() == closeButton)
		     	 	{shutDown();}
		   }
			private void addReAp()
			{
				
			ReportApplicant addReApWindow = new ReportApplicant(this);
						addReApWindow.setSize(750, 550);
						addReApWindow.setTitle("รายงานตามคำสั่งภาษา SQL : กรณีศึกษาธุรกิจนายหน้าจัดหางาน"); 
						addReApWindow.setVisible(true);
						
					}
			private void addExEmp()
			{
				ExEmployment addReComWindow = new ExEmployment(this);
 				addReComWindow.setSize(750,750);
				addReComWindow.setTitle("คำสั่งภาษา SQL : กรณีศึกษาธุรกิจนายหน้าจัดหางาน"); 
				addReComWindow.setVisible(true);
				
				
					}
			
			
		 	public void shutDown()
			{
				
				this.dispose();
				 
			}	

}
