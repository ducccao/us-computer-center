package HCMUS.Computer.Center.Client;
import javax.swing.*;

import HCMUS.Computer.Center.Data.KhoaHocDB;
import HCMUS.Computer.Center.Logic.LichHocController;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LapLichHocScreen {
	JFrame fm;
	// labels
	JLabel lbMaKhoaHoc=new JLabel("Mã khóa học");
	JLabel lbNgayBatDau=new JLabel("Ngày bắt đầu");
	JLabel lbNgayKT=new JLabel("Ngày kết thúc");
	JLabel lbNgayHocTrongTuan=new JLabel("Ngày học trong tuần");
	JLabel lbGioBatDau=new JLabel("Giờ bắt đầu");
	JLabel lbGioKT=new JLabel("Giờ kết thúc");
	
	// textfield
	JTextField tfNgayBD=new JTextField();
	JTextField tfNgayKT=new JTextField();
	JTextField tfNgayHocTrongTuan=new JTextField();
	JTextField tfGioBD=new JTextField();
	JTextField tfGioKT=new JTextField();
	
	JComboBox cbbMaKH;
	
	JPanel posNORTH3=new JPanel();
	JPanel posCENTER3=new JPanel(new GridLayout(10,1));
	JPanel posSOUTH3=new JPanel(new GridLayout(1,1));
	
	GridLayout pos3Grid=new GridLayout(2,1);
	
	
	// buttons
	JButton btnLapLich=new JButton("Lập lịch");
	JButton btnBack=new JButton("Trở về");
	ActionListener btnBackListener=new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			fm.dispose();
			
		}
	};
	
	ActionListener btnLapLichActionListener=new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String ngayBatDau=tfNgayBD.getText();
			String ngayKetThuc=tfNgayKT.getText();
			String ngayHocTrongTuan=tfNgayHocTrongTuan.getText();
			String gioBatDau=tfGioBD.getText();
			String gioKetThuc=tfGioKT.getText();
			String maKhoaHoc=cbbMaKH.getSelectedItem().toString();
			
			LichHocController lichhocController=new LichHocController();
			lichhocController.lapLichHoc(ngayBatDau, ngayKetThuc, ngayHocTrongTuan, gioBatDau, gioKetThuc, maKhoaHoc);
	
			
		}
	};
	
	
	public void render() {
		 fm=new JFrame();
		fm.setTitle("Lập lịch học");
		int fmxSize=600;
		int fmySize=500;
		

	
		// makh combobox
		KhoaHocDB khdb=new KhoaHocDB();
		String dataMaKH[]= khdb.getMaKhoaHoc();
		cbbMaKH=new JComboBox(dataMaKH);
		
	
		

		
		btnBack.addActionListener(btnBackListener);
		btnLapLich.addActionListener(btnLapLichActionListener);
		

		
		// panel
	

		

		
		posNORTH3.setBorder(BorderFactory.createEmptyBorder(5,80,5,80));
		posNORTH3.setLayout(pos3Grid);
		
		posCENTER3.setBorder(BorderFactory.createEmptyBorder(5,80,5,80));
		posSOUTH3.setBorder(BorderFactory.createEmptyBorder(5,80,80,80));
		
		
	
		
		posNORTH3.add(lbMaKhoaHoc);
		posNORTH3.add(cbbMaKH);
		
		posCENTER3.add(lbNgayBatDau);
		posCENTER3.add(tfNgayBD);
		posCENTER3.add(lbNgayHocTrongTuan);
		posCENTER3.add(tfNgayHocTrongTuan);
		posCENTER3.add(lbNgayKT);
		posCENTER3.add(tfNgayKT);
		posCENTER3.add(lbGioBatDau);
		posCENTER3.add(tfGioBD);
		posCENTER3.add(lbGioKT);
		posCENTER3.add(tfGioKT);
		
		posSOUTH3.add(btnLapLich);
		posSOUTH3.add(btnBack);
		
		
		

		
		
		
		
		
//		fm.add(pn);
		
		fm.add(posNORTH3,BorderLayout.NORTH);
		fm.add(posCENTER3,BorderLayout.CENTER);
		fm.add(posSOUTH3,BorderLayout.SOUTH);
	
		
		
		fm.setSize(fmxSize,fmySize);
		fm.setLocationRelativeTo(null);
		fm.setVisible(true);
		
	}
}
