package Report;



import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class ExDetail11_15 extends javax.swing.JFrame{
	
	JButton ReApButton,ExEmpButton, closeButton;
	JLabel 	jLabel1,jLabel11,jLabel12,jLabel13,jLabel14,jLabel15,
	jLabel2,jLabel21,jLabel22,jLabel23,jLabel24,
	jLabel3,jLabel31,jLabel32,jLabel33,jLabel34,jLabel35,
	jLabel4,jLabel41,jLabel42,jLabel43,jLabel44,jLabel45,jLabel46,jLabel47,
	jLabel5,jLabel51,jLabel52,jLabel53,jLabel54,jLabel55,jLabel56,

	jLabel6,jLabel7;
	ReportApplicant mainMenu;
	public ExDetail11_15(ReportApplicant mainMenu) {
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(35,1));
		//JPanel centerPanel = new JPanel(new GridLayout(4,2));
		//JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel L1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel L2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel L8 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		jLabel1 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		
        jLabel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
		jLabel22 = new javax.swing.JLabel();
		jLabel23 = new javax.swing.JLabel();
		jLabel24 = new javax.swing.JLabel();
		
        jLabel3 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
		jLabel32 = new javax.swing.JLabel();
		jLabel33 = new javax.swing.JLabel();
		jLabel34 = new javax.swing.JLabel();
		jLabel35 = new javax.swing.JLabel();
		
		
        jLabel4 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
		jLabel42 = new javax.swing.JLabel();
		jLabel43 = new javax.swing.JLabel();
		jLabel44 = new javax.swing.JLabel();
		jLabel45 = new javax.swing.JLabel();
		jLabel46 = new javax.swing.JLabel();
		jLabel47 = new javax.swing.JLabel();
		
        jLabel5 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
		jLabel52 = new javax.swing.JLabel();
		jLabel53 = new javax.swing.JLabel();
		jLabel54 = new javax.swing.JLabel();
		jLabel55 = new javax.swing.JLabel();
		jLabel56 = new javax.swing.JLabel();
		
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
		
		// create logo
				Font defaultFont = c.getFont(); // get font so can restore
				JLabel logoLabel1 = new JLabel(" ",SwingConstants.CENTER);
				logoLabel1.setForeground(Color.red);
				logoLabel1.setFont(new Font("TimesRoman", Font.ITALIC,22));
				logoLabel1.setText("คำสั่งภาษา SQL : กรณีศึกษาธุรกิจนายหน้าจัดหางาน(ข้อ 11-15)");
				c.add(logoLabel1); // add logo to the Frame	
				
				
				jLabel1.setText("  11.ให้แสดงเลขรหัสบริษัท, ชื่อบริษัท, ชื่อตำแหน่งที่เปิดรับ และจำนวนอัตราว่าง ของตำแหน่งที่มีคำว่า ‘Specialist’ ปรากฏเป็นส่วนหนึ่งของชื่อตำแหน่ง โดยเรียงลำดับตามเลขรหัสบริษัท และตามชื่อตำแหน่งจากน้อยไปมาก");
				jLabel11.setText("    SELECT	c.COMP_ID, COMP_NAME, POS_NAME, POS_NUMBER");
				jLabel12.setText("    FROM		company c, position p");
				jLabel13.setText("    WHERE		c.COMP_ID = p.COMP_ID");
				jLabel14.setText("    AND		POS_NAME LIKE '%Specialist%'");
				jLabel15.setText("    ORDER BY 	c.COMP_ID, POS_NAME;");
				
				jLabel2.setText("  12.ให้แสดงเลขรหัสผู้สมัคร, ชื่อผู้สมัคร, เลขรหัสคุณสมบัติเฉพาะตำแหน่ง และคำอธิบายคุณสมบัติเฉพาะตำแหน่ง โดยแสดงเฉพาะที่มีคำว่า ‘MGT’ ปรากฏเป็นส่วนหนึ่งของเลขรหัสคุณสมบัติเฉพาะตำแหน่ง หรือคำว่า ‘Sys’ ปรากฏเป็นส่วนหนึ่งของคำอธิบายคุณสมบัติเฉพาะตำแหน่ง");
				jLabel21.setText("    SELECT	a.AP_ID, AP_NAME, q.QUAL_CODE, QUAL_DESC");
				jLabel22.setText("    FROM		applicant a, ap_qual aq, qualification q");
				jLabel23.setText("    WHERE		a.AP_ID	 = aq.AP_ID");
				jLabel24.setText("    AND		aq.QUAL_CODE	= q.QUAL_CODE");
				jLabel24.setText("    AND		(q.QUAL_CODE LIKE '%MGT%' OR  QUAL_DESC like '%Sys%');");
				
				jLabel3.setText("  13.ให้แสดงเลขรหัสบริษัท, ชื่อบริษัท, รหัสตำแหน่งที่เปิดรับ, ชื่อตำแหน่งที่เปิดรับ และเงินเดือนที่ให้เงินเดือนต่ำสุด");
				jLabel31.setText("    SELECT c.COMP_ID, COMP_NAME, POS_ID, POS_NAME, POS_SALARY AS MIN_SALARY");
				jLabel32.setText("    FROM   position p, company c");
				jLabel33.setText("    WHERE p.COMP_ID      = c.COMP_ID");
				jLabel34.setText("    AND  pos_SALARY  = (SELECT MIN(POS_SALARY)");
				jLabel35.setText("    FROM position);");
				
				
				jLabel4.setText("  14.ให้แสดงเลขรหัสผู้สมัคร, ชื่อผู้สมัคร, ชื่อตำแหน่งที่เปิดรับ, เงินเดือน และชื่อบริษัท ที่ให้เงินเดือนสูงสุด");
				jLabel41.setText("    SELECT	a.AP_ID, AP_NAME, POS_NAME, POS_SALARY AS MAX_SALARY, COMP_NAME");
				jLabel42.setText("    FROM	   applicant a, position p, ap_pos ap, company c");
				jLabel43.setText("    WHERE	   a.AP_ID 	= ap.AP_ID");
				jLabel44.setText("    AND	   ap.POS_ID	= p.POS_ID");
				jLabel45.setText("    AND	   p.COMP_ID 	= c.COMP_ID");
				jLabel46.setText("    AND     pos_SALARY  = (SELECT MAX(POS_SALARY)");
				jLabel47.setText("    FROM position);");
				
				jLabel5.setText("  15.ให้แสดงเลขรหัสตำแหน่ง, ชื่อตำแหน่งที่เปิดรับ, เงินเดือน และคำอธิบายคุณสมบัติเฉพาะตำแหน่ง ที่มีรหัสคุณสมบัติเฉพาะตำแหน่ง เป็น ‘C++’ โดยเรียงลำดับชื่อตำแหน่งที่เปิดรับตามตัวอักษรจาก A-Z");
				jLabel51.setText("    SELECT   p.POS_ID, POS_NAME, POS_SALARY, QUAL_DESC");
				jLabel52.setText("    FROM	   position p, pos_qual pq, qualification q");
				jLabel53.setText("    WHERE	   p.POS_ID	= pq.POS_ID");
				jLabel54.setText("    AND	   pq.QUAL_CODE  = q.QUAL_CODE");
				jLabel55.setText("    AND	   q.QUAL_CODE   = 'C++'");
				jLabel56.setText("    ORDER BY 2 ASC;");
				c.add(jLabel1);
				c.add(jLabel11);
				c.add(jLabel12);
				c.add(jLabel13);
				c.add(jLabel14);
				c.add(jLabel15);
				
				c.add(jLabel2);
				c.add(jLabel21);
				c.add(jLabel22);
				c.add(jLabel23);
				c.add(jLabel24);
				
				c.add(jLabel3);
				c.add(jLabel31);
				c.add(jLabel32);
				c.add(jLabel33);
				c.add(jLabel34);
				c.add(jLabel35);
				
				
				c.add(jLabel4);
				c.add(jLabel41);
				c.add(jLabel42);
				c.add(jLabel43);
				c.add(jLabel44);
				c.add(jLabel45);
				c.add(jLabel46);
				c.add(jLabel47);
				
				c.add(jLabel5);
				c.add(jLabel51);
				c.add(jLabel52);
				c.add(jLabel53);
				c.add(jLabel54);
				c.add(jLabel55);
				c.add(jLabel56);
	}
}
				
