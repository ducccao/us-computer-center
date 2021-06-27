package HCMUS.Computer.Center.Client;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import HCMUS.Computer.Center.Data.GiayChungNhanDB;

public class CapNhatHocVienGiayChungNhanScreen {
	JFrame f=new JFrame();
	
	JTable tbInfoGiayCN;
	JScrollPane srollPane;
	
	JLabel lbMaLop;
	String[] dataMaLop ;
	JComboBox<String> cbbMaLop;
	
	JLabel lbDaNhan= new JLabel("Đã nhận");
	JCheckBox chbDaNhan= new JCheckBox();
	
	// button
	JButton btnBack=new JButton("Trở về");
	JButton btnUpdate = new JButton("Cập nhật");
	
	// layout
	JPanel topPanel=new JPanel(new GridLayout(1,1));
	JPanel midPanel= new JPanel(new GridLayout(2,2));
	JPanel botPanel= new JPanel(new GridLayout(1,2));
	
	
	ActionListener btnBackAction = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			f.dispose();
			return;
		}
	};

	
	public void render(String mahv) {
		
		f.setTitle("Cập nhật học viên - giấy chứng nhận");
		int x=600;
		int y= 800;
		
		// get data from DB
		GiayChungNhanDB cndb= new GiayChungNhanDB();
		cndb.findDataByMaHV(mahv);
		
	
		
		// top panel content
		cndb.getAll();
		String[] cols= {"Mã học viên","Họ tên","Mã lớp","Tên lớp","Đã nhận"};
		 tbInfoGiayCN=new JTable(cndb.getDataFoundByMaHV(),cols);
		 srollPane= new JScrollPane(tbInfoGiayCN);
	
		
		// mid panel content
		 lbMaLop=new JLabel("Mã lớp");
		String[] dataMaLop = cndb.getMaLop();
		cbbMaLop= new JComboBox<String>(dataMaLop);
		
		ActionListener btnUpdateAction= new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				GiayChungNhanDB cndb= new GiayChungNhanDB();
				String malop=cbbMaLop.getSelectedItem().toString();
				boolean daNhan=chbDaNhan.isSelected();
				cndb.update(daNhan, mahv, malop);
			}
		};
	
	
		
		btnBack.addActionListener(btnBackAction);
		btnUpdate.addActionListener(btnUpdateAction);
		
	
		
		topPanel.add(srollPane);
	
		midPanel.add(lbMaLop);
		midPanel.add(cbbMaLop);
		midPanel.add(lbDaNhan);
		midPanel.add(chbDaNhan);
		
		botPanel.add(btnUpdate);
		botPanel.add(btnBack);
		
		f.add(topPanel,BorderLayout.NORTH);
		f.add(midPanel,BorderLayout.CENTER);
		f.add(botPanel,BorderLayout.SOUTH);
		
		f.setSize(x,y);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
}
