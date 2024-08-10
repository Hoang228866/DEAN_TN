package com.example.demo.Entity;

import com.example.demo.enums.GioiTinh;
import com.example.demo.enums.TrangThai;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Entity
@Table(name = "NHANVIEN")
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")

    private UUID id;
    @Column(name = "so_dien_thoai")
    private String sdt;
    @Column(name = "ten_day_du")
    private String tenDayDu;
    @Column(name = "tai_khoan")
    private String taiKhoan;
    @Column(name = "mat_khau")
    private String matKhau;
    @Column(name = "email")
    private String email;
    @Column(name = "ngay_sinh")
    private String ngaySinh;
    @Column(name = "anh")
    private String anh;
    @Column(name = "quyen")
    private String quyen;
    @Column(name = "gioi_tinh")
    private GioiTinh gt;
    @Column(name = "ngay_tao")
    private LocalDate ngayTao;
    @Column(name = "dia_chi")
    private String  diaChi;
    @Column(name = "manv")
    private  String maNhanVien;
    @Column(name = "trang_thai")
    private TrangThai trangThai;


}
