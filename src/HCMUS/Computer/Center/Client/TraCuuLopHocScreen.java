package HCMUS.Computer.Center.Client;
import javax.swing.*;


import HCMUS.Computer.Center.Logic.LopHocController;

import java.util.ArrayList;
import java.util.Vector;
import java.awt.*;

// ACCOUNT
// NVQL01
// 123123

public class TraCuuLopHocScreen {
	
		
		
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
		
	
		public void render() {
			
			JFrame fmTraCuuLopHoc=new JFrame();
			fmTraCuuLopHoc.setTitle("Tra cứu lớp học");
	
			fmTraCuuLopHoc.setSize(600,400);
			fmTraCuuLopHoc.setLocationRelativeTo(null);
			fmTraCuuLopHoc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
			// labels
			JLabel lbDSLopHoc  = new JLabel("<html><body style='height:100vh;display:flex;justify-content:flex-start;'>Danh sách lớp học</body></html");
			
			// panel
			GridLayout grid=new GridLayout(1,1);
	

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
						dataMaLop=addEleIntoArray1DimensionalString(dataMaLop,dataTatCaLopHoc.get(i).get(j));
					}
				}
				else {
					for(int j=0;j<dataTatCaLopHoc.get(i).size();++j) {
						dataTenLop=addEleIntoArray1DimensionalString(dataTenLop,dataTatCaLopHoc.get(i).get(j));
					}
				}
			}
			
			
			
	
			String dataString[][]= new String[dataMaLop.length][2];
			
			for(int i=0;i<dataMaLop.length;i++) {
				dataString[i][0]=dataMaLop[i];
				dataString[i][1]=dataTenLop[i];
			}
			
			// add malop
			String dataStringTemp[][]= {{"lh01","lh02"},{"tenlop 1","ten lop 2"} };
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
			
			List arrListLopHocInfo=new List(0);

//			arrListLopHocInfo.add(dataMaLop);
//			arrListLopHocInfo.add(dataTenLop);
			

			JTable tblLopHoc=new JTable(dataString,col);
			
			JScrollPane tblLopHocPane= new JScrollPane(tblLopHoc);
		 
			// panel
			JPanel panel=new JPanel(grid);
			panel.add(lbDSLopHoc);
			panel.add(tblLopHocPane);
			
			// btn backs
			JButton btnBack=new JButton("Trở về");
			btnBack.setBounds(50,50,50,50);
			btnBack.setLocation(250,250);
			
			
//			panel.add(btnBack);
			
			
			fmTraCuuLopHoc.add(panel);		
			fmTraCuuLopHoc.setVisible(true);
			
		}
	
}
