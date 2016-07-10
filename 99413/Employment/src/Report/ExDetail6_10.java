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


public class ExDetail6_10 extends javax.swing.JFrame{
	
	JButton ReApButton,ExEmpButton, closeButton;
	JLabel 	jLabel1,jLabel11,jLabel12,jLabel13,jLabel14,
			jLabel2,jLabel21,jLabel22,jLabel23,jLabel24,
			jLabel3,jLabel31,jLabel32,jLabel33,jLabel34,
			jLabel4,jLabel41,jLabel42,jLabel43,jLabel44,jLabel45,jLabel46,
			jLabel5,jLabel51,jLabel52,jLabel53,jLabel54,jLabel55,jLabel56,

			jLabel6,jLabel7;
	ReportApplicant mainMenu;
	public ExDetail6_10(ReportApplicant mainMenu) {
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(30,1));
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
		
        jLabel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
		jLabel22 = new javax.swing.JLabel();
		jLabel23 = new javax.swing.JLabel();
		jLabel24 = new javax.swing.JLabel();
		
        jLabel3 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
		jLabel32 = new javax.swing.JLabel();
		jLabel33 = new javax.swing.JLabel();
		
		
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
				logoLabel1.setText("คำสั่งภาษา SQL : กรณีศึกษาธุรกิจนายหน้าจัดหางาน(ข้อ 6-10)");
				c.add(logoLabel1); // add logo to the Frame
				jLabel1.setText("  6.ให้แสดงเลขรหัสบริษัท, ชื่อบริษัท, ชื่อผู้ติดต่อ และจังหวัดที่บริษัทตั้งอยู่ ของบริษัทที่มีชื่อในตำแหน่งที่สองเป็นตัวอักษร ‘B’ หรือ ตัวอักษร ‘S’ ในตำแหน่งใดก็ได้ และภูมิลำเนาอยู่ในกรุงเทพฯ");
				jLabel11.setText("    SELECT	 COMP_ID, COMP_NAME, COMP_PERSON, COMP_CHW");
				jLabel12.setText("    FROM     company");
				jLabel13.setText("    WHERE	 (COMP_NAME LIKE '_B%' OR COMP_NAME LIKE '%S%')");
				jLabel14.setText("    AND	  COMP_CHW = 'Bangkok';");
				
				jLabel2.setText("  7.ให้แสดงวิชาเอก และจำนวนผู้สมัครในแต่ละวิชาเอก โดยเรียงลำดับตามจำนวนผู้สมัครในแต่ละวิชาเอกจากมากไปน้อย");
				jLabel21.setText("    SELECT		AP_MAJ, COUNT(AP_MAJ) As CountMajor");
				jLabel22.setText("    FROM		applicant");
				jLabel23.setText("    GROUP BY 	AP_MAJ");
				jLabel24.setText("    ORDER BY 	2 DESC;");
				
				jLabel3.setText("  8.ให้แสดงรายชื่อจังหวัดที่ผู้สมัครอาศัยอยู่ โดยแสดงเฉพาะจังหวัดที่ผู้สมัครเป็นเพศชาย ในกรณีที่จังหวัดซ้ำกันให้แสดงผลเพียงครั้งเดียว");
				jLabel31.setText("    SELECT		DISTINCT  AP_CHW");
				jLabel32.setText("    FROM		applicant");
				jLabel33.setText("    WHERE		AP_SEX = 'M';");
				
				
				jLabel4.setText("  9.ให้แสดงเลขรหัสตำแหน่ง, ชื่อตำแหน่งที่เปิดรับ, เงินเดือน และระยะเวลาว่าจ้างที่มีระยะเวลาตั้งแต่ 1 ปีขึ้นไป แต่ไม่เกิน 3 ปี  และเงินเดือนตั้งแต่ 20,000 บาทขึ้นไปโดยเรียงลำดับตามเลขรหัสตำแหน่ง จากน้อยไปมาก");
				jLabel41.setText("    SELECT		POS_ID, POS_NAME, POS_SALARY, POS_PERIOD");
				jLabel42.setText("    FROM		position");
				jLabel43.setText("    WHERE	    POS_PERIOD >= '1'");
				jLabel44.setText("    AND		    POS_PERIOD <= '3'");
				jLabel45.setText("    AND		    POS_SALARY >= 20000");
				jLabel46.setText("    ORDER BY 	POS_ID  ASC;;");
				
				jLabel5.setText("  10.ให้แสดงเลขรหัสตำแหน่งและจำนวนคุณสมบัติเฉพาะตำแหน่ง ที่มีจำนวนมากที่สุด");
				jLabel51.setText("    SELECT		POS_ID, COUNT (QUAL_CODE) AS MAX_COUNT_QUAL");
				jLabel52.setText("    FROM		pos_qual");
				jLabel53.setText("    GROUP BY 	POS_ID");
				jLabel54.setText("    HAVING		COUNT (QUAL_CODE) >= ALL (SELECT COUNT (*) ");
				jLabel55.setText("    FROM pos_qual");
				jLabel56.setText("    GROUP BY POS_ID);");
				c.add(jLabel1);
				c.add(jLabel11);
				c.add(jLabel12);
				c.add(jLabel13);
				c.add(jLabel14);
				
				c.add(jLabel2);
				c.add(jLabel21);
				c.add(jLabel22);
				c.add(jLabel23);
				c.add(jLabel24);
				
				c.add(jLabel3);
				c.add(jLabel31);
				c.add(jLabel32);
				c.add(jLabel33);
				
				
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
				
