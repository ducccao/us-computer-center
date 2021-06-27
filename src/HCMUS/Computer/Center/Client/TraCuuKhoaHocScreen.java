package HCMUS.Computer.Center.Client;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import HCMUS.Computer.Center.Logic.KhoaHocController;
import java.util.Vector;
public class TraCuuKhoaHocScreen {
	JFrame f=new JFrame();
	JLabel lbTCKH=new JLabel("Danh sách khóa học");
	
	JTable tbDanhSachKhoaHoc;
	
	JScrollPane sp;
	
	JButton btnBack=new JButton("Trở về");
	
	Panel panel=new Panel();
	
	// log vector<string[]>
	
	public void logVectorStringAr(Vector<String[]>a) {
		for(int i=0;i<a.size();++i) {
			for(int j=0;j<a.get(i).length;++j) {
				System.out.print(a.get(i)[j]+" ");
			}
		}
	}
	// log string[][]
	public void logA2S(String[][] a) {
		for(int i=0;i<a.length;++i) {
			for(int j=0;j<a[i].length;++j) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	ActionListener btnBackActionListener=new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			f.dispose();
		}
	};
	
	public void render() {
	
		f.setTitle("Tra cứu khóa học");
		
		int fmxSize=600;
		int fmySize=400;
		
		
		// labels

		lbTCKH.setBounds(fmxSize/2-150/2,20,150,50);
		
		// get data
		KhoaHocController khoahocController=new KhoaHocController();
		Vector<String[]>khoahocData= khoahocController.layKhoaHocData();
		
		/*
		 * 0: ma khoa hoc
		 * 1: ten khoa hoc
		 * 2: hoc phi
		 * 3: ma lop hoc
		 * 
		 * */
		
//		logVectorStringAr(khoahocData);
		
		// Table
		String[]column= { "Mã khóa học","Tên khóa học","Học phí","Mã lớp học" };
		
		String[][] data= new String[khoahocData.get(0).length][4];
		// data[0][0] = makh
		// data[0][1]=ten kh
		// data[0][2]= gia
		// data[0][3] = malop
		
		// ....
		// data[n][..]
		
	
			for(int j=0;j<khoahocData.size();++j) {
				for(int k=0;k<khoahocData.get(j).length;++k) {
					data[k][j]=khoahocData.get(j)[k];
				}
			} 
		
//			logA2S(data);
	
		
	
		 tbDanhSachKhoaHoc=new JTable(data,column);
		tbDanhSachKhoaHoc.setBounds(10,60,10,60);
		 sp=new JScrollPane(tbDanhSachKhoaHoc);
	
		// buttons

		btnBack.setBounds(150, 150, 150, 150);
		
		
	
		btnBack.addActionListener(btnBackActionListener);

		
		// panel

		panel.setLayout(new GridLayout(3,1));
		panel.add(lbTCKH);
		panel.add(sp);
		panel.add(btnBack);

		
//		f.setLayout(null);
		f.add(panel);
	

		f.setSize(fmxSize,fmySize);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
}
