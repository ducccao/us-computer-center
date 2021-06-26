package HCMUS.Computer.Center.Logic;

public class CapNhatHocVienGiayChungNhanController {
	private String maHocVien;
	private String hoTen;
	private String maLop;
	private String tenLop;
	private boolean daNhan;
	
	public void setInfo(String maHocVien,String hoTen, String maLop, String tenLop, boolean daNhan) {
		this.maHocVien=maHocVien;
		this.hoTen=hoTen;
		this.maLop= maLop;
		this.tenLop=tenLop;
		this.daNhan=daNhan;
	}
	
	public void update() {
		
	}
	
}
