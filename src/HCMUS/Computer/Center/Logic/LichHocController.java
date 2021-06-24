package HCMUS.Computer.Center.Logic;

import HCMUS.Computer.Center.Data.LichHocDB;

public class LichHocController {
	public void lapLichHoc(String ngayBatDau, String ngayKetThuc,String ngayHocTrongTuan,String gioBatDau
			,String gioKetThuc,String maKhoaHoc) {
			LichHocDB lichhocModel=new LichHocDB();
			lichhocModel.lapLichHoc(ngayBatDau, ngayKetThuc, ngayHocTrongTuan, gioBatDau, gioKetThuc, maKhoaHoc);
	}
}
