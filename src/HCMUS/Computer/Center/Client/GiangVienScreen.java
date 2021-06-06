package HCMUS.Computer.Center.Client;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GiangVienScreen {
	public void render() {
		JFrame f=new JFrame();
		f.setTitle("Giảng viên");
		
		int x=600;
		int y=400;
		
		// buttons
		JButton btnTraCuuThongTinCaNhan=new JButton("Tra cứu thông tin cá nhân");
		JButton btnTraCuuLichDay=new JButton("Tra cứu lịch dạy");
		
		//panel
		JPanel panel=new JPanel(new GridLayout(1,1));
		panel.add(btnTraCuuThongTinCaNhan);
		panel.add(btnTraCuuLichDay);
		
		
		f.add(panel);
		f.setSize(x,y);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}

}
