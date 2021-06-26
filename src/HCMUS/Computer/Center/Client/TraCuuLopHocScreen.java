package HCMUS.Computer.Center.Client;
import javax.swing.*;


import HCMUS.Computer.Center.Logic.LopHocController;

import java.util.ArrayList;
import java.util.Vector;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// ACCOUNT
// NVQL01
// 123123

public class TraCuuLopHocScreen {
	JFrame fmTraCuuLopHoc=new JFrame();
	// labels
	JLabel lbDSLopHoc  = new JLabel("<html><body style='height:100vh;display:flex;justify-content:flex-start;'>Danh sách lớp học</body></html");
	
	// panel
	GridLayout grid=new GridLayout(3,1);
	
	// btn backs
	JButton btnBack=new JButton("Trở về");
	

	// panel
	JPanel panel=new JPanel(grid);
	
	JTable tblLopHoc;
	
	JScrollPane tblLopHocPane;
	
		
		public String[] addEleIntoArray1DimensionalString(String a[],String ele) {
			String[] ret=new String[a.length+1];
			
			for(int i=0;i<a.length;++i) {
				ret[i]=a[i];
			}
			
			ret[ret.length-1]=ele;
			
			return ret;
		}
		
		public void logArray1DimensionalString(String[]a) {
			int i=0;
			while(i<a.length) {
			System.out.print(a[i]+" ");
				i++;
			}
			System.out.println("");
		}
		
		public void logArray2DimensionalString(String[][]a) {
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
				fmTraCuuLopHoc.dispose();
			}
		};
	
		public void render() {
			
		
			fmTraCuuLopHoc.setTitle("Tra cứu lớp học");
	
			fmTraCuuLopHoc.setSize(600,400);
			fmTraCuuLopHoc.setLocationRelativeTo(null);
			fmTraCuuLopHoc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			// Table lop hoc
			LopHocController lophocController=new LopHocController();
			Vector<Vector<String>>dataTatCaLopHoc= lophocController.layTatCaLopHoc();

	
			String dataMaLop[]=new String[0];
			String dataTenLop[]=new String[0];
			
			// pooring malop tenlop
			for(int i=0;i<dataTatCaLopHoc.size();++i) {
				// i=0: malop
				// i=1: tenlop
				if(i==0) {
					for(int j=0;j<dataTatCaLopHoc.get(i).size();++j) {
						System.out.print(dataTatCaLopHoc.get(i).get(j));
						dataMaLop=addEleIntoArray1DimensionalString(dataMaLop,dataTatCaLopHoc.get(i).get(j));
					}
				}
				else {
					for(int j=0;j<dataTatCaLopHoc.get(i).size();++j) {
						dataTenLop=addEleIntoArray1DimensionalString(dataTenLop,dataTatCaLopHoc.get(i).get(j));
					}
				}
			}
			
			
//			logArray1DimensionalString(dataMaLop);
			
			
	
			String dataString[][]= new String[dataMaLop.length][2];
			
			for(int i=0;i<dataMaLop.length;i++) {
				dataString[i][0]=dataMaLop[i];
				dataString[i][1]=dataTenLop[i];
			}
			
		
	
			/*
			 * s[0][0]=lh01
			 * s[0][1]=tenlop1
			 * 
			 * s[1][0]
			 * s[1][1]
			 * ...
			 * s[n-1][0]
			 * s[n-1][0]
			 * 
			 * n = malop length - length 
			 * */
			
		//	logArray2DimensionalString(dataString);
			
			String col[]= {"Mã lóp học","Tên lớp học"};
//			JTable tblLopHoc=new JTable(dataString,col);
			
		

//			arrListLopHocInfo.add(dataMaLop);
//			arrListLopHocInfo.add(dataTenLop);
			

			tblLopHoc=new JTable(dataString,col);
			
			 tblLopHocPane= new JScrollPane(tblLopHoc);
		 
	
			panel.add(lbDSLopHoc);
			panel.add(tblLopHocPane);
			
		
			btnBack.setBounds(50,50,50,50);
			btnBack.setLocation(250,250);
			
			
		
			btnBack.addActionListener(btnBackActionListener);
			
			panel.add(btnBack);
			
			
			fmTraCuuLopHoc.add(panel);		
			fmTraCuuLopHoc.setVisible(true);
			
		}
	
}
