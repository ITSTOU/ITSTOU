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


public class ExEmployment extends javax.swing.JFrame{
	
	JButton ReApButton,ExEmpButton, closeButton;
	JLabel jLabel1,jLabel2,jLabel3,jLabel4,jLabel5,jLabel6,jLabel7;
	public ExEmployment(MenuReport menuReport) {
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(9,1));
		//JPanel centerPanel = new JPanel(new GridLayout(4,2));
		//JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel L1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel L2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel L8 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
		
		// create logo
				Font defaultFont = c.getFont(); // get font so can restore
				JLabel logoLabel1 = new JLabel(" ",SwingConstants.CENTER);
				logoLabel1.setForeground(Color.red);
				logoLabel1.setFont(new Font("TimesRoman", Font.ITALIC,22));
				logoLabel1.setText("คำสั่งภาษา SQL : กรณีศึกษาธุรกิจนายหน้าจัดหางาน");
				c.add(logoLabel1); // add logo to the Frame
				jLabel1.setText("  1.ให้แสดงข้อมูลทั้งหมดของบริษัทที่มีตำแหน่งว่างทุกรายการ  โดยเรียงลำดับตามเลขรหัสของบริษัท จาก มากไปน้อย");
				jLabel2.setText("  2.ให้แสดงเลขรหัสตำแหน่ง, ชื่อตำแหน่งที่เปิดรับ, เงินเดือน, จำนวนอัตราว่างที่เปิดรับ และระยะเวลาว่าจ้าง โดยเรียงลำดับตามเงินเดือนจากมากไปน้อย");
				jLabel3.setText("  3.ให้แสดงเลขรหัส, ชื่อ-สกุล, เพศ และวิชาเอกของผู้สมัคร ที่ชื่อผู้สมัครขึ้นต้นด้วยตัวอักษร ‘ A ‘ หรือ มีตัวอักษร ‘ y ‘ ปรากฏในชื่อผู้สมัครในตำแหน่งใดก็ได้");
				jLabel4.setText("  4.ให้แสดงชื่อจังหวัดที่บริษัทตั้งอยู่, เลขรหัสบริษัท และชื่อบริษัท ที่มีภูมิลำเนาอยู่นอกกรุงเทพฯ โดยเรียงลำดับตามชื่อบริษัท จาก A-Z");
				jLabel5.setText("  5.ให้แสดงค่าเงินเดือนสูงสุด, ค่าเงินเดือนต่ำสุด,ค่าเงินเดือนเฉลี่ย และจำนวนของชื่อตำแหน่งที่เปิดรับทั้งหมด");
				c.add(jLabel1);
				c.add(jLabel2);
				c.add(jLabel3);
				c.add(jLabel4);
				c.add(jLabel5);
	}
}
				