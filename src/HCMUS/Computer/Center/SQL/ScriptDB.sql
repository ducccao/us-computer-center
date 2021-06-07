drop database if exists `us-computer-center`;
create database `us-computer-center`;

use `us-computer-center`;


-- ---------------------------------------------------------
-- Table structor for lophoc
-- ---------------------------------------------------------
drop table if exists `lophoc`;
create table `lophoc`(
	maLop nchar(200),
	tenLop nvarchar(200),
    primary key (maLop)
);



-- ---------------------------------------------------------
-- Records for lophoc
-- ---------------------------------------------------------
insert into `lophoc` (maLop,tenLop) values ('LH01','Lớp kỹ thuật viên');
insert into `lophoc` (maLop,tenLop) values ('LH02','Lớp chuyên đề');
insert into `lophoc` (maLop,tenLop) values ('LH03','Lớp chứng chỉ tin học A');
insert into `lophoc` (maLop,tenLop) values ('LH04','Lớp chứng chỉ tin học B');

-- ---------------------------------------------------------
-- Table structor for khoahoc
-- ---------------------------------------------------------
drop table if exists `khoahoc`;
create table `khoahoc`(
	maKhoaHoc nvarchar(200),
    tenKhoaHoc nvarchar(200),
    hocPhi nvarchar(200),
    maLop nvarchar(200) not null,
	
    primary key (maKhoaHoc),
    foreign key (maLop) references `lophoc` (maLop)
);

-- ---------------------------------------------------------
-- Records for khoahoc
-- ---------------------------------------------------------
insert into `khoahoc` (maKhoaHoc,tenKhoaHoc,hocPhi,maLop) values ('KH01','Kỹ thuật lập trình','1300000','LH01');
insert into `khoahoc` (maKhoaHoc,tenKhoaHoc,hocPhi,maLop) values ('KH02','Cấu trúc dữ liệu và giải thuật','1300000','LH01');
insert into `khoahoc` (maKhoaHoc,tenKhoaHoc,hocPhi,maLop) values ('KH03','Thuật toán nâng cao','1300000','LH01');
insert into `khoahoc` (maKhoaHoc,tenKhoaHoc,hocPhi,maLop) values ('KH04','Chuyên đề cách suy nghĩ','1300000','LH02');
insert into `khoahoc` (maKhoaHoc,tenKhoaHoc,hocPhi,maLop) values ('KH05','Chuyên đề cách viết CV','1300000','LH01');
insert into `khoahoc` (maKhoaHoc,tenKhoaHoc,hocPhi,maLop) values ('KH06','Tin học cơ bản','1300000','LH03');
insert into `khoahoc` (maKhoaHoc,tenKhoaHoc,hocPhi,maLop) values ('KH07','Nhập môn Excel','1300000','LH03');
insert into `khoahoc` (maKhoaHoc,tenKhoaHoc,hocPhi,maLop) values ('KH08','Nhập môn Word','1300000','LH03');
insert into `khoahoc` (maKhoaHoc,tenKhoaHoc,hocPhi,maLop) values ('KH09','Excel nâng cao','1300000','LH04');
insert into `khoahoc` (maKhoaHoc,tenKhoaHoc,hocPhi,maLop) values ('KH10','Word nâng cao','1300000','LH04');


-- ---------------------------------------------------------
-- Table structor for giangvien
-- ---------------------------------------------------------

drop table if exists `giangvien`;
create table `giangvien`(
	maGiangVien nvarchar(200),
    matKhau nvarchar(200),
    chucVu nvarchar(200),
    hoTen nvarchar(200),
    ngaySinh nvarchar(200),
    diaChi nvarchar(200),
    sdt nvarchar(200),
    maKhoaHoc nvarchar(200),
    
     primary key (maGiangVien,maKhoaHoc),
    foreign key (maKhoaHoc) references `khoahoc` (maKhoaHoc)
);

-- ---------------------------------------------------------
-- Records for giangvien
-- ---------------------------------------------------------
insert into `giangvien` (maGiangVien,matKhau,chucVu,hoTen,ngaySinh,diaChi,sdt,maKhoaHoc) 
values ('GV01','123123','GiangVien','Khoa Ngô Ngọc Đăng','12/12/1990','Q5 HCM','123456789','KH01');
insert into `giangvien` (maGiangVien,matKhau,chucVu,hoTen,ngaySinh,diaChi,sdt,maKhoaHoc) 
values ('GV01','123123','GiangVien','Khoa Ngô Ngọc Đăng','12/12/1990','Q5 HCM','123456789','KH02');
insert into `giangvien` (maGiangVien,matKhau,chucVu,hoTen,ngaySinh,diaChi,sdt,maKhoaHoc) 
values ('GV01','123123','GiangVien','Khoa Ngô Ngọc Đăng','12/12/1990','Q5 HCM','123456789','KH03');
insert into `giangvien` (maGiangVien,matKhau,chucVu,hoTen,ngaySinh,diaChi,sdt,maKhoaHoc) 
values ('GV02','123123','GiangVien','Minh Vĩ Lương','06/06/1980','Q10 HCM','123456789','KH04');
insert into `giangvien` (maGiangVien,matKhau,chucVu,hoTen,ngaySinh,diaChi,sdt,maKhoaHoc) 
values ('GV02','123123','GiangVien','Minh Vĩ Lương','06/06/1980','Q10 HCM','123456789','KH05');
insert into `giangvien` (maGiangVien,matKhau,chucVu,hoTen,ngaySinh,diaChi,sdt,maKhoaHoc) 
values ('GV03','123123','GiangVien','Phú Trần','06/06/1985','Q3 HCM','123456789','KH06');
insert into `giangvien` (maGiangVien,matKhau,chucVu,hoTen,ngaySinh,diaChi,sdt,maKhoaHoc) 
values ('GV03','123123','GiangVien','Phú Trần','06/06/1985','Q3 HCM','123456789','KH07');
insert into `giangvien` (maGiangVien,matKhau,chucVu,hoTen,ngaySinh,diaChi,sdt,maKhoaHoc) 
values ('GV03','123123','GiangVien','Phú Trần','06/06/1985','Q3 HCM','123456789','KH08');
insert into `giangvien` (maGiangVien,matKhau,chucVu,hoTen,ngaySinh,diaChi,sdt,maKhoaHoc) 
values ('GV03','123123','GiangVien','Phú Trần','06/06/1985','Q3 HCM','123456789','KH09');
insert into `giangvien` (maGiangVien,matKhau,chucVu,hoTen,ngaySinh,diaChi,sdt,maKhoaHoc) 
values ('GV03','123123','GiangVien','Phú Trần','06/06/1985','Q3 HCM','123456789','KH10');


-- ---------------------------------------------------------
-- Table structor for hocvien
-- ---------------------------------------------------------

drop table if exists `hocvien`;
create table `hocvien`(
	maHocVien nvarchar(200),
    matKhau nvarchar(200),
    chucVu nvarchar(200),
    hoTen nvarchar(200),
    ngaySinh nvarchar(200),
    diaChi nvarchar(200),
    sdt nvarchar(200),
   
     primary key (maHocVien)
);

-- ---------------------------------------------------------
-- Records for hocvien
-- ---------------------------------------------------------
insert into `hocvien` (maHocVien,matKhau,chucVu,hoTen,ngaySinh,diaChi,sdt) 
values ('HV01','123123','HocVien','Đức Cao','27/03/1999','Q8 HCM','123456789');
insert into `hocvien` (maHocVien,matKhau,chucVu,hoTen,ngaySinh,diaChi,sdt) 
values ('HV02','123123','HocVien','Hải Phan','17/06/1999','Q10 HCM','123456789');
insert into `hocvien` (maHocVien,matKhau,chucVu,hoTen,ngaySinh,diaChi,sdt) 
values ('HV03','123123','HocVien','Tons','20/09/1999','Q11 HCM','123456789');


-- ---------------------------------------------------------
-- Table structor for nhanvienquanly
-- ---------------------------------------------------------

drop table if exists `nhanvienquanly`;
create table `nhanvienquanly`(
	maNhanVien nvarchar(200),
    matKhau nvarchar(200),
    chucVu nvarchar(200),
    hoTen nvarchar(200),
    ngaySinh nvarchar(200),
    diaChi nvarchar(200),
    sdt nvarchar(200),
   
     primary key (maNhanVien)
);

-- ---------------------------------------------------------
-- Records for nhanvienquanly
-- ---------------------------------------------------------
insert into `nhanvienquanly` (maNhanVien,matKhau,chucVu,hoTen,ngaySinh,diaChi,sdt) 
values ('NVQL01','123123','NVQL','Huy Kha','20/09/1999','Q10 HCM','123456789');
insert into `nhanvienquanly` (maNhanVien,matKhau,chucVu,hoTen,ngaySinh,diaChi,sdt) 
values ('NVQL02','123123','NVQL','Minh Hoàng','01/01/1999','Q10 HCM','123456789');


-- ---------------------------------------------------------
-- Table structor for giaychungnhan
-- ---------------------------------------------------------

drop table if exists `giaychungnhan`;
create table `giaychungnhan`(
	maLop nvarchar(200),
    tenGiayChungNhan nvarchar(200),
   
     primary key (maLop)
);

-- ---------------------------------------------------------
-- Records for giaychungnhan
-- ---------------------------------------------------------
insert into `giaychungnhan` (maLop,tenGiayChungNhan) values ('LH01','Chứng nhận đã đậu lớp kỹ thuật viên');
insert into `giaychungnhan` (maLop,tenGiayChungNhan) values ('LH02','Chứng nhận đã đậu lớp tin học A');
insert into `giaychungnhan` (maLop,tenGiayChungNhan) values ('LH03','Chứng nhận đã đậu lớp tin học B');


-- ---------------------------------------------------------
-- Table structor for chitiethocvienthanhtoankhoahoc
-- ---------------------------------------------------------

drop table if exists `chitiethocvienthanhtoankhoahoc`;
create table `chitiethocvienthanhtoankhoahoc`(
	maHocVien nvarchar(200),
    maKhoaHoc nvarchar(200),
	maNhanVien nvarchar(200),
    daThanhToan bool,
    
	primary key (maHocVien,maKhoaHoc,maNhanVien)
);

-- ---------------------------------------------------------
-- Records for chitiethocvienthanhtoankhoahoc
-- ---------------------------------------------------------
insert into `chitiethocvienthanhtoankhoahoc` (maHocVien,maKhoaHoc,maNhanVien,daThanhToan) values ('HV01','KH01','NVQL01',TRUE);
insert into `chitiethocvienthanhtoankhoahoc` (maHocVien,maKhoaHoc,maNhanVien,daThanhToan) values ('HV01','KH02','NVQL01',TRUE);
insert into `chitiethocvienthanhtoankhoahoc` (maHocVien,maKhoaHoc,maNhanVien,daThanhToan) values ('HV01','KH03','NVQL01',TRUE);
insert into `chitiethocvienthanhtoankhoahoc` (maHocVien,maKhoaHoc,maNhanVien,daThanhToan) values ('HV01','KH04','NVQL01',FALSE);
insert into `chitiethocvienthanhtoankhoahoc` (maHocVien,maKhoaHoc,maNhanVien,daThanhToan) values ('HV02','KH05','NVQL01',TRUE);
insert into `chitiethocvienthanhtoankhoahoc` (maHocVien,maKhoaHoc,maNhanVien,daThanhToan) values ('HV02','KH04','NVQL01',FALSE);
insert into `chitiethocvienthanhtoankhoahoc` (maHocVien,maKhoaHoc,maNhanVien,daThanhToan) values ('HV03','KH07','NVQL01',TRUE);
insert into `chitiethocvienthanhtoankhoahoc` (maHocVien,maKhoaHoc,maNhanVien,daThanhToan) values ('HV03','KH08','NVQL01',TRUE);
insert into `chitiethocvienthanhtoankhoahoc` (maHocVien,maKhoaHoc,maNhanVien,daThanhToan) values ('HV03','KH09','NVQL01',FALSE);


-- ---------------------------------------------------------
-- Table structor for hocvienketquakhoahoc
-- ---------------------------------------------------------

drop table if exists `hocvienketquakhoahoc`;
create table `hocvienketquakhoahoc`(
	maHocVien nvarchar(200),
    GPA nvarchar(200),
	daDau bool,
    maKhoaHoc nvarchar(200),
    
	primary key (maHocVien,maKhoaHoc),
    foreign key (maKhoaHoc) references `khoahoc`(maKhoaHoc)
    
);

-- ---------------------------------------------------------
-- Records for hocvienketquakhoahoc
-- ---------------------------------------------------------
insert into `hocvienketquakhoahoc` (maHocVien,GPA,daDau,maKhoaHoc) values ('HV01','9.0',TRUE,'KH01');
insert into `hocvienketquakhoahoc` (maHocVien,GPA,daDau,maKhoaHoc) values ('HV01','6.5',TRUE,'KH02');
insert into `hocvienketquakhoahoc` (maHocVien,GPA,daDau,maKhoaHoc) values ('HV01','0.0',FALSE,'KH03');
insert into `hocvienketquakhoahoc` (maHocVien,GPA,daDau,maKhoaHoc) values ('HV01','0.0',FALSE,'KH04');
insert into `hocvienketquakhoahoc` (maHocVien,GPA,daDau,maKhoaHoc) values ('HV02','8.5',TRUE,'KH04');
insert into `hocvienketquakhoahoc` (maHocVien,GPA,daDau,maKhoaHoc) values ('HV03','0.0',FALSE,'KH07');
insert into `hocvienketquakhoahoc` (maHocVien,GPA,daDau,maKhoaHoc) values ('HV03','8.5',TRUE,'KH08');
insert into `hocvienketquakhoahoc` (maHocVien,GPA,daDau,maKhoaHoc) values ('HV03','0.0',FALSE,'KH09');




-- ---------------------------------------------------------
-- Table structor for hocvienchitietgiaychungnhan
-- ---------------------------------------------------------

drop table if exists `hocvienchitietgiaychungnhan`;
create table `hocvienchitietgiaychungnhan`(
	maHocVien nvarchar(200),
    maLop nvarchar(200),
	daNhan bool,

	primary key (maHocVien,maLop),
    foreign key (maLop) references `lophoc`(maLop)
);

-- ---------------------------------------------------------
-- Records for hocvienchitietgiaychungnhan
-- ---------------------------------------------------------
insert into `hocvienchitietgiaychungnhan` (maHocVien,maLop,daNhan) values ('HV01','LH01',TRUE);
insert into `hocvienchitietgiaychungnhan` (maHocVien,maLop,daNhan) values ('HV02','LH02',TRUE);
insert into `hocvienchitietgiaychungnhan` (maHocVien,maLop,daNhan) values ('HV03','LH03',FALSE);
insert into `hocvienchitietgiaychungnhan` (maHocVien,maLop,daNhan) values ('HV03','LH04',FALSE);



-- ---------------------------------------------------------
-- Table structor for lichhoc
-- ---------------------------------------------------------

drop table if exists `lichhoc`;
create table `lichhoc`(
	maLichHoc nvarchar(200),
    ngayBatDau nvarchar(200),
	ngayKetThuc  nvarchar(200),
	ngayHocTrongTuan  nvarchar(200),
	gioBatDau  nvarchar(200),
	gioKetThuc  nvarchar(200),
	maKhoaHoc  nvarchar(200),

	primary key (maLichHoc),
    foreign key (maKhoaHoc) references `khoahoc`(maKhoaHoc)
);

-- ---------------------------------------------------------
-- Records for lichhoc
-- ---------------------------------------------------------
insert into `lichhoc` (maLichHoc,ngayBatDau,ngayKetThuc,ngayHocTrongTuan,gioBatDau,gioKetThuc,maKhoaHoc) 
values ('LICHHOC01','03/03/2021','03/04/2021','Thu 7','9:00AM','11:00AM','KH01');
insert into `lichhoc` (maLichHoc,ngayBatDau,ngayKetThuc,ngayHocTrongTuan,gioBatDau,gioKetThuc,maKhoaHoc) 
values ('LICHHOC02','03/03/2021','03/04/2021','Thu 7','7:00AM','9:00AM','KH02');
insert into `lichhoc` (maLichHoc,ngayBatDau,ngayKetThuc,ngayHocTrongTuan,gioBatDau,gioKetThuc,maKhoaHoc) 
values ('LICHHOC03','03/03/2021','03/04/2021','Thu 7','7:00PM','9:00PM','KH03');
insert into `lichhoc` (maLichHoc,ngayBatDau,ngayKetThuc,ngayHocTrongTuan,gioBatDau,gioKetThuc,maKhoaHoc) 
values ('LICHHOC04','03/03/2021','03/04/2021','Thu 2','7:00PM','9:00PM','KH04');
insert into `lichhoc` (maLichHoc,ngayBatDau,ngayKetThuc,ngayHocTrongTuan,gioBatDau,gioKetThuc,maKhoaHoc) 
values ('LICHHOC05','03/03/2021','03/04/2021','Thu 3','7:00PM','9:00PM','KH05');
insert into `lichhoc` (maLichHoc,ngayBatDau,ngayKetThuc,ngayHocTrongTuan,gioBatDau,gioKetThuc,maKhoaHoc) 
values ('LICHHOC06','03/03/2021','03/04/2021','Thu 4','7:00PM','9:00PM','KH06');
insert into `lichhoc` (maLichHoc,ngayBatDau,ngayKetThuc,ngayHocTrongTuan,gioBatDau,gioKetThuc,maKhoaHoc) 
values ('LICHHOC07','03/03/2021','03/04/2021','Thu 5','7:00PM','9:00PM','KH07');
insert into `lichhoc` (maLichHoc,ngayBatDau,ngayKetThuc,ngayHocTrongTuan,gioBatDau,gioKetThuc,maKhoaHoc) 
values ('LICHHOC08','03/03/2021','03/04/2021','Thu 6','7:00PM','9:00PM','KH08');
insert into `lichhoc` (maLichHoc,ngayBatDau,ngayKetThuc,ngayHocTrongTuan,gioBatDau,gioKetThuc,maKhoaHoc) 
values ('LICHHOC09','03/03/2021','03/04/2021','Thu 2','7:00AM','8:00AM','KH09');
insert into `lichhoc` (maLichHoc,ngayBatDau,ngayKetThuc,ngayHocTrongTuan,gioBatDau,gioKetThuc,maKhoaHoc) 
values ('LICHHOC10','03/03/2021','03/04/2021','Thu 3','7:00AM','8:00AM','KH10');




-- ---------------------------------------------------------
-- Table structor for lichday
-- ---------------------------------------------------------

drop table if exists `lichday`;
create table `lichday`(
	maLichDay nvarchar(200),
    ngayBatDau nvarchar(200),
	ngayKetThuc  nvarchar(200),
	ngayHocTrongTuan  nvarchar(200),
	gioBatDau  nvarchar(200),
	gioKetThuc  nvarchar(200),
	maKhoaHoc  nvarchar(200),

	primary key (maLichDay),
    foreign key (maKhoaHoc) references `khoahoc`(maKhoaHoc)
);

-- ---------------------------------------------------------
-- Records for lichday
-- ---------------------------------------------------------
insert into `lichday` (maLichDay,ngayBatDau,ngayKetThuc,ngayHocTrongTuan,gioBatDau,gioKetThuc,maKhoaHoc) 
values ('LICHDAY01','03/03/2021','03/04/2021','Thu 7','9:00AM','11:00AM','KH01');
insert into `lichday` (maLichDay,ngayBatDau,ngayKetThuc,ngayHocTrongTuan,gioBatDau,gioKetThuc,maKhoaHoc) 
values ('LICHDAY02','03/03/2021','03/04/2021','Thu 7','7:00AM','9:00AM','KH02');
insert into `lichday` (maLichDay,ngayBatDau,ngayKetThuc,ngayHocTrongTuan,gioBatDau,gioKetThuc,maKhoaHoc) 
values ('LICHDAY03','03/03/2021','03/04/2021','Thu 7','7:00PM','9:00PM','KH03');
insert into `lichday` (maLichDay,ngayBatDau,ngayKetThuc,ngayHocTrongTuan,gioBatDau,gioKetThuc,maKhoaHoc) 
values ('LICHDAY04','03/03/2021','03/04/2021','Thu 2','7:00PM','9:00PM','KH04');
insert into `lichday` (maLichDay,ngayBatDau,ngayKetThuc,ngayHocTrongTuan,gioBatDau,gioKetThuc,maKhoaHoc) 
values ('LICHDAY05','03/03/2021','03/04/2021','Thu 3','7:00PM','9:00PM','KH05');
insert into `lichday` (maLichDay,ngayBatDau,ngayKetThuc,ngayHocTrongTuan,gioBatDau,gioKetThuc,maKhoaHoc) 
values ('LICHDAY06','03/03/2021','03/04/2021','Thu 4','7:00PM','9:00PM','KH06');
insert into `lichday` (maLichDay,ngayBatDau,ngayKetThuc,ngayHocTrongTuan,gioBatDau,gioKetThuc,maKhoaHoc) 
values ('LICHDAY07','03/03/2021','03/04/2021','Thu 5','7:00PM','9:00PM','KH07');
insert into `lichday` (maLichDay,ngayBatDau,ngayKetThuc,ngayHocTrongTuan,gioBatDau,gioKetThuc,maKhoaHoc) 
values ('LICHDAY08','03/03/2021','03/04/2021','Thu 6','7:00PM','9:00PM','KH08');
insert into `lichday` (maLichDay,ngayBatDau,ngayKetThuc,ngayHocTrongTuan,gioBatDau,gioKetThuc,maKhoaHoc) 
values ('LICHDAY09','03/03/2021','03/04/2021','Thu 2','7:00AM','8:00AM','KH09');
insert into `lichday` (maLichDay,ngayBatDau,ngayKetThuc,ngayHocTrongTuan,gioBatDau,gioKetThuc,maKhoaHoc) 
values ('LICHDAY10','03/03/2021','03/04/2021','Thu 3','7:00AM','8:00AM','KH10');


