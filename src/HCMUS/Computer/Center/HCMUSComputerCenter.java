package HCMUS.Computer.Center;
import javax.swing.*;
import HCMUS.*;



public class HCMUSComputerCenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		
	
		// Login screen
		LoginScreen loginScreen =new LoginScreen();
		
//		loginScreen.render2();
		
		
		// Man hinh Quan ly trung tam tin hoc 
		QuanLyTTSceen qlttScreen=new QuanLyTTSceen();
		
//		qlttScreen.render();
		
		// Man hinh tra cuu lop hoc
		TraCuuLopHocScreen tclhScreen=new TraCuuLopHocScreen();
		tclhScreen.render();
		
	
		
	
	}

}
