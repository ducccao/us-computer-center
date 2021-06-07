package HCMUS.Computer.Center.Client;
import java.awt.GridLayout;

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
					"LH01","Lớp kỹ thuật viên"
				},
				{
					"LH02","Lớp chuyên đề"
				},
				{
					"LH03","Lớp chứng chỉ tin học A"
				},
				{
					"LH04","Lớp chứng chỉ tin học B"
				}
		};
		
		// col name
		String[] columnNames= {"Mã lớp học","Tên lớp học"};
		

	
		
		tb=new JTable(data,columnNames);
		tb.setBounds(30,40,200,200);

		
		
		// adding to jscrollpane
		GridLayout grid=new GridLayout(1,1);
		JScrollPane scrollPane=new JScrollPane(tb);
		
	
		
		
		return scrollPane;
		
		
	}
	
}
