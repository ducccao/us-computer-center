package HCMUS.Computer.Center.Client;
import javax.swing.*;
import java.awt.*;

public class TraCuuLopHocScreen {
		public void render() {
			
			JFrame fmTraCuuLopHoc=new JFrame();
			fmTraCuuLopHoc.setTitle("Tra cứu lớp học");
	
			fmTraCuuLopHoc.setSize(600,400);
			fmTraCuuLopHoc.setLocationRelativeTo(null);
			fmTraCuuLopHoc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
			// labels
			JLabel lbDSLopHoc  = new JLabel("<html><body style='height:100vh;display:flex;justify-content:flex-start;'>Danh sách lớp học</body></html");
			
			// panel
			GridLayout grid=new GridLayout(2,3);
	

			// Table lop hoc
			TblLopHoc tb = new TblLopHoc();
			
			JScrollPane tblLopHocPane= tb.getTable();
		 
			// panel
			JPanel panel=new JPanel(grid);
			panel.add(lbDSLopHoc);
			panel.add(tblLopHocPane);
			
			// btn backs
			JButton btnBack=new JButton("Trở về");
			btnBack.setBounds(50,50,50,50);
			btnBack.setLocation(250,250);
			
			
			panel.add(btnBack);
			
			
			fmTraCuuLopHoc.add(panel);		
			fmTraCuuLopHoc.setVisible(true);
			
		}
	
}
