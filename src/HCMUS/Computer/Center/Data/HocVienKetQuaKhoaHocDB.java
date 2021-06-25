package HCMUS.Computer.Center.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Utils.Utils;

public class HocVienKetQuaKhoaHocDB {
	private String url="jdbc:mysql://localhost:3306/us-computer-center";
	private String username="root";
	private String password="root";
	private String tblName="hocvienketquakhoahoc";
	
	private String[] maHocViens=new String[0];
	private String[] GPAs=new String[0];;
	private String[] daDaus=new String[0];;
	private String[] maKhoaHocs=new String[0];;
	
	private String[] maKhoaHocVienHoc=new String[0];
	
	@SuppressWarnings("static-access")
	 public void findByMaHV(String mahv) {
		try {
			Connection conn = DriverManager.getConnection(this.url,this.username,this.password);
			
			Statement stmt= conn.createStatement();
			String sql="select * from "+this.tblName+" where maHocVien = '"+mahv+"'";
			ResultSet ret=stmt.executeQuery(sql);
			
			while(ret.next()) {
				String maHocVien=ret.getString("maHocVien");
				String GPA=ret.getString("GPA");
				String daDau=ret.getString("daDau");
				String maKhoaHoc=ret.getString("maKhoaHoc");
				
				Utils u=new Utils();
				
				this.maHocViens=u.addEleIntoArray1DimesonalString(this.maHocViens, maHocVien);
				this.GPAs=u.addEleIntoArray1DimesonalString(this.GPAs, GPA);
				this.daDaus=u.addEleIntoArray1DimesonalString(this.daDaus, daDau);
				this.maKhoaHocs=u.addEleIntoArray1DimesonalString(this.maKhoaHocs, maKhoaHoc);
			
				
			}
			
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane op =new JOptionPane();
			op.showMessageDialog(new JFrame(), e.getMessage());
			
		}
	}
	
	public String[][] getDataAfterFind() {
		String[][]ret=new String[0][];
		for(int i=0;i<4;++i) {
			String[]record= {this.maHocViens[i],this.GPAs[i],this.daDaus[i],this.maKhoaHocs[i]};
			Utils u=new Utils();
			ret=u.addArr1StrIntoArr2String(ret, record);
		}

		return ret;
	}
	
	public void findAllMaKhoaHocHocVienDaHoc(String mahv) {
		try {
			Connection conn= DriverManager.getConnection(this.url,this.username,this.password);
			Statement stmt= conn.createStatement();
			
			String sql="select kq.maKhoaHoc"
					+ " from `hocvienketquakhoahoc` kq "
					+ " where kq.maHocVien= '"+mahv+"';";
			
//			System.out.print(sql);
			ResultSet ret=stmt.executeQuery(sql);
			
			while(ret.next()) {
				Utils u=new Utils();
		
//				System.out.print(ret.getString("maKhoaHoc"));
				this.maKhoaHocVienHoc=u.addEleIntoArray1DimesonalString(this.maKhoaHocVienHoc, ret.getString("maKhoaHoc"));
		
			}
			stmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane op=new JOptionPane();
			op.showMessageDialog(new JFrame(), e.getMessage());
		}
	}
	
	public void update(String mahv,String GPA, boolean daDau,String maKhoaHoc) {
			try {
				Connection conn=DriverManager.getConnection(this.url,this.username,this.password);
				

				
				 String sql="update `hocvienketquakhoahoc`\r\n" +
				  "set GPA='"+GPA+"' , daDau="+daDau+" \r\n" +
				  "where maKhoaHoc='"+maKhoaHoc+"'\r\n" + "and maHocVien = '"+mahv+"';";
				  
//				 ResultSet ret=stmt.executeQuery(sql);
				 
				
				 Statement s=conn.prepareStatement(sql);
				 
				s.execute(sql);
	
				
//				String sql="update "+ this.tblName+" set GPA = ? and daDau = ? "
//						+ "where maKhoaHoc = ? and maHocVien = ?";
//				PreparedStatement pre=conn.prepareStatement(sql);
				
		
//				
//				pre.setString(1,GPA);
//				pre.setBoolean(2, daDau);
//				pre.setString(3, maKhoaHoc);
//				pre.setString(4, mahv);
				
				System.out.println(sql);
				
//				pre.executeUpdate();
				
				JOptionPane op=new JOptionPane();
				op.showMessageDialog(new JFrame(),"Đã cập nhật!");
				
				conn.close();
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
				JOptionPane op=new JOptionPane();
				op.showMessageDialog(new JFrame(), e.getMessage());
			}
	}
	
	
	public String[] getAllMaKhoaHocHocVienHoc() {
		return this.maKhoaHocVienHoc;
	}
	
}
