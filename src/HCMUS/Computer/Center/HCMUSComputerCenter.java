package HCMUS.Computer.Center;
import javax.swing.*;
import HCMUS.*;



public class HCMUSComputerCenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		
		/* *****************
		 * Login Screen
		 * ***************** */
		LoginScreen loginScreen =new LoginScreen();
		
//		loginScreen.render2();
		
		QuanLyTTSceen qlttScreen=new QuanLyTTSceen();
		
		qlttScreen.render();
		
	
		
		/* *****************
		 * End Login Screen
		 * ***************** */
	}

}
