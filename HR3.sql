CREATE DATABASE HR3;


Use HR3;


CREATE TABLE ThongTinNhanVien (
    MaNhanVien INT PRIMARY KEY,
    HoTen NVARCHAR(100),
    Tuoi INT,
    GioBatDau TIME,
    GioKetThuc TIME,
    LoaiNghi NVARCHAR(50),
    NgayCong FLOAT
);

INSERT INTO ThongTinNhanVien (MaNhanVien, HoTen, Tuoi, GioBatDau, GioKetThuc, LoaiNghi, NgayCong)
VALUES
    (1, 'Nguyen Van A', 25, '08:00:00', '2023-01-01 17:00:00',null, 1),
    (2, 'Tran Thi B', 30, '09:00:00', '2023-01-02 18:00:00', 'Nghỉ phép', 0),
    (3, 'Pham Van C', 28, '07:30:00', '2023-01-03 16:30:00', NULL, 9.0),
    (4, 'Le Thi D', 35, '08:30:00', '2023-01-04 17:30:00', 'Nghỉ không lương',1),
    (5, 'Hoang Van E', 27, '08:00:00', '2023-01-05 17:00:00', NULL,1);