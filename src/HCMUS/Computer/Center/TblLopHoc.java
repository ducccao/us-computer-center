package HCMUS.Computer.Center;
import javax.swing.*;

public class TblLopHoc {
	// frame
	JFrame f;
	JTable tb;
	
	public JScrollPane getTable(){
		// constructor
		// form
		f=new JFrame();
		f.setTitle("Danh sách lớp học");
		
		
		// data
		String[][] data= {
				{
					"caheo","3"
				},
				{
					"ca map","1"
				}
		};
		
		// col name
		String[] columnNames= {"Họ tên","Tuổi"};
		
		tb=new JTable(data,columnNames);
		tb.setBounds(30,40,200,200);
		
		
		// adding to jscrollpane
		JScrollPane scrollPane=new JScrollPane(tb);
		
		
		return scrollPane;
		
		
	}
	
}
