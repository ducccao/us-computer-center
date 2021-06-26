package HCMUS.Computer.Center.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import HCMUS.Computer.Center.Logic.DBConfig;
import Utils.Utils;

public class GiayChungNhanDB extends DBConfig {

	private String tblName="hocvienchitietgiaychungnhan";
	
	private String[][]data=new String[0][];
	private String[]maHocViens=new String[0];
	
	private String[][]dataFoundByMaHV= new String[0][];
	private String[]maLops= new String[0];
	
	public void getAll() {
		try {
			Connection conn = DriverManager.getConnection(this.url,this.username,this.password);
			
			Statement s= conn.createStatement();
			String sql="select cn.maHocVien, hv.hoTen , cn.maLop, lh.tenLop ,cn.daNhan\r\n"
					+ "from `hocvienchitietgiaychungnhan` cn\r\n"
					+ "left join `hocvien` hv\r\n"
					+ "on hv.maHocVien= cn.maHocVien\r\n"
					+ "left join `lophoc` lh\r\n"
					+ "on cn.maLop = lh.maLop;";
			ResultSet ret= s.executeQuery(sql);
			
			while(ret.next()) {
				String maHocVien=ret.getString("maHocVien");
				String hoTen=ret.getString("hoTen");
				String maLop=ret.getString("maLop");
				String tenLop=ret.getString("tenLop");
				boolean daNhan=ret.getBoolean("daNhan");
				String strDaNhan="";
				if(daNhan==true) {
					strDaNhan="true";
				}
				else {
					strDaNhan="false";
				}
				
				String[]record= {maHocVien,hoTen,maLop,tenLop,strDaNhan};
				
				Utils u=new Utils();
				this.data= u.addArr1StrIntoArr2String(this.data, record);
				this.maHocViens=u.addEleIntoArray1DimesonalString(this.maHocViens, maHocVien);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane op=new JOptionPane();
			op.showMessageDialog(new JFrame(), e.getMessage());
		}
	}
	
	
	public String[][] getData() {
		return this.data;
	}
	
	public String[] getMaHocVien() {
		return this.maHocViens;
	}
	
	public void findDataByMaHV(String mahv) {
		try {
			Connection conn = DriverManager.getConnection(this.url, this.username, this.password);
			
			Statement s= conn.createStatement();
			
			String sql="select cn.maHocVien, hv.hoTen , cn.maLop, lh.tenLop ,cn.daNhan\r\n"
					+ "from `hocvienchitietgiaychungnhan` cn\r\n"
					+ "left join `hocvien` hv\r\n"
					+ "on hv.maHocVien= cn.maHocVien\r\n"
					+ "left join `lophoc` lh\r\n"
					+ "on cn.maLop = lh.maLop\r\n"
					+ "where cn.maHocVien = '"+mahv+"';";
			
			ResultSet ret= s.executeQuery(sql);
			
			while(ret.next()) {
				String maHocVien=ret.getString("maHocVien");
				String hoTen=ret.getString("hoTen");
				String maLop=ret.getString("maLop");
				String tenLop=ret.getString("tenLop");
				boolean daNhan=ret.getBoolean("daNhan");
				String strDaNhan="";
				if(daNhan==true) {
					strDaNhan="true";
				}
				else {
					strDaNhan="false";
				}
				
				String[]record= {maHocVien,hoTen,maLop,tenLop,strDaNhan};
				
				Utils u=new Utils();
				this.dataFoundByMaHV= u.addArr1StrIntoArr2String(this.data, record);
				this.maLops=u.addEleIntoArray1DimesonalString(this.maLops, maLop);
				
			
			}
			
			conn.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane op= new JOptionPane();
			op.showMessageDialog(new JFrame(), e.getMessage());
		}
	}
	
	public String[][] getDataFoundByMaHV() {
		return this.dataFoundByMaHV;
	}
	
	public String[] getMaLop() {
		return this.maLops;
	}
	
	public void update(boolean daNhan, String mahv, String malop) {
		try {
			Connection conn = DriverManager.getConnection(this.url, this.username, this.password);
			
			String sql="update `hocvienchitietgiaychungnhan` cn\r\n"
					+ "set daNhan = ? \r\n"
					+ "where cn.maHocVien = ? \r\n"
					+ "and cn.maLop = ?;";
			
			PreparedStatement pre= conn.prepareStatement(sql);
			
			pre.setBoolean(1, daNhan);
			pre.setString(2, mahv);
			pre.setString(3, malop);
			
			pre.executeUpdate();
			
			
			JOptionPane op= new JOptionPane();
			op.showMessageDialog(new JFrame(), "Cập nhật thành công!");
			
			conn.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane op= new JOptionPane();
			op.showMessageDialog(new JFrame(), e.getMessage());
		}
	}
}
