package HCMUS.Computer.Center.Client;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HocVienScreen {
	public void render() {
		JFrame f=new JFrame();
		f.setTitle("Học viên");
		
		int x=600;
		int y=400;
		
		// buttons
		JButton btnTraCuuThongTinCaNhan=new JButton("Tra cứu thông tin cá nhân");
		JButton btnTraCuuLichHoc=new JButton("Tra cứu lịch học");
		
		//panel
		JPanel panel=new JPanel(new GridLayout(1,1));
		panel.add(btnTraCuuThongTinCaNhan);
		panel.add(btnTraCuuLichHoc);
		
		
		f.add(panel);
		f.setSize(x,y);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
}
