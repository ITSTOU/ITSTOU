package Report;


import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class ExDetail1_5 extends javax.swing.JFrame{
	
	JButton ReApButton,ExEmpButton, closeButton;
	JLabel 	jLabel1,jLabel11,jLabel12,jLabel13,
			jLabel2,jLabel21,jLabel22,jLabel23,
			jLabel3,jLabel31,jLabel32,jLabel33,
			jLabel4,jLabel41,jLabel42,jLabel43,jLabel44,
			jLabel5,jLabel51,jLabel52,jLabel53,jLabel54,jLabel55,
			jLabel6,jLabel7;
	
	ReportApplicant mainMenu;
	public ExDetail1_5(ReportApplicant mainMenu) {
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(24,1));
		
		jLabel1 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		
        jLabel2 = new javax.swing.JLabel();        
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        
        jLabel3 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
		jLabel32 = new javax.swing.JLabel();
		jLabel33 = new javax.swing.JLabel();
		
        jLabel4 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
		jLabel42 = new javax.swing.JLabel();
		jLabel43 = new javax.swing.JLabel();
		jLabel44 = new javax.swing.JLabel();
		
        jLabel5 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
		jLabel52 = new javax.swing.JLabel();
		jLabel53 = new javax.swing.JLabel();
		jLabel54 = new javax.swing.JLabel();
		jLabel55 = new javax.swing.JLabel();
		
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
		
		// create logo
				Font defaultFont = c.getFont(); // get font so can restore
				JLabel logoLabel1 = new JLabel(" ",SwingConstants.CENTER);
				logoLabel1.setForeground(Color.red);
				logoLabel1.setFont(new Font("TimesRoman", Font.ITALIC,22));
				logoLabel1.setText("คำสั่งภาษา SQL : กรณีศึกษาธุรกิจนายหน้าจัดหางาน(ข้อ 1-5)");
				c.add(logoLabel1); // add logo to the Frame
				jLabel1.setText("  1.ให้แสดงข้อมูลทั้งหมดของบริษัทที่มีตำแหน่งว่างทุกรายการ  โดยเรียงลำดับตามเลขรหัสของบริษัท จาก มากไปน้อย");
				jLabel11.setText("      SELECT * ");
				jLabel12.setText("      FROM COMPANY");
				jLabel13.setText("      ORDER BY COMP_ID DESC;");
				
				jLabel2.setText("  2.ให้แสดงเลขรหัสตำแหน่ง, ชื่อตำแหน่งที่เปิดรับ, เงินเดือน, จำนวนอัตราว่างที่เปิดรับ และระยะเวลาว่าจ้าง โดยเรียงลำดับตามเงินเดือนจากมากไปน้อย");
				jLabel21.setText("      SELECT		POS_ID, POS_NAME, POS_SALARY, POS_NUMBER, POS_PERIOD ");
				jLabel22.setText("      FROM		POSITION");
				jLabel23.setText("      ORDER BY 	POS_SALARY DESC;");
				
				jLabel3.setText("  3.ให้แสดงเลขรหัส, ชื่อ-สกุล, เพศ และวิชาเอกของผู้สมัคร ที่ชื่อผู้สมัครขึ้นต้นด้วยตัวอักษร ‘ A ‘ หรือ มีตัวอักษร ‘ y ‘ ปรากฏในชื่อผู้สมัครในตำแหน่งใดก็ได้");
				jLabel31.setText("      SELECT		AP_ID, AP_NAME, AP_SEX, AP_MAJ");
				jLabel32.setText("      FROM       	applicant");
				jLabel33.setText("      WHERE		AP_NAME LIKE 'A%'    OR    AP_NAME LIKE    '%y%';");
				
				jLabel4.setText("  4.ให้แสดงชื่อจังหวัดที่บริษัทตั้งอยู่, เลขรหัสบริษัท และชื่อบริษัท ที่มีภูมิลำเนาอยู่นอกกรุงเทพฯ โดยเรียงลำดับตามชื่อบริษัท จาก A-Z");
				jLabel41.setText("      SELECT		COMP_CHW, COMP_ID, COMP_NAME");
				jLabel42.setText("      FROM COMPANY");
				jLabel43.setText("      WHERE		COMP_CHW <> 'Bangkok'");
				jLabel44.setText("      ORDER BY 	COMP_NAME;");
				
				jLabel5.setText("  5.ให้แสดงค่าเงินเดือนสูงสุด, ค่าเงินเดือนต่ำสุด,ค่าเงินเดือนเฉลี่ย และจำนวนของชื่อตำแหน่งที่เปิดรับทั้งหมด");
				jLabel51.setText("      SELECT 	MAX (POS_SALARY) As MaxSalary, ");
				jLabel52.setText("              MIN (POS_SALARY) As MinSalary,");
				jLabel53.setText("              AVG (POS_SALARY) As AvgSalary, ");
				jLabel54.setText("              COUNT (POS_NAME) As CountPosition ");
				jLabel55.setText("              FROM  position;");
				
				c.add(jLabel1);
				c.add(jLabel11);
				c.add(jLabel12);
				c.add(jLabel13);
				
				c.add(jLabel2);
				c.add(jLabel21);
				c.add(jLabel22);
				c.add(jLabel23);
				
				c.add(jLabel3);
				c.add(jLabel31);
				c.add(jLabel32);
				c.add(jLabel33);
				
				c.add(jLabel4);
				c.add(jLabel41);
				c.add(jLabel42);
				c.add(jLabel43);
				c.add(jLabel44);
				
				c.add(jLabel5);
				c.add(jLabel51);
				c.add(jLabel52);
				c.add(jLabel53);
				c.add(jLabel54);
				c.add(jLabel55);
	}
}
				