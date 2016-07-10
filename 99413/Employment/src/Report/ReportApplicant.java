package Report;
import Employment.MyConnect;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class ReportApplicant extends JFrame implements ActionListener {

	private Connection conn = MyConnect.getConnection();
	JMenuBar menuBar;
	JMenu fileMenu,helpMenu;
	JMenuItem Ex1_5, Ex6_10,Ex11_15,Ex16_20,closeMenu;
	JButton btok;
	JTextArea txtsearch;
	JScrollPane jScrollPaneTable, jScrollPaneSearch;
	JTable table;
	MenuReport menuReport;
	public ReportApplicant(MenuReport menuReport) {

		Container c = this.getContentPane();
		c.setLayout(new BorderLayout());
		JPanel SearchPanel = new JPanel(new FlowLayout());

		btok = new JButton("ค้นหา");
		txtsearch = new JTextArea(7, 50);
		jScrollPaneSearch = new JScrollPane(txtsearch);

		SearchPanel.add(jScrollPaneSearch);
		SearchPanel.add(btok);
		c.add(SearchPanel, BorderLayout.NORTH);
	
		
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("โจทย์ปัญหา");
		JMenu helpMenu = new JMenu("พิมพ์รายงาน");
		Ex1_5 = new JMenuItem("ข้อ 1-ข้อ5");
		Ex6_10 = new JMenuItem("ข้อ 6-ข้อ10");
		Ex11_15 = new JMenuItem("ข้อ 11-ข้อ15");
		Ex16_20 = new JMenuItem("ข้อ 16-ข้อ20");
		closeMenu = new JMenuItem("Close");


			
		this.setJMenuBar(menuBar);	// add bar to frame
		menuBar.add(fileMenu);  	// add menus to bar
		menuBar.add(helpMenu);
		fileMenu.add(Ex1_5); // add menu items to menus
		fileMenu.add(Ex6_10);
		fileMenu.add(Ex11_15);
		fileMenu.add(Ex16_20);
		fileMenu.add(closeMenu);

				
		//this.setSize(300,200);     
		//this.setTitle("Find A Customer");
		//this.setVisible(true);


		table = new JTable();

		jScrollPaneTable = new JScrollPane(table);
		c.add(jScrollPaneTable, BorderLayout.CENTER);
		Ex1_5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ex1_5();
			}
		});
		Ex6_10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ex6_10();
			}
		});
		Ex11_15.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ex11_15();
			}
		});
		Ex16_20.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ex16_20();
			}
		});
		btok.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				report();
			}
		});

	}
	public void ex1_5() {
		ExDetail1_5 exdeWindow = new ExDetail1_5(this);
		exdeWindow.setSize(950, 700);
		exdeWindow.setTitle("คำสั่งภาษา SQL : กรณีศึกษาธุรกิจนายหน้าจัดหางาน(ข้อ 1-5)"); 
		exdeWindow.setVisible(true);
		//this.setVisible(false);
	};
	public void ex6_10() {
		ExDetail6_10 exdeWindow = new ExDetail6_10(this);
		exdeWindow.setSize(950, 700);
		exdeWindow.setTitle("คำสั่งภาษา SQL : กรณีศึกษาธุรกิจนายหน้าจัดหางาน(ข้อ 6-10)"); 
		exdeWindow.setVisible(true);
		//this.setVisible(false);
	};
	public void ex11_15() {
		ExDetail11_15 exdeWindow = new ExDetail11_15(this);
		exdeWindow.setSize(950, 700);
		exdeWindow.setTitle("คำสั่งภาษา SQL : กรณีศึกษาธุรกิจนายหน้าจัดหางาน(ข้อ 11-15)"); 
		exdeWindow.setVisible(true);
		//this.setVisible(false);
	};
	public void ex16_20() {
		ExDetail16_20 exdeWindow = new ExDetail16_20(this);
		exdeWindow.setSize(950, 700);
		exdeWindow.setTitle("คำสั่งภาษา SQL : กรณีศึกษาธุรกิจนายหน้าจัดหางาน(ข้อ 16-20)"); 
		exdeWindow.setVisible(true);
		//this.setVisible(false);
	};
	public void report() {

		try {

			DefaultTableModel tableModel = new DefaultTableModel();

			String sql = txtsearch.getText().trim();
			if (txtsearch.getSelectedText() != null) {
				sql = txtsearch.getSelectedText();
		    }
			
			if (sql.toLowerCase().startsWith("select")) {  // select command
				ResultSet rs = conn.createStatement().executeQuery(sql);

				// get MetaData
				ResultSetMetaData metaData = rs.getMetaData();

				// Get number of columns from meta data
				int columnCount = metaData.getColumnCount();

				// Get all column names from meta data and add columns to table
				// model
				for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
					tableModel.addColumn(metaData.getColumnLabel(columnIndex));
				}

				// Create array of Objects with size of column count from meta
				// data
				Object[] row = new Object[columnCount];

				// Scroll through result set
				while (rs.next()) {
					// Get object from column with specific index of result set
					// to
					// array of objects
					for (int i = 0; i < columnCount; i++) {
						row[i] = rs.getObject(i + 1);
					}
					// Now add row to table model with that array of objects as
					// an
					// argument
					tableModel.addRow(row);
				}

				// Now add that table model to your table and you are done :D
				table.setModel(tableModel);
				
			} else { // non select command
				PreparedStatement pre = conn.prepareStatement(sql);
				int affectedrows = pre.executeUpdate();
				if (affectedrows != -1) {
					JOptionPane.showMessageDialog(this, "ดำเนินการเรียบร้อยแล้ว จำนวน " + affectedrows + " records.",
							"ผลการดำเนิการ",
							JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(this, "ไม่มีการดำเนินการใดๆ กับข้อมูล",
							"ผลการดำเนิการ",
							JOptionPane.INFORMATION_MESSAGE);
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "คุณพิมพ์คำสั่งผิดพลาด",
					"แจ้งข้อผิดพลาด", JOptionPane.WARNING_MESSAGE);

		}

	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
