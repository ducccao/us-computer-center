package HCMUS.Computer.Center.Logic;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import HCMUS.Computer.Center.Data.HocVienKetQuaKhoaHocDB;

public class HocVienKetQuaKhoaHocController {
	private String GPA;
	private boolean daDau;
	private String maKhoaHoc;
	private String maHocVien;
	
	public void setInfo ( String maHocVien,String GPA,boolean daDau,String maKhoaHoc) {
		this.GPA=GPA;
		this.daDau=daDau;
		this.maKhoaHoc=maKhoaHoc;
		this.maHocVien=maHocVien;
	}
	
	public void updateKetQua() {
		HocVienKetQuaKhoaHocDB kqdb=new HocVienKetQuaKhoaHocDB();
		
		if(this.maKhoaHoc.trim().equals("")||this.maHocVien.trim().equals("")
				||this.GPA.trim().equals("")) {
			JOptionPane op=new JOptionPane();
			op.showMessageDialog(new JFrame(), "Dữ liệu không được rỗng!");
			return;
		}
		if(Integer.parseInt(GPA)>10||Integer.parseInt(GPA)<0) {
			JOptionPane op=new JOptionPane();
			op.showMessageDialog(new JFrame(), "GPA sai định dạng");
			return;
		}
	
		System.out.println(maHocVien+" "+ GPA+" "+ daDau+" "+ maKhoaHoc);
		
		kqdb.update(maHocVien, GPA, daDau, maKhoaHoc);
		return;
	}
	
	
	
}
