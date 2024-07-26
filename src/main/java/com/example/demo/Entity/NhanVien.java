package com.example.demo.Entity;

import com.example.demo.enums.GioiTinh;
import com.example.demo.enums.Quyen;
import com.example.demo.enums.TrangThai;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Entity
@Table(name = "NHANVIEN")
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "tendaydu")
    private String tenDayDu;
    @Column(name = "sodienthoai")
    private String sdt;
    @Column(name = "taikhoan")
    private String taiKhoan;
    @Column(name = "matkhau")
    private String matKhau;
    @Column(name = "email")
    private String email;
    @Column(name = "ngaysinh")
    private LocalDate ngaySinh;
    @Column(name = "anh")
    private String anh;
    @Column(name = "quyen")
    private Quyen quyen;
    @Column(name = "gioitinh")
    private GioiTinh gt;
    @Column(name = "ngaytao")
    private  LocalDate ngayTao;
    @Column(name = "diachi")
    private String  diaChi;
    @Column(name = "manv")
    private  String maNhanVien;
    @Column(name = "trangthai")
    private TrangThai trangThai;


}
