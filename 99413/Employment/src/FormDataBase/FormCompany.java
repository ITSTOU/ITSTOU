package FormDataBase;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Employment.MyConnect;

public class FormCompany extends javax.swing.JFrame {
	private Connection conn = MyConnect.getConnection();
	private DefaultTableModel modelCompany;

	public FormCompany() {
		initComponents();
		modelCompany = (DefaultTableModel) tableComp.getModel();
		showData();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		txtCompId = new javax.swing.JTextField();
		txtCompName = new javax.swing.JTextField();
		txtCompAddr = new javax.swing.JTextField();
		txtCompChw = new javax.swing.JTextField();
		txtCompPerson = new javax.swing.JTextField();
		cmdSaveCom = new javax.swing.JButton();
		jScrollPane2 = new javax.swing.JScrollPane();
		tableComp = new javax.swing.JTable();
		cmdUpdateCom = new javax.swing.JButton();

		cmdUpdateCom.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				update();
			}
		});

		cmdDeleteCom = new javax.swing.JButton();
		cmdDeleteCom.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				delete();
			}
		});

		jPanel1 = new javax.swing.JPanel();
		txtSearchCom = new javax.swing.JTextField();

		txtSearchCom.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				// if(!txtSearchCom.getText().trim().isEmpty())
				// {
				showData();
				// }
			}
		});

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane1.setViewportView(jTable1);
		jLabel1.setText("รหัสบริษัท (COMP_ID) ");
		jLabel2.setText("ชื่อบริษัท (COMP_NAME)");
		jLabel3.setText("ที่อยู่บริษัท (COMP_ADDR)");
		jLabel4.setText("จังหวัดที่บริษัทอยู่ (COMP_CHW)");
		jLabel5.setText("ชื่อผู้ติดต่อ (COMP_PERSON)");
		cmdSaveCom.setText("บันทึก");
		cmdSaveCom.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				insert();
			}
		});

		tableComp.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null },
						{ null, null, null, null, null, null },
						{ null, null, null, null, null, null },
						{ null, null, null, null, null, null } }, new String[] {
						"รหัสบริษัท", "ชื่อบริษัท ", "ที่อยู่บริษัท ",
						"จังหวัดที่บริษัทอยู่", "ชื่อผู้ติดต่อ " }) {
			boolean[] canEdit = new boolean[] { false, false, false, false,
					false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});

		tableComp.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int index = tableComp.getSelectedRow();
				txtCompId.setText(tableComp.getValueAt(index, 0).toString());
				txtCompName.setText(tableComp.getValueAt(index, 1).toString());
				txtCompAddr.setText(tableComp.getValueAt(index, 2).toString());
				txtCompChw.setText(tableComp.getValueAt(index, 3).toString());
				txtCompPerson
						.setText(tableComp.getValueAt(index, 4).toString());
			}
		});
		jScrollPane2.setViewportView(tableComp);
		if (tableComp.getColumnModel().getColumnCount() > 0) {
			tableComp.getColumnModel().getColumn(0).setPreferredWidth(5);
			tableComp.getColumnModel().getColumn(1).setPreferredWidth(25);
			tableComp.getColumnModel().getColumn(2).setPreferredWidth(25);
			tableComp.getColumnModel().getColumn(3).setPreferredWidth(12);
			tableComp.getColumnModel().getColumn(4).setPreferredWidth(6);
		}
		cmdUpdateCom.setText("แก้ไข");
		cmdDeleteCom.setText("ลบ");
		jPanel1.setBorder(javax.swing.BorderFactory
				.createTitledBorder("ค้นหาข้อมูล"));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel1Layout.createSequentialGroup().addContainerGap()
						.addComponent(txtSearchCom).addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel1Layout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(txtSearchCom,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(116, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														javax.swing.GroupLayout.Alignment.LEADING,
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				false)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(
																														jLabel1)
																												.addComponent(
																														jLabel2)
																												.addComponent(
																														jLabel3)
																												.addComponent(
																														jLabel4)
																												.addComponent(
																														jLabel5))
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addGroup(
																														javax.swing.GroupLayout.Alignment.TRAILING,
																														layout.createSequentialGroup()
																																.addGap(20,
																																		20,
																																		20)
																																.addComponent(
																																		txtCompPerson,
																																		javax.swing.GroupLayout.PREFERRED_SIZE,
																																		195,
																																		javax.swing.GroupLayout.PREFERRED_SIZE))
																												.addGroup(
																														layout.createSequentialGroup()
																																.addGap(18,
																																		18,
																																		18)
																																.addGroup(
																																		layout.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING)
																																				.addComponent(
																																						txtCompId,
																																						javax.swing.GroupLayout.PREFERRED_SIZE,
																																						197,
																																						javax.swing.GroupLayout.PREFERRED_SIZE)
																																				.addComponent(
																																						txtCompName,
																																						javax.swing.GroupLayout.Alignment.TRAILING,
																																						javax.swing.GroupLayout.PREFERRED_SIZE,
																																						195,
																																						javax.swing.GroupLayout.PREFERRED_SIZE)
																																				.addComponent(
																																						txtCompAddr,
																																						javax.swing.GroupLayout.Alignment.TRAILING,
																																						javax.swing.GroupLayout.PREFERRED_SIZE,
																																						195,
																																						javax.swing.GroupLayout.PREFERRED_SIZE)
																																				.addComponent(
																																						txtCompChw,
																																						javax.swing.GroupLayout.Alignment.TRAILING,
																																						javax.swing.GroupLayout.PREFERRED_SIZE,
																																						195,
																																						javax.swing.GroupLayout.PREFERRED_SIZE)))))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										cmdSaveCom)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																								.addComponent(
																										cmdUpdateCom)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																								.addComponent(
																										cmdDeleteCom)
																								.addGap(0,
																										0,
																										Short.MAX_VALUE)))
																.addGap(44, 44,
																		44)
																.addComponent(
																		jPanel1,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(0,
																		15,
																		Short.MAX_VALUE)
																.addComponent(
																		jScrollPane2,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		618,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(21, 21, 21)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING,
												false)
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jLabel1)
																				.addComponent(
																						txtCompId,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jLabel2)
																				.addComponent(
																						txtCompName,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jLabel3)
																				.addComponent(
																						txtCompAddr,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jLabel4)
																				.addComponent(
																						txtCompChw,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGap(8, 8, 8)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jLabel5)
																				.addComponent(
																						txtCompPerson,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addComponent(
														jPanel1,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(cmdSaveCom)
												.addComponent(cmdUpdateCom)
												.addComponent(cmdDeleteCom))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jScrollPane2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										258,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));

		pack();
	}// </editor-fold>

	private void cmdSaveComActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void formInternalFrameOpened(
			javax.swing.event.InternalFrameEvent evt) {
		// TODO add your handling code here:
		showData();

	}

	public void update() {
		int index = tableComp.getSelectedRow();
		if (index != -1) {
			String pk = tableComp.getValueAt(index, 0).toString();
			String sql = "UPDATE COMPANY SET" + " COMP_NAME=?,"
					+ " COMP_ADDR=?," + " COMP_CHW=?," + " COMP_PERSON=?"
					+ " WHERE COMP_ID=?";
			try {
				PreparedStatement pre = conn.prepareStatement(sql);
				pre.setString(1, txtCompName.getText().trim());
				pre.setString(2, txtCompAddr.getText().trim());
				pre.setString(3, txtCompChw.getText().trim());
				pre.setString(4, txtCompPerson.getText().trim());
				pre.setString(5, pk);

				int i = pre.executeUpdate();
				if (i != -1) // ok
				{
					JOptionPane.showMessageDialog(this, "Update เรียบร้อยแล้ว",
							"ผลการทำงาน", JOptionPane.INFORMATION_MESSAGE);
					clear();
					showData();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

	public void clear() {
		txtCompId.setText("");
		txtCompName.setText("");
		txtCompAddr.setText("");
		txtCompChw.setText("");
		txtCompPerson.setText("");
	}

	public void delete() {
		int index = tableComp.getSelectedRow();
		if (index != -1) {
			String pk = tableComp.getValueAt(index, 0).toString();
			String sql = "DELETE FROM COMPANY " + " WHERE COMP_ID=?";
			try {
				PreparedStatement pre = conn.prepareStatement(sql);
				pre.setString(1, pk);

				int i = pre.executeUpdate();
				if (i != -1) // ok
				{
					JOptionPane.showMessageDialog(this, "DELETE เรียบร้อยแล้ว",
							"ผลการทำงาน", JOptionPane.INFORMATION_MESSAGE);
					clear();
					showData();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

	public void insert() {
		String sql = "INSERT INTO COMPANY VALUES (?,?,?,?,?)";
		try {
			PreparedStatement pre = conn.prepareStatement(sql);
			pre.setString(1, txtCompId.getText().trim());
			pre.setString(2, txtCompName.getText().trim());
			pre.setString(3, txtCompAddr.getText().trim());
			pre.setString(4, txtCompChw.getText().trim());
			pre.setString(5, txtCompPerson.getText().trim());

			int i = pre.executeUpdate();
			if (i != -1) // ok
			{
				JOptionPane.showMessageDialog(this, "INSERT เรียบร้อยแล้ว",
						"ผลการทำงาน", JOptionPane.INFORMATION_MESSAGE);
				clear();
				showData();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void showData() {
		try {
			// clear old data in table
			int totalRow = tableComp.getRowCount() - 1;
			while (totalRow > -1) {
				modelCompany.removeRow(totalRow);
				totalRow--;
			}

			// search
			String search = txtSearchCom.getText().trim();
			String sql = "SELECT * FROM COMPANY " + " WHERE COMP_NAME LIKE '%"
					+ search + "%' " + " OR COMP_ADDR LIKE '%" + search + "%' "
					+ " OR COMP_CHW LIKE '%" + search + "%' "
					+ " OR COMP_PERSON LIKE '%" + search + "%'";

			ResultSet rs = conn.createStatement().executeQuery(sql);

			int row = 0;
			while (rs.next()) {
				modelCompany.addRow(new Object[0]);
				modelCompany.setValueAt(rs.getString("COMP_ID"), row, 0);
				modelCompany.setValueAt(rs.getString("COMP_NAME"), row, 1);
				modelCompany.setValueAt(rs.getString("COMP_ADDR"), row, 2);
				modelCompany.setValueAt(rs.getString("COMP_CHW"), row, 3);
				modelCompany.setValueAt(rs.getString("COMP_PERSON"), row, 4);
				row++;
			}
			tableComp.setModel(modelCompany);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// Variables declaration - do not modify
	private javax.swing.JButton cmdDeleteCom;
	private javax.swing.JButton cmdSaveCom;
	private javax.swing.JButton cmdUpdateCom;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTable jTable1;
	private javax.swing.JTable tableComp;
	private javax.swing.JTextField txtCompId;
	private javax.swing.JTextField txtCompName;
	private javax.swing.JTextField txtCompAddr;
	private javax.swing.JTextField txtCompChw;
	private javax.swing.JTextField txtCompPerson;
	private javax.swing.JTextField txtSearchCom;
}
