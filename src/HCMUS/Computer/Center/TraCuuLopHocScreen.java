package HCMUS.Computer.Center;
import javax.swing.*;
import java.awt.*;
import HCMUS.Computer.Center.TblLopHoc;

public class TraCuuLopHocScreen {
		public void render() {
			
			JFrame fmTraCuuLopHoc=new JFrame();
			fmTraCuuLopHoc.setTitle("Tra cứu lớp học");
	
			fmTraCuuLopHoc.setSize(600,400);
			fmTraCuuLopHoc.setLocationRelativeTo(null);
			fmTraCuuLopHoc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
			// labels
			JLabel lbDSLopHoc  = new JLabel("Danh sách lớp học");
			
			// panel
			GridLayout grid=new GridLayout(2,2);
	

			// Table lop hoc
			TblLopHoc tb = new TblLopHoc();
			
			JScrollPane tblLopHocPane= tb.getTable();
		 
			// panel
			JPanel panel=new JPanel(grid);
			panel.add(lbDSLopHoc);
			panel.add(tblLopHocPane);
			
			
			fmTraCuuLopHoc.add(panel);		
			fmTraCuuLopHoc.setVisible(true);
			
		}
	
}
