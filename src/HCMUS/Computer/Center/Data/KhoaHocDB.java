package HCMUS.Computer.Center.Data;
import java.sql.*;
public class KhoaHocDB {
	private String Url="jdbc:mysql://localhost:3306/us-computer-center";
	private String username="root";
	private String password="root";
	private String tblName="khoahoc";
	
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
	
	
	public void logArray(String[] a) {
		for(int i=0;i<a.length;++i)System.out.print(a[i]+" ");
		return;
	}
	
	public void all() {
			try {
				Connection conn=DriverManager.getConnection(Url,username,password);
				Statement stmt=conn.createStatement();
				
				String sql="select * from "+ tblName;
				
				ResultSet rs=stmt.executeQuery(sql);

				
				String maKhoaHocData[]= {};
				
				while(rs.next())  {
					String maKhoaHoc=rs.getString("maKhoaHoc");
					String tenKhoaHoc=rs.getString("tenKhoaHoc");
					String hocPhi=rs.getString("hocPhi");
					String maLop=rs.getString("maLop");
					
					maKhoaHocData=addElementIntoArray(maKhoaHocData,maKhoaHoc);
				}
				logArray(maKhoaHocData);
			
				
				
				String ret[][];
			
					

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Connection to database have been errors");
				System.out.println(e);
			}
		
	}
}
