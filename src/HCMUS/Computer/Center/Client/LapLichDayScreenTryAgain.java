package HCMUS.Computer.Center.Client;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import HCMUS.Computer.Center.Data.KhoaHocDB;

public class LapLichDayScreenTryAgain {
	private JFrame fm ;
	private int fmxSize=600;
	private int fmySize=600;
	private int pdTop=20;
	private int pdLeft=80;
	private int pdBot=20;
	private int pdRight=80;
	
	private JLabel lbMaKhoaHoc;
	private JLabel lbNgayBatDau;
	private JLabel  lbNgayKT;
	private JLabel lbNgayDayTrongTuan;
	private JLabel lbGioBatDau;
	private JLabel lbGioKT;
	
	private JTextField tfNgayBD;
	private JTextField tfNgayKT;
	private JTextField tfNgayDayTrongTuan;
	private JTextField tfGioBD;
	private JTextField tfGioKT;
	
	private JComboBox cbbMaKH;
	
	private JButton btnLapLich;
	private JButton btnBack;
	
	JPanel topPanel;
	JPanel midPanel;
	JPanel bottomPanel;
	
	public void initForm() {
		String fmTitle="Lập lịch dạy";
		this.fm=new JFrame();
		fm.setTitle(fmTitle);
	}
	
	
	public void initLabels() {
		 lbMaKhoaHoc=new JLabel("Mã khóa học");
		 lbNgayBatDau=new JLabel("Ngày bắt đầu");
		 lbNgayKT=new JLabel("Ngày kết thúc");
		 lbNgayDayTrongTuan=new JLabel("Ngày dạy trong tuần");
		 lbGioBatDau=new JLabel("Giờ bắt đầu");
		 lbGioKT=new JLabel("Giờ kết thúc");
	}
	
	public void initTextFields() {
		JTextField tfNgayBD=new JTextField();
		JTextField tfNgayKT=new JTextField();
		JTextField tfNgayDayTrongTuan=new JTextField();
		JTextField tfGioBD=new JTextField();
		JTextField tfGioKT=new JTextField();
	}
	
	public void initButtons() {
		JButton btnLapLich=new JButton("Lập lịch");
		JButton btnBack=new JButton("Trở về");
	}
	
	public void initCombobox() {
		KhoaHocDB khdb=new KhoaHocDB();
		String dataMaKH[]= khdb.getMaKhoaHoc();
		cbbMaKH=new JComboBox(dataMaKH);
	}
	
	public void initLayout() {
		JPanel topPanel=new JPanel(new GridLayout(2, 1));
		JPanel midPanel=new JPanel(new GridLayout(10, 1));
		JPanel bottomPanel=new JPanel(new GridLayout(1, 1));
		
		topPanel.setBorder(BorderFactory.createEmptyBorder(pdTop, pdLeft, pdBot, pdRight));
		topPanel.add(lbMaKhoaHoc);
		topPanel.add(cbbMaKH);
		
		midPanel.setBorder(BorderFactory.createEmptyBorder(pdTop, pdLeft, pdBot, pdRight));
		midPanel.add(lbNgayBatDau);
		midPanel.add(tfNgayBD);
		midPanel.add(lbNgayKT);
		midPanel.add(tfNgayKT);
		midPanel.add(lbNgayDayTrongTuan);
		midPanel.add(tfNgayDayTrongTuan);
		midPanel.add(lbGioBatDau);
		midPanel.add(tfGioBD);
		midPanel.add(lbGioKT);
		midPanel.add(tfGioKT);
		
		bottomPanel.setBorder(BorderFactory.createEmptyBorder(pdTop,pdLeft,pdBot,pdRight));
		bottomPanel.add(btnLapLich);
		bottomPanel.add(btnBack);
		
		fm.add(topPanel,BorderLayout.NORTH);
		fm.add(midPanel,BorderLayout.CENTER);
		fm.add(bottomPanel,BorderLayout.SOUTH);
		
		fm.setSize(fmxSize,fmySize);
		fm.setLocationRelativeTo(null);
		fm.setVisible(true);
	}
	
	
	public void render() {
	
		
		// init form
		this.initForm();

		// labels
		this.initLabels();
		
		// textfields
		this.initTextFields();
		
		// buttons
		this.initButtons();
		
		// makh combobox
		this.initCombobox();
	
		// layout
		this.initLayout();
	
		
	}
}
