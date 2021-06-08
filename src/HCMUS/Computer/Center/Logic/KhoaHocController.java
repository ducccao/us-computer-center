package HCMUS.Computer.Center.Logic;
import java.util.Vector;
import HCMUS.Computer.Center.Data.KhoaHocDB;


public class KhoaHocController {
	private Vector<String[]> khoahocData=new Vector<String[]>(0);
	
	public Vector<String[]> layKhoaHocData(){
		KhoaHocDB khModel=new KhoaHocDB();
		khoahocData=khModel.layDataThongTinLopHoc();
		return khoahocData;
	}
	
}
