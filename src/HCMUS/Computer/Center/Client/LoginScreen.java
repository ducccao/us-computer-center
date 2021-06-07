package HCMUS.Computer.Center.Client;
import javax.swing.*;

import HCMUS.Computer.Center.Logic.UserController;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;


public class LoginScreen extends JFrame implements ActionListener   {
	Container container=getContentPane();
	JLabel maUserLb=new JLabel("Mã người dùng");
	JLabel passwordLb=new JLabel("Mật khẩu");
	JTextField maUserTf=new JTextField();
	JPasswordField passwordTf=new JPasswordField();
	JButton loginBtn=new JButton("Đăng nhập");
	JButton resetBtn=new JButton("Reset");
	
	
	Vector<Vector<String>> allMaNguoiDung=new Vector<Vector<String>>(0);
	Vector<Vector<String>> allMatKhauNguoiDung=new Vector<Vector<String>>(0);
	
	
	
	/*
	 * Print Vector<Vector<String>>
	 */
	public  void logVectorVectorString(Vector<Vector<String>>a) {
		for(int i=0;i<a.size();++i) {
			for(int j=0;j<a.get(i).size();++j) {
				System.out.print(a.get(i).get(j)+" ");
			}
			System.out.println("");
		}
	}
	
	
	public LoginScreen(){
		
		setLayoutManager();
		setLocationAndSize();
		addPackToContainer();
		
	}
	
	
	
	// set layout
	public void setLayoutManager() {
		container.setLayout(null);
	}

	// set location & size
	public void setLocationAndSize() {

		maUserLb.setBounds(100,40,160,30);
		maUserTf.setBounds(100,80,160,30);
		passwordLb.setBounds(100,120,160,30);
		passwordTf.setBounds(100,160,160,30);
		loginBtn.setBounds(100,210,160,30);
		
		// handle btn login click
		ActionListener btnLoginActionListener=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				UserController userController=new UserController();
				allMaNguoiDung= userController.layTatCaMaNguoiDung();
				allMatKhauNguoiDung=userController.layTatCaMatKhauNguoiDung();

				String maNguoiDung=maUserTf.getText();
				String matKhauNguoiDung=passwordTf.getText();
				
				for(int i=0;i<allMaNguoiDung.size();++i) {
				
					// 0: HocVien
					// 1: GiangVien
					// 2: NVQL
					for(int j=0;j<allMaNguoiDung.get(i).size();j++) {
						if(i==0) {
						String maNguoiDungij = allMaNguoiDung.get(i).get(j).toString();
						String matKhauNguoiDungij = allMatKhauNguoiDung.get(i).get(j).toString();
					
				
						boolean flagCheckInfo=	maNguoiDungij.equals(maNguoiDung) &&
								matKhauNguoiDungij.equals(matKhauNguoiDung);
						
			
				
							if(flagCheckInfo==true) {
								
								HocVienScreen fmHocVien=new HocVienScreen();
								fmHocVien.render();
								
								return;
							}
						
						}
						else if(i==1) {
							
							String maNguoiDungij = allMaNguoiDung.get(i).get(j).toString();
							String matKhauNguoiDungij = allMatKhauNguoiDung.get(i).get(j).toString();
						
					
							boolean flagCheckInfo=	maNguoiDungij.equals(maNguoiDung) &&
									matKhauNguoiDungij.equals(matKhauNguoiDung);
							
				
					
								if(flagCheckInfo==true) {
									
									GiangVienScreen fmGiangVien=new GiangVienScreen();
									fmGiangVien.render();
									
									return;
								}
							
						}
						else {

							String maNguoiDungij = allMaNguoiDung.get(i).get(j).toString();
							String matKhauNguoiDungij = allMatKhauNguoiDung.get(i).get(j).toString();
						
					
							boolean flagCheckInfo=	maNguoiDungij.equals(maNguoiDung) &&
									matKhauNguoiDungij.equals(matKhauNguoiDung);
							
				
					
								if(flagCheckInfo==true) {
									
									QuanLyTTSceen fmNVQL=new QuanLyTTSceen();
									fmNVQL.render();
									
									return;
								}
						}
					}
					
					
					
					
					
				}
			
				
			
				JOptionPane.showMessageDialog(new JFrame(), "Sai thông tin!");
	
			
				
			
			}
		};
		
		loginBtn.addActionListener(btnLoginActionListener);
	}
	
	// add all packs to layout
	public void addPackToContainer() {
		container.add(maUserLb);
		container.add(maUserTf);
		container.add(passwordLb);
		container.add(passwordTf);
		container.add(loginBtn);
	}

	
	// add action event
	public void addActionEvent() {
		loginBtn.addActionListener(this);
	}
	
	// Overriding actionPerform method
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	
	// render form
	public void render2() {

	
		
		LoginScreen loginScreen=new LoginScreen();
		loginScreen.setTitle("Đăng nhập");
		loginScreen.setBounds(10,10,350,300);
		loginScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginScreen.setLocationRelativeTo(null);
		loginScreen.setResizable(false);

		loginScreen.setVisible(true);
		
	
		

	}
	
	
	public Vector<Vector<String>> setMaNguoiDung() {
		UserController userController=new UserController();
		return	this.allMaNguoiDung= userController.layTatCaMaNguoiDung();
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
