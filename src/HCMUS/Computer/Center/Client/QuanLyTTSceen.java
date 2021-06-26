package HCMUS.Computer.Center.Client;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuanLyTTSceen {
	public void render() {
		JFrame fmQuanLy=new JFrame();

		fmQuanLy.setTitle("Quản lý trung tâm tin học - HCMUS");
		fmQuanLy.setVisible(true);
		fmQuanLy.setSize(600,400);
		fmQuanLy.setLocationRelativeTo(null);
		fmQuanLy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		
		// Labels
		JLabel lbTraCuuLopHoc=new JLabel("Tra cứu lớp học");
		JLabel lbTraCuuKhoaHoc=new JLabel("Tra cứu Khóa học");
		JLabel lbLapLichHoc=new JLabel("Lập lịch học");
		JLabel lbLapLichDay=new JLabel("Lập lịch dạy");
		
		JLabel lbDangKyKhoaHocChoHocVien=new JLabel("<html>Đăng ký khóa học cho học viên</html>");

		
		JLabel lbTraCuuTTHocVien=new JLabel("<html>Tra cứu thông tin học viên</html>");
		JLabel lbTraCuuTTGiayChungNhan=new JLabel("<html>Tra cứu thông tin giấy chứng nhận</html>");
		
		// Buttons
		JButton btnTraCuuLopHoc=new JButton();
		JButton btnTraCuuKhoaHoc=new JButton();
		JButton btnLapLichHoc=new JButton();
		JButton btnLapLichDay=new JButton();
		JButton btnDangKyKhoaHocChoHocVien=new JButton();
		JButton btnTraCuuTTHocVien=new JButton();
		JButton btnTraCuuTTGiayChungNhan=new JButton();
		JButton btnTest=new JButton();
		
		ActionListener btnTraCuuLopHocActionListener= new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				TraCuuLopHocScreen fmTraCuuLopHoc=new TraCuuLopHocScreen();
				fmTraCuuLopHoc.render();
				return;
			}
		};
		
		ActionListener btnTraCuuKhoaHocActionListener=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				TraCuuKhoaHocScreen fmTraCuuKhoaHoc=new TraCuuKhoaHocScreen();
				fmTraCuuKhoaHoc.render();
				return;
			}
		};
		
		ActionListener lapLichHocActionListener=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				LapLichHocScreen fmLapLichHoc=new LapLichHocScreen();
				fmLapLichHoc.render();
				
				
				return;
			}
		};
		
		ActionListener dangkykhoahocActionListener=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DangKyKhoaHocScreen f=new DangKyKhoaHocScreen();
				f.render();
				return;
			}
		};
		
		ActionListener btnLapLichDayActionListener=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				LapLichDayScreen lldayScreen=new LapLichDayScreen();
				lldayScreen.render();
//				LapLichDayScreenTryAgain lldScreen=new LapLichDayScreenTryAgain();
//				lldScreen.render();
				return;
			}
		};
		
		
		ActionListener btnTraCuuTTHocVienActionListener=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				TraCuuThongTinHocVienScreen f=new TraCuuThongTinHocVienScreen();
				f.render();
				return;
			}
		};
		
		
		ActionListener btnTraCuuTTGiayChungNhanActionListener=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				TraCuuGiayChungNhanScreen f= new TraCuuGiayChungNhanScreen();
				f.render();
				return;
			}
		};
			
		
		btnTraCuuLopHoc.addActionListener(btnTraCuuLopHocActionListener);
		btnTraCuuKhoaHoc.addActionListener(btnTraCuuKhoaHocActionListener);
		btnLapLichHoc.addActionListener(lapLichHocActionListener);
		btnDangKyKhoaHocChoHocVien.addActionListener(dangkykhoahocActionListener);
		btnLapLichDay.addActionListener(btnLapLichDayActionListener);
		btnTraCuuTTHocVien.addActionListener(btnTraCuuTTHocVienActionListener);
		btnTraCuuTTGiayChungNhan.addActionListener(btnTraCuuTTGiayChungNhanActionListener);
		
		
		btnTraCuuLopHoc.add(lbTraCuuLopHoc);
		btnTraCuuKhoaHoc.add(lbTraCuuKhoaHoc);
		btnLapLichHoc.add(lbLapLichHoc);
		btnLapLichDay.add(lbLapLichDay);
		btnDangKyKhoaHocChoHocVien.add(lbDangKyKhoaHocChoHocVien);
		btnTraCuuTTHocVien.add(lbTraCuuTTHocVien);
		btnTraCuuTTGiayChungNhan.add(lbTraCuuTTGiayChungNhan);
		

	
		
		// Panel
		JPanel panel=new JPanel(new GridLayout(3,3));
		panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		panel.add(btnTraCuuLopHoc);
		panel.add(btnTraCuuKhoaHoc);
		panel.add(btnLapLichHoc);
		panel.add(btnLapLichDay);
		panel.add(btnDangKyKhoaHocChoHocVien);
		panel.add(btnTraCuuTTHocVien);
		panel.add(btnTraCuuTTGiayChungNhan);
//		panel.add(btnTest);

		
		
		

		fmQuanLy.add(panel);
		
		
	}
	
	public void addHTML(JButton btnTest) {
		String htmlStart="<html><body>";
		
		String htmlContent="<h1>ádasdasdadass</h1>";

		String htmlEnd="</body></html>";
		
		final String ret=htmlStart+htmlContent+htmlEnd;
		Runnable  r=()->{
			JLabel lbTest= new JLabel(ret);
			btnTest.add(lbTest);
			JOptionPane.showMessageDialog(null, lbTest);
		};
		
		SwingUtilities.invokeLater(r);
	}
	
	
	
}
