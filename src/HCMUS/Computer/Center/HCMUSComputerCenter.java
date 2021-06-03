package HCMUS.Computer.Center;
import javax.swing.*;



public class HCMUSComputerCenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		
		// Home Screen
		JFrame f=new JFrame("HCMUS Computer Center");
		
		
		JButton b= new JButton("Click here");
		
		b.setBounds(100,100,100, 40);    
		
		f.add(b);
		f.setSize(400,400);

		f.setLayout(null);
		f.setVisible(true);
			
		
	}

}
