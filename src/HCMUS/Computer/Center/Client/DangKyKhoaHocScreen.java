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
import javax.swing.JPanel;
import javax.swing.JTextField;

import HCMUS.Computer.Center.Data.KhoaHocDB;
import HCMUS.Computer.Center.Logic.DangKyKhoaHocController;
import Utils.Utils;

public class DangKyKhoaHocScreen {
	public void render() {
		JFrame fm= new JFrame();
		fm.setTitle("Đăng ký khóa học");
		int x=600;
		int y=400;
				
		int pdTop=20;
		int pdLeft=80;
		int pdBot=20;
		int pdRight=80;
		
		// labels
		JLabel lbTenHocVien=new JLabel("Tên học viên");
		JLabel lbNgaySinh=new JLabel("Ngày sinh");
		JLabel lbDiaChi=new JLabel("Địa chỉ");
		JLabel lbSDT=new JLabel("Số điện thoại");
		JLabel lbTenKhoaHoc=new JLabel("Tên khóa học");
		JLabel lbDaThuPhi=new JLabel("Đã thu phí");
		
		// inputs
		KhoaHocDB khdb=new KhoaHocDB();
		String dataTenKH[]= khdb.getTenKhoaHoc();
		
		JTextField tfTenHocVien=new JTextField();
		JTextField tfNgaySinh=new JTextField();
		JTextField tfDiaChi=new JTextField();
		JTextField tfSDT=new JTextField();
		JComboBox cbbTenKhoaHoc=new JComboBox(dataTenKH);
		JCheckBox cbDaThuPhi=new JCheckBox();
		
		// buttons
		JButton btnDangKy=new JButton("Đăng ký");
		JButton btnBack=new JButton("Trở về");
		
		// panels
		JPanel topPanel=new JPanel(new GridLayout(2,1));
		topPanel.setBorder(BorderFactory.createEmptyBorder(pdTop, pdLeft, pdBot, pdRight));
		
		
		
		JPanel midPanel=new JPanel(new GridLayout(12,1));
		midPanel.setBorder(BorderFactory.createEmptyBorder(pdTop, pdLeft, pdBot, pdRight));
		
		midPanel.add(lbTenHocVien);
		midPanel.add(tfTenHocVien);
		midPanel.add(lbNgaySinh);
		midPanel.add(tfNgaySinh);
		midPanel.add(lbDiaChi);
		midPanel.add(tfDiaChi);
		midPanel.add(lbSDT);
		midPanel.add(tfSDT);
		midPanel.add(lbTenKhoaHoc);
		midPanel.add(cbbTenKhoaHoc);
		midPanel.add(lbDaThuPhi);
		midPanel.add(cbDaThuPhi);
		
		
		
		JPanel botPanel=new JPanel(new GridLayout(1,1));
		botPanel.setBorder(BorderFactory.createEmptyBorder(pdTop, pdLeft, pdBot, pdRight));
		botPanel.add(btnDangKy);
		botPanel.add(btnBack);
		
		// submit
		ActionListener btnDangKyActionListener= new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 String tenhv= tfTenHocVien.getText();
				 String ngaysinh= tfNgaySinh.getText();
				 String diachi= tfDiaChi.getText();
				 String sdt= tfSDT.getText();
				 String tenkhoahoc=cbbTenKhoaHoc.getSelectedItem().toString().trim();
				 boolean isThuPhi=cbDaThuPhi.isSelected();
				 
				 KhoaHocDB khdb=new KhoaHocDB();
			
				 String[]tenkhoahocData=khdb.getTenKhoaHoc();
				 String[]makhoahocData=khdb.getMaKhoaHoc();
				 
				 String manv="NVQL01";

				 Utils u = new Utils();
				 
				 String mahv=u.randomString(10);
				 String makhoahoc="";
				 
				 for(int i=0;i<tenkhoahocData.length;++i) {
//					 System.out.println(tenkhoahocData[i]);
//					 System.out.println(tenkhoahoc);
					 System.out.println(tenkhoahocData[i].trim().equals(tenkhoahoc));
			
					 if(tenkhoahocData[i].equals(tenkhoahoc)==true) {
						 makhoahoc=makhoahocData[i];

						 break;
					 }
				 }
			
				 DangKyKhoaHocController dangKyKhoaHocController=new DangKyKhoaHocController();
				 dangKyKhoaHocController.setInfo(mahv,tenhv , ngaysinh, diachi, sdt,makhoahoc,manv,isThuPhi);
				 dangKyKhoaHocController.insertChiTietThanhToanKhoaHoc();
				return;
			}
		};
		
		btnDangKy.addActionListener(btnDangKyActionListener);
		
		
		
		fm.add(topPanel,BorderLayout.NORTH);
		fm.add(midPanel,BorderLayout.CENTER);
		fm.add(botPanel,BorderLayout.SOUTH);
		

		fm.setSize(x,y);
		fm.setLocationRelativeTo(null);
		fm.setVisible(true);
		
		
	} 
}
