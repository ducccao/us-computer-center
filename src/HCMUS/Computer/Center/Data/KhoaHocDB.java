package HCMUS.Computer.Center.Data;
import java.sql.*;
import java.util.Vector;
public class KhoaHocDB {
	private String Url="jdbc:mysql://localhost:3306/us-computer-center";
	private String username="root";
	private String password="root";
	private String tblName="khoahoc";
	private String maKhoaHocData[]=new String[0];
	private String tenKhoaHocDatac[]=new String[0];
	private String hocPhiData[]=new String[0];
	private String maLopData[]=new String[0];
	private Vector<String[]> all=new Vector<String[]>(0);
	
	
	public KhoaHocDB() {
		layThongTin();
	}
	
	public String[] addElementIntoArray( String[] a, String ele) {
		if(a.length==0) {
			String[] ret=new String[1];
			ret[0]=ele;
			return ret;
		}
		
		
		int len=a.length;
		String[] ret= new String[len+1];
		
		for(int i=0;i<len;++i) {
			ret[i]=a[i];
		}
		ret[ret.length-1]=ele;
		return ret;
	}
	
	public Vector<String[]> addArrayIntoArray(String[]arrInput,Vector<String[]> arrNeedToAdd) {
		if(arrNeedToAdd.size()==0) {
			Vector<String[]> ret=new Vector<String[]>(0);
			ret.add(arrInput);
			return ret;
		}
		Vector<String[]> ret= new Vector<String[]>(arrNeedToAdd.size());
		ret.add(arrInput);
		return ret;
		
	}
	
	
	public void logArray(String[] a) {
		for(int i=0;i<a.length;++i)System.out.print(a[i]+" ");
		System.out.println("");
		return;
	}
	
	private void logVectorString(Vector<String[]>a) {
		for(int i=0;i<a.size();++i) {
			for(int j=0;j<a.get(i).length;++j) {
				System.out.print(a.get(i)[j]+" ");
			}
			System.out.println("");
		}
		
		
	}
	
	public void layThongTin() {
			try {
				Connection conn=DriverManager.getConnection(Url,username,password);
				Statement stmt=conn.createStatement();
				
				String sql="select * from "+ tblName;
				
				ResultSet rs=stmt.executeQuery(sql);

				
//				String maKhoaHocData[]= {};
				
				while(rs.next())  {
					String maKhoaHoc=rs.getString("maKhoaHoc");
					String tenKhoaHoc=rs.getString("tenKhoaHoc");
					String hocPhi=rs.getString("hocPhi");
					String maLop=rs.getString("maLop");
					
					maKhoaHocData=addElementIntoArray(maKhoaHocData,maKhoaHoc);
					tenKhoaHocDatac=addElementIntoArray(tenKhoaHocDatac,tenKhoaHoc);
					hocPhiData=addElementIntoArray(hocPhiData,hocPhi);
		
					maLopData=addElementIntoArray(maLopData,maLop);
				}
		
				

				Vector<String[]> ret=new Vector<String[]>(0);
				
				all.add(maKhoaHocData);
				all.add(tenKhoaHocDatac);
				all.add(hocPhiData);
				all.add(maLopData);
							
				stmt.close();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Connection to database have been errors");
				System.out.println(e);
			}
		
	}
	
	
	public Vector<String[]> layDataThongTinLopHoc() {
		return all;
	}
	
}
