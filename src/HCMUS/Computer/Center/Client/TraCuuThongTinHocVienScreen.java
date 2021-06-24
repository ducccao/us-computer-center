package HCMUS.Computer.Center.Client;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;



import HCMUS.Computer.Center.Data.HocVienDB;
import Utils.Utils;

public class TraCuuThongTinHocVienScreen {
	 private String dataDSHocVien[][]= {};
	 private	JTable tblDSHocVien;
	 private JScrollPane scrollPanel;
	public void render() {
		JFrame fm=new JFrame();
		fm.setTitle("Tra cứu thông tin học viên");
		int x=600;
		int y=400;
		
		int pdTop=20;
		int pdLeft=80;
		int pdBot=20;
		int pdRight=80;
		
		// get infor hoc vien
		Utils u =new Utils();
		HocVienDB hvdb=new HocVienDB();
		Vector<String>dsMaHocVien=hvdb.layTatCaMaHocVien();
		Vector<String>hoTens=hvdb.layTatCaHoTenHocVien();
		Vector<String>ngaySinhs=hvdb.layTatCaNgaySinhHocVien();
		Vector<String>diaChis=hvdb.layTatCaDiaChiHocVien();
		Vector<String>sdts=hvdb.layTatCaSDTHocVien();
		
		
		// labels
		JLabel lbMaHocVien =new JLabel("Mã học viên");
		JLabel lbDSHocVien =new JLabel("Danh sách học viên");
		
		// text field
		String dataMaHV[]= {};
		
		for(int i=0;i<dsMaHocVien.size();++i) {
			dataMaHV=u.addEleIntoArray1DimesonalString(dataMaHV, dsMaHocVien.get(i));
		}
		
		JComboBox cbbMAHV=new JComboBox(dataMaHV);
		
		// buttons
		JButton btnTraCuu=new JButton("Tra cứu");
		JButton btnBack=new JButton("Trở về");
		
	
		
		
		// dshocvien
		
	

	
		for(int i=0;i<dsMaHocVien.size();++i) {
			String[] recordHocVien=new String[5];
			recordHocVien[0]=dsMaHocVien.get(i);
//			recordHocVien[1]=matKhaus.get(i);
//			recordHocVien[2]=chucVus.get(i);
			recordHocVien[1]=hoTens.get(i);
			recordHocVien[2]=ngaySinhs.get(i);
			recordHocVien[3]=diaChis.get(i);
			recordHocVien[4]=sdts.get(i);
			dataDSHocVien=u.addArr1StrIntoArr2String(dataDSHocVien, recordHocVien);
		}
		
	
		// action
		ActionListener btnBackActionListener=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				fm.dispose();
				return;
			}
		};
		
		ActionListener btnTraCuuActionListener=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String mahv=cbbMAHV.getSelectedItem().toString().trim();

				Utils u =new Utils();
				for(int i=0;i<dsMaHocVien.size();++i) {
					if(dsMaHocVien.get(i).trim().equals(mahv)==true) {
						System.out.print("equal!");
						dataDSHocVien=new String[1][];
						
						String[] recordHocVien=new String[5];
						recordHocVien[0]=dsMaHocVien.get(i);
						recordHocVien[1]=hoTens.get(i);
						recordHocVien[2]=ngaySinhs.get(i);
						recordHocVien[3]=diaChis.get(i);
						recordHocVien[4]=sdts.get(i);
						dataDSHocVien=u.addArr1StrIntoArr2String(dataDSHocVien, recordHocVien);
						JOptionPane op=new JOptionPane();
						
						JFrame f=new JFrame();
						JLabel b=new JLabel("<html>"
								+ "<br/> Mã học viên: "+dsMaHocVien.get(i)
								+ "<br/>  Họ tên: "+hoTens.get(i)
								+ "<br/>  Ngày sinh: "+ngaySinhs.get(i)
								+ "<br/>  Địa chỉ: "+diaChis.get(i)
								+ "<br/>  SDT: "+sdts.get(i)
								+"</html>");
						op.showMessageDialog(f,b);
						break;
					}
				
			
				}
			
				
				
			}
		};
		
		btnBack.addActionListener(btnBackActionListener);
		btnTraCuu.addActionListener(btnTraCuuActionListener);
	
		
	
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
