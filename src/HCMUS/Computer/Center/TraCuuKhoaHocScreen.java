package HCMUS.Computer.Center;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.*;

public class TraCuuKhoaHocScreen {
	public void render() {
		JFrame f=new JFrame();
		f.setTitle("Tra cứu khóa học");
		
		int fmxSize=600;
		int fmySize=400;
		
		
		// labels
		JLabel lbTCKH=new JLabel("Danh sách khóa học");
		lbTCKH.setBounds(fmxSize/2-150/2,20,150,50);
		
		// Table
		String[]column= { "Mã khóa học","Tên khóa học","Học phí","Mã lớp học" };
		String[][] data= { {"KH01","Kỹ thuật máy tính","3000000","LH01"} };
		JTable tbDanhSachKhoaHoc=new JTable(data,column);
		tbDanhSachKhoaHoc.setBounds(10,60,10,60);
		JScrollPane sp=new JScrollPane(tbDanhSachKhoaHoc);
	
		// buttons
		JButton btnBack=new JButton("Trở về");
		btnBack.setBounds(150, 150, 150, 150);
		
		// panel
		Panel panel=new Panel();
		panel.setLayout(new GridLayout(3,1));
		panel.add(lbTCKH);
		panel.add(sp);
		panel.add(btnBack);
		
//		f.setLayout(null);
		f.add(panel);
	

		f.setSize(fmxSize,fmySize);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
}
