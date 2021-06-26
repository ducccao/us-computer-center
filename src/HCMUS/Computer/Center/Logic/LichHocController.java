package HCMUS.Computer.Center.Logic;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import HCMUS.Computer.Center.Data.LichHocDB;

public class LichHocController {
	public void lapLichHoc(String ngayBatDau, String ngayKetThuc,String ngayHocTrongTuan,String gioBatDau
			,String gioKetThuc,String maKhoaHoc) {
		if(ngayBatDau.equals("")||ngayKetThuc.equals("")||ngayHocTrongTuan.equals("")
				||gioBatDau.equals("") ||gioKetThuc.equals("")||maKhoaHoc.equals("")) {
			JOptionPane op = new JOptionPane();
			op.showMessageDialog(new JFrame(), "Thông tin không được rỗng!");
			return;
		}
		
			LichHocDB lichhocModel=new LichHocDB();
			lichhocModel.lapLichHoc(ngayBatDau, ngayKetThuc, ngayHocTrongTuan, gioBatDau, gioKetThuc, maKhoaHoc);
	}
}
