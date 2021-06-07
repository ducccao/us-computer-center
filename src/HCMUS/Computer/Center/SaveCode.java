package HCMUS.Computer.Center;

import HCMUS.Computer.Center.Client.DangKyKhoaHocScreen;
import HCMUS.Computer.Center.Client.GiangVienScreen;
import HCMUS.Computer.Center.Client.HocVienScreen;
import HCMUS.Computer.Center.Client.LapLichDayScreen;
import HCMUS.Computer.Center.Client.LapLichHocScreen;
import HCMUS.Computer.Center.Client.LoginScreen;
import HCMUS.Computer.Center.Client.QuanLyTTSceen;
import HCMUS.Computer.Center.Client.TraCuuGiayChungNhanScreen;
import HCMUS.Computer.Center.Client.TraCuuKhoaHocScreen;
import HCMUS.Computer.Center.Client.TraCuuLopHocScreen;
import HCMUS.Computer.Center.Client.TraCuuThongTinHocVienScreen;

public class SaveCode {
public void saveCode() {
	System.out.println("Hi");
	
	
	// Login screen
	LoginScreen loginScreen =new LoginScreen();
	
	loginScreen.render2();
	
	
	// Man hinh Quan ly trung tam tin hoc 
	QuanLyTTSceen qlttScreen=new QuanLyTTSceen();
	
//	qlttScreen.render();
	
	// Man hinh tra cuu lop hoc
	TraCuuLopHocScreen tclhScreen=new TraCuuLopHocScreen();
//	tclhScreen.render();
	
	
	// Man hinh tra cuu khoa hoc
	TraCuuKhoaHocScreen tckhScreen=new TraCuuKhoaHocScreen();
//	tckhScreen.render();
	
	// Man hinh lap lich hoc
	LapLichHocScreen llhScreen=new LapLichHocScreen();
//	llhScreen.render();
	
	
	
	// Man hinh lap lich day
	LapLichDayScreen lldScreen=new LapLichDayScreen();
//	lldScreen.render();
	
	// Man hinh dang ky khoa hoc
	DangKyKhoaHocScreen dkkhScreen=new DangKyKhoaHocScreen();
//	dkkhScreen.render();
	
	// Man hinh tra cuu thong tin hoc vien
	TraCuuThongTinHocVienScreen tctthvScreen=new TraCuuThongTinHocVienScreen();
//	tctthvScreen.render();
	
	// Man hinh tra cuu giay chung nhan
	TraCuuGiayChungNhanScreen tcgcnScreen=new TraCuuGiayChungNhanScreen();
//	tcgcnScreen.render();
	
	
	// man hinh giang vien
	GiangVienScreen gvScreen=new GiangVienScreen();
//	gvScreen.render();
	
	// man hinh hoc vien
	HocVienScreen hvScreen=new HocVienScreen();
//	hvScreen.render();

//	KhoaHocDB khoahocModel=new KhoaHocDB();
//	
//	Vector<String[]> dataKhoaHoc=khoahocModel.getAll();
}
}
