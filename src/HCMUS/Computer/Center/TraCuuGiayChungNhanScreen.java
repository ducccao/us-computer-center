package HCMUS.Computer.Center;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class TraCuuGiayChungNhanScreen {
	public void render() {
		JFrame f=new JFrame();
		f.setTitle("Tra cứu giấy chứng nhận");
		int x=900;
		int y=700;
		
		int pdTop=20;
		int pdLeft=80;
		int pdBot=20;
		int pdRight=80;
		
		// labels
		
		JLabel lbThongTinHocVienGiayChungNhan=new JLabel("Thông tin học viên - giấy chứng nhận");
		JLabel lbCapNhatTTGiayCN=new JLabel("Cập nhật thông tin giấy chứng nhận");
		JLabel lbMaHV=new JLabel("Mã học viên");
		JLabel lbMaHVForCheckbox=new JLabel("Mã học viên");
		
		// cbb mahocvien
		String dataMaHV[]= {"HV01","HV02"};
		JComboBox cbbMaHV=new JComboBox(dataMaHV);
		JCheckBox chkbDaNhan=new JCheckBox("Đã nhận");
		
		JTextField tfMaHV=new JTextField("");
		

		
		// buttons
		JButton btnTracuu=new JButton("Tra cứu");
		JButton btnUpdate=new JButton("Cập nhật");
		JButton btnBack=new JButton("Trở về");
		
		
		// tbl giay chung nhan - hoc vien
		String dataHVGCN[][]= { 
				{"HV01","duccao 01","LH01","Lớp kỹ thuật viên","TRUE"}, 
				{"HV02","duccao 02","LH01","Lớp chứng chỉ tin học B","FALSE"}};
		String col[]= {"Mã học viên","Tên học viên","Mã lớp học","Tên lớp học","Trạng thái nhận"};
		JTable tblHocVienGiayCN=new JTable(dataHVGCN,col);
		JScrollPane scrPanel=new JScrollPane(tblHocVienGiayCN);
		
		
		// panel
		JPanel topPanel=new JPanel(new GridLayout(1,2));;
		topPanel.setBorder(BorderFactory.createEmptyBorder(pdTop, pdLeft, pdBot, pdRight));
		
		JPanel midPanel=new JPanel(new GridLayout(7,1));;
		midPanel.setBorder(BorderFactory.createEmptyBorder(pdTop, pdLeft, pdBot, pdRight));

		
		JPanel botPanel=new JPanel(new GridLayout(1,1));;
		botPanel.setBorder(BorderFactory.createEmptyBorder(pdTop, pdLeft, pdBot, pdRight));
		
		
		topPanel.add(lbMaHV);
		topPanel.add(cbbMaHV);
		topPanel.add(btnTracuu);
		
		
	

		midPanel.add(lbCapNhatTTGiayCN);
		midPanel.add(lbMaHVForCheckbox);
		midPanel.add(tfMaHV);
		midPanel.add(chkbDaNhan);
		midPanel.add(btnUpdate);
		midPanel.add(lbThongTinHocVienGiayChungNhan);
		midPanel.add(scrPanel);
		
		
		
		botPanel.add(btnBack);

		
		f.add(topPanel,BorderLayout.NORTH);
		f.add(midPanel,BorderLayout.CENTER);
		f.add(botPanel,BorderLayout.SOUTH);
		
		
		f.setSize(x,y);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	
				
	
	}
}
