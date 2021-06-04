package HCMUS.Computer.Center;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TraCuuThongTinHocVienScreen {
	public void render() {
		JFrame fm=new JFrame();
		fm.setTitle("Tra cứu thông tin học viên");
		int x=600;
		int y=400;
		
		int pdTop=20;
		int pdLeft=80;
		int pdBot=20;
		int pdRight=80;
		
		
		// labels
		JLabel lbMaHocVien =new JLabel("Mã học viên");
		JLabel lbDSHocVien =new JLabel("Danh sách học viên");
		
		// text field
		String dataMaHV[]= {"HV01","HV02","HV03"};
		JComboBox cbbMAHV=new JComboBox(dataMaHV);
		
		// buttons
		JButton btnTraCuu=new JButton("Tra cứu");
		JButton btnBack=new JButton("Trở về");
		
		// dshocvien
		String dataDSHocVien[][]= { 
				{"HV01","Duccao 01","27/03/1999","HCM","0901435802"},
				{"HV02","Duccao 02","27/03/1999","HCM","0901435802"}	,
				{"HV03","Duccao 03","27/03/1999","HCM","0901435802"}	
		};
		String col[]= {"Mã học viên","Họ tên","Ngày sinh","Địa chỉ","Số điện thoại"};
		JTable tblDSHocVien=new JTable(dataDSHocVien,col);
		JScrollPane scrollPanel=new JScrollPane(tblDSHocVien);
		
		
		// panels
		JPanel topPanel=new JPanel(new GridLayout(1,1));
		topPanel.setBorder(BorderFactory.createEmptyBorder(pdTop, pdLeft, pdBot, pdRight));
		
		topPanel.add(lbMaHocVien);
		topPanel.add(cbbMAHV);
		topPanel.add(btnTraCuu);

		
		
		JPanel midPanel=new JPanel(new GridLayout(2,1));
		midPanel.setBorder(BorderFactory.createEmptyBorder(pdTop, pdLeft, pdBot, pdRight));
		midPanel.add(lbDSHocVien);
		midPanel.add(scrollPanel);

		JPanel botPanel=new JPanel(new GridLayout(2,1));
		botPanel.setBorder(BorderFactory.createEmptyBorder(pdTop, pdLeft, pdBot, pdRight));
		botPanel.add(btnBack);
		
		
		
		
		fm.add(topPanel,BorderLayout.NORTH);
		fm.add(midPanel,BorderLayout.CENTER);
		fm.add(botPanel,BorderLayout.SOUTH);
		
		fm.setSize(x,y);
		fm.setLocationRelativeTo(null);
		fm.setVisible(true);
	} 
}
