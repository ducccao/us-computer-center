package HCMUS.Computer.Center.Client;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import HCMUS.Computer.Center.Data.HocVienKetQuaKhoaHocDB;
import HCMUS.Computer.Center.Logic.HocVienKetQuaKhoaHocController;

public class HocVienKetQuaKhoaHocScreen {
	 JFrame f = new JFrame();

	 
	 JLabel lbMaKhoaHoc=new JLabel("Mã khóa học");
	 JLabel lbGPA=new JLabel("GPA: ");
	 JLabel lbDD=new JLabel("Đã đậu");
	 
	 JTextField tfGPA=new JTextField();
	 JComboBox cbbMaKH;
	 JCheckBox chbDD=new JCheckBox();
	 
	 // buttons
	 JButton btnBack=new JButton("Trở về");
	 JButton btnCapNhat=new JButton("Cập nhật");
	 
	 JTable tblKetQuaHocTap;
	 JScrollPane scrollPanel;
	 
	 // panels
	 JPanel topPanel=new JPanel(new GridLayout(1,1));
	 JPanel midPanel=new JPanel(new GridLayout(3,2));
	 JPanel botPanel=new JPanel(new GridLayout(1,2));
	 
	 ActionListener btnBackActionListener=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f.dispose();
			}
		};
		

	public void render(String mahv) {
	
		 f.setTitle("Học viên - kết quả khóa học");
		
		 int xSize=600;
		 int ySize=600;
			int pdTop=20;
			int pdLeft=80;
			int pdBot=20;
			int pdRight=80;
			
		 
		 // student detail
		
		 HocVienKetQuaKhoaHocDB kqkhdb=new HocVienKetQuaKhoaHocDB();
		 kqkhdb.findByMaHV(mahv);
		 String[][] studentDetail=kqkhdb.getDataAfterFind();
		 
//		 JLabel lbstudentDetail=new JLabel("<html>"
//		 		+ "<br/>Mã học viên: "+studentDetail[0]
//		 		+ "<br/>GPA:  "+studentDetail[1]
//		 		+ "<br/>Đã đậu: "+studentDetail[2]
//		 		+ "<br/>Mã khóa học: "+studentDetail[3]
//		 		+ "<html/>");
		 
		 // edit info
		 
			ActionListener btnCapNhatActionListener=new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					HocVienKetQuaKhoaHocController hvkqController=new HocVienKetQuaKhoaHocController();
					
					String maHocVien=mahv;
					String gpa=tfGPA.getText().toString().trim();
					boolean daDau=chbDD.isSelected();
					String maKhoaHoc=cbbMaKH.getSelectedItem().toString().trim();
					
					hvkqController.setInfo(maHocVien,gpa, daDau, maKhoaHoc);
					hvkqController.updateKetQua();
					
				
					
				}
			}; 
		

		 
		 kqkhdb.findAllMaKhoaHocHocVienDaHoc(mahv);
		 
	
		  cbbMaKH=new JComboBox(kqkhdb.getAllMaKhoaHocHocVienHoc());

	
		 btnBack.addActionListener(btnBackActionListener);
		 btnCapNhat.addActionListener(btnCapNhatActionListener);
		 
		 // table
	
		 
		 String col[]= {"Mã học viên","GPA","Đã đậu","Mã khóa học"};

		  tblKetQuaHocTap=new JTable(studentDetail,col);
		  scrollPanel=new JScrollPane(tblKetQuaHocTap);
		

		 
//		 topPanel.add(lbKetQua);
		 topPanel.add(scrollPanel);
		 
		 midPanel.add(lbMaKhoaHoc);
		 midPanel.add(cbbMaKH);
		 midPanel.add(lbGPA);
		 midPanel.add(tfGPA);
		 midPanel.add(lbDD);
		 midPanel.add(chbDD);
		 
		 botPanel.add(btnCapNhat);
		 botPanel.add(btnBack);
		 f.setSize(xSize,ySize);
	
		 f.add(topPanel,BorderLayout.NORTH);
		 f.add(midPanel,BorderLayout.CENTER);
		 f.add(botPanel,BorderLayout.SOUTH);

	
		 
		 f.setLocationRelativeTo(null);
		 f.setVisible(true);
	}
}
