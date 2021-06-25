

-- dang ky khoa hoc
insert into `hocvien` (maHocVien,matKhau,chucVu,hoTen,ngaySinh,diaChi,sdt) 
values ('HV01','123123','HocVien','Đức Cao','27/03/1999','Q8 HCM','123456789');
insert into `chitiethocvienthanhtoankhoahoc` (maHocVien,maKhoaHoc,maNhanVien,daThanhToan) values ('HV01','KH01','NVQL01',TRUE);
insert into `khoahoc` (maKhoaHoc,tenKhoaHoc,hocPhi,maLop) values ('KH01','Kỹ thuật lập trình','1300000','LH01');

-- ket qua khoa hoc
select * from `hocvienketquakhoahoc` kq
where kq.mahocvien="HV01";

select kq.maKhoaHoc
from `hocvienketquakhoahoc` kq
where kq.maHocVien='HV01';

update `hocvienketquakhoahoc`
set GPA='5' , daDau=false
where maKhoaHoc='KH01'
and maHocVien = 'HV01';


use `us-computer-center`;
select * from `hocvienketquakhoahoc`;

select * from `lichday`;
select * from `lichhoc`;
select * from `khoahoc`;
select * from `chitiethocvienthanhtoankhoahoc`;
select * from `hocvien`;
select * from `lophoc`;
select * from `khoahoc`;
select * from `hocvien`;
select * from `giangvien`;
select * from `nhanvienquanly`;
select * from `nhanvienquanly`;




