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


public class ExDetail16_20 extends javax.swing.JFrame{
	
	JButton ReApButton,ExEmpButton, closeButton;
	JLabel 	jLabel1,jLabel11,jLabel12,jLabel13,jLabel14,jLabel15,
	jLabel2,jLabel21,jLabel22,jLabel23,jLabel24,jLabel25,jLabel26,
	jLabel3,jLabel31,jLabel32,jLabel33,jLabel34,jLabel35,jLabel36,
	jLabel4,jLabel41,jLabel42,jLabel43,jLabel44,jLabel45,jLabel46,
	jLabel5,jLabel51,jLabel52,jLabel53,jLabel54,jLabel55,jLabel56,

	jLabel6,jLabel7;
	ReportApplicant mainMenu;
	public ExDetail16_20(ReportApplicant mainMenu) {
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(37,1));
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
		jLabel25 = new javax.swing.JLabel();
		jLabel26 = new javax.swing.JLabel();
		
        jLabel3 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
		jLabel32 = new javax.swing.JLabel();
		jLabel33 = new javax.swing.JLabel();
		jLabel34 = new javax.swing.JLabel();
		jLabel35 = new javax.swing.JLabel();
		jLabel36 = new javax.swing.JLabel();
		
		
        jLabel4 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
		jLabel42 = new javax.swing.JLabel();
		jLabel43 = new javax.swing.JLabel();
		jLabel44 = new javax.swing.JLabel();
		jLabel45 = new javax.swing.JLabel();
		jLabel46 = new javax.swing.JLabel();
		
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
				logoLabel1.setText("คำสั่งภาษา SQL : กรณีศึกษาธุรกิจนายหน้าจัดหางาน(ข้อ 16-20)");
				c.add(logoLabel1); // add logo to the Frame
				
				
				jLabel1.setText("  16.ให้แสดงชื่อบริษัท, ชื่อจังหวัด, ชื่อตำแหน่งที่เปิดรับ และรหัสผู้สมัคร สำหรับบริษัทที่มีภูมิลำเนาอยู่ที่จังหวัด ‘Puket’ หรือ ‘Songkla’ หรือ ‘Chiengmai’");
				jLabel11.setText("    SELECT	COMP_NAME, COMP_CHW, POS_NAME, AP_ID");
				jLabel12.setText("    FROM	   company c, position p, ap_pos ap");
				jLabel13.setText("    WHERE	   p.COMP_ID	= c.COMP_ID");
				jLabel14.setText("    AND	   ap.POS_ID	= p.POS_ID");
				jLabel15.setText("    AND	   (COMP_CHW	= 'Puket' OR COMP_CHW  = 'Songkla' OR COMP_CHW = 'Chiengmai');");
				
				jLabel2.setText("  17.ให้แสดงชื่อตำแหน่งที่เปิดรับ, ชื่อผู้สมัคร, วิชาเอก และเงินเดือน สำหรับผู้สมัครในตำแหน่งที่มีคำว่า ‘Manager’ ปรากฏเป็นส่วนหนึ่งของชื่อตำแหน่ง และมีเงินเดือน ตั้งแต่ 10,000 บาท ขึ้นไป");
				jLabel21.setText("    SELECT	POS_NAME, AP_NAME, AP_MAJ, POS_SALARY");
				jLabel22.setText("    FROM	   applicant a, position p, ap_pos ap");
				jLabel23.setText("    WHERE	   a.AP_ID	= ap.AP_ID");
				jLabel24.setText("    AND	   ap.POS_ID	= p.POS_ID");
				jLabel25.setText("    AND	   POS_NAME LIKE '%Manager%'");
				jLabel26.setText("    AND	   POS_SALARY >= 10000;");
				
				jLabel3.setText("  18.ให้แสดงรหัสผู้สมัคร, ชื่อผู้สมัคร, วิชาเอก, เงินเดือน และรหัสตำแหน่ง สำหรับผู้สมัครที่จบวิชาเอก ‘Information Technology’ และมีเงินเดือนระหว่าง 10,000-40,000 บาท");
				jLabel31.setText("    SELECT	   a.AP_ID, AP_NAME, AP_MAJ, POS_SALARY, p.POS_ID");
				jLabel32.setText("    FROM	   position p, applicant a, ap_pos ap");
				jLabel33.setText("    WHERE	   a.AP_ID	= ap.AP_ID");
				jLabel34.setText("    AND	   ap.POS_ID	= p.POS_ID");
				jLabel35.setText("    AND	   AP_MAJ	= 'Information Technology'");
				jLabel36.setText("    AND	   POS_SALARY between 10000 and 40000;");
				
				
				
				jLabel4.setText("  19.ให้แสดงรหัสบริษัท, รหัสตำแหน่งที่เปิดรับ, ชื่อตำแหน่งที่เปิดรับ, รหัสผู้สมัคร, ชื่อผู้สมัคร และวันที่สมัคร ในช่วงวันที่ระหว่างวันที่ 1 มกราคม 2003  ถึง 30 มีนาคม 2003");
				jLabel41.setText("    SELECT	c.COMP_ID, p.POS_ID, POS_NAME, a.AP_ID, AP_NAME, APPLY_DATE");
				jLabel42.setText("    FROM	    applicant a, ap_pos ap, position p, company  c");
				jLabel43.setText("    WHERE	    a.AP_ID	= ap.AP_ID");
				jLabel44.setText("    AND       ap.POS_ID	= p.POS_ID");
				jLabel45.setText("    AND       p.COMP_ID	= c.COMP_ID");
				jLabel46.setText("    AND       (APPLY_DATE between '01/01/2003' and '03/30/2003');");
				
				jLabel5.setText("  20.ให้แสดงชื่อบริษัท, รหัสผู้สมัคร, ชื่อผู้สมัคร และวุฒิการศึกษา สำหรับผู้มีวุฒิการศึกษาปริญญาโทเท่านั้น");
				jLabel51.setText("    SELECT   COMP_NAME, a.AP_ID, AP_NAME, AP_ED");
				jLabel52.setText("    FROM	   applicant a, position p, company c, ap_pos ap");
				jLabel53.setText("    WHERE	   AP_ED LIKE 'M%'");
				jLabel54.setText("    AND	   a.AP_ID	= ap.AP_ID");
				jLabel55.setText("    AND	   ap.POS_ID	= p.POS_ID");
				jLabel56.setText("    AND	   p.COMP_ID	= c.COMP_ID;");
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
				c.add(jLabel25);
				c.add(jLabel26);
				
				c.add(jLabel3);
				c.add(jLabel31);
				c.add(jLabel32);
				c.add(jLabel33);
				c.add(jLabel34);
				c.add(jLabel35);
				c.add(jLabel36);
				
				c.add(jLabel4);
				c.add(jLabel41);
				c.add(jLabel42);
				c.add(jLabel43);
				c.add(jLabel44);
				c.add(jLabel45);
				c.add(jLabel46);
				
				
				c.add(jLabel5);
				c.add(jLabel51);
				c.add(jLabel52);
				c.add(jLabel53);
				c.add(jLabel54);
				c.add(jLabel55);
				c.add(jLabel56);
	}
}
				
