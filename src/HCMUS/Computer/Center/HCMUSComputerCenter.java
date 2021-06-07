package HCMUS.Computer.Center;
import javax.swing.*;
import HCMUS.*;
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
import HCMUS.Computer.Center.Data.Db;
import HCMUS.Computer.Center.Data.HocVienDB;
import HCMUS.Computer.Center.Data.KhoaHocDB;
import HCMUS.Computer.Center.Logic.UserController;

import java.sql.*;
import java.util.Vector;



public class HCMUSComputerCenter {
	
	/*
	 * Print Vector<String[]>
	 */
	public static void logVectorStringArray(Vector<String[]>a) {
		for(int i=0;i<a.size();++i) {
			for(int j=0;j<a.get(i).length;++j) {
				System.out.print(a.get(i)[j]+" ");
			}
			System.out.println("");
		}
	}
	
	
	/*
	 * Print Vector<Vector<String>>
	 */
	public static void logVectorVectorString(Vector<Vector<String>>a) {
		for(int i=0;i<a.size();++i) {
			for(int j=0;j<a.get(i).size();++j) {
				System.out.print(a.get(i).get(j)+" ");
			}
			System.out.println("");
		}
	}
	
	/*
	 * Print Vector<String>
	 */
	public static void logVectorString(Vector<String>a) {
		for(int i=0;i<a.size();++i) {
			System.out.print(a.get(i)+" ");
		}
		System.out.println("");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoginScreen fmLogin=new LoginScreen();
		fmLogin.render2();
	
	}

}
