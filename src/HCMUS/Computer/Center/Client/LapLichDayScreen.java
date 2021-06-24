package HCMUS.Computer.Center.Client;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import HCMUS.Computer.Center.Data.KhoaHocDB;
import HCMUS.Computer.Center.Logic.LapLichDayController;
import Utils.Utils;

public class LapLichDayScreen {

	
		public void render() {
			JFrame fm =new JFrame();
			fm.setTitle("Lập lịch dạy");
			int fmxSize=600;
			int fmySize=500;
			
			int pdTop=20;
			int pdLeft=80;
			int pdBot=20;
			int pdRight=80;
			
			
			// labels
			JLabel lbMaKhoaHoc=new JLabel("Mã khóa học");
			JLabel lbNgayBatDau=new JLabel("Ngày bắt đầu");
			JLabel lbNgayKT=new JLabel("Ngày kết thúc");
			JLabel lbNgayDayTrongTuan=new JLabel("Ngày dạy trong tuần");
			JLabel lbGioBatDau=new JLabel("Giờ bắt đầu");
			JLabel lbGioKT=new JLabel("Giờ kết thúc");
			
			
			// textfields
			JTextField tfNgayBD=new JTextField();
			JTextField tfNgayKT=new JTextField();
			JTextField tfNgayDayTrongTuan=new JTextField();
			JTextField tfGioBD=new JTextField();
			JTextField tfGioKT=new JTextField();
			
			// buttons
			JButton btnLapLich=new JButton("Lập lịch");
			JButton btnBack=new JButton("Trở về");
			
			// makh combobox
			KhoaHocDB khdb=new KhoaHocDB();
			String dataMaKH[]= khdb.getMaKhoaHoc();
			JComboBox cbbMaKH=new JComboBox(dataMaKH);
			
			// action 
			ActionListener btnBackActionListener= new  ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					fm.dispose();
					return;
				}
			};
			
			ActionListener btnLapLichActionListener=new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					Utils u = new Utils();
					String maLichDay= u.randomString(10);
					String ngayBatDau=tfNgayBD.getText();
					String ngayKetThuc=tfNgayKT.getText();
					String ngayDayTrongTuan= tfNgayDayTrongTuan.getText();
					String gioBatDau=tfGioBD.getText();
					String gioKetThuc=tfGioKT.getText();
					String maKhoaHoc=cbbMaKH.getSelectedItem().toString();
					
					System.out.print(maLichDay+" "+ngayBatDau+" "+ngayKetThuc+" "
							+ngayDayTrongTuan+" "+gioBatDau+" "+gioKetThuc+" "
							+maKhoaHoc+" ");
					
					LapLichDayController lldayController=new LapLichDayController();
					lldayController.setInfo(maLichDay, ngayBatDau, ngayKetThuc, ngayDayTrongTuan, gioBatDau, gioKetThuc, maKhoaHoc);
					lldayController.insertLichDay();

					
					
					JOptionPane op=new JOptionPane();
					op.showMessageDialog(new JFrame(), "Thêm lịch dạy thành công!");
					return;
					
				}
			};
		
			btnBack.addActionListener(btnBackActionListener);
			btnLapLich.addActionListener(btnLapLichActionListener);
			
			// layout
			JPanel topPanel=new JPanel(new GridLayout(2, 1));
			JPanel midPanel=new JPanel(new GridLayout(10, 1));
			JPanel bottomPanel=new JPanel(new GridLayout(1, 1));
			
			topPanel.setBorder(BorderFactory.createEmptyBorder(pdTop, pdLeft, pdBot, pdRight));
			topPanel.add(lbMaKhoaHoc);
			topPanel.add(cbbMaKH);
			
			midPanel.setBorder(BorderFactory.createEmptyBorder(pdTop, pdLeft, pdBot, pdRight));
			midPanel.add(lbNgayBatDau);
			midPanel.add(tfNgayBD);
			midPanel.add(lbNgayKT);
			midPanel.add(tfNgayKT);
			midPanel.add(lbNgayDayTrongTuan);
			midPanel.add(tfNgayDayTrongTuan);
			midPanel.add(lbGioBatDau);
			midPanel.add(tfGioBD);
			midPanel.add(lbGioKT);
			midPanel.add(tfGioKT);
			
			bottomPanel.setBorder(BorderFactory.createEmptyBorder(pdTop,pdLeft,pdBot,pdRight));
			bottomPanel.add(btnLapLich);
			bottomPanel.add(btnBack);
			

			fm.add(topPanel,BorderLayout.NORTH);
			fm.add(midPanel,BorderLayout.CENTER);
			fm.add(bottomPanel,BorderLayout.SOUTH);
			
			fm.setSize(fmxSize,fmySize);
			fm.setLocationRelativeTo(null);
			fm.setVisible(true);
			
		}
}
