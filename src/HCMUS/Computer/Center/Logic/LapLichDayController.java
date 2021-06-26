package HCMUS.Computer.Center.Logic;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import HCMUS.Computer.Center.Data.LichDayDB;

public class LapLichDayController {
	private String maLichDay;
	private String ngayBatDau;
	private String ngayKetThuc;
	private String ngayDayTrongTuan;
	private String gioBatDau;
	private String gioKetThuc;
	private String maKhoaHoc;
	
	public void setInfo(String maLichDay,String ngayBatDau,String ngayKetThuc,
			String ngayDayTrongTuan,String gioBatDau ,String gioKetThuc,String maKhoaHoc) {
		this.maLichDay=maLichDay;
		this.ngayBatDau=ngayBatDau;
		this.ngayKetThuc=ngayKetThuc;
		this.ngayDayTrongTuan=ngayDayTrongTuan;
		this.gioBatDau=gioBatDau;
		this.gioKetThuc=gioKetThuc;
		this.maKhoaHoc=maKhoaHoc;
	}
	
	public void insertLichDay() {
		LichDayDB lichDayDB=new LichDayDB();
		
		if(maLichDay.equals("")||ngayBatDau.equals("")||ngayKetThuc.equals("")
				||ngayDayTrongTuan.equals("")||gioBatDau.equals("")||gioKetThuc.equals("")
				||maKhoaHoc.equals("")) {
			JOptionPane op= new JOptionPane();
			op.showMessageDialog(new JFrame(), "Thông tin không được rỗng!");
			return;
		}
		
		lichDayDB.insert(maLichDay, ngayBatDau, ngayKetThuc, ngayDayTrongTuan, gioBatDau, gioKetThuc, maKhoaHoc);
		return;
	}
}
