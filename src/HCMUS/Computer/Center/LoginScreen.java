package HCMUS.Computer.Center;
import javax.swing.*;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginScreen extends JFrame implements ActionListener   {
	Container container=getContentPane();
	JLabel maUserLb=new JLabel("Mã người dùng");
	JLabel passwordLb=new JLabel("Mật khẩu");
	JTextField maUserTf=new JTextField();
	JPasswordField passwordTf=new JPasswordField();
	JButton loginBtn=new JButton("Đăng nhập");
	JButton resetBtn=new JButton("Reset");
	
	LoginScreen(){
		
		setLayoutManager();
		setLocationAndSize();
		addPackToContainer();
		
	}
	
	// Overriding actionPerform method
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	
	public void setLayoutManager() {
		container.setLayout(null);
	}
	
	public void setLocationAndSize() {
		maUserLb.setBounds(100,40,160,30);
		maUserTf.setBounds(100,80,160,30);
		passwordLb.setBounds(100,120,160,30);
		passwordTf.setBounds(100,160,160,30);
		loginBtn.setBounds(100,210,160,30);
	}
	
	public void addPackToContainer() {
		container.add(maUserLb);
		container.add(maUserTf);
		container.add(passwordLb);
		container.add(passwordTf);
		container.add(loginBtn);

		
	}
	
	
	public void render2() {
		LoginScreen loginScreen=new LoginScreen();
		loginScreen.setTitle("Đăng nhập");
		loginScreen.setVisible(true);
		loginScreen.setBounds(10,10,350,300);
		loginScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginScreen.setLocationRelativeTo(null);
		loginScreen.setResizable(false);
		
	}
	
	
	/*
	 * public static void render() { // screen JFrame screen = new
	 * JFrame("Đăng nhập"); screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 * 
	 * 
	 * // text field final JTextField maUser=new JTextField(); maUser.setBounds(100,
	 * 100, 100, 100);
	 * 
	 * 
	 * screen.add(maUser);
	 * 
	 * screen.pack();
	 * 
	 * screen.setSize(500,300); screen.setLayout(null);
	 * screen.setLocationRelativeTo(null); screen.setVisible(true); // end screen
	 * 
	 * 
	 * }
	 */
	
	
	
	
}
